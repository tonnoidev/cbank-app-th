package th.co.cbank.project.view;

import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.model.CbSaveConfigBean;

public class TransactionAdvanceDialog extends BaseDialogSwing{
    private final Logger logger = Logger.getLogger(TransactionAdvanceDialog.class);

    public TransactionAdvanceDialog(java.awt.Frame parent, boolean modal, String t_custcode, String t_acccode) {
        super(parent, modal);
        initComponents();
        setBounds(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds());

        initTable();
        txtCustCode.setText(t_custcode);
        txtAccCode.setText(t_acccode);

        calc();
    }
    
    private void calc(){
        if (txtCustCode.getText().trim().equals("")) {
            txtCustCode.requestFocus();
        } else if (txtAccCode.getText().trim().equals("")) {
            txtAccCode.requestFocus();
        } else {
            findData(txtCustCode.getText(), txtAccCode.getText(), true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCustCode = new javax.swing.JTextField();
        txtAccCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWithdraw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtInterest = new javax.swing.JTextField();
        txtNetBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("อัพเดตความเคลื่อนไหว");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("รหัสสมาชิก");

        txtCustCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCustCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustCodeKeyPressed(evt);
            }
        });

        txtAccCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccCodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("เลขที่บัญชี");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รายการ", "วันที่", "เวลา", "เลขที่เอกสาร", "จำนวนวัน", "ดอกเบี้ยสะสม", "ดอกเบี้ยยกมา", "ฝาก", "ฝาก(ดอกเบี้ย)", "ถอน", "คงเหลือ(รวมดอก)", "เงินต้น", "กำไร", "ดอกเบี้ยต่อปี", "print", "LineNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(120);
        }

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ออก (Close)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("ล้างการค้นหา");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("บันทึกข้อมูล");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ฝาก");

        txtDeposit.setEditable(false);
        txtDeposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ถอน");

        txtWithdraw.setEditable(false);
        txtWithdraw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("เงินต้นคงเหลือ");

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("กำไร");

        txtInterest.setEditable(false);
        txtInterest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtNetBalance.setEditable(false);
        txtNetBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNetBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNetBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("รวมยอดสูทธิ");

        txtInt.setEditable(false);
        txtInt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInt.setForeground(new java.awt.Color(153, 153, 153));
        txtInt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNetBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(txtBalance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNetBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCustCode, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(txtAccCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCustCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccCode.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_txtCustCodeKeyPressed

    private void txtAccCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1ActionPerformed(null);
            jButton1.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtCustCode.requestFocus();
        }
    }//GEN-LAST:event_txtAccCodeKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        saveTransaction();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCustCode;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtInt;
    private javax.swing.JTextField txtInterest;
    private javax.swing.JTextField txtNetBalance;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        th.co.cbank.util.JTableUtil.defaultTemplate(jTable1);
        jTable1.setRowHeight(30);
        JTableUtil.alignRight(jTable1, 3);
        JTableUtil.alignRight(jTable1, 4);
        JTableUtil.alignRight(jTable1, 5);
        JTableUtil.alignRight(jTable1, 6);
        JTableUtil.alignRight(jTable1, 7);
        JTableUtil.alignRight(jTable1, 8);
        JTableUtil.alignRight(jTable1, 9);
        JTableUtil.alignRight(jTable1, 10);
        JTableUtil.alignRight(jTable1, 11);
        JTableUtil.alignRight(jTable1, 12);
        JTableUtil.alignRight(jTable1, 13);

        clearModel();
    }

    private void clearForm() {
        txtCustCode.setText("");
        txtAccCode.setText("");
        clearModel();

        txtDeposit.setText("0.00");
        txtWithdraw.setText("0.00");
        txtBalance.setText("0.00");
        txtInterest.setText("0.00");
        txtNetBalance.setText("0.00");
        txtInt.setText("0.00");

        txtCustCode.requestFocus();
    }

    public void findData(String custCode, String accCode, boolean addModel) {

        double show1 = 0.00;//ฝาก
        double show2 = 0.00;//ถอน
        double show3 = 0.00;//คงเหลือ
        double show4 = 0.00;//กำไรทบต้น
        double show5 = 0.00;//ยอดเงินสุทธิ

        clearModel();

        String tCustCode = custCode;
        String tAccCode = accCode;
        String date = "";
        try {
            String sql = "select t_date from cb_transaction_save "
                    + "where t_status in('2','3','8') "
                    + "and t_custcode='" + tCustCode + "' "
                    + "and t_acccode='" + tAccCode + "' "
                    + "group by t_date "
                    + "order by t_date";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                date += DateFormat.getLocale_ddMMyyyy(rs.getDate("t_date")) + ",";
            }
            date += DateFormat.getLocale_ddMMyyyy(new Date());

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
            clearForm();
        }

        //add to model
        String[] dates = date.split(",");
        Date dateStart = DateFormat.getLocal_ddMMyyyy(dates[0]);
        Date dateEnd = DateFormat.getLocal_ddMMyyyy(dates[dates.length - 1]);
//        Date dateEnd = DateFormat.getLocal_ddMMyyyy("31/12/2559");

        Calendar c = Calendar.getInstance();
        c.setTime(dateStart);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        boolean isLoop = false;
        CbSaveConfigBean cfBean = getSaveConfigControl().listSaveConfig(tAccCode);
        int dayCount = 0;
        String temp_date = "";

        double all_balance = 0.00;//เก็บยอดเงิน balance
        double all_interest = 0.00;//เก็บยอดยกมาของดอกเบี้ย
        double all_money = 0.00;//เงินต้น
        int LineNo = 0;

        while (!isLoop) {
            String dateStr = DateFormat.getLocale_ddMMyyyy(c.getTime());
            if (temp_date.equals("")) {
                temp_date = dateStr;
            }
            if (!temp_date.equals(dateStr)) {
                dayCount++;
            }

            ItemRows data = new ItemRows();
            data.setT_date(c.getTime());
            data.setT_time("");
            data.setT_docno("");
            data.setRemark("");
            data.setInterest_rate(cfBean.getTypeINT());
            data.setT_day(dayCount);
            data.setBalance(all_balance);
            data.setT_interest((data.getT_day() * data.getInterest_rate() * all_balance) / (36500));
            data.setT_interest_balance(all_interest);
            data.setPrinciple(all_money);

            boolean isDateIn = false;
            for (int i = 0; i < dates.length; i++) {
                if (dates[i].equals(DateFormat.getLocale_ddMMyyyy(c.getTime()))) {
                    ArrayList<CbTransactionSaveBean> listBean = getCbTransactionSaveControl().getTransaction(tCustCode, tAccCode, c.getTime());
                    double temp_all_interest = all_interest;

                    for (int j = 0; j < listBean.size(); j++) {
                        CbTransactionSaveBean bean1 = (CbTransactionSaveBean) listBean.get(j);

                        ItemRows data2 = new ItemRows();
                        data2.setT_date(bean1.getT_date());
                        data2.setT_time(bean1.getT_time());
                        data2.setT_docno(bean1.getT_docno());
                        all_balance += bean1.getT_amount();

                        //เก็บเฉพาะเงินต้น
                        all_money += bean1.getT_amount();
                        data2.setPrinciple(all_money);
                        data2.setBalance(all_balance);
                        data2.setT_interest((data2.getT_day() * data2.getInterest_rate() * all_balance) / (36500));
                        data2.setT_day(0);

                        all_interest = data.getT_interest() + temp_all_interest;
                        //temp_all_interest = 0;

                        if (bean1.getT_amount() >= 0) {
                            data2.setDeposit(bean1.getT_amount());
                            data2.setRemark("<html><font color=blue><b>ฝากเงิน</b></font></html>");
                            show1 += bean1.getT_amount();
                            data2.setT_interest_balance(all_interest);
                        } else {
                            data2.setWithdraw(bean1.getT_amount());
                            data2.setRemark("<html><font color=red><b>ถอนเงิน</b></font></html>");
                            show2 += bean1.getT_amount() * -1;
                            data2.setT_interest_balance(all_interest);
                        }

                        data2.setInterest_rate(cfBean.getTypeINT());
                        data2.setIsPrint("Y");
                        LineNo++;

                        data2.setLineNo("" + LineNo);
                        data2.setProfit(data2.getBalance() - data2.getPrinciple());
                        if (addModel) {
                            model.addRow(data2.toObject());
                        }

                        //update recode
                        try {
                            String sql = "update cb_transaction_save set "
                                    + "t_balance='" + data2.getBalance() + "' "
                                    + "where t_custcode='" + tCustCode + "' "
                                    + "and t_acccode='" + tAccCode + "' "
                                    + "and t_docno='" + data2.getT_docno() + "' "
                                    + "and t_time='" + data2.getT_time() + "' "
                                    + "and t_status in('2','3','8')";
                            MySQLConnect.exeUpdate(sql);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                            e.printStackTrace();
                        }
                    }

                    isDateIn = true;
                    dayCount = 0;
                    break;
                }
            }

            boolean isUpdate = false;
            //check เงื่อนไขการจ่ายดอกเบี้ยเพิ่ม
            if (cfBean.getPayType().equals("2")) {
                int dd_db1 = cfBean.getCbPayType1();
                int mm_db1 = cfBean.getCbPayType2();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                if (c1.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);

                    data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(tAccCode);
                    bean.setT_custcode(tCustCode);
                    bean.setT_description(ThaiUtil.Unicode2ASCII("ฝากเงิน(ดอกเบี้ย)"));
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(0);
                    bean.setPrintChk("Y");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(0);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");

                    if (bean.getT_amount() > 0) {
                        getCbTransactionSaveControl().saveCbTransactionSave(bean);
                    }
                }
            } else if (cfBean.getPayType().equals("3")) {
                //ช่วงที่ 1
                int dd_db1 = cfBean.getCbPayType3();
                int mm_db1 = cfBean.getCbPayType4();
                Calendar c1 = Calendar.getInstance(Locale.ENGLISH);
                c1.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c1.set(Calendar.DATE, dd_db1);
                c1.set(Calendar.MONTH, mm_db1 - 1);
                //จบช่วงที่ 1

                //ช่วงที่ 2
                int dd_db2 = cfBean.getCbPayType5();
                int mm_db2 = cfBean.getCbPayType6();
                Calendar c2 = Calendar.getInstance(Locale.ENGLISH);
                c2.setTime(c.getTime());//เอาปีของความเคลื่อนไหวก่อนหน้า เพื่อเลือกวันที่คำนวณ
                c2.set(Calendar.DATE, dd_db2);
                c2.set(Calendar.MONTH, mm_db2 - 1);
                //จบช่วงที่ 2

                if (c1.getTime().compareTo(c.getTime()) == 0 || c2.getTime().compareTo(c.getTime()) == 0) {
                    data.setT_time("00:00:00");
                    data.setRemark("<html><font color=green><b>ดอกเบี้ยทบเงินต้น</b></font></html>");
                    data.setIsPrint("Y");
                    LineNo++;
                    data.setLineNo("" + LineNo);

                    data.setBalance(all_balance + data.getT_interest() + data.getT_interest_balance());
                    data.setDeposit_interest(data.getT_interest() + data.getT_interest_balance());
                    show4 += data.getDeposit_interest();
                    data.setT_interest_balance(0);
                    all_interest = 0;//clear ดอกเบี้ยทบต้นออก
                    data.setT_interest(0);
                    dayCount = 0;
                    all_balance = data.getBalance();
                    isUpdate = true;

                    //insert ดอกเบี้ยฝาก
                    CbTransactionSaveBean bean = new CbTransactionSaveBean();
                    bean.setT_date(data.getT_date());
                    bean.setT_time(data.getT_time());
                    bean.setT_acccode(tAccCode);
                    bean.setT_custcode(tCustCode);
                    bean.setT_description(ThaiUtil.Unicode2ASCII("ฝากเงิน(ดอกเบี้ย)"));
                    bean.setT_amount(data.getDeposit_interest());
                    bean.setT_empcode("system");
                    bean.setT_docno("");
                    bean.setT_booktype("INT");
                    bean.setLineNo(0);
                    bean.setPrintChk("Y");
                    bean.setT_balance(data.getBalance());
                    bean.setT_index(0);
                    bean.setMoney_in(data.getDeposit_interest());
                    bean.setMoney_out(0);
                    bean.setBranchCode(Value.BRANCH_CODE);
                    bean.setT_interest(0);
                    bean.setT_fee(0);
                    bean.setT_status("11");
                    if (bean.getT_amount() > 0) {
                        getCbTransactionSaveControl().saveCbTransactionSave(bean);
                    }
                }
            }//end paytype 3

            if (!isDateIn) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    model.addRow(data.toObject());
                }
            }

            if (isDateIn && isUpdate) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    model.addRow(data.toObject());
                }
            }

            if (c.getTime().compareTo(dateEnd) == 0) {
                data.setProfit(data.getBalance() - data.getPrinciple());
                if (addModel) {
                    model.addRow(data.toObject());
                }
                isLoop = true;
            } else {
                c.add(Calendar.DATE, 1);
            }
        }//end while loop

        show3 = show1 - show2;
        show5 = show3 + show4;
        txtDeposit.setText(NumberFormat.showDouble2(show1));
        txtWithdraw.setText(NumberFormat.showDouble2(show2));
        txtBalance.setText(NumberFormat.showDouble2(show3));
        txtInterest.setText(NumberFormat.showDouble2(show4));
        txtNetBalance.setText(NumberFormat.showDouble2(show5));
        txtInt.setText(NumberFormat.showDouble2(all_interest));
    }

    private void clearModel() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int size = jTable1.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
    }

    public void saveTransaction() {
        //update cb_save_account
        try {
            String sql = "update cb_save_account set "
                    + "b_balance='" + txtNetBalance.getText().replace(",", "") + "',"
                    + "b_interest='" + txtInt.getText().replace(",", "") + "' "
                    + "where b_cust_code='" + txtCustCode.getText() + "' "
                    + "and account_code='" + txtAccCode.getText() + "'";
            MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }

        //update cb_profile
        try {
            String sql = "select * from cb_save_account "
                    + "where b_cust_code='" + txtCustCode.getText() + "' "
                    + "and account_code='" + txtAccCode.getText() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            double netTotal = 0.00;
            while (rs.next()) {
                netTotal += rs.getDouble("b_balance");
            }

            try {
                String sql1 = "update cb_profile set "
                        + "save_balance='" + netTotal + "' "
                        + "where p_custcode='" + txtCustCode.getText() + "'";
                MySQLConnect.exeUpdate(sql1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                e.printStackTrace();
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }

    class ItemRows {

        private Date t_date;
        private String t_time;
        private String t_docno;
        private int t_day;
        private double t_interest;
        private double t_interest_balance;//ยอดยกมา
        private double deposit;
        private double deposit_interest;
        private double withdraw;
        private double balance;
        private double principle;//เงินต้น
        private String remark;
        private double profit;
        private double interest_rate;//อัตราดอกเบี้ยต่อปี
        private String isPrint = "N";
        private String LineNo = "";

        public ItemRows() {
        }

        public ItemRows(Date t_date, String t_time, String t_docno, int t_day, double t_interest,
                double t_interest_balance, double deposit, double deposit_interest, double withdraw,
                double balance, double principle, String remark, double profit, double interest_rate,
                String isPrint, String LineNo) {
            this.t_date = t_date;
            this.t_time = t_time;
            this.t_docno = t_docno;
            this.t_day = t_day;
            this.t_interest = t_interest;
            this.t_interest_balance = t_interest_balance;
            this.deposit = deposit;
            this.deposit_interest = deposit_interest;
            this.withdraw = withdraw;
            this.balance = balance;
            this.principle = principle;
            this.remark = remark;
            this.profit = profit;
            this.interest_rate = interest_rate;
            this.isPrint = isPrint;
            this.LineNo = LineNo;
        }

        public Object[] toObject() {
            String data = "";
            data += remark + "_";
            data += DateFormat.getLocale_ddMMyyyy(t_date) + "_";
            data += t_time + "_";
            data += t_docno + "_";
            data += t_day + "_";
            data += NumberFormat.showDouble4(t_interest) + "_";
            data += NumberFormat.showDouble4(t_interest_balance) + "_";
            data += NumberFormat.showDouble2(deposit) + "_";
            data += NumberFormat.showDouble2(deposit_interest) + "_";
            data += NumberFormat.showDouble2(withdraw) + "_";
            data += NumberFormat.showDouble2(balance) + "_";
            data += NumberFormat.showDouble2(principle) + "_";
            data += NumberFormat.showDouble2(profit) + "_";
            data += NumberFormat.showDouble2(interest_rate) + "_";
            data += isPrint + "_";
            data += LineNo + "_";

            return data.split("_");
        }

        public String getLineNo() {
            return LineNo;
        }

        public void setLineNo(String LineNo) {
            this.LineNo = LineNo;
        }

        public Date getT_date() {
            return t_date;
        }

        public void setT_date(Date t_date) {
            this.t_date = t_date;
        }

        public String getT_time() {
            return t_time;
        }

        public void setT_time(String t_time) {
            this.t_time = t_time;
        }

        public String getT_docno() {
            return t_docno;
        }

        public void setT_docno(String t_docno) {
            this.t_docno = t_docno;
        }

        public int getT_day() {
            return t_day;
        }

        public void setT_day(int t_day) {
            this.t_day = t_day;
        }

        public double getT_interest() {
            return t_interest;
        }

        public void setT_interest(double t_interest) {
            this.t_interest = t_interest;
        }

        public double getT_interest_balance() {
            return t_interest_balance;
        }

        public void setT_interest_balance(double t_interest_balance) {
            this.t_interest_balance = t_interest_balance;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public double getDeposit_interest() {
            return deposit_interest;
        }

        public void setDeposit_interest(double deposit_interest) {
            this.deposit_interest = deposit_interest;
        }

        public double getWithdraw() {
            return withdraw;
        }

        public void setWithdraw(double withdraw) {
            this.withdraw = withdraw;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getPrinciple() {
            return principle;
        }

        public void setPrinciple(double principle) {
            this.principle = principle;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public double getProfit() {
            return profit;
        }

        public void setProfit(double profit) {
            this.profit = profit;
        }

        public double getInterest_rate() {
            return interest_rate;
        }

        public void setInterest_rate(double interest_rate) {
            this.interest_rate = interest_rate;
        }

        public String isIsPrint() {
            return isPrint;
        }

        public void setIsPrint(String isPrint) {
            this.isPrint = isPrint;
        }

    }
}
