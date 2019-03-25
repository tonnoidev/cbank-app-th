package th.co.cbank.project.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class MainForm extends javax.swing.JFrame {

    private final JDesktopPane jdpDesktop;
    private Image img;

    public MainForm() {
        initComponents();
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);

        try {
            img = new ImageIcon(getClass().getResource("/img/bg.jpg")).getImage();
        } catch (Exception ex) {
        }

        jdpDesktop = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(img, 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(img.getWidth(null), img.getHeight(null));
            }
        };

        setContentPane(jdpDesktop);
        jdpDesktop.putClientProperty("JDesktopPane.dragMode", "outline");

        initAccordion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบบริหารธนาคารชุมชน V 1.0.4");

        jMenu1.setText("เมนูหลัก");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenu3.setText("สมุดบัญชีเงินฝาก");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("เปิดบัญชีเงินฝาก");
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("ฝากเงิน");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("ถอนเงิน");
        jMenu3.add(jMenuItem3);
        jMenu3.add(jSeparator2);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("ปิดบัญชีเงินฝาก");
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenu4.setText("สมุดบัญชีหุ้น");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("ซื้อหุ้น");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("ขายหุ้น");
        jMenu4.add(jMenuItem6);
        jMenu4.add(jSeparator3);

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("โอนหุ้น");
        jMenu4.add(jMenuItem7);

        jMenu1.add(jMenu4);

        jMenu5.setText("สมุดบัญชีเงินกู้");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("เปิดบัญชีเงินกู้");
        jMenu5.add(jMenuItem8);
        jMenu5.add(jSeparator4);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("รับชำระเงินกู้");
        jMenu5.add(jMenuItem9);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("แฟ้มข้อมูลหลัก");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu6.setText("ตั้งค่าระบบ");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables

    protected void createFrame(JInternalFrame frame) {
        frame.setSize(1024, 768);
        frame.setVisible(true);
        jdpDesktop.add(frame);
        try {
            frame.setSelected(true);
        } catch (PropertyVetoException e) {
        }
    }

    private void initAccordion() {
        
    }

}
