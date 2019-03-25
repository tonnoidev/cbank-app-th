package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;

public class ShowAccountPrintDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ShowAccountPrintDialog.class);
    private String selectItem = null;

    public ShowAccountPrintDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        loadListAccount();
    }

    public String getSelectText() {
        return selectItem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccountList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เลือกบัญชีเพื่อทำรายการ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("ค้นหาชื่อบัญชี");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbAccountList.setAutoCreateRowSorter(true);
        tbAccountList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "เลขที่บัญชี", "จำนวนเงินคงเหลือ", "ชื่อ", "นามสกุล"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountListMouseClicked(evt);
            }
        });
        tbAccountList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbAccountListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccountList);
        if (tbAccountList.getColumnModel().getColumnCount() > 0) {
            tbAccountList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbAccountList.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAccountList.getColumnModel().getColumn(2).setPreferredWidth(135);
            tbAccountList.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbAccountList.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountListMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbAccountList.getSelectedRow();
            if (rows != -1) {
                Value.CUST_ACCOUNT_CODE = "" + tbAccountList.getValueAt(rows, 1);
                selectItem = "" + tbAccountList.getValueAt(rows, 1);
                dispose();
            } else {
                selectItem = null;
            }
        }
    }//GEN-LAST:event_tbAccountListMouseClicked

    private void tbAccountListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbAccountListKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int rows = tbAccountList.getSelectedRow();
            if (rows != -1) {
                Value.CUST_ACCOUNT_CODE = "" + tbAccountList.getValueAt(rows, 1);
                selectItem = "" + tbAccountList.getValueAt(rows, 1);
                dispose();
            } else {
                selectItem = null;
            }
        }
    }//GEN-LAST:event_tbAccountListKeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        loadListAccount(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadListAccount(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbAccountList;
    // End of variables declaration//GEN-END:variables

    private void loadListAccount() {
        DefaultTableModel model = (DefaultTableModel) tbAccountList.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        tbAccountList.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbAccountList.setRowHeight(30);
        JTableHeader tHeader = tbAccountList.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        try {
            String sql = "select * "
                    + "from cb_save_account "
                    + "where account_status='1' "
                    + "order by account_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while (rs.next()) {
                count++;
                model.addRow(new Object[]{
                    count,
                    rs.getString("ACCOUNT_CODE"),
                    NumberFormat.showDouble2(rs.getDouble("B_BALANCE")),
                    ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_NAME")),
                    ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_LASTNAME"))
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadListAccount(String text) {
        DefaultTableModel model = (DefaultTableModel) tbAccountList.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        
        text = ThaiUtil.Unicode2ASCII(text);
        tbAccountList.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbAccountList.setRowHeight(30);
        JTableHeader tHeader = tbAccountList.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        try {
            String sql = "select * "
                    + "from cb_save_account s "
                    + "where account_status='1' "
                    + "and B_CUST_NAME like '%" + text + "%' "
                    + "or account_code like '%"+text+"%' "
                    + "order by account_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while (rs.next()) {
                count++;
                model.addRow(new Object[]{
                    count,
                    rs.getString("ACCOUNT_CODE"),
                    NumberFormat.showDouble2(rs.getDouble("B_BALANCE")),
                    ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_NAME")),
                    ThaiUtil.ASCII2Unicode(rs.getString("B_CUST_LASTNAME"))
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
