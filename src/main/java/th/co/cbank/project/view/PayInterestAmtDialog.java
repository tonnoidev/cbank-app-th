package th.co.cbank.project.view;

import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Point;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.mapping.PayInterestAmtMapping;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.ExcelUtil;

public class PayInterestAmtDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(PayInterestAmtDialog.class);

    private Frame parent;
    private DefaultTableModel model;

    public PayInterestAmtDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;

        initTable();
        model = (DefaultTableModel) tbData.getModel();
        txtDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShowData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnCal1 = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แสดงรายละเอียด การจ่ายดอกเบี้ยเงินฝาก");

        btnShowData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnShowData.setText("แสดงข้อมูล");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "บัญชีเลขที่", "เจ้าของบัญชี", "จำนวนเงินในบัญขี", "จำนวนดอกเบี้ย", "รหัสบัตรประชาชน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);
        if (tbData.getColumnModel().getColumnCount() > 0) {
            tbData.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbData.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbData.getColumnModel().getColumn(2).setPreferredWidth(250);
            tbData.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbData.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbData.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ออก (Close)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText(" วันที่ จ่ายดอกเบี้ย(ทบดอกเบี้ย)");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnCal1.setText("...");
        btnCal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCal1ActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setText("Export (xls)");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCal1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        findData();
    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnCal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCal1ActionPerformed
        Point point = txtDate.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate.setText(dcd.getDateString());
            txtDate.requestFocus();
        }
    }//GEN-LAST:event_btnCal1ActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        exportExcelFile();
    }//GEN-LAST:event_btnExportActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
        if(evt.getClickCount()==2){
            showDetail();
        }
    }//GEN-LAST:event_tbDataMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal1;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        th.co.cbank.util.JTableUtil.defaultTemplate(tbData);
        tbData.setRowHeight(30);
        JTableUtil.alignRight(tbData, 3);
        JTableUtil.alignRight(tbData, 4);

        clearModel();
    }

    public void findData() {
        clearModel();
        Date date = DateFormat.getLocal_ddMMyyyy(txtDate.getText());
        List<PayInterestAmtMapping> listData = getSaveAccountControl().getPayInterest(DateFormat.getMySQL_Date(date));
        for (PayInterestAmtMapping bean : listData) {
            model.addRow(new Object[]{
                bean.getIndex(),
                bean.getAccountNo(),
                ThaiUtil.ASCII2Unicode(bean.getAccountName()),
                bean.getBalanceAmt(),
                bean.getIntAmt(),
                bean.getCustCode()
            });
        }
    }

    private void clearModel() {
        int size = tbData.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
    }

    private void exportExcelFile() {
        try {
            ExcelUtil excel = new ExcelUtil();
            excel.setOutputFile("Pay Interest.xls");
            excel.write((DefaultTableModel) tbData.getModel(), "Report-3", new int[]{3, 4});
            Desktop.getDesktop().open(new File("Pay Interest.xls"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDetail() {
        int row = tbData.getSelectedRow();
        if (row != -1) {
            TransactionAdvanceDialog ta = new TransactionAdvanceDialog(null, true, tbData.getValueAt(row, 5).toString(), tbData.getValueAt(row, 1).toString());
            ta.setVisible(true);
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
