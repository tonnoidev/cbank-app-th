package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.CbMemberTypeBean;

public class MemberTypeDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(MemberTypeDialog.class);

    public MemberTypeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();
        loadMemberTypeData();
        txtTypeCode.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMemberType = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTypeName = new javax.swing.JTextField();
        txtTypeCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        btnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("แฟ้มข้อมูลประเภทสมาชิก");

        tbMemberType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสประเภท", "ชื่อประเภท", "สมาชิก"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMemberType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMemberTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMemberType);
        if (tbMemberType.getColumnModel().getColumnCount() > 0) {
            tbMemberType.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbMemberType.getColumnModel().getColumn(1).setPreferredWidth(200);
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
        jLabel1.setText("รหัสประเภท");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ชื่อประเภท");

        txtTypeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTypeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeNameKeyPressed(evt);
            }
        });

        txtTypeCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTypeCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTypeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeCodeKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("สมาชิก");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("คน");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 คน", "มากกว่า 1 คน" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
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
        if(txtTypeCode.getText().equals("")){
            txtTypeCode.requestFocus();
        }else if(txtTypeName.getText().equals("")){
            txtTypeName.requestFocus();
        }else{
            CbMemberTypeBean bean = new CbMemberTypeBean();
            bean.setTypeCode(txtTypeCode.getText());
            bean.setTypeName(ThaiUtil.Unicode2ASCII(txtTypeName.getText()));
            bean.setMemberCount(jComboBox1.getSelectedIndex() + 1);

            
            if (getMemberTypeControl().saveMemberType(bean)) {
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
                loadMemberTypeData();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTypeCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!txtTypeCode.getText().equals("")){
                txtTypeName.requestFocus();
            }else{
                txtTypeCode.requestFocus();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtTypeCodeKeyPressed

    private void txtTypeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!txtTypeName.getText().equals("")){
                jComboBox1.requestFocus();
            }else{
                txtTypeName.requestFocus();
            }            
        }
    }//GEN-LAST:event_txtTypeNameKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtTypeCode.requestFocus();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void tbMemberTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMemberTypeMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbMemberType.getSelectedRow();
            if (rows != -1) {
                CbMemberTypeBean bean = getMemberTypeControl().listMemberType("" + tbMemberType.getValueAt(rows, 0));
                txtTypeCode.setText(bean.getTypeCode());
                txtTypeName.setText(bean.getTypeName());
                if(bean.getMemberCount()>1){
                    jComboBox1.setSelectedIndex(1);
                }else{
                    jComboBox1.setSelectedIndex(0);
                }

                txtTypeCode.setEditable(false);
                txtTypeName.requestFocus();
            }

        }
    }//GEN-LAST:event_tbMemberTypeMouseClicked

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnReset1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMemberType;
    private javax.swing.JTextField txtTypeCode;
    private javax.swing.JTextField txtTypeName;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        JTableHeader tHeader = tbMemberType.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbMemberType.setRowHeight(30);
        tbMemberType.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void loadMemberTypeData() {
        ArrayList<CbMemberTypeBean> listExp = getMemberTypeControl().listMemberType();
        DefaultTableModel model = (DefaultTableModel) tbMemberType.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        for (int i = 0; i < listExp.size(); i++) {
            CbMemberTypeBean bean = (CbMemberTypeBean) listExp.get(i);
            model.addRow(new Object[]{bean.getTypeCode(), bean.getTypeName(), bean.getMemberCount()});
        }

        resetData();
    }

    private void resetData() {
        txtTypeCode.setText("");
        txtTypeName.setText("");

        txtTypeCode.setEditable(true);
        jComboBox1.setSelectedIndex(0);
        txtTypeCode.requestFocus();
    }
}
