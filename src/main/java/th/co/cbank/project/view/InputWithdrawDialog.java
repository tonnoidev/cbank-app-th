package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTextField;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbWithdrawAllowBean;
import th.co.cbank.project.model.ProfileBean;

public class InputWithdrawDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(InputWithdrawDialog.class);
    private final ArrayList<CbWithdrawAllowBean> listBean;
    private boolean allow = false;

    public InputWithdrawDialog(java.awt.Frame parent, boolean modal, ArrayList<CbWithdrawAllowBean> listBean) {
        super(parent, modal);
        initComponents();

        this.listBean = listBean;
    }

    public boolean allowPerson() {
        return allow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custCust1 = new javax.swing.JTextField();
        custCust2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        custCust3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        custCust4 = new javax.swing.JTextField();
        custCust5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        custCust6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายชื่อผู้มีสิทธิ์ถอน");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        custCust1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust1KeyPressed(evt);
            }
        });

        custCust2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ลำดับที่ 1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ลำดับที่ 2:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ลำดับที่ 3:");

        custCust3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust3KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("ลำดับที่ 4:");

        custCust4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust4KeyPressed(evt);
            }
        });

        custCust5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust5KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ลำดับที่ 5:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ยืนยัน");
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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("ลำดับที่ 6:");

        custCust6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        custCust6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        custCust6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custCust6KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ออก (Exit)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custCust2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCust1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCust3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCust4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCust5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custCust6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custCust6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 5, 0));

        pic1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic1);

        pic2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic2);

        pic3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic3);

        pic4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic4);

        pic5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic5);

        pic6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pic6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        pic6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(pic6);

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ข้อมูลผู้มีสิทธิ์ถอน");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custCust1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust1.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic1.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                custCust2.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust1KeyPressed

    private void custCust2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust2.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic2.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                custCust3.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust2KeyPressed

    private void custCust3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust3.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic3.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                custCust4.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust3KeyPressed

    private void custCust4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust4.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic4.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                custCust5.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust4KeyPressed

    private void custCust5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust5.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic5.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                custCust6.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust5KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        check();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void custCust6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCust6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            ProfileBean profile = getProfileControl().listCbProfile(custCust6.getText());
            if(profile!=null){
                if (!profile.getP_cust_pic_url().equals("")) {
                    pic6.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
                } else {
                    pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                }
                
                jButton1.requestFocus();
            }
        }
    }//GEN-LAST:event_custCust6KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custCust1;
    private javax.swing.JTextField custCust2;
    private javax.swing.JTextField custCust3;
    private javax.swing.JTextField custCust4;
    private javax.swing.JTextField custCust5;
    private javax.swing.JTextField custCust6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    // End of variables declaration//GEN-END:variables

    private void check() {
        JTextField[] txt = new JTextField[6];
        txt[0] = custCust1;
        txt[1] = custCust2;
        txt[2] = custCust3;
        txt[3] = custCust4;
        txt[4] = custCust5;
        txt[5] = custCust6;

        if (listBean != null) {
            int sizePerson = listBean.size();
            int inputPerson = 0;
            for (int i = 0; i < listBean.size(); i++) {
                CbWithdrawAllowBean bean = (CbWithdrawAllowBean) listBean.get(i);
                if (bean.getCust_code().equals(txt[i].getText())) {
                    inputPerson++;
                }
            }

            if (sizePerson == inputPerson) {
                allow = true;                
            }
        }
        
        dispose();
    }
}
