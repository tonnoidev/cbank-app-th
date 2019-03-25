package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.log.Log;

public class ResetDataToNewProgramDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ResetDataToNewProgramDialog.class);

    public ResetDataToNewProgramDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        tbListTable.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbListTable.setRowHeight(30);

        JTableHeader tHeader = tbListTable.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        loadTables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListTable = new javax.swing.JTable();
        txtFileName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cbListConfig = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reset Data");
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ยืนยันการ Reset Data");
        jButton1.setAutoscrolls(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ออก (Close)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ชื่อตาราง", "Empty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbListTable);
        if (tbListTable.getColumnModel().getColumnCount() > 0) {
            tbListTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbListTable.getColumnModel().getColumn(1).setPreferredWidth(155);
            tbListTable.getColumnModel().getColumn(2).setPreferredWidth(55);
        }

        txtFileName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFileName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("บันทึกการเลือก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbListConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbListConfig.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbListConfigKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เลือกรายการที่ตั้งค่าไว้");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("โหลด Config");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("ล้างข้อมูล Default");
        jButton5.setAutoscrolls(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbListConfig, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFileName)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbListConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        emptyTableSelected();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!txtFileName.getText().equals("")) {
            saveConfig();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากำหนดชื่อสำหรับบันทึกข้อมูล");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loadConfig();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        resetDB();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5KeyPressed

    private void cbListConfigKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbListConfigKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_cbListConfigKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbListConfig;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListTable;
    private javax.swing.JTextField txtFileName;
    // End of variables declaration//GEN-END:variables

    private void resetDB() {
        try {
            String sql = "update cb_profile set "
                    + "Hoon_Qty='0',"
                    + "Member_Point='0',"
                    + "AR_Balance='0.00',"
                    + "Save_Balance='0.00',"
                    + "Loan_Balance='0.00',"
                    + "Loan_Credit_Balance=Loan_Credit_Amt,"
                    + "status='" + ThaiUtil.Unicode2ASCII("ยังไม่เปิดบัญชี") + "',"
                    + "dow_incar_rai='0', dow_incar_tree='0',p_down_fee='0',p_prefix='¤Ø³' ";
            MySQLConnect.exeUpdate(sql);
//            MySQLConnect.exeUpdate("truncate cb_profile_address");

            MySQLConnect.exeUpdate("update cb_save_config set SaveRunning='1',NoRunning='1'");
            MySQLConnect.exeUpdate("truncate cb_save_account");

            MySQLConnect.exeUpdate("truncate cb_transaction_save");
            MySQLConnect.exeUpdate("truncate cb_transaction_loan");

            MySQLConnect.exeUpdate("truncate cb_loan_account");
            MySQLConnect.exeUpdate("truncate cb_loan_table");
            MySQLConnect.exeUpdate("truncate cb_loan_transaction");
            MySQLConnect.exeUpdate("update cb_loan_config set LoanRunning='1',BookNo='1'");

            MySQLConnect.exeUpdate("delete from cb_bondsman");
            //MySQLConnect.exeUpdate("delete from cb_fee_transaction");

            JOptionPane.showMessageDialog(this, "Clear Database Empty.");
            new File("cbanksystem.running").delete();
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void loadTables() {
        DefaultTableModel model = (DefaultTableModel) tbListTable.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }
        try {
            String sql = "show tables";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            int count = 0;
            while (rs.next()) {
                count++;
                String tableName = rs.getString(1);
                if (tableName.equals("cb_branch")||
                        tableName.equals("cb_config")||
                        tableName.equals("cb_fee")||
                        tableName.equals("cb_member_type")||
                        tableName.equals("cb_passbook_default")||
                        tableName.equals("cb_prefix")||
                        tableName.equals("cb_save_type")||
                        tableName.equals("cb_status")||
                        tableName.equals("cb_user")) {
                    
                } else {
                    model.addRow(new Object[]{
                        count,
                        rs.getString(1),
                        false
                    });
                }
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void saveConfig() {

    }

    private void loadConfig() {

    }

    private void emptyTableSelected() {
        DefaultTableModel model = (DefaultTableModel) tbListTable.getModel();
        boolean isSave = false;
        int countSave = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            String tableName = model.getValueAt(i, 1).toString();
            boolean isSelected = Boolean.parseBoolean(model.getValueAt(i, 2).toString());
            if (isSelected) {
                try {
                    MySQLConnect.exeUpdate("truncate " + tableName);
                    countSave++;
                    isSave = true;
                } catch (Exception ex) {
                    Log.write.error(ex.getMessage());
                }
            }
        }
        if (isSave) {
            JOptionPane.showMessageDialog(this, "ล้างข้อมูลตารางเรียบร้อยแล้ว " + countSave + " ตาราง");
            new File("cbanksystem.running").delete();
            System.exit(0);
        }
    }
}
