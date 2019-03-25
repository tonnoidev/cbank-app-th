package th.co.cbank.project.control;

import th.co.cbank.project.model.ConfigBean;
import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbFeeTransactionBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.CbFeeBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.PrintBean;
import th.co.cbank.project.model.ProfileBean;

public final class PrintCOM extends BaseControl {
    private final Logger logger = Logger.getLogger(PrintCOM.class);
    private Enumeration portList;
    private CommPortIdentifier portId;
    private final String messageString = "Test Printer ,ระบบบริหารธนาคารชุมชน CB System";
    private SerialPort serialPort;
    private OutputStream outputStream;
    private final String fixCharSet = "tis-620";//tis-620
    private final String charset = "UTF-8";
    private final String PrintType = "4";
    private String XLine1 = "";
    private String XLine2 = "";
    private String XLine3 = "";
    private String XLine4 = "";

    int LineCount = 0;
    boolean PrintLine4 = true;

    public PrintCOM() {
        //detect comport auto
        try {
            String sql = "select PrintSlipPort from cb_config;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                String comportExist = rs.getString("PrintSlipPort");
                if (comportExist == null || comportExist.equals("null") || comportExist.equals("")) {
                    //find comport on computer
                    //show list
                    String[] comports = listComport();
                    if (comports.length == 1) {
                        try {
                            String sql2 = "update cb_config set PrintSlipPort='" + comports[0] + "'";
                            update(sql2);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    } else if (comports.length > 1) {
                        //ให้ผู้ใช้งานเลือก port สำหรับการเชื่อมต่อ

                    } else {
                        //ทุกอย่างเหมือนเดิม อิอิ
                        try {
                            String sql2 = "update cb_config set PrintSlipPort=''";
                            update(sql2);
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
            }

            rs.close();
        } catch (Exception e) {
            Log.write.error(e.getMessage());
        }
    }

    public String[] listComport() {
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();
        boolean found = false;
        String listComport = "";
        while (pList.hasMoreElements()) {
            found = true;
            CommPortIdentifier cpi = (CommPortIdentifier) pList.nextElement();
            if (cpi.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                System.out.println("is a Serial Port: " + cpi);
                listComport += cpi.getName() + ",";
            }
        }

        if (!found) {
            System.out.println("ไมพบข้อมูลการเชื่อมต่อ Comport");
        }

        return listComport.split(",");
    }

    public void initPrinter() {
        try {
            byte b[] = {27, 64, 1}; //init Printer

            outputStream.write(b);
            byte b2[] = {27, 33, 1}; //Set to Normal Font

            outputStream.write(b2);
            outputStream.flush();
            LineCount = 0;
            PrintLine4 = false;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int searchArray(int key, int[] list) {
        int ans = -1;
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                ans = i;
            }
        }
        return ans;
    }

    public void get_Line(String St) {
        System.out.println(St);
        int SetMode[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int list1[] = {232, 233, 234, 235, 236};
        int list2[] = {128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138,
            139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149,
            150, 151, 152, 153, 154, 155, 156, 157, 158,
            209, 212, 213, 214, 215, 219, 220, 221, 222, 231, 232,
            233, 234, 235, 236, 237, 251, 252, 253, 254
        };

        int list4[] = {216, 217};
        char ch;

        String level1 = "";
        String level2 = "";
        String level3 = "";
        String level4 = "";

        int i = 0;
        while (i <= St.length() - 1) {   // Check TIS Upper }

            ch = St.charAt(i);
            if (searchArray((int) ch, SetMode) != -1) {
                //Level2=Level2+ch ;
            } else {
                if (searchArray((int) ch, list1) != -1) {
                    level1 = level1.substring(0, level1.length() - 1) + ch;
                } else {
                    if (searchArray((int) ch, list2) != -1) {
                        level2 = level2.substring(0, level2.length() - 1) + ch;
                    } else {
                        if (searchArray((int) ch, list4) != -1) {
                            level4 = level4.substring(0, level4.length() - 1) + ch;
                        } else {
                            level1 = level1 + " ";
                            level2 = level2 + " ";
                            level3 = level3 + ch;
                            level4 = level4 + " ";
                        }
                    }
                }
            }
            i++;
        }
        XLine1 = level1;
        XLine2 = level2;
        XLine3 = level3;
        XLine4 = level4;

    }

    //WORK
    public void p(String PrintMsg) {
        if (PrintType.equals("6")) {
            try {
                XLine1 = PrintMsg + "\n";
                outputStream.write(XLine1.getBytes(fixCharSet));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            get_Line(ThaiUtil.Unicode2ASCII(PrintMsg));
            try {
                try {
                    if (XLine1.trim().length() > 0) {
                        XLine1 = ThaiUtil.ASCII2Unicode(XLine1 + "\n");
                        byte LineSpace[] = {27, 51, 15, 1};
                        byte LineSpace2[] = {27, 51, 15, 1};
                        if (XLine2.trim().length() > 0) {
                            outputStream.write(LineSpace2);
                        } else {
                            outputStream.write(LineSpace);
                        }
                        outputStream.write(XLine1.getBytes(fixCharSet));
                        LineCount = LineCount + 1;
                        PrintLine4 = false;
                    }
                    if (XLine2.trim().length() > 0) {
                        XLine2 = ThaiUtil.ASCII2Unicode(XLine2 + "\n");
                        byte LineSpace[] = {27, 51, 17, 1};
                        outputStream.write(LineSpace);
                        outputStream.write(XLine2.getBytes(fixCharSet));
                        PrintLine4 = false;
                        LineCount = LineCount + 1;
                    }
                    if (XLine3.trim().length() >= 0) {
                        XLine3 = ThaiUtil.ASCII2Unicode(XLine3 + "\n");
                        byte LineSpace[] = {27, 51, 15, 1};
                        byte LineSpace2[] = {27, 51, 18, 1};
                        if (XLine4.trim().length() > 0) {
                            outputStream.write(LineSpace);
                        } else {
                            outputStream.write(LineSpace2);
                        }
                        outputStream.write(XLine3.getBytes(fixCharSet));
                        PrintLine4 = false;
                        LineCount = LineCount + 1;
                    }
                    if (XLine4.trim().length() > 0) {
                        XLine4 = ThaiUtil.ASCII2Unicode(XLine4 + "\n");
                        byte LineSpace4[] = {27, 51, 0};
                        outputStream.write(LineSpace4);
                        outputStream.write(XLine4.getBytes(fixCharSet));
                        PrintLine4 = true;
                        LineCount = LineCount + 1;
                    } else {
                        PrintLine4 = false;
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    //WORK
    public void printTest(String Port) {

        if (Port.equals("")) {
            JOptionPane.showMessageDialog(null, "ระบุตำแหน่งปริ้นเตอร์สำหรับ Comport ไม่ถูกต้อง !");
            return;
        }

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(Port)) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600,
                                SerialPort.DATABITS_8,
                                SerialPort.STOPBITS_1,
                                SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

                    try {
                        p(messageString);
                        p("");///1
                        p("");///2
                        p("");///3
                        p("");///4
                        p("");///5
                        p("");///6
                        p("");///7
                        p("");///8
                        p("");///9
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //WORK
    public void printLOG(String msg) {

        ConfigControl cc = new ConfigControl();
        ConfigBean cBean = cc.getConfigBean();
        if (cBean == null) {
            return;
        }
        if (cBean.getPrintSlipPort() != null) {
            portList = CommPortIdentifier.getPortIdentifiers();

            while (portList.hasMoreElements()) {
                portId = (CommPortIdentifier) portList.nextElement();
                if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                    if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                        try {
                            serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                        } catch (PortInUseException e) {
                            e.printStackTrace();
                            return;
                        }
                        try {
                            outputStream = serialPort.getOutputStream();
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.exit(0);
                        }
                        try {
                            serialPort.setSerialPortParams(9600,
                                    SerialPort.DATABITS_8,
                                    SerialPort.STOPBITS_1,
                                    SerialPort.PARITY_NONE);
                        } catch (UnsupportedCommOperationException e) {
                            e.printStackTrace();
                        }

                        initPrinter();

                        try {
                            p(msg);
                            p("");///1
                            p("");///2
                            p("");///3
                            p("");///4
                            p("");///5
                            p("");///6
                            p("");///7
                            p("");///8
                            p("");///9
                            cutPaper();
                            outputStream.flush();
                            outputStream.close();
                            if (serialPort != null) {
                                serialPort.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Printer Comport ยังไม่ได้ติดตั้งกรุณาตั้งค่า");
            Log.write.error("Printer Comport ยังไม่ได้ติดตั้งกรุณาตั้งค่า");
        }

    }

    //WORK
    public void cutPaper() {
        try {
            byte Str[] = {27, 105, 0}; //init Printer
            outputStream.write(Str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectStye(int style) {

        if (style == 1) {
            byte Str[] = {27, 33, 1};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 2) {
            byte Str[] = {27, 33, 2};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 3) {
            byte Str[] = {27, 33, 97};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 4) {
            byte Str[] = {27, 33, 98};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        //Test ready ตัวหนังสูงยาวใหญ่
        if (style == 5) {
            byte Str[] = {27, 33, 16};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 6) {
            byte Str[] = {27, 33, 17};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        //Test ready ตัวหนังสือใหญ่มากที่สุด
        if (style == 7) {
            byte Str[] = {27, 33, 49};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 8) {
            byte Str[] = {27, 33, 48};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        //Test ready มีขีดแสดงชั้นวรรณของสระ
        if (style == 10) {
            byte Str[] = {27, 45, 1};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 11) {
            byte Str[] = {27, 45, 0};
            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 12) {
            byte str[] = {27, 114, 1};
            try {
                outputStream.write(str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (style == 13) {
            byte Str[] = {27, 114, 0};

            try {
                outputStream.write(Str);
                outputStream.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public String dataFullR(String str, int Len) {
        String returnStr;
        String addStr = "";
        int List1[] = {209, 212, 213, 214, 215, 216, 217, 218, 219, 231, 232, 233, 234, 235, 236, 237};
        if (Len < str.length()) {
            returnStr = str.substring(0, Len - 1);
        } else {
            for (int i = 1; i <= (Len - str.length()); i++) {
                addStr = addStr + " ";
            }

            returnStr = str.trim() + addStr;
        }

        int I = 0;
        int ICnt = 0;
        char ch;
        String TempStr = ThaiUtil.Unicode2ASCII(returnStr);
        while (I <= TempStr.length() - 1) {   // Check TIS Upper }

            ch = TempStr.charAt(I);
            if (searchArray((int) ch, List1) != -1) {
                ICnt++;
            }
            I = I + 1;
        }

        if (ICnt > 0) {
            for (int i = 1; i <= ICnt; i++) {
                returnStr = returnStr + " ";
            }
        }
        return returnStr;
    }

    //WORK
    public void printPaymentLoan(PrintBean pBean) {
        ConfigControl cc = new ConfigControl();
        ConfigBean cBean = cc.getConfigBean();
        if (cBean.getPrintSlipPort() == null || cBean.getPrintSlipPort().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาติดตั้ง Comport สำหรับปริ้นเตอร์ !!!");
            return;
        }

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600,
                                SerialPort.DATABITS_8,
                                SerialPort.STOPBITS_1,
                                SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

//                    pBean.setP_title("กลุ่มออมทรัพย์พัฒนาอาชีพ นนทบุรี หมู่ 4");
//                    pBean.setP_date("29/04/2558");
//                    pBean.setP_time("19:36");
//                    pBean.setP_docno("LO001601");
//                    pBean.setP_doc_type("เงินกู้ธนาคาร");
//                    pBean.setP_name("นางสาว พรภัสส์ ทายิตา");
//                    pBean.setP_acc_no("DW014107");
//                    pBean.setP_pay_step("2");
//                    pBean.setP_pay_1("3,334.00");
//                    pBean.setP_pay_int("1,600.00");
//                    pBean.setP_pay_fee("0.00");
//                    pBean.setP_pay_net("3,934.00");
//                    pBean.setP_balance("193,332.00");
//                    pBean.setP_emp_name("ชุลีมาศ ชัยนาน");
                    try {
                        p("ใบบันทึกรายการ");
                        p(pBean.getP_title());
                        p("");
                        p("วันที่ " + pBean.getP_date() + " เวลา " + pBean.getP_time());
                        p("เลขที่สัญญากู้ " + pBean.getP_docno());
                        p("ประเภทสัญญา " + pBean.getP_doc_type());
                        p("ชื่อผู้กู้ " + pBean.getP_name());
                        p("เลขที่ " + pBean.getP_acc_no());
                        p("รวมเงินที่ชำระ             " + addSpace(pBean.getP_pay_1(), 10) + " บาท");
                        p("ดอกเบี้ยที่ชำระ            " + addSpace(pBean.getP_pay_int(), 10) + " บาท");
                        p("ค่าธรรมเนียม/ค่าปรับ       " + addSpace(pBean.getP_pay_fee(), 10) + " บาท");
                        p("ยอดเงินรวมที่ชำระ         " + addSpace(pBean.getP_pay_net(), 10) + " บาท");
                        p("จำนวนเงินต้นคงเหลือ       " + addSpace(pBean.getP_balance(), 10) + " บาท");
                        p("");
                        p("ผู้ทำรายการ " + pBean.getP_emp_name());
                        p("******** ขอบคุณที่ใช้บริการ ********");

                        p("");///1
                        p("");///2
                        p("");///3
                        p("");///4
                        p("");///5
                        p("");///6
                        p("");///7
                        p("");///8
                        p("");///9
                        p("");//10
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //WORK
    public void printPaymentLoan(CbTransactionLoanBean cbTransactionLoanBean) {
        ConfigControl cc = new ConfigControl();
        ConfigBean cBean = cc.getConfigBean();
        if (cBean.getPrintSlipPort() == null || cBean.getPrintSlipPort().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาติดตั้ง Comport สำหรับปริ้นเตอร์ !!!");
            return;
        }

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

                    CbLoanAccountControl cbLoanAccountControl = new CbLoanAccountControl();
                    CbLoanAccountBean cbLoanAccountBean = cbLoanAccountControl.listLoanAccount(cbTransactionLoanBean.getT_acccode());

                    CbLoanConfigControl cbLoanConfigControl = new CbLoanConfigControl();
                    CbLoanConfigBean cbLoanConfigBean = cbLoanConfigControl.listLoanConfig(cbLoanAccountBean.getLoan_type());

                    BranchControl branchControl = new BranchControl();
                    BranchBean branchBean = branchControl.getData();
                    SimpleDateFormat sDate = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss");

                    ProfileControl profileControl = new ProfileControl();
                    ProfileBean profileBean = profileControl.listCbProfile(cbTransactionLoanBean.getT_custcode());

                    try {
                        p("     ใบเสร็จรับเงินชำระเงินกู้");
                        p(branchBean.getName());
                        p("");
                        p("วันที่ " + sDate.format(new Date()) + " เวลา " + sTime.format(new Date()));
                        p("เลขที่ " + cbTransactionLoanBean.getT_acccode());
                        p("เลขที่สัญญากู้ " + cbTransactionLoanBean.getT_acccode());
                        p("ประเภทสัญญา " + cbLoanConfigBean.getLoanName());
                        p("ชื่อผู้กู้ " + profileBean.getP_custName());
                        p("     รายละเอียดการชำระ");
//                        p("เงินต้น                " + addSpace(NumberFormat.showDouble2(cbTransactionLoanBean.getT_old_balance()), 10) + " บาท");
                        p("ดอกเบี้ย               " + addSpace(NumberFormat.showDouble2(cbTransactionLoanBean.getT_interest()), 10) + " บาท");
                        p("ค่าธรรมเนียม/ค่าปรับ     " + addSpace(NumberFormat.showDouble2(cbTransactionLoanBean.getT_fee()), 10) + " บาท");
                        p("รวมยอดรับชำระ         " + addSpace(NumberFormat.showDouble2(cbTransactionLoanBean.getT_amount()), 10) + " บาท");
                        p("หนี้คงเหลือหลังชำระ      " + addSpace(NumberFormat.showDouble2(cbTransactionLoanBean.getT_balance()), 10) + " บาท");
                        p("");
                        p("ผู้ทำรายการ " + cbTransactionLoanBean.getT_empcode());
                        p("******** ขอบคุณที่ใช้บริการ ********");

                        p("");//1
                        p("");//2
                        p("");//3
                        p("");//4
                        p("");//5
                        p("");//6
                        p("");//7
                        p("");//8
                        p("");//9
                        p("");//10
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // WORK
    public boolean printMemberFee(String custCode, String feeMember, String docno, String feeProject) {
        boolean isPrint = false;
        ConfigControl cc = new ConfigControl();
        ConfigBean cBean = cc.getConfigBean();

        if (cBean.getPrintSlipPort() == null || cBean.getPrintSlipPort().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาติดตั้ง Comport สำหรับปริ้นเตอร์ !!!");
            return false;
        }

        BranchControl bc = new BranchControl();
        BranchBean bBean = bc.getData();

        double feeProjectAmt = Double.parseDouble(feeProject);
        double feeMemberAmt = Double.parseDouble(feeMember);

        CbFeeTransactionControl feeCon = new CbFeeTransactionControl();

        // สำหรับค่าธรรมเนียมสมาชิก
        CbFeeControl cbFeeControl = new CbFeeControl();
        if (feeProjectAmt > 0) {
            CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
            CbFeeBean fBean = cbFeeControl.listExpense("4");
            if (fBean != null) {
                feeBean.setFee_code(fBean.getExp_id());
                feeBean.setFee_desc(fBean.getExp_desc());
                feeBean.setFee_amount(feeProjectAmt);
                feeBean.setFee_branch(bBean.getCode());
                feeBean.setFee_emp_code(Value.USER_CODE);
                feeBean.setFee_cust_code(custCode);

                feeCon.saveCbFeeTransaction(feeBean);
            }
        }
        if (feeMemberAmt > 0) {
            CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
            CbFeeBean fBean = cbFeeControl.listExpense("1");
            if (fBean != null) {
                feeBean.setFee_code(fBean.getExp_id());
                feeBean.setFee_desc(fBean.getExp_desc());
                feeBean.setFee_amount(feeMemberAmt);
                feeBean.setFee_branch(bBean.getCode());
                feeBean.setFee_emp_code(Value.USER_CODE);
                feeBean.setFee_cust_code(custCode);

                feeCon.saveCbFeeTransaction(feeBean);
            }
        }

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

                    SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat tt = new SimpleDateFormat("hh:mm");
                    ProfileControl pc = new ProfileControl();
                    ProfileBean pBean = pc.listCbProfile(custCode);

                    CbFeeBean fBean = cbFeeControl.listExpense("1");
                    CbFeeBean fBean2 = cbFeeControl.listExpense("4");

                    try {
                        p("ใบบันทึกรายการรับชำระค่าธรรมเนียม");
                        p("วันที่ " + ss.format(new Date()) + " เวลา " + tt.format(new Date()));
                        p("เลขที่ " + docno);
                        p("สาขา " + bBean.getName());
                        p("ชื่อ " + pBean.getP_custName() + " " + pBean.getP_custSurname());
                        p("รายการ                จำนวนเงิน");
                        p("1. " + fBean2.getExp_desc() + "  " + addSpace("" + feeProjectAmt, 10) + " บาท");
                        p("2. " + fBean.getExp_desc() + " " + addSpace("" + feeMemberAmt, 10) + " บาท");
                        p("");
                        p("                รวม   " + addSpace("" + (feeProjectAmt + feeMemberAmt), 10) + " บาท");
                        p("-------------------------------------");
                        p("ผู้ทำรายการ " + Value.USER_NAME);
                        p("******** ขอบคุณที่ใช้บริการ ********");

                        p("");///1
                        p("");///2
                        p("");///3
                        p("");///4
                        p("");///5
                        p("");///6
                        p("");///7
                        p("");///8
                        p("");///9
                        p("");//10
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }

                        isPrint = true;
                    } catch (IOException e) {
                        e.printStackTrace();

                        isPrint = false;
                    }
                }
            }
        }

        return isPrint;
    }

    private String getRunning(int run) {
        if (run < 10) {
            return "000000" + run;
        } else if (run < 100) {
            return "00000" + run;
        } else if (run < 1000) {
            return "0000" + run;
        } else if (run < 10000) {
            return "000" + run;
        } else if (run < 100000) {
            return "00" + run;
        } else if (run < 1000000) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    public boolean printFeeOpen(String custCode, String feeOpenAcc) {
        ConfigControl cc = new ConfigControl();
        ConfigBean bean = cc.getConfigBean();
        String docNo;
        if (bean.getBranchPrefix().equals("Y")) {
            BranchControl branchControl = new BranchControl();
            BranchBean bBean = branchControl.getData();
            docNo = bBean.getCode() + bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        } else {
            docNo = bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        }
        boolean isPrint = false;
        ConfigBean cBean = cc.getConfigBean();

        if (cBean.getPrintSlipPort() == null || cBean.getPrintSlipPort().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาติดตั้ง Comport สำหรับปริ้นเตอร์ !!!");
            return false;
        }
        BranchControl bc = new BranchControl();
        BranchBean bBean = bc.getData();

        double feeOpenAmt = Double.parseDouble(feeOpenAcc);

        CbFeeTransactionControl feeCon = new CbFeeTransactionControl();

        // สำหรับค่าธรรมเนียมการเปิดบัญชีเงินฝาก
        CbFeeControl cbFeeControl = new CbFeeControl();
        CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
        CbFeeBean fBean = cbFeeControl.listExpense("2");
        feeBean.setFee_code(fBean.getExp_id());
        feeBean.setFee_desc(fBean.getExp_desc());
        feeBean.setFee_amount(feeOpenAmt);
        feeBean.setFee_branch(bBean.getCode());
        feeBean.setFee_emp_code(Value.USER_CODE);
        feeCon.saveCbFeeTransaction(feeBean);

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

                    SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat tt = new SimpleDateFormat("hh:mm");
                    ProfileControl pc = new ProfileControl();
                    ProfileBean pBean = pc.listCbProfile(custCode);

                    try {
                        p("ใบบันทึกรายการรับชำระค่าธรรมเนียม");
                        p("วันที่ " + ss.format(new Date()) + " เวลา " + tt.format(new Date()));
                        p("เลขที่ " + docNo + " สาขา " + bBean.getName());
                        p("ชื่อ " + pBean.getP_custName() + " " + pBean.getP_custSurname());
                        p("รายการ                       จำนวนเงิน");
                        p("1. " + fBean.getExp_desc() + "           " + addSpace("" + feeOpenAmt, 10) + " บาท");
                        p("                รวม          " + addSpace("" + feeOpenAmt, 10) + " บาท");
                        p("-------------------------------------");
                        p("ผู้ทำรายการ " + Value.USER_NAME);
                        p("******** ขอบคุณที่ใช้บริการ ********");

                        p("");///1
                        p("");///2
                        p("");///3
                        p("");///4
                        p("");///5
                        p("");///6
                        p("");///7
                        p("");///8
                        p("");///9
                        p("");//10
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }

                        isPrint = true;
                    } catch (IOException e) {
                        e.printStackTrace();

                        isPrint = false;
                    }
                }
            }
        }

        return isPrint;
    }

    public boolean printFeeLoanOpen(String custCode, String feeLoanOpen) {
        ConfigControl cc = new ConfigControl();
        ConfigBean bean = cc.getConfigBean();
        String docNo;
        if (bean.getBranchPrefix().equals("Y")) {
            BranchControl branchControl = new BranchControl();
            BranchBean bBean = branchControl.getData();
            docNo = bBean.getCode() + bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        } else {
            docNo = bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        }
        boolean isPrint = false;
        ConfigBean cBean = cc.getConfigBean();

        if (cBean.getPrintSlipPort() == null || cBean.getPrintSlipPort().equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณาติดตั้ง Comport สำหรับปริ้นเตอร์ !!!");
            return false;
        }
        BranchControl bc = new BranchControl();
        BranchBean bBean = bc.getData();

        double feeLoanOpenAmt = Double.parseDouble(feeLoanOpen);

        CbFeeTransactionControl feeCon = new CbFeeTransactionControl();

        // สำหรับค่าธรรมเนียมการเปิดบัญชีเงินฝาก
        CbFeeControl cbFeeControl = new CbFeeControl();
        CbFeeTransactionBean feeBean = new CbFeeTransactionBean();
        CbFeeBean fBean = cbFeeControl.listExpense("3");
        feeBean.setFee_code(fBean.getExp_id());
        feeBean.setFee_desc(fBean.getExp_desc());
        feeBean.setFee_amount(feeLoanOpenAmt);
        feeBean.setFee_branch(bBean.getCode());
        feeBean.setFee_emp_code(Value.USER_CODE);
        feeCon.saveCbFeeTransaction(feeBean);

        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (portId.getName().equalsIgnoreCase(cBean.getPrintSlipPort())) {
                    try {
                        serialPort = (SerialPort) portId.open("SimpleWriteApp", 2000);
                    } catch (PortInUseException e) {
                        e.printStackTrace();
                    }
                    try {
                        outputStream = serialPort.getOutputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                    } catch (UnsupportedCommOperationException e) {
                        e.printStackTrace();
                    }

                    initPrinter();

                    SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat tt = new SimpleDateFormat("hh:mm");
                    ProfileControl pc = new ProfileControl();
                    ProfileBean pBean = pc.listCbProfile(custCode);

                    try {
                        p("ใบบันทึกรายการรับชำระค่าธรรมเนียม");
                        p("วันที่ " + ss.format(new Date()) + " เวลา " + tt.format(new Date()));
                        p("เลขที่ " + docNo + " สาขา " + bBean.getName());
                        p("ชื่อ " + pBean.getP_custName() + " " + pBean.getP_custSurname());
                        p("รายการ                       จำนวนเงิน");
                        p("1. " + fBean.getExp_desc() + "           " + addSpace("" + feeLoanOpenAmt, 10) + " บาท");
                        p("                รวม          " + addSpace("" + feeLoanOpenAmt, 10) + " บาท");
                        p("-------------------------------------");
                        p("ผู้ทำรายการ " + Value.USER_NAME);
                        p("******** ขอบคุณที่ใช้บริการ ********");

                        p("");///1
                        p("");///2
                        p("");///3
                        p("");///4
                        p("");///5
                        p("");///6
                        p("");///7
                        p("");///8
                        p("");///9
                        p("");//10
                        cutPaper();
                        outputStream.flush();
                        outputStream.close();
                        if (serialPort != null) {
                            serialPort.close();
                        }

                        isPrint = true;
                    } catch (IOException e) {
                        e.printStackTrace();

                        isPrint = false;
                    }
                }
            }
        }

        return isPrint;
    }

    //WORK
    public String addSpace(String data, int length) {
        int n = length - data.length();
        String v = "";
        for (int i = 0; i < n; i++) {
            v += " ";
        }
        return v + data;
    }
}
