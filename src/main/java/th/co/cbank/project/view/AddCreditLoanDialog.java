package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.ProfileBean;

public class AddCreditLoanDialog extends BaseDialogSwing {
    
    private final Logger logger = Logger.getLogger(AddCreditLoanDialog.class);

    public AddCreditLoanDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        ProfileBean pBean = getProfileControl().listCbProfile(Value.CUST_CODE);
        txtCreditAmt1.setText("" + pBean.getLoan_Credit_Amt());
        txtLoanMaxAmt.setText("" + pBean.getLoan_Credit_Balance());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtLoanMaxAmt = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCreditAmt1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtCreditAmt2 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("เพิ่มวงเงินเครดิตให้กับสมาชิก");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("บันทึกข้อมูลเงินกู้");
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

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลเงินกู้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel8.setOpaque(false);

        txtLoanMaxAmt.setEditable(false);
        txtLoanMaxAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanMaxAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanMaxAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanMaxAmt.setText("0.00");
        txtLoanMaxAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("วงเงินสินเชื่อ");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("บาท");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("บาท");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("จำนวนเงินคงเหลือ");

        txtCreditAmt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCreditAmt1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCreditAmt1.setText("0.00");
        txtCreditAmt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCreditAmt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreditAmt1FocusGained(evt);
            }
        });
        txtCreditAmt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditAmt1KeyReleased(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("ปรับวงเงินสินเชื่อ");

        txtCreditAmt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCreditAmt2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCreditAmt2.setText("0.00");
        txtCreditAmt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCreditAmt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCreditAmt2FocusGained(evt);
            }
        });
        txtCreditAmt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCreditAmt2KeyReleased(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setText("บาท");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel50)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtLoanMaxAmt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCreditAmt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreditAmt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel90))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtCreditAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtCreditAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtLoanMaxAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ยกเลิก (Close)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCreditAmt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditAmt1FocusGained
        txtCreditAmt1.selectAll();
    }//GEN-LAST:event_txtCreditAmt1FocusGained

    private void txtCreditAmt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditAmt1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2.requestFocus();
        } else {
            try {
                double d = Double.parseDouble(txtCreditAmt1.getText());
                txtLoanMaxAmt.setText("" + d);
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_txtCreditAmt1KeyReleased

    private void txtCreditAmt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCreditAmt2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditAmt2FocusGained

    private void txtCreditAmt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreditAmt2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditAmt2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        saveLoanAllow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveLoanAllow() {
        //update ar credit amount
        try {
            String idCard = Value.CUST_CODE;
            double tCreditAmt1 = Double.parseDouble(txtCreditAmt1.getText());
            String sql = "update cb_profile set "
                    + "Loan_Credit_Amt = '" + tCreditAmt1 + "',"
                    + "Loan_Credit_Balance = '" + tCreditAmt1 + "' "
                    + "where p_CustCode='" + idCard + "';";
            MySQLConnect.exeUpdate(sql);

            //save history
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
            jButton1.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtCreditAmt1;
    private javax.swing.JTextField txtCreditAmt2;
    private javax.swing.JTextField txtLoanMaxAmt;
    // End of variables declaration//GEN-END:variables
}
