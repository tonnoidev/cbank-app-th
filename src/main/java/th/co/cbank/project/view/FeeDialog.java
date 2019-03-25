package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.CbFeeBean;

public class FeeDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(FeeDialog.class);

    public FeeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();
        loadExpenseData();
        txtExpendId.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbExpend = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtExpendName = new javax.swing.JTextField();
        txtExpendId = new javax.swing.JTextField();
        btnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แฟ้มข้อมูลค่าธรรมเนียม");

        tbExpend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสค่าธรรมเนียม", "รายการ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbExpend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExpendMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbExpend);
        if (tbExpend.getColumnModel().getColumnCount() > 0) {
            tbExpend.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbExpend.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setText("ยกเลิก");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึก");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("รหัสธรรมเนียม");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("รายการ");

        txtExpendName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtExpendName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtExpendName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExpendNameKeyPressed(evt);
            }
        });

        txtExpendId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtExpendId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtExpendId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExpendIdKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExpendName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpendId, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtExpendId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtExpendName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReset1.setBackground(new java.awt.Color(255, 51, 51));
        btnReset1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset1.setText("ออก (Close)");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtExpendId.getText().equals("")) {
            txtExpendId.requestFocus();
        } else if (txtExpendName.getText().equals("")) {
            txtExpendName.requestFocus();
        } else {
            CbFeeBean bean = new CbFeeBean();
            bean.setExp_id(txtExpendId.getText());
            bean.setExp_desc(ThaiUtil.Unicode2ASCII(txtExpendName.getText()));
            
            if (getCbFeeControl().saveExpense(bean)) {
                loadExpenseData();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtExpendIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpendIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtExpendId.getText().equals("")){
                txtExpendId.requestFocus();
            }else{
                txtExpendName.requestFocus();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtExpendIdKeyPressed

    private void txtExpendNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpendNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtExpendName.getText().equals("")){
                txtExpendName.requestFocus();
            }else{
                btnSave.requestFocus();
            }
        }
    }//GEN-LAST:event_txtExpendNameKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtExpendId.requestFocus();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void tbExpendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExpendMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbExpend.getSelectedRow();
            if (rows != -1) {
                CbFeeBean bean = getCbFeeControl().listExpense("" + tbExpend.getValueAt(rows, 0));
                txtExpendId.setText(bean.getExp_id());
                txtExpendName.setText(bean.getExp_desc());

                txtExpendId.setEditable(false);
                txtExpendName.requestFocus();
            }

        }
    }//GEN-LAST:event_tbExpendMouseClicked

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnReset1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbExpend;
    private javax.swing.JTextField txtExpendId;
    private javax.swing.JTextField txtExpendName;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        JTableHeader tHeader = tbExpend.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbExpend.setRowHeight(30);
        tbExpend.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void loadExpenseData() {
        ArrayList<CbFeeBean> listExp = getCbFeeControl().listExpense();
        DefaultTableModel model = (DefaultTableModel) tbExpend.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        for (int i = 0; i < listExp.size(); i++) {
            CbFeeBean bean = (CbFeeBean) listExp.get(i);
            model.addRow(new Object[]{bean.getExp_id(), ThaiUtil.ASCII2Unicode(bean.getExp_desc())});
        }

        resetData();
    }

    private void resetData() {
        txtExpendId.setText("");
        txtExpendName.setText("");

        txtExpendId.setEditable(true);
        txtExpendId.requestFocus();
    }
}
