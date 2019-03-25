package th.co.cbank.project.control;

import th.co.cbank.project.model.ReportGreenBean;
import th.co.cbank.project.model.ReportOrangeBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.PrintSlipBean;

public class PassBook_PSiPR9 {

    public String printTransactionOrange(String date, String type, String total, String payment, String pay_int, String balance, String line, boolean print) {
        String param = "";
        String[] p = new String[13];
        p[0] = cutSpace(date, 22);//01/05/58
        p[1] = "         ";//9
        p[2] = cutSpace(type, 4);//LN
        p[3] = "    ";//4
        p[4] = cutSpace(total, 34);//9,999,999.99
        p[5] = "  ";//2
        p[6] = cutSpace(payment, 34);//9,999,999.99
        p[7] = "    ";//4
        p[8] = cutSpace(pay_int, 25);//99,999.99
        p[9] = "   ";//3
        p[10] = cutSpace(balance, 34);//9,999,999.99
        p[11] = "                             ";//29
        p[12] = cutSpace(line, 4);//99;

        for (String pp : p) {
            param += pp;
        }

        Map m = new HashMap();
        //convert line to in
        int lineInt = 1;
        try {
            lineInt = Integer.parseInt(line);
            for (int i = 1; i < lineInt; i++) {
                m.put("p" + i, "");
                System.out.println("p" + i);
            }
        } catch (NumberFormatException e) {

        }
        m.put("p" + line, param);
        System.out.println("#p" + line);
        for (int i = lineInt; i < 24; i++) {
            m.put("p" + (i + 1), "");
            System.out.println("p" + (i + 1));
        }

        if (print) {
            String sourceFileName = AppConstants.JASPER_TRAN_ORG_1_REPORT;
            try {
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
                JasperPrintManager.printReport(jasperPrint, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            }
        }

        return param;
    }

    public String printTransactionGreen(String date, String type, String wd, String dp, String balance, String in, String line, boolean print) {
        String param = "";
        String[] p = new String[13];
        p[0] = cutSpace(date, 22);//01/05/58
        p[1] = "    ";//4
        p[2] = cutSpace(type, 7);//DM
        p[3] = "         ";//9
        p[4] = cutSpace(wd, 37);//99,999,999.99
        p[5] = "             ";//13
        p[6] = cutSpace(dp, 37);//99,999,999.99
        p[7] = "           ";//11
        p[8] = cutSpace(balance, 37);//99,999,999.99
        p[9] = "       ";//7
        p[10] = cutSpace(in, 16);//9,999.99;
        p[11] = "                                   ";//35
        p[12] = cutSpace(line, 4);//99;

        for (String pp : p) {
            param += pp;
        }

        //System.out.println("param length: " + param.length());
        Map m = new HashMap();
        //convert line to in
        int lineInt = 1;
        try {
            lineInt = Integer.parseInt(line);
            for (int i = 1; i < lineInt; i++) {
                m.put("p" + i, "");
                //System.out.println("p" + i);
            }
        } catch (NumberFormatException e) {

        }
        m.put("p" + line, param);
        //System.out.println("#p" + line);
        for (int i = lineInt; i < 24; i++) {
            m.put("p" + (i + 1), "");
            //System.out.println("p" + (i + 1));
        }
        if (print) {
            String sourceFileName = AppConstants.JASPER_TRAN_GREEN_1_REPORT;
            try {
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
                JasperPrintManager.printReport(jasperPrint, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            }
        }
        return param;
    }

    public void printTransactionOrange2(ArrayList<ReportOrangeBean> listBean, boolean print) {
        Map m = new HashMap();
        //clear map is null
        for (int i = 1; i <= 168; i++) {
            m.put("p" + i, "");
        }

        int lineInt;
        int lineMax = 24;
        String tempBalance = null;
        for (int i = 0; i < listBean.size(); i++) {
            ReportOrangeBean bean = (ReportOrangeBean) listBean.get(i);
            if (tempBalance == null) {
                tempBalance = bean.getBalance();
            }
            String[] p = new String[7];
            p[0] = addSpace(bean.getDate());//วันที่
            p[1] = addSpace(bean.getType());//รายการ
            if (bean.getPayStart().equals(AppConstants.CB_STATUS_LOAN)) {//ประเภทการกู้เงิน
                p[2] = addSpace(bean.getStart());//เงินต้น
                p[3] = addSpace("0.00");//ชำระเงินต้น
            }
            if (bean.getPayStart().equals(AppConstants.CB_STATUS_PAYMENT)) {//ประเภทการรับชำระ
                p[2] = addSpace(tempBalance);//เงินต้น
                p[3] = addSpace(bean.getStart());//ชำระเงินต้น
                tempBalance = bean.getBalance();
            }
            p[4] = addSpace(bean.getPayInt());//ชำระดอกเบี้ย
            p[5] = addSpace(bean.getBalance());//เงินต้นคงเหลือ
            p[6] = addSpace(bean.getLine());//ชำระค่าปรับ

            lineInt = Integer.parseInt(bean.getLine());
            if (lineInt == lineMax) {
                m = getHashMap(m, p, lineInt);
                if (print) {
                    printBookGreen(m);
                }
                for (int a = 1; a <= 168; a++) {
                    m.put("p" + a, "");
                }

                JOptionPane.showMessageDialog(null, "กรุณากลับหน้าสมุดเพื่อทำรายการใหม่");
            } else {
                m = getHashMap(m, p, lineInt);
            }
        }

        if (print) {
            printReportOrange(m);
        }
    }

    public void printTransactionGreen2(ArrayList<ReportGreenBean> listBean, boolean print) {
        Map m = new HashMap();
        //clear map is null
        for (int i = 1; i <= 168; i++) {
            m.put("p" + i, "");
        }

        int lineInt;
        int lineMax = 24;
        for (int i = 0; i < listBean.size(); i++) {
            ReportGreenBean bean = (ReportGreenBean) listBean.get(i);

            String[] p = new String[7];
            p[0] = addSpace(bean.getDate());//01/05/58
            p[1] = addSpace(bean.getType());//DM
            p[2] = addSpace(bean.getWd());//99,999,999.99
            p[3] = addSpace(bean.getDp());//99,999,999.99
            p[4] = addSpace(bean.getBalance());//99,999,999.99
            p[5] = addSpace(bean.getIn());//9,999.99;
            p[6] = addSpace(bean.getLine());//99;

            lineInt = Integer.parseInt(bean.getLine());
            if (lineInt == lineMax) {
                m = getHashMap(m, p, lineInt);
                if (print) {
                    printBookGreen(m);
                }
                for (int a = 1; a <= 168; a++) {
                    m.put("p" + a, "");
                }

                JOptionPane.showMessageDialog(null, "กรุณากลับหน้าสมุดเพื่อทำรายการใหม่");
            } else {
                m = getHashMap(m, p, lineInt);
            }
        }

        if (print) {
            printBookGreen(m);
        }

    }

    private String cutSpace(String data, int length) {
        String tmp = data.replace("", "  ").substring(2);
        if (tmp.equals("")) {
            tmp = tmp.substring(0, tmp.length() - 2);
            int n1 = length;
            int n2 = tmp.length();
            int n = n1 - n2;
            String another = "";
            for (int i = 0; i < n; i++) {
                another += " ";
            }

            String sumText = another + tmp;
            if (sumText.length() == length) {
                System.out.println("Check Sum == TRUE");
            } else {
                System.out.println("Check Sum == FALSE[" + data + "],-" + (length - sumText.length()));
            }
            tmp = another + tmp;
        }

        return tmp;
    }

    private String addSpace(String data) {
        if (data == null) {
            return "";
        } else {
            String tmp = data.replace("", "  ").substring(2);
            if (!tmp.equals("")) {
                tmp = tmp.substring(0, tmp.length() - 2);
            }
            return tmp;
        }
    }

    public void printFrontBook(String accCode, String accName, String bookNo, String barcode, String accType) {
        Map m = new HashMap();
        m.put("AccountCode", addSpace(accCode));
        m.put("AccountName", accName);
        m.put("BookNo", addSpace(bookNo));
        m.put("BARCODE", barcode);
        m.put("AccountType", accType);

        String sourceFileName = AppConstants.JASPER_PRINT_BOOK_ACCOUNT;
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    public void printLoanFrontBook(String accCode, String accName, String bookNo, String barcode, String accType) {
        Map m = new HashMap();
        m.put("AccountCode", addSpace(accCode));
        m.put("AccountName", accName);
        m.put("BookNo", addSpace(bookNo));
        m.put("BARCODE", barcode);
        m.put("AccountType", accType);

        String sourceFileName = AppConstants.JASPER_PRINT_BOOK_LOAN_ACCOUNT;
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    public void printSlipSaveBook(PrintSlipBean bean) {
        Map m = new HashMap();
        m.put("p1", bean.getAccountName());
        m.put("p2", addSpace(bean.getAccountCode()));
        m.put("p3", addSpace(bean.getTranDate()));
        m.put("p4", addSpace(bean.getTranTime()));
        m.put("p5", addSpace(bean.getEmpCode()));
        m.put("p6", addSpace(bean.getAmount()));
        m.put("p7", addSpace(bean.getDocNo()));

        String sourceFileName = AppConstants.JASPER_SLIP_SHORT;
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    private void printReportOrange(Map m) {
        String sourceFileName = AppConstants.JASPER_TRAN_ORG_2;
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    private void printBookGreen(Map m) {
        String sourceFileName;
        ConfigControl cc = new ConfigControl();
        ConfigBean cBean = cc.getConfigBean();
        switch (cBean.getBookSpec()) {
            case 0:
                sourceFileName = AppConstants.JASPER_TRAN_GREEN_2_0;
                break;
            case 1:
                sourceFileName = AppConstants.JASPER_TRAN_GREEN_2;
                break;
            default:
                sourceFileName = AppConstants.JASPER_TRAN_GREEN_2_0;
                break;
        }

        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(sourceFileName));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, m, MySQLConnect.conn);
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    private Map getHashMap(Map m, String[] p, int lineInt) {
        int col = 7;
        int iAt = (col * lineInt) - (col - 1);
        int count = 0;
        for (int x = iAt; x <= (col * lineInt); x++) {
            //System.out.println("p" + x);
            m.put("p" + x, p[count]);
            count++;
        }

        return m;
    }
}
