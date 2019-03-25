package th.co.cbank.project.view;

import th.co.cbank.project.model.ProfileBean;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.util.NumberUtil;
import th.co.cbank.util.StringUtil;

public class CustomerDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(CustomerDialog.class);
    private DefaultTableModel model;
    private DefaultTableModel modelDetail;
    private DefaultTableModel modelDetail2;

    public CustomerDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Value.CUST_LOAN_CODE = null;

        initTable();
        findCustomer();

        txtSearch.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCustomer = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLoanAccount = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ระบุข้อมูลในการค้นหา");

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tbCustomer.setAutoCreateRowSorter(true);
        tbCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัส", "ชื่อ", "นามสกุล", "สถานะ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCustomer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCustomerMouseClicked(evt);
            }
        });
        tbCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbCustomerKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCustomer);
        if (tbCustomer.getColumnModel().getColumnCount() > 0) {
            tbCustomer.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbCustomer.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbCustomer.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbCustomer.getColumnModel().getColumn(3).setPreferredWidth(250);
            tbCustomer.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่เปิดบัญชี", "ประเภทบัญชี", "ยอดเงินคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAccount);

        jTabbedPane1.addTab("บัญชีเงินฝาก", jScrollPane2);

        tbLoanAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่บัญชี", "วันที่เปิดบัญชี", "ประเภทบัญชี", "ยอดเงินคงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoanAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoanAccountMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbLoanAccount);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><font color=red><b>บัญชีเงินกู้</b></font></html>", jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("* สามารถดับเบิ้ลคลิ๊กที่ชื่อ เพื่อทำรายการทั้งหมดในระบบ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("* สามารถดับเบิ้ลคลิ๊กที่เลขที่บัญชีเงินฝาก/ เลขที่บัญชีเงินกู้ เพื่อทำรายการนั้น ๆ ได้");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tbCustomer.requestFocus();
        } else {
            findCustomer();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tbCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCustomerMouseClicked
        if (evt.getClickCount() == 2 && tbCustomer.getSelectedRow() != -1) {
            Value.CUST_CODE  = "" + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1);
            dispose();
        } else {
            
            //for save account
            int rows = tbCustomer.getSelectedRow();
            modelDetail = (DefaultTableModel) tbAccount.getModel();
            int size = modelDetail.getRowCount();
            for (int i = 0; i < size; i++) {
                modelDetail.removeRow(0);
            }
            
            ArrayList<CbSaveAccountBean> listBean = getSaveAccountControl().listCbSaveAccount("" + tbCustomer.getValueAt(rows, 1));
            for (int i = 0; i < listBean.size(); i++) {
                CbSaveAccountBean bean = (CbSaveAccountBean) listBean.get(i);
                modelDetail.addRow(new Object[]{
                    bean.getAccount_code(),
                    DateFormat.getLocale_ddMMyyyy(bean.getB_START()),
                    bean.getAccount_name(),
                    NumberFormat.showDouble2(bean.getB_BALANCE())
                });
            }
            
            //for loan account
            modelDetail2 = (DefaultTableModel) tbLoanAccount.getModel();
            int size2 = modelDetail2.getRowCount();
            for (int i = 0; i < size2; i++) {
                modelDetail2.removeRow(0);
            }
            
            ArrayList<CbLoanAccountBean> listLoan = getLoanAccountControl().listLoanAccountCust("" + tbCustomer.getValueAt(rows, 1));
            for(int i=0;i<listLoan.size();i++){
                CbLoanAccountBean bean = (CbLoanAccountBean)listLoan.get(i);
                modelDetail2.addRow(new Object[]{
                    bean.getLoan_docno(),
                    DateFormat.getLocale_ddMMyyyy(bean.getLoan_docdate()),
                    bean.getLoan_name(),
                    NumberFormat.showDouble2(bean.getLoan_amount())
                });
            }
        }
    }//GEN-LAST:event_tbCustomerMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void tbCustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCustomerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Row count: "+tbCustomer.getRowCount());
            Value.CUST_CODE = "" + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1);
            dispose();
        }
    }//GEN-LAST:event_tbCustomerKeyPressed

    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbAccount.getSelectedRow();
            if (rows != -1) {
                Value.CUST_CODE = "" + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1);
                Value.CUST_ACCOUNT_CODE = ""+tbAccount.getValueAt(rows, 0);                
                dispose();
            }
        }
    }//GEN-LAST:event_tbAccountMouseClicked

    private void tbLoanAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoanAccountMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbLoanAccount.getSelectedRow();
            if (rows != -1) {
                Value.CUST_LOAN_CODE = ""+tbLoanAccount.getValueAt(rows, 0);
                if(StringUtil.isEmpty(Value.CUST_LOAN_CODE)){
                    Value.CUST_LOAN_CODE = null;
                    return;
                }
                
                double balanceAmt = NumberUtil.toDouble(""+tbLoanAccount.getValueAt(rows, 3));
                if(balanceAmt==0){
                    JOptionPane.showMessageDialog(this, "ไม่พบยอดค้างชำระในระบบ !!!");
                    Value.CUST_LOAN_CODE = null;
                    return;
                }
                
                Value.CUST_CODE = "" + tbCustomer.getValueAt(tbCustomer.getSelectedRow(), 1);                
                dispose();
            }
        }
    }//GEN-LAST:event_tbLoanAccountMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTable tbCustomer;
    private javax.swing.JTable tbLoanAccount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        model = (DefaultTableModel) tbCustomer.getModel();

        JTableHeader tHeader = tbCustomer.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbCustomer.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbCustomer.setRowHeight(35);

        JTableHeader tHeader2 = tbAccount.getTableHeader();
        tHeader2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbAccount.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbAccount.setRowHeight(35);
        
        JTableUtil.alignCenter(tbCustomer, 0);
        JTableUtil.alignCenter(tbAccount, 0);        
        
        JTableHeader tHeader3 = tbLoanAccount.getTableHeader();
        tHeader3.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
        tbLoanAccount.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbLoanAccount.setRowHeight(35);
        
        JTableUtil.alignCenter(tbLoanAccount, 0);
    }

    private void findCustomer() {
        int sizeM = model.getRowCount();
        for (int i = 0; i < sizeM; i++) {
            model.removeRow(0);
        }

        ArrayList<ProfileBean> listData = getProfileControl().search(txtSearch.getText());
        for (int i = 0; i < listData.size(); i++) {
            ProfileBean bean = (ProfileBean) listData.get(i);

            model.addRow(new Object[]{
                bean.getP_index(),
                bean.getP_custCode(),
                bean.getP_custName(),
                bean.getP_custSurname(),
                bean.getStatus()
            });
        }
    }
}
