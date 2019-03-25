package th.co.cbank.project.view;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.log.Log;

public class DatabaseDumpDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(DatabaseDumpDialog.class);

    public DatabaseDumpDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    class DumpDB {

        public void backup() {
            try {
                Runtime rt = Runtime.getRuntime();
                //C:/Program Files (x86)/MySQL/MySQL Server 5.0/bin/
                String sql_bin = txtMySQLPath.getText();
                //D:/backup_sql/cbsystem2.sql
                String sql_target_path = txtBackupFileTarget.getText();
                String sql_user = txtMySqlUser.getText();
                String sql_pass = txtMySqlPass.getText();
                String sql_db = txtMySqlDBName.getText();
                String sql_port = txtMySqlPort.getText();
                rt.exec(sql_bin + "mysqldump -port" + sql_port + " -u" + sql_user + " -p" + sql_pass + " "
                        + sql_db + " "
                        + "-r  " + sql_target_path);
                JOptionPane.showMessageDialog(null, "Backup ฐานข้อมูลเรียบร้อยแล้ว");
                Log.write.info("Backup database success");
                dispose();
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, "พบปัญหาในการ Backup ข้อมูล");
                Log.write.error(ioe.getMessage());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnFindMySQLPath = new javax.swing.JButton();
        btnConncet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatabaseList = new javax.swing.JTable();
        btnBackup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        txtMySQLPath = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pbBackup = new javax.swing.JProgressBar();
        btnFindTarget = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMySqlUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMySqlPass = new javax.swing.JPasswordField();
        txtBackupFileTarget = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMySqlPort = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMySqlDBName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("สำรองข้อมูล");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Username:");

        btnFindMySQLPath.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindMySQLPath.setText("ค้นหา");
        btnFindMySQLPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindMySQLPathActionPerformed(evt);
            }
        });

        btnConncet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConncet.setText("Connect");
        btnConncet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConncetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("File Backup Path:");

        tbDatabaseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ชื่อฐานข้อมูล", "จำนวนตาราง"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDatabaseList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbDatabaseList);

        btnBackup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBackup.setText("Backup Database");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("MySQL Path:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("*รหัสผ่านจะต้องไม่ใช่ค่าว่าง");

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setText("Cancel (Close)");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtMySQLPath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMySQLPath.setText("C:/Program Files (x86)/MySQL/MySQL Server 5.0/bin/");
        txtMySQLPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMySQLPath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMySQLPathKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("ความคืบหน้าของกระบวนการ Backup ข้อมูล");

        pbBackup.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(pbBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnFindTarget.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindTarget.setText("เลือกที่อยู่");
        btnFindTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindTargetActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Password:");

        txtMySqlUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMySqlUser.setText("root");
        txtMySqlUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("เลือกฐานข้อมูลที่ต้องการ Backup");

        txtMySqlPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMySqlPass.setText("000000");
        txtMySqlPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtBackupFileTarget.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBackupFileTarget.setText("D:/backup_sql/cbsystem.sql");
        txtBackupFileTarget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Port:");

        txtMySqlPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMySqlPort.setText("3306");
        txtMySqlPort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Database Name:");

        txtMySqlDBName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMySqlDBName.setText("cbsystem");
        txtMySqlDBName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMySQLPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFindMySQLPath, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtMySqlDBName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConncet)
                                        .addGap(161, 161, 161))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBackupFileTarget)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFindTarget)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtMySqlPass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMySqlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnBackup)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtMySqlPort, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMySQLPath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindMySQLPath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMySqlUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMySqlPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMySqlPort, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMySqlDBName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btnConncet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFindTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtBackupFileTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        DumpDB dd = new DumpDB();
        dd.backup();
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnFindTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindTargetActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(txtBackupFileTarget.getText()));
        chooser.setDialogTitle("เลือก File สำหรับ Backup ฐานข้อมูล");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String fileSelected = "" + chooser.getSelectedFile();
            txtBackupFileTarget.setText("" + fileSelected.replace("\\", "/") + txtMySqlDBName.getText());
        }
    }//GEN-LAST:event_btnFindTargetActionPerformed

    private void btnConncetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConncetActionPerformed

    }//GEN-LAST:event_btnConncetActionPerformed

    private void btnFindMySQLPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindMySQLPathActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(txtMySQLPath.getText()));
        chooser.setDialogTitle("เลือก Path MySQL/bin");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String fileSelected = "" + chooser.getSelectedFile();
            txtMySQLPath.setText("" + fileSelected.replace("\\", "/"));
        }
    }//GEN-LAST:event_btnFindMySQLPathActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtMySQLPathKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMySQLPathKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_txtMySQLPathKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConncet;
    private javax.swing.JButton btnFindMySQLPath;
    private javax.swing.JButton btnFindTarget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar pbBackup;
    private javax.swing.JTable tbDatabaseList;
    private javax.swing.JTextField txtBackupFileTarget;
    private javax.swing.JTextField txtMySQLPath;
    private javax.swing.JTextField txtMySqlDBName;
    private javax.swing.JPasswordField txtMySqlPass;
    private javax.swing.JTextField txtMySqlPort;
    private javax.swing.JTextField txtMySqlUser;
    // End of variables declaration//GEN-END:variables
}
