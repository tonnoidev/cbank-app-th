package th.co.cbank.project.view;

import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.project.log.Log;
import th.co.cbank.util.FTPUtility;

public class FileConfigDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(FileConfigDialog.class);

    public FileConfigDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        try {
            Image im = ImageIO.read(getClass().getResource("/img/deposit.png"));
            setIconImage(im);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        readConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbDatabaseMaster = new javax.swing.JComboBox();
        cbDatabaseMember = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPort = new javax.swing.JComboBox();
        txtMacno = new javax.swing.JTextField();
        cbCharset = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnTestConnect = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ftp_server = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ftp_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftp_port = new javax.swing.JTextField();
        ftp_root_path = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ftp_list_dir = new javax.swing.JTextArea();
        ftp_pass = new javax.swing.JPasswordField();
        btnDownload = new javax.swing.JButton();
        pb1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("จัดการไฟล์สำหรับเชื่อมต่อฐานข้อมูล");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setText("ออก (Close)");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ลงทะเบียนเพื่อใช้งานโปรแกรม");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "เลือกฐานข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Database");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Database Member");

        cbDatabaseMaster.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbDatabaseMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDatabaseMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDatabaseMember, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbDatabaseMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbDatabaseMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายละเอียดการเชื่อมต่อฐานข้อมูล", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Charset");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Username");

        txtServer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtServer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Port");

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Mac No.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Server");

        cbPort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3306", "3307", "3308", "3309" }));

        txtMacno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMacno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cbCharset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbCharset.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tis-620", "utf-8" }));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Password");

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnTestConnect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTestConnect.setText("ทดสอบการเชื่อมต่อ");
        btnTestConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestConnectActionPerformed(evt);
            }
        });
        jPanel4.add(btnTestConnect);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMacno)
                            .addComponent(cbPort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCharset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword)
                            .addComponent(txtUsername)
                            .addComponent(txtServer))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbCharset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtMacno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Database Configuration", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Server :");

        ftp_server.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_server.setText("softerp.homeip.net");
        ftp_server.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Username :");

        ftp_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_user.setText("ftpuser");
        ftp_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Port :");

        ftp_port.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_port.setText("21");
        ftp_port.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        ftp_root_path.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_root_path.setText("ton/jeffer");
        ftp_root_path.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Root Path :");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Test Connection");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ftp_list_dir.setEditable(false);
        ftp_list_dir.setColumns(20);
        ftp_list_dir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_list_dir.setRows(5);
        ftp_list_dir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane1.setViewportView(ftp_list_dir);

        ftp_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ftp_pass.setText("password");
        ftp_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnDownload.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDownload.setText("Download Test");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftp_server)
                    .addComponent(ftp_user, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(ftp_port)
                    .addComponent(ftp_root_path, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDownload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ftp_pass))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftp_server, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ftp_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftp_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftp_port, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftp_root_path, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(pb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("FTP Configuration", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnTestConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConnectActionPerformed
        testConnection();
    }//GEN-LAST:event_btnTestConnectActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisterDialog rd = new RegisterDialog(null, true);
        rd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TestFtpConnect();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        new Thread(new Runnable() {

            @Override
            public void run() {
                downloadFile();
            }
        }).start();
    }//GEN-LAST:event_btnDownloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTestConnect;
    private javax.swing.JComboBox cbCharset;
    private javax.swing.JComboBox cbDatabaseMaster;
    private javax.swing.JComboBox cbDatabaseMember;
    private javax.swing.JComboBox cbPort;
    private javax.swing.JTextArea ftp_list_dir;
    private javax.swing.JPasswordField ftp_pass;
    private javax.swing.JTextField ftp_port;
    private javax.swing.JTextField ftp_root_path;
    private javax.swing.JTextField ftp_server;
    private javax.swing.JTextField ftp_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JTextField txtMacno;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void testConnection() {
        Connection connect;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Log.write.info("Driver Loaded.");

            String jdbcUrl = "jdbc:mysql://"
                    + "" + txtServer.getText() + ":" + cbPort.getSelectedItem() + ""
                    + "?charset=" + cbCharset.getSelectedItem();
            connect = DriverManager.getConnection(jdbcUrl, txtUsername.getText(), txtPassword.getText());
            cbDatabaseMaster.removeAllItems();
            cbDatabaseMember.removeAllItems();
            try {
                String sql = "show databases";
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String db = rs.getString(1);
                    if (!db.equals("information_schema") || !db.equals("mysql")) {
                        cbDatabaseMaster.addItem("" + db);
                        cbDatabaseMember.addItem("" + db);
                    }
                }
                rs.close();
                stmt.close();
                connect.close();

                Properties prop = new Properties();
                InputStream input = new FileInputStream("itfinger_conf.txt");
                prop.load(input);
                String database = prop.getProperty("database");
                String databaseMember = prop.getProperty("database_member");
                cbDatabaseMaster.setSelectedItem("" + database);
                cbDatabaseMember.setSelectedItem("" + databaseMember);
            } catch (IOException | SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error Connection", JOptionPane.ERROR_MESSAGE);
                Log.write.error(e.getMessage());
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void readConfig() {
        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("itfinger_conf.txt");
            prop.load(input);

            String server = prop.getProperty("server");
            String user = prop.getProperty("username");
            String pass = prop.getProperty("password");
            String port = prop.getProperty("port");
            String charset = prop.getProperty("charset");
            String macno = prop.getProperty("macno");
            txtServer.setText(server);
            txtUsername.setText(user);
            txtPassword.setText(pass);
            cbPort.setSelectedItem("" + port);
            cbCharset.setSelectedItem("" + charset);
            txtMacno.setText(macno);

            //for ftp
            String ftpServer = prop.getProperty("ftp_server");
            String ftpUser = prop.getProperty("ftp_user");
            String ftpPass = prop.getProperty("ftp_path");
            String ftpPort = prop.getProperty("ftp_port");
            String ftpRootPath = prop.getProperty("ftp_root_path");

            if (ftpServer != null) {
                ftp_server.setText(ftpServer);
            } else {
                ftp_server.setText("softerp.homeip.net");
            }
            if (ftpUser != null) {
                ftp_user.setText(ftpUser);
            } else {
                ftp_user.setText("ftpuser");
            }
            if (ftpPass != null) {
                ftp_pass.setText(ftpPass);
            } else {
                ftp_pass.setText("password");
            }
            if (ftpPort != null) {
                ftp_port.setText(ftpPort);
            } else {
                ftp_port.setText("21");
            }
            if (ftpRootPath != null) {
                ftp_root_path.setText(ftpRootPath);
            } else {
                ftp_root_path.setText("/");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Read config file Error !", JOptionPane.ERROR_MESSAGE);
            Log.write.error(e.getMessage() + "\n" + e.getMessage());
        }
    }

    private void saveFile() {
        String fileName = "itfinger_conf.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bf = new BufferedWriter(fileWriter);
            bf.write("server=" + txtServer.getText() + "\n");
            bf.write("database=" + cbDatabaseMaster.getSelectedItem() + "\n");
            bf.write("database_member=" + cbDatabaseMember.getSelectedItem() + "\n");
            bf.write("username=" + txtUsername.getText() + "\n");
            bf.write("password=" + txtPassword.getText() + "\n");
            bf.write("charset=" + cbCharset.getSelectedItem() + "\n");
            bf.write("port=" + cbPort.getSelectedItem() + "\n");
            bf.write("macno=" + txtMacno.getText() + "\n");
            bf.write("pathscan=\n");
            bf.write("pathexe=\n");
            bf.write("use_finger=N\n");
            bf.write("only_hoon_form=Y\n");
            bf.write("report_type=1\n");

            //for ftp configuration
            bf.write("ftp_server=" + ftp_server.getText() + "\n");
            bf.write("ftp_user=" + ftp_user.getText() + "\n");
            bf.write("ftp_pass=" + ftp_pass.getText() + "\n");
            bf.write("ftp_port=" + ftp_port.getText() + "\n");
            bf.write("ftp_root_path=" + ftp_root_path.getText() + "\n");

            bf.close();

            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว [" + fileName + " ]");
            Log.write.info("บันทึกข้อมูลเรียบร้อยแล้ว [" + fileName + " ]");
            dispose();
        } catch (IOException ex) {
            Log.write.error(ex.getMessage() + "\nError writing to file '" + fileName + "'");
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void TestFtpConnect() {
        FTPUtility ftp = new FTPUtility(ftp_server.getText(), ftp_user.getText(), ftp_pass.getText(), ftp_port.getText());
        if (ftp.connect()) {
            ftp_list_dir.append("Connect to [" + ftp_server.getText() + "] is Success.\n");
        } else {
            ftp_list_dir.append("Connect to [" + ftp_server.getText() + "] is Failure !!!.\n");
        }

        if (ftp.disconnect()) {
            ftp_list_dir.append("Closed Connection.\n");
        }
    }

    private void downloadFile() {
        String tempFolder = "download";
        String logFolder = "log";

        String fileName = "dist.zip";
        FTPUtility ftp = new FTPUtility(ftp_server.getText(), ftp_user.getText(), ftp_pass.getText(), ftp_port.getText());
        ftp.setPb(pb1);
        try {
            new File(tempFolder).mkdir();
            new File("backup").mkdir();
            new File("update").mkdir();
            new File(logFolder).mkdir();
            if (ftp.connect()) {
                ftp_list_dir.append("Start Download.\n");
                File fileDownload = new File(tempFolder + "/" + fileName);
                File fileExtract = new File("");
                
                if (ftp.download(ftp_root_path.getText() + "/" + "update/" + fileName,
                        fileDownload)) {
                    ftp_list_dir.append("Download file " + fileName + " is Success .\n");

                    SimpleDateFormat simp = new SimpleDateFormat("ddMMyyyyHHmm", Locale.ENGLISH);
                    Date d = new Date();
                    File f = new File(simp.format(d) + ".download");
                    f.createNewFile();
                    if (ftp.upload(f.getName(), ftp_root_path.getText() + "/log/" + f.getName())) {
                        f.delete();
                        
                        //unzip
                        //ZipUtility zipUtil = new ZipUtility();
                        //zipUtil.unzip(fileDownload, fileExtract);
                    }
                } else {
                    ftp_list_dir.append("Download file " + fileName + " is Failure !!! .\n");
                }
            }

            if (ftp.disconnect()) {
                ftp_list_dir.append("Closed Connection.\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
