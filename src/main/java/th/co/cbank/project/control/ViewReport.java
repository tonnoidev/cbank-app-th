package th.co.cbank.project.control;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;

public class ViewReport extends BaseControl {

    private final Logger logger = Logger.getLogger(ViewReport.class);
    private final DecimalFormat doubleFmt = new DecimalFormat("##,###,##0.00");
    private final SimpleDateFormat sFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    // USED
    public void printReportBuyHoon(String CustCode, String DocNo) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DocNo + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                MoneyToWord c = new MoneyToWord(rs.getDouble("t_hoon_amt"));
                parameters.put("TEXT_MONEY", c.toString());
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_hoon_amt")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));

                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("D_DATE", "" + sFormat.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("HOON_VOLUMN", doubleFmt.format(rs.getDouble("t_amount")));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("Hoon_Qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("Hoon_Qty") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    e.printStackTrace();
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_BUY_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Buying Investment Report");
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    // USED
    public void printReportSellHoon(String CustCode, String DOC_NO) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                parameters.put("TEXT_MONEY", "");
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_amount")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));
                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("TOTAL_QTY", doubleFmt.format(rs.getDouble("t_amount")));

                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                parameters.put("D_DATE", "" + s.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("hoon_qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("hoon_qty") * rs.getDouble("t_hoon_rate")));
                parameters.put("HOON_AMOUNT", doubleFmt.format(rs.getDouble("t_amount") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    e.printStackTrace();
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SELL_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Selling Investment Report");
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportTransferHoon(String CustCode, String DOC_NO) {
        BranchControl bc = new BranchControl();
        try {
            SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
            Map parameters = new HashMap();
            ProfileControl pc = new ProfileControl();
            ProfileBean bean = pc.listCbProfile(CustCode);
            String sql = "select p.p_custCode,p.p_custName,hoon_qty,"
                    + "t_docno,t_hoon,t_hoon_amt,t_hoon_cash,t_hoon_ton,"
                    + "t_hoon_rate,branch_code,t_amount "
                    + "from cb_transaction_save t, cb_profile p "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_custcode='" + CustCode + "' "
                    + "and t_docno='" + DOC_NO + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                parameters.put("CUST_NAME", bean.getP_custName() + " " + bean.getP_custSurname());
                parameters.put("DEPOSIT_NO", rs.getString("t_docno"));
                parameters.put("CUST_CODE", CustCode);
                parameters.put("TEXT_MONEY", "");
                parameters.put("NUMBER_MONEY", doubleFmt.format(rs.getDouble("t_amount")));

                BranchBean bbb = bc.getData();
                parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(bbb.getName()));
                parameters.put("TOTAL_RATE", doubleFmt.format(rs.getDouble("t_hoon_rate")));
                parameters.put("TOTAL_QTY", doubleFmt.format(rs.getDouble("t_amount")));

                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                parameters.put("D_DATE", "" + s.format(new Date()));
                parameters.put("D_TIME", sTime.format(new Date()));
                parameters.put("TOTAL_BALANCE", doubleFmt.format(rs.getDouble("hoon_qty")));
                parameters.put("TOTAL_MONEY", doubleFmt.format(rs.getDouble("hoon_qty") * rs.getDouble("t_hoon_rate")));
                parameters.put("HOON_AMOUNT", doubleFmt.format(rs.getDouble("t_amount") * rs.getDouble("t_hoon_rate")));

                try {
                    String sql2 = "select * from cb_branch";
                    ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                    if (rs2.next()) {
                        parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs2.getString("Name")));
                        parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs2.getString("AddressNo")) + " "
                                + "ต." + ThaiUtil.ASCII2Unicode(rs2.getString("Locality")) + " "
                                + "อ." + ThaiUtil.ASCII2Unicode(rs2.getString("SubProvince")) + " "
                                + "จ." + ThaiUtil.ASCII2Unicode(rs2.getString("Province")) + " "
                                + "" + rs2.getString("Post"));
                    }
                    rs2.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    e.printStackTrace();
                }

                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_TRANSFER_HOON_REPORT));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
                JasperViewer v = new JasperViewer(jasperPrint, false);
                JDialog j = new JDialog(new JFrame(), true);
                j.setTitle("Print");
                j.setSize(1024, 768);
                j.getContentPane().add(v.getContentPane());
                j.setLocationRelativeTo(null);
                j.setVisible(true);
                v.setTitle("Transfer Hoon Report");
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // USED
    public void printReportLoan(String DOC_NO) {
        try {
            Map parameters = new HashMap();

            try {
                String sql = "select p.p_custname,p.p_custsurname,l.* "
                        + "from cb_loan_balance l, cb_profile p "
                        + "where l.cust_code=p.p_custcode and "
                        + "cb_loan_docno='" + DOC_NO + "';";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    String docNo = rs.getString("cb_loan_docno");
                    String custName = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                    String custSurname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));

                    MoneyToWord mtw = new MoneyToWord(rs.getDouble("loan_amount"));

                    parameters.put("cb_loan_NO", docNo);
                    parameters.put("CUST_NAME", custName + " " + custSurname);
                    parameters.put("CUST_CODE", rs.getString("cust_code"));
                    parameters.put("TEXT_MONEY", mtw.toString());
                    parameters.put("NUMBER_MONEY", "" + doubleFmt.format(rs.getDouble("loan_amount")));

                    parameters.put("D_DATE", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("D_TIME", "");

                    parameters.put("cb_loan_AMOUNT", "" + doubleFmt.format(rs.getDouble("loan_amount")));
                    parameters.put("cb_loan_INTEREST", "" + doubleFmt.format(rs.getDouble("cb_loan_interest")));
                    parameters.put("INTEREST_TYPE", "ลดต้นลดดอก");
                    parameters.put("cb_loan_START", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("cb_loan_GURANTEE", "" + ThaiUtil.ASCII2Unicode(rs.getString("cb_loan_person")));

                    try {
                        String sql2 = "select sum(loan_amount) loan_amount from cb_loan_balance "
                                + "where cust_code='" + rs.getString("cust_code") + "';";
                        ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                        if (rs2.next()) {
                            parameters.put("cb_loan_BALANCE", doubleFmt.format(rs2.getDouble("loan_amount")));
                        }

                        rs2.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }

                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            try {
                String sql = "select * from cb_branch";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                    parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")) + " "
                            + "ต." + ThaiUtil.ASCII2Unicode(rs.getString("Locality")) + " "
                            + "อ." + ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")) + " "
                            + "จ." + ThaiUtil.ASCII2Unicode(rs.getString("Province")) + " "
                            + "" + rs.getString("POST"));
                    parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                }
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_SLIP_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Loan Report");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    // USED
    public void printReportLoanPayment(String DOC_NO) {
        try {
            Map parameters = new HashMap();

            try {
                String sql = "select p.p_custname,p.p_custsurname,l.* "
                        + "from cb_loan_balance l, cb_profile p "
                        + "where l.cust_code=p.p_custcode and "
                        + "cb_loan_docno='" + DOC_NO + "';";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    String docNo = rs.getString("cb_loan_docno");
                    String custName = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                    String custSurname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));

                    MoneyToWord mtw = new MoneyToWord(rs.getDouble("loan_amount"));

                    parameters.put("cb_loan_NO", docNo);
                    parameters.put("CUST_NAME", custName + " " + custSurname);
                    parameters.put("CUST_CODE", rs.getString("cust_code"));
                    parameters.put("TEXT_MONEY", mtw.toString());
                    parameters.put("NUMBER_MONEY", "" + doubleFmt.format(rs.getDouble("loan_amount")));

                    parameters.put("D_DATE", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("D_TIME", "");

                    parameters.put("cb_loan_AMOUNT", "" + doubleFmt.format(rs.getDouble("loan_amount")));
                    parameters.put("cb_loan_INTEREST", "" + doubleFmt.format(rs.getDouble("cb_loan_interest")));
                    parameters.put("INTEREST_TYPE", "ลดต้นลดดอก");
                    parameters.put("cb_loan_START", "" + sFormat.format(rs.getDate("cb_loan_docdate")));
                    parameters.put("cb_loan_GURANTEE", "" + ThaiUtil.ASCII2Unicode(rs.getString("cb_loan_person")));

                    try {
                        String sql2 = "select sum(loan_amount) loan_amount from cb_loan_balance "
                                + "where cust_code='" + rs.getString("cust_code") + "';";
                        ResultSet rs2 = MySQLConnect.getResultSet(sql2);
                        if (rs2.next()) {
                            parameters.put("cb_loan_BALANCE", doubleFmt.format(rs2.getDouble("loan_amount")));
                        }

                        rs2.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }

                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            try {
                String sql = "select * from cb_branch";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    parameters.put("COM_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                    parameters.put("COM_ADDR", ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")) + " "
                            + "ต." + ThaiUtil.ASCII2Unicode(rs.getString("Locality")) + " "
                            + "อ." + ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")) + " "
                            + "จ." + ThaiUtil.ASCII2Unicode(rs.getString("Province")) + " "
                            + "" + rs.getString("POST"));
                    parameters.put("BRANCH_NAME", ThaiUtil.ASCII2Unicode(rs.getString("Name")));
                }
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_SLIP_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Loan Report");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void printSample(Map p, String path) {
        try {
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(path));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
        } catch (HeadlessException e) {
            Log.write.error(e.getMessage());
        } catch (JRException e) {
            Log.write.error(e.getMessage());
        }
    }

    public void printReport(List<Map> listMap, String path) {
        JasperPrint print = null;
        for (Map p : listMap) {
            try {
                JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource(path));
                JasperPrint print1 = JasperFillManager.fillReport(report, p, MySQLConnect.conn);
                if (print == null) {
                    print = print1;
                    continue;
                }

                List pages = print1.getPages();
                for (int j = 0; j < pages.size(); j++) {
                    JRPrintPage object = (JRPrintPage) pages.get(j);
                    print.addPage(object);
                }

            } catch (HeadlessException e) {
                Log.write.error(e.getMessage());
            } catch (JRException e) {
                Log.write.error(e.getMessage());
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(ViewReport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // show report
        JasperViewer v = new JasperViewer(print, false);
        JDialog j = new JDialog(new JFrame(), true);
        j.setTitle("Print");
        j.setSize(1024, 768);
        j.getContentPane().add(v.getContentPane());
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }

    // USED
    public void printLoanPrommis() {
        try {
            Map p = new HashMap();
            for (int i = 1; i <= 35; i++) {
                p.put("m" + i, "");
            }
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_CLOSE_DAY_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Deposit Report");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportTran(String AccCode) {
        try {
            Map p = new HashMap();
            p.put("AccCode", AccCode);
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            CbSaveAccountControl sa = new CbSaveAccountControl();
            CbSaveAccountBean sBean = sa.getSaveAccountBean(AccCode);
            CbSaveConfigControl sc = new CbSaveConfigControl();
            CbSaveConfigBean cBean = sc.listSaveConfig(AccCode);
            p.put("parameter2", sBean.getB_CUST_CODE());
            p.put("parameter3", AccCode);
            p.put("parameter4", cBean.getTypeName());
            p.put("parameter5", sBean.getB_CUST_NAME() + " " + sBean.getB_CUST_LASTNAME());

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SAVE_TRAN_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving by");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportAllTran(String sql, String dateBetween) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sql);
            p.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_SAVING_ACCOUNT_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportLoanTran(String sql) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sql);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_LOAN_ACCOUNT_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportHoonAllTran(String sql, String dateBetween) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sql);
            p.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_HOON_ALL_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void printReportPersonBalance(String sqlAll, String dateBetween) {
        try {
            Map p = new HashMap();
            BranchControl bc = new BranchControl();
            BranchBean bBean = bc.getData();
            p.put("parameter1", bBean.getName());
            p.put("sql", sqlAll);
            p.put("dateBetween", dateBetween);

            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource(AppConstants.JASPER_PERSON_BALANCE_REPORT));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, p, MySQLConnect.conn);
            JasperViewer v = new JasperViewer(jasperPrint, false);
            JDialog j = new JDialog(new JFrame(), true);
            j.setTitle("Print");
            j.setSize(1024, 768);
            j.getContentPane().add(v.getContentPane());
            j.setLocationRelativeTo(null);
            j.setVisible(true);
            v.setTitle("Report Saving All");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
