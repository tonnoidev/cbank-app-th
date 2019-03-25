package th.co.cbank.project.view;

import java.awt.Color;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbSaveAccountBean;

public class WaitDialog extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(WaitDialog.class);
    
    public WaitDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                ArrayList<CbSaveAccountBean> listBean = getSaveAccountControl().listCbSaveAccountActive();
                if (!listBean.isEmpty()) {
                    getSaveAccountControl().updateBefore1();
                }
                cbShow.setStringPainted(true);
                cbShow.setMaximum(listBean.size());
                cbShow.setValue(0);
                for (int i = 0; i < listBean.size(); i++) {
                    CbSaveAccountBean bean = (CbSaveAccountBean) listBean.get(i);
                    if (!bean.getB_CUST_CODE().equals("null")) {
                        //sac.updateInterestAPI(bean.getB_CUST_CODE(), bean.getAccount_code());
                        cbShow.setValue((i + 1));
                        cbShow.setString((i + 1) + "/" + listBean.size());
                    }
                }
                lbShow.setText("ระบบอัตเดตเรียบร้อยแล้ว จะปิดตัวในอีก 1 วินาที");
                jPanel2.setBackground(new Color(0, 204, 204));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }

                dispose();
            }
        });
        
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbShow = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        lbShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(255, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(255, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("กรุณารอสักครู่ระบบกำลังอัพเดตข้อมูลอัตราดอกเบี้ย");

        cbShow.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbShow.setBorderPainted(false);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbShow.setText("Wait...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbShow)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbShow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar cbShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbShow;
    // End of variables declaration//GEN-END:variables
}
