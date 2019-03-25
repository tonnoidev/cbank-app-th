package th.co.cbank.project.view;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbLoanTablePaymentBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.ProfileBean;

public class LoadExcelAccountLoanDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(LoadExcelAccountLoanDialog.class);

    private static final double LOAN_CREDIT_AMT = 150000;
    private static final String fileName = "D:/idCard.txt";
    private static final String fileRename = "D:/idCard_bak.txt";
    private static final String loanCode = "101";
    private DefaultTableModel model;
    private static final String fixStringDate = "01/03/2018";
    private static final String fixLoanConfigName = "101 - ทุนหมุนเวียน";

    public LoadExcelAccountLoanDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        model = (DefaultTableModel) tbData.getModel();
        tbData.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbData.setRowHeight(25);

        JTableHeader tHeader = tbData.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        pbLoad = new javax.swing.JProgressBar();
        btnLoad = new javax.swing.JButton();
        lbMsg = new javax.swing.JLabel();
        chkLoanConfig = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        taLog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("บันทึกข้อมูลเงินกู้จาก Excel");

        btnLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLoad.setText("OK_Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        lbMsg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMsg.setText("...");

        chkLoanConfig.setText("Reset Loan config");

        taLog.setColumns(20);
        taLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        taLog.setLineWrap(true);
        taLog.setRows(5);
        taLog.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taLog);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pbLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoad))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(lbMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chkLoanConfig, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkLoanConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pbLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Loan Form");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Card", "Loan Amount", "Interest Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbData.getColumnModel().getColumn(1).setPreferredWidth(55);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ยืนยันการ load ข้อมูลจาก config file");
        if (confirm == JOptionPane.YES_OPTION) {
            if (chkLoanConfig.isSelected()) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            btnLoad.setEnabled(false);
                            resetLoanConfig();
                            process();
                            btnLoad.setEnabled(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JCheckBox chkLoanConfig;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMsg;
    private javax.swing.JProgressBar pbLoad;
    private javax.swing.JTextArea taLog;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables

    public void process() {
        pbLoad.setMinimum(0);
        pbLoad.setMaximum(getLainMax());
        pbLoad.setStringPainted(true);

        double loanAmt = 0.0;
        File f = new File(fileName);
        BufferedReader br;
        String line;
        String idCard1 = "";
        try {
            br = new BufferedReader(new FileReader(f));
            BranchBean bBean = getBranchControl().getData();
            DecimalFormat dec = new DecimalFormat("0000000");
            lbMsg.setText("Process loading starting...");
            int i = 0;
            while ((line = br.readLine()) != null) {
                lbMsg.setText("Loading.. " + line);
                taLog.append(lbMsg.getText() + "\n\n");
                CbLoanConfigBean lBean = getLoanConfigControl().listLoanConfig(loanCode);

                idCard1 = line;
                if (line.equals("")) {
                    continue;
                }
                String[] lineData = line.split("=");
                String idCard = "";
                if (lineData.length > 0) {
                    idCard = lineData[0];
                }
                if (lineData.length > 1) {
                    loanAmt = Double.parseDouble(lineData[1]);
                }
                if (loanAmt == 0) {
                    lbMsg.setText("Loading.. " + idCard + " : not create new loan account: loan amount == " + loanAmt);
                    taLog.append(idCard+" : Loan amount == 0 ... Not create new loan account");
                    continue;
                }
                i++;
                pbLoad.setValue(i);
                ProfileBean proBean = getProfileControl().listCbProfile(idCard);
                if (proBean != null) {
                    //update credit limit
                    lbMsg.setText("Loading.. " + idCard + " : update loan credit: " + loanAmt);
                    taLog.append(lbMsg.getText() + "\n");
                    System.out.println("-- update loan limit --");
                    update(proBean.getP_custCode());
                    System.out.println("-- finish loan limit --");
                } else {
                    //create new profile
                    lbMsg.setText("Loading.. " + line + " : create profile: " + idCard);
                    taLog.append(lbMsg.getText() + "\n");
                    System.out.println("-- Start new profile --");
                    proBean = getProfileControl().initBean();
                    proBean.setP_custCode(idCard);
                    proBean.setP_custName("");
                    proBean.setP_custSurname("");
                    getProfileControl().saveProfile(proBean);
                    System.out.println("-- Finish new profile --");

                    //update credit limit
                    lbMsg.setText("Loading.. " + idCard + " : update loan credit: " + loanAmt);
                    taLog.append(lbMsg.getText() + "\n");
                    System.out.println("-- update loan limit --");
                    update(proBean.getP_custCode());
                    System.out.println("-- finish loan limit --");
                }

                //save loan account
                String loanDocNo = bBean.getCode() + lBean.getLoanCode() + dec.format(lBean.getLoanRunning());
                CbLoanAccountBean loanBean = getLoanAccountControl().initBean();
                loanBean.setLoan_docno(loanDocNo);
                loanBean.setLoan_docdate(DateFormat.getEnglish_ddMMyyyy(fixStringDate));
                loanBean.setCust_code(proBean.getP_custCode());
                loanBean.setBranch_code(bBean.getCode());
                loanBean.setLoan_amount(loanAmt);
                loanBean.setLoan_interest(1);
                loanBean.setLoan_datePay(DateFormat.getEnglish_ddMMyyyy(fixStringDate));
                loanBean.setLoan_type(lBean.getLoanCode());
                loanBean.setBook_no("001");

                lbMsg.setText("Loading.. " + idCard + " : save loan account: " + loanDocNo);
                taLog.append(lbMsg.getText() + "\n");
                if (getLoanAccountControl().saveLoanAccount(loanBean)) {
                    String sql = "update cb_profile set "
                            + "Loan_Credit_Balance=Loan_Credit_Balance-" + loanAmt + ","
                            + "Loan_Balance=Loan_Balance+" + loanAmt + " "
                            + "where p_CustCode='" + proBean.getP_custCode() + "'";
                    MySQLConnect.exeUpdate(sql);

                    sql = "update cb_config set LoanDocRunning=LoanDocRunning+1";
                    MySQLConnect.exeUpdate(sql);

                    lbMsg.setText("Loading.. " + idCard + " : init(), loan transaction: " + loanDocNo);
                    taLog.append(lbMsg.getText() + "\n");
                    CbTransactionLoanBean tLoanBean = new CbTransactionLoanBean();
                    tLoanBean.setT_date(loanBean.getLoan_docdate());
                    tLoanBean.setT_acccode(loanDocNo);
                    tLoanBean.setT_custcode(proBean.getP_custCode());
                    tLoanBean.setT_description(ThaiUtil.Unicode2ASCII(fixLoanConfigName));
                    tLoanBean.setT_amount(loanAmt);
                    tLoanBean.setMoney_in(0.00);
                    tLoanBean.setMoney_out(0.00);
                    tLoanBean.setT_empcode(Value.USER_CODE);
                    tLoanBean.setT_docno(loanDocNo);
                    tLoanBean.setRemark("");
                    tLoanBean.setT_status("10");

                    ConfigBean cBean = getConfigControl().getConfigBean();
                    tLoanBean.setT_booktype(cBean.getLoanDocPrefix());
                    tLoanBean.setLineNo(getCbTransactionLoanControl().getLineByAccount(loanDocNo));
                    tLoanBean.setPrintChk("N");
                    tLoanBean.setT_index(getCbTransactionLoanControl().getMaxIndex(loanDocNo));
                    tLoanBean.setT_balance(loanAmt);
                    tLoanBean.setT_hoon(0);
                    tLoanBean.setBranch_code(bBean.getCode());
                    tLoanBean.setT_fee(0);
                    tLoanBean.setT_empcode(Value.USER_CODE);

                    //save transaction
                    lbMsg.setText("Loading.. " + idCard + " : save loan transaction: " + loanDocNo);
                    taLog.append(lbMsg.getText() + "\n");
                    getCbTransactionLoanControl().saveCbTransactionLoan(tLoanBean);

                    //save loan table
                    lbMsg.setText("Loading.. " + idCard + " : save table payment: " + loanDocNo);
                    taLog.append(lbMsg.getText() + "\n");
                    System.out.println("-- Start save table payment --");
                    CbLoanTablePaymentBean loanTbPayBean = getCbLoanTablePaymentControl().initBean();
                    System.out.println("-- LOAN DOC NO (" + loanDocNo + ")");
                    loanTbPayBean.setLoan_doc_no(loanDocNo);
                    loanTbPayBean.setNet_total_pay(loanAmt);
                    loanTbPayBean.setBase_total_amount(loanAmt);
                    loanTbPayBean.setBalance_amount(loanAmt);
                    loanTbPayBean.setBranch_code(bBean.getCode());

                    getCbLoanTablePaymentControl().saveCbLoanTablePayment(loanTbPayBean);
                    System.out.println("-- Finish save table payment --");
                    lbMsg.setText("Loading.. Finish... ("+i+")" + idCard);
                    taLog.append(lbMsg.getText() + "\n");
                }

                taLog.setCaretPosition(taLog.getDocument().getLength());
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            taLog.append("<< ERROR >> " + e.getMessage() + "\n");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage() + " , " + idCard1);
            taLog.append("<< ERROR >> " + e.getMessage() + "\n");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            taLog.append("<< ERROR >> " + e.getMessage() + "\n");
        }

        //rename file
        lbMsg.setText("rename file finish..");
        taLog.append(lbMsg.getText());
        new File(fileName).renameTo(new File(fileRename));

        lbMsg.setText("Process loading complete");
        taLog.append(lbMsg.getText());
        JOptionPane.showMessageDialog(null, "Load data loan account from file success");
    }

    public int update(String custCode) throws Exception {
        String sql = "update cb_profile set "
                + "loan_credit_amt='" + LOAN_CREDIT_AMT + "', "
                + "loan_credit_balance=(loan_credit_amt-loan_balance) "
                + "where p_custcode='" + custCode + "'";

        return MySQLConnect.exeUpdate(sql);
    }

    public void resetLoanConfig() throws Exception {
        MySQLConnect.exeUpdate("update cb_config set loanDocRunning='1'");
        MySQLConnect.exeUpdate("update cb_loan_config set loanRunning='1',bookNo='1' where loanCode='" + loanCode + "'");
        MySQLConnect.exeUpdate("delete from cb_loan_account");
        MySQLConnect.exeUpdate("delete from cb_loan_table_payment");
        MySQLConnect.exeUpdate("delete from cb_transaction_loan");
        MySQLConnect.exeUpdate("update cb_profile set loan_balance=0, loan_credit_amt=0, loan_credit_balance=0");
    }

    private int getLainMax() {
        String idCard1 = "";
        double loanAmt = 0.0;
        double loanIntAmt = 0.0;
        try {
            File f = new File(fileName);
            BufferedReader br;
            String line;
            br = new BufferedReader(new FileReader(f));
            int count = 0;
            while ((line = br.readLine()) != null) {
                idCard1 = line;
                if (line.equals("")) {
                    continue;
                }
                String[] lineData = line.split("=");
                String idCard = "";
                if (lineData.length > 0) {
                    idCard = lineData[0];
                }
                if (lineData.length > 1) {
                    loanAmt = Double.parseDouble(lineData[1]);
                }
                if (lineData.length > 2) {
                    loanIntAmt = Double.parseDouble(lineData[2]);
                }
                if(loanAmt==0){
                    continue;
                }
                count++;
            }
            br.close();

            return count;
        } catch (Exception e) {
            return 0;
        }
    }

    private void loadData() {
        String idCard1 = "";
        double loanAmt = 0.0;
        double loanIntAmt = 0.0;

        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        try {
            File f = new File(fileName);
            BufferedReader br;
            String line;
            br = new BufferedReader(new FileReader(f));
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
                idCard1 = line;
                if (line.equals("")) {
                    continue;
                }
                String[] lineData = line.split("=");
                String idCard = "";
                if (lineData.length > 0) {
                    idCard = lineData[0];
                }
                if (lineData.length > 1) {
                    loanAmt = Double.parseDouble(lineData[1]);
                }
                if (lineData.length > 2) {
                    loanIntAmt = Double.parseDouble(lineData[2]);
                }

                model.addRow(new Object[]{(count), idCard, loanAmt, loanIntAmt});
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
