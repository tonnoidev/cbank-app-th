package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;

public class EditProfileDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(EditProfileDialog.class);

    public EditProfileDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        txtCustCode.setText("");
        txtCustName.setText("");

        txtCustCode.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCustCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCustIndex = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เลือกข้อมูลลูกค้า");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("รหัสบัตรประชาชน/สมาชิก");

        txtCustCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCustCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustCodeKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ชื่อสมาชิก");

        txtCustName.setEditable(false);
        txtCustName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("แก้ไขข้อมูล");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("ออก (Close)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ลำดับสมาชิก");

        txtCustIndex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCustIndex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustIndexKeyPressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("เริ่มใหม่");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCustIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Value.CUST_CODE = null;
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        findData();
        
        jButton2.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!txtCustCode.getText().trim().equals("")) {
            Value.CUST_CODE = txtCustCode.getText();
            dispose();
        } else {
            Value.CUST_CODE = null;
            jButton5ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCustCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findData();

            jButton2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtCustCodeKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        jButton2ActionPerformed(null);
    }//GEN-LAST:event_jButton2KeyPressed

    private void txtCustIndexKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustIndexKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            findIndex();

            jButton2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtCustCode.selectAll();
            txtCustCode.requestFocus();
        }
    }//GEN-LAST:event_txtCustIndexKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        findIndex();
        
        jButton2.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtCustIndex.setEnabled(true);
        txtCustCode.setEnabled(true);
        txtCustName.setEnabled(true);
        
        txtCustCode.setText("");
        txtCustIndex.setText("");
        txtCustName.setText("");
        
        txtCustCode.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCustCode;
    private javax.swing.JTextField txtCustIndex;
    private javax.swing.JTextField txtCustName;
    // End of variables declaration//GEN-END:variables

    private void findData() {
        try {
            String sql = "select p_index, p_custcode, p_custname, p_custsurname "
                    + "from cb_profile "
                    + "where p_custcode='" + txtCustCode.getText() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                String code = rs.getString("p_custcode");
                String name = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                String surname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));
                txtCustIndex.setText(rs.getString("p_index"));
                txtCustCode.setText(code);
                txtCustName.setText(name + " " + surname);

                txtCustIndex.setEnabled(false);
                txtCustCode.setEnabled(false);
                txtCustName.setEnabled(false);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void findIndex() {
        try {
            String sql = "select p_index, p_custcode, p_custname, p_custsurname "
                    + "from cb_profile "
                    + "where p_index='" + txtCustIndex.getText() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                String code = rs.getString("p_custcode");
                String name = ThaiUtil.ASCII2Unicode(rs.getString("p_custname"));
                String surname = ThaiUtil.ASCII2Unicode(rs.getString("p_custsurname"));
                txtCustIndex.setText(rs.getString("p_index"));
                txtCustCode.setText(code);
                txtCustName.setText(name + " " + surname);

                txtCustIndex.setEnabled(false);
                txtCustCode.setEnabled(false);
                txtCustName.setEnabled(false);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
