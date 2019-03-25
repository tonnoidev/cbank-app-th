package th.co.cbank.project.view;

import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.GroupBean;
import th.co.cbank.project.model.CbUserBean;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;

public class ConfigDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(ConfigDialog.class);

    public ConfigDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initChk();

        loadListGroup();
        loadListUser();
        
        setLocation(0, 0);
        setSize(parent.getMaximumSize());

        txtBranchCode.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBranchCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBranchAt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTambol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAmphur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProvince = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFax = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtManager = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtGroupCode = new javax.swing.JTextField();
        txtGroupName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        chk16 = new javax.swing.JCheckBox();
        chk17 = new javax.swing.JCheckBox();
        chk18 = new javax.swing.JCheckBox();
        chk19 = new javax.swing.JCheckBox();
        chk20 = new javax.swing.JCheckBox();
        chk22 = new javax.swing.JCheckBox();
        chk21 = new javax.swing.JCheckBox();
        chk23 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGroup = new javax.swing.JTable();
        btnGroupCancel = new javax.swing.JButton();
        btnGroupSave = new javax.swing.JButton();
        rdSelect = new javax.swing.JRadioButton();
        rdUnSelect = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cbGroup = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtUserPass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtUserCode = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtUserIDCode = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        txtUser_Addr = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtUser_AddrNo = new javax.swing.JTextField();
        txtUser_AddrSoi = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txtUser_AddrRoad = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtUser_AddrTambon = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtUser_AddrAmphur = new javax.swing.JTextField();
        txtUser_AddrPost = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txtUser_AddrProvince = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtUser_AddrTel = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtUser_AddrHome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("การตั้งค่าระบบ");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("รหัสสาขา");

        txtBranchCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtBranchCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBranchCodeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ชื่อสาขา");

        txtBranchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtBranchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBranchNameKeyPressed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายละเอียดสาขา", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("สถานที่ตั้ง เลขที่");

        txtBranchAt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchAt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtBranchAt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBranchAtKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("แขวง/ตำบล");

        txtTambol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTambol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTambol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTambolKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("เขต/อำเภอ");

        txtAmphur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmphur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAmphur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmphurKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("จังหวัด");

        txtProvince.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProvince.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtProvince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProvinceKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("รหัสไปรษณีย์");

        txtPost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPostKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("เบอร์โทรศัพท์");

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("เบอร์โทรสาร");

        txtFax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFaxKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("อี-เมลล์");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtManager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtManager.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("ชื่อผู้จัดการสาขา");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtManager, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancel.setText("ยกเลิก");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTambol, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAmphur, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPost, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtBranchAt)
                                .addComponent(txtEmail)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBranchAt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTambol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAmphur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ข้อมูลสาขา", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("รหัสกลุ่ม");

        txtGroupCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGroupCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtGroupCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGroupCodeKeyPressed(evt);
            }
        });

        txtGroupName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtGroupName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("ชื่อกลุ่ม");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chk1.setBackground(new java.awt.Color(255, 255, 255));
        chk1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk1.setSelected(true);
        chk1.setText("ลงทะเบียนผู้ใช้งาน");

        chk2.setBackground(new java.awt.Color(255, 255, 255));
        chk2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk2.setSelected(true);
        chk2.setText("แก้ไข/ให้สินเชื่อ");

        chk4.setBackground(new java.awt.Color(255, 255, 255));
        chk4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk4.setSelected(true);
        chk4.setText("ฝากเงิน");

        chk5.setBackground(new java.awt.Color(255, 255, 255));
        chk5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk5.setSelected(true);
        chk5.setText("ถอนเงิน");

        chk8.setBackground(new java.awt.Color(255, 255, 255));
        chk8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk8.setSelected(true);
        chk8.setText("ซื้อหุ้น");

        chk9.setBackground(new java.awt.Color(255, 255, 255));
        chk9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk9.setSelected(true);
        chk9.setText("ขายหุ้น");

        chk12.setBackground(new java.awt.Color(255, 255, 255));
        chk12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk12.setSelected(true);
        chk12.setText("กู้เงิน");

        chk13.setBackground(new java.awt.Color(255, 255, 255));
        chk13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk13.setSelected(true);
        chk13.setText("รับชำระเงินกู้");

        chk10.setBackground(new java.awt.Color(255, 255, 255));
        chk10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk10.setSelected(true);
        chk10.setText("ตั้งค่าหุ้น");

        chk6.setBackground(new java.awt.Color(255, 255, 255));
        chk6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk6.setSelected(true);
        chk6.setText("ตั้งค่าเงินฝาก");

        chk3.setBackground(new java.awt.Color(255, 255, 255));
        chk3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk3.setSelected(true);
        chk3.setText("ค้นหาข้อมูล");

        chk14.setBackground(new java.awt.Color(255, 255, 255));
        chk14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk14.setSelected(true);
        chk14.setText("ตั้งค่าเงินกู้");

        chk7.setBackground(new java.awt.Color(255, 255, 255));
        chk7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk7.setSelected(true);
        chk7.setText("รายงานเงินฝาก");

        chk11.setBackground(new java.awt.Color(255, 255, 255));
        chk11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk11.setSelected(true);
        chk11.setText("รายงานหุ้น");

        chk15.setBackground(new java.awt.Color(255, 255, 255));
        chk15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk15.setSelected(true);
        chk15.setText("รายงานเงินกู้");

        chk16.setBackground(new java.awt.Color(255, 255, 255));
        chk16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk16.setSelected(true);
        chk16.setText("กำหนดข้อมูลสมาชิก");

        chk17.setBackground(new java.awt.Color(255, 255, 255));
        chk17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk17.setSelected(true);
        chk17.setText("กำหนดข้อมูลลูกหนี้");

        chk18.setBackground(new java.awt.Color(255, 255, 255));
        chk18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk18.setSelected(true);
        chk18.setText("รายงานผลประกอบการ");

        chk19.setBackground(new java.awt.Color(255, 255, 255));
        chk19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk19.setSelected(true);
        chk19.setText("ปิดสิ้นวัน");

        chk20.setBackground(new java.awt.Color(255, 255, 255));
        chk20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk20.setSelected(true);
        chk20.setText("ปันผลหุ้น");

        chk22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk22.setSelected(true);
        chk22.setText("ข้อมูลสาขา");
        chk22.setOpaque(false);

        chk21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk21.setSelected(true);
        chk21.setText("ข้อมูลกลุ่มผู้ใช้งาน");
        chk21.setOpaque(false);

        chk23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chk23.setSelected(true);
        chk23.setText("ตั้งค่าระบบ");
        chk23.setOpaque(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk1)
                            .addComponent(chk4)
                            .addComponent(chk8)
                            .addComponent(chk12))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk19)
                            .addComponent(chk16))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk13)
                    .addComponent(chk9)
                    .addComponent(chk5)
                    .addComponent(chk2)
                    .addComponent(chk17)
                    .addComponent(chk20))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk6)
                    .addComponent(chk10)
                    .addComponent(chk14)
                    .addComponent(chk18)
                    .addComponent(chk22)
                    .addComponent(chk3))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk23)
                    .addComponent(chk15)
                    .addComponent(chk11)
                    .addComponent(chk7)
                    .addComponent(chk21))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk1)
                    .addComponent(chk2)
                    .addComponent(chk3)
                    .addComponent(chk23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk4)
                    .addComponent(chk5)
                    .addComponent(chk6)
                    .addComponent(chk7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk8)
                    .addComponent(chk9)
                    .addComponent(chk10)
                    .addComponent(chk11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk12)
                    .addComponent(chk13)
                    .addComponent(chk14)
                    .addComponent(chk15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk17)
                    .addComponent(chk16)
                    .addComponent(chk18)
                    .addComponent(chk21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk19)
                    .addComponent(chk20)
                    .addComponent(chk22))
                .addContainerGap())
        );

        tbGroup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสกลุ่ม", "ชื่อกลุ่ม", "สิทธิ์การใช้งาน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGroupMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGroup);
        if (tbGroup.getColumnModel().getColumnCount() > 0) {
            tbGroup.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbGroup.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbGroup.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        btnGroupCancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGroupCancel.setText("ยกเลิก");
        btnGroupCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupCancelActionPerformed(evt);
            }
        });

        btnGroupSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGroupSave.setText("บันทึกข้อมูล");
        btnGroupSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroupSaveActionPerformed(evt);
            }
        });

        rdSelect.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdSelect);
        rdSelect.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdSelect.setSelected(true);
        rdSelect.setText("เลือกทั้งหมด");
        rdSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdSelectItemStateChanged(evt);
            }
        });

        rdUnSelect.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdUnSelect);
        rdUnSelect.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdUnSelect.setText("ไม่เลือกทั้งหมด");
        rdUnSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdUnSelectItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGroupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdSelect)
                                    .addComponent(rdUnSelect)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGroupSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGroupCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 171, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtGroupCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdUnSelect)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGroupSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGroupCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ข้อมูลกลุ่มผู้ใช้งาน", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cbGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("บันทึกข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสผู้ใช้งาน", "ชื่อ", "นามสกุล", "กลุ่มผู้ใช้งาน"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbUser);
        if (tbUser.getColumnModel().getColumnCount() > 0) {
            tbUser.getColumnModel().getColumn(0).setPreferredWidth(120);
            tbUser.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbUser.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbUser.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("ยกเลิก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("กลุ่มผู้ใช้");

        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel28.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("นามสกุล");

        txtUserPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUserPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserPassKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("รหัสใช้งาน");

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLastNameKeyPressed(evt);
            }
        });

        txtUserCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUserCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserCodeKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("รหัสผ่าน");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("ชื่อผู้ใช้งาน");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel86.setText("่เลขที่บัตรประชาชน");

        txtUserIDCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserIDCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUserIDCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserIDCodeKeyPressed(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(255, 204, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ข้อมูลที่อยู่", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel29.setOpaque(false);

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("บ้านเลขที่");

        txtUser_Addr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_Addr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_Addr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrKeyPressed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel88.setText("หมู่ที่");

        txtUser_AddrNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrNoKeyPressed(evt);
            }
        });

        txtUser_AddrSoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrSoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrSoi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrSoiKeyPressed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("ซอย");

        txtUser_AddrRoad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrRoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrRoad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrRoadKeyPressed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel90.setText("ถนน");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel91.setText("ตำบล/แขวง");

        txtUser_AddrTambon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrTambon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrTambon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrTambonKeyPressed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("อำเภอ/เขต");

        txtUser_AddrAmphur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrAmphur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrAmphur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrAmphurKeyPressed(evt);
            }
        });

        txtUser_AddrPost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrPost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser_AddrPost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrPost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrPostKeyPressed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("รหัสไปรษณีย์");

        txtUser_AddrProvince.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrProvince.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrProvince.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrProvinceKeyPressed(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel94.setText("จังหวัด");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel95.setText("เบอร์โทรศัพท์");

        txtUser_AddrTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser_AddrTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrTelKeyPressed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel96.setText("เบอร์บ้าน");

        txtUser_AddrHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser_AddrHome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser_AddrHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtUser_AddrHome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUser_AddrHomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel95))
                    .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser_AddrProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrTambon, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrRoad, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel89)))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel93))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser_AddrAmphur, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrHome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrSoi, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtUser_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88)
                    .addComponent(txtUser_AddrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtUser_AddrRoad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(txtUser_AddrSoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtUser_AddrTambon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrAmphur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(txtUser_AddrProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser_AddrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(txtUser_AddrTel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96)
                    .addComponent(txtUser_AddrHome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserCode, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtUserIDCode))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtUserCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtUserIDCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ข้อมูลผู้ใช้งาน", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {           
            String sql = "update cb_branch set "
                    + "code='"+txtBranchCode.getText()+"',"
                    + "name='" + ThaiUtil.Unicode2ASCII(txtBranchName.getText()) + "',"
                    + "addressno='" + ThaiUtil.Unicode2ASCII(txtBranchAt.getText()) + "',"
                    + "locality='" + ThaiUtil.Unicode2ASCII(txtTambol.getText()) + "',"
                    + "subprovince='" + ThaiUtil.Unicode2ASCII(txtAmphur.getText()) + "',"
                    + "province='" + ThaiUtil.Unicode2ASCII(txtProvince.getText()) + "',"
                    + "post='" + txtPost.getText() + "',"
                    + "tel_no='" + txtTel.getText() + "',"
                    + "fax_no='" + txtFax.getText() + "',"
                    + "e_mail='" + txtEmail.getText() + "',"
                    + "manager='" + ThaiUtil.Unicode2ASCII(txtManager.getText()) + "' ";
            MySQLConnect.exeUpdate(sql);
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnGroupSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupSaveActionPerformed
        if (!txtGroupCode.getText().equals("")) {
            saveGroup();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบถ้วน");
            txtGroupCode.requestFocus();
        }
    }//GEN-LAST:event_btnGroupSaveActionPerformed

    private void btnGroupCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroupCancelActionPerformed
        resetForm();
    }//GEN-LAST:event_btnGroupCancelActionPerformed

    private void rdSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdSelectItemStateChanged
        if (rdSelect.isSelected()) {
            selectAll();
        }
    }//GEN-LAST:event_rdSelectItemStateChanged

    private void rdUnSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdUnSelectItemStateChanged
        if (rdUnSelect.isSelected()) {
            unSelectAll();
        }
    }//GEN-LAST:event_rdUnSelectItemStateChanged

    private void txtUserCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUserPass.requestFocus();
        }
    }//GEN-LAST:event_txtUserCodeKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLastName.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUserIDCode.requestFocus();
        }
    }//GEN-LAST:event_txtLastNameKeyPressed

    private void txtGroupCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGroupCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtGroupName.requestFocus();
        }
    }//GEN-LAST:event_txtGroupCodeKeyPressed

    private void txtBranchCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBranchCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBranchName.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtBranchCodeKeyPressed

    private void txtBranchNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBranchNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtBranchAt.requestFocus();
        }
    }//GEN-LAST:event_txtBranchNameKeyPressed

    private void txtBranchAtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBranchAtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTambol.requestFocus();
        }
    }//GEN-LAST:event_txtBranchAtKeyPressed

    private void txtTambolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTambolKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAmphur.requestFocus();
        }
    }//GEN-LAST:event_txtTambolKeyPressed

    private void txtAmphurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmphurKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtProvince.requestFocus();
        }
    }//GEN-LAST:event_txtAmphurKeyPressed

    private void txtProvinceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPost.requestFocus();
        }
    }//GEN-LAST:event_txtProvinceKeyPressed

    private void txtPostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPostKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTel.requestFocus();
        }
    }//GEN-LAST:event_txtPostKeyPressed

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFax.requestFocus();
        }
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtFaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtFaxKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtManager.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txtUserCode.getText().equals("") || !txtUserPass.getText().equals("")) {
            saveUser();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบถ้วน");
            txtUserCode.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUserIDCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_Addr.requestFocus();
        }
    }//GEN-LAST:event_txtUserIDCodeKeyPressed

    private void txtUser_AddrTambonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrTambonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrAmphur.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrTambonKeyPressed

    private void txtUser_AddrAmphurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrAmphurKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrProvince.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrAmphurKeyPressed

    private void txtUser_AddrPostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrPostKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrTel.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrPostKeyPressed

    private void txtUser_AddrProvinceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrProvinceKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrPost.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrProvinceKeyPressed

    private void txtUser_AddrTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrTelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrHome.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrTelKeyPressed

    private void txtUser_AddrHomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrHomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSave.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrHomeKeyPressed

    private void txtUserPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtName.requestFocus();
        }
    }//GEN-LAST:event_txtUserPassKeyPressed

    private void txtUser_AddrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrNo.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrKeyPressed

    private void txtUser_AddrNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrNoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrRoad.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrNoKeyPressed

    private void txtUser_AddrRoadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrRoadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrSoi.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrRoadKeyPressed

    private void txtUser_AddrSoiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_AddrSoiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtUser_AddrTambon.requestFocus();
        }
    }//GEN-LAST:event_txtUser_AddrSoiKeyPressed

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbUser.getSelectedRow();
            if (rows != -1) {
                String userCode = tbUser.getValueAt(rows, 0).toString();                
                CbUserBean user = getUserControl().listUser(userCode);
                txtUserCode.setText(user.getUsername());
                txtUserCode.setEditable(false);
                txtUserPass.setText(user.getPassword());
                txtName.setText(user.getName());
                txtLastName.setText(user.getLastname());
                txtUserIDCode.setText(user.getIDCard());
                cbGroup.setSelectedItem("" + user.getUsergroup());

                txtUser_Addr.setText(user.getAddr_no());
                txtUser_AddrNo.setText("" + user.getAddr_moo());
                txtUser_AddrRoad.setText(user.getAddr_road());
                txtUser_AddrTambon.setText(user.getAddr_tambon());
                txtUser_AddrAmphur.setText(user.getAddr_amphur());
                txtUser_AddrProvince.setText(user.getAddr_province());
                txtUser_AddrTel.setText(user.getAddr_tel());
                txtUser_AddrHome.setText(user.getAddr_tel_home());

                txtName.requestFocus();
            }
        }
    }//GEN-LAST:event_tbUserMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetFormEmp();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGroupMouseClicked
        int rows = tbGroup.getSelectedRow();
        if (rows != -1) {
            txtGroupCode.setEditable(false);
            txtGroupCode.setText("" + tbGroup.getValueAt(rows, 0));
            txtGroupName.setText("" + tbGroup.getValueAt(rows, 1));
            String[] permission = tbGroup.getValueAt(rows, 2).toString().split(",");
            for (int i = 0; i < permission.length; i++) {
                chkAll[i].setSelected(permission[i].equals("Y"));
            }

            txtGroupName.requestFocus();
        }
    }//GEN-LAST:event_tbGroupMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGroupCancel;
    private javax.swing.JButton btnGroupSave;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox cbGroup;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk16;
    private javax.swing.JCheckBox chk17;
    private javax.swing.JCheckBox chk18;
    private javax.swing.JCheckBox chk19;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk20;
    private javax.swing.JCheckBox chk21;
    private javax.swing.JCheckBox chk22;
    private javax.swing.JCheckBox chk23;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdSelect;
    private javax.swing.JRadioButton rdUnSelect;
    private javax.swing.JTable tbGroup;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField txtAmphur;
    private javax.swing.JTextField txtBranchAt;
    private javax.swing.JTextField txtBranchCode;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtGroupCode;
    private javax.swing.JTextField txtGroupName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPost;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtTambol;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUserCode;
    private javax.swing.JTextField txtUserIDCode;
    private javax.swing.JPasswordField txtUserPass;
    private javax.swing.JTextField txtUser_Addr;
    private javax.swing.JTextField txtUser_AddrAmphur;
    private javax.swing.JTextField txtUser_AddrHome;
    private javax.swing.JTextField txtUser_AddrNo;
    private javax.swing.JTextField txtUser_AddrPost;
    private javax.swing.JTextField txtUser_AddrProvince;
    private javax.swing.JTextField txtUser_AddrRoad;
    private javax.swing.JTextField txtUser_AddrSoi;
    private javax.swing.JTextField txtUser_AddrTambon;
    private javax.swing.JTextField txtUser_AddrTel;
    // End of variables declaration//GEN-END:variables

    private final JCheckBox[] chkAll = new JCheckBox[23];

    private void initChk() {
        chkAll[0] = chk1;
        chkAll[1] = chk2;
        chkAll[2] = chk3;
        chkAll[3] = chk4;
        chkAll[4] = chk5;
        chkAll[5] = chk6;
        chkAll[6] = chk7;
        chkAll[7] = chk8;
        chkAll[8] = chk9;
        chkAll[9] = chk10;
        chkAll[10] = chk11;
        chkAll[11] = chk12;
        chkAll[12] = chk13;
        chkAll[13] = chk14;
        chkAll[14] = chk15;
        chkAll[15] = chk16;
        chkAll[16] = chk17;
        chkAll[17] = chk18;
        chkAll[18] = chk19;
        chkAll[19] = chk20;
        chkAll[20] = chk21;
        chkAll[21] = chk22;
        chkAll[22] = chk23;

        tbGroup.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbUser.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));

        tbGroup.setRowHeight(30);
        tbUser.setRowHeight(30);

        JTableHeader hGroup = tbGroup.getTableHeader();
        hGroup.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        JTableHeader uGroup = tbUser.getTableHeader();
        uGroup.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        // load data branch
        BranchBean bean = getBranchControl().getData();
        txtBranchCode.setText(bean.getCode());
        txtBranchName.setText(ThaiUtil.ASCII2Unicode(bean.getName()));
        txtBranchAt.setText(ThaiUtil.ASCII2Unicode(bean.getAddressNo()));
        txtTambol.setText(ThaiUtil.ASCII2Unicode(bean.getLocality()));
        txtAmphur.setText(ThaiUtil.ASCII2Unicode(bean.getSubProvince()));
        txtProvince.setText(ThaiUtil.ASCII2Unicode(bean.getProvince()));
        txtPost.setText(bean.getPost());
        txtTel.setText(bean.getTel_No());
        txtEmail.setText(bean.getE_Mail());
        txtFax.setText(bean.getFax_No());
        txtManager.setText(ThaiUtil.ASCII2Unicode(bean.getManager()));

        loadListGroup();
    }

    private void selectAll() {
        for (JCheckBox chkAll1 : chkAll) {
            chkAll1.setSelected(true);
        }
    }

    private void unSelectAll() {
        for (JCheckBox chkAll1 : chkAll) {
            chkAll1.setSelected(false);
        }
    }

    private void loadListGroup() {
        try {
            String sql = "select * from cb_group";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            DefaultTableModel model = (DefaultTableModel) tbGroup.getModel();
            int size = model.getRowCount();
            for (int i = 0; i < size; i++) {
                model.removeRow(0);
            }

            cbGroup.removeAllItems();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("groupcode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("groupname")),
                    rs.getString("permission")
                });

                cbGroup.addItem(rs.getString("groupcode"));
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadListUser() {
        try {
            String sql = "select * from cb_user";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
            int size = model.getRowCount();
            for (int i = 0; i < size; i++) {
                model.removeRow(0);
            }

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("username"),
                    ThaiUtil.ASCII2Unicode(rs.getString("name")),
                    ThaiUtil.ASCII2Unicode(rs.getString("lastname")),
                    rs.getString("usergroup")
                });
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void resetFormEmp() {
        txtUserCode.setText("");
        txtUserPass.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtUserIDCode.setText("");
        txtUser_Addr.setText("");
        txtUser_AddrNo.setText("");
        txtUser_AddrRoad.setText("");
        txtUser_AddrTambon.setText("");
        txtUser_AddrAmphur.setText("");
        txtUser_AddrProvince.setText("");
        txtUser_AddrTel.setText("");
        txtUser_AddrHome.setText("");

        txtUserCode.setEditable(true);
        txtUserCode.requestFocus();
    }

    private void resetForm() {
        selectAll();
        txtGroupCode.setEditable(true);
        txtGroupCode.setText("");
        txtGroupName.setText("");
        txtGroupCode.requestFocus();
    }

    private void saveGroup() {
        GroupBean bean = new GroupBean();
        bean.setGroupCode(txtGroupCode.getText());
        bean.setGroupName(ThaiUtil.Unicode2ASCII(txtGroupName.getText()));
        String strPer = "";
        for (JCheckBox chkAll1 : chkAll) {
            boolean isSelect = chkAll1.isSelected();
            if (isSelect) {
                strPer += "Y,";
            } else {
                strPer += "N,";
            }
        }

        bean.setPermission(strPer.substring(0, strPer.length() - 1));
        getSettingControl().saveCbGroup(bean);
        loadListGroup();
        resetForm();

        JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
    }

    private void saveUser() {
        CbUserBean bean = new CbUserBean();
        bean.setUsergroup("" + cbGroup.getSelectedItem());
        bean.setName(ThaiUtil.Unicode2ASCII(txtName.getText()));
        bean.setLastname(ThaiUtil.Unicode2ASCII(txtLastName.getText()));
        bean.setPassword(txtUserPass.getText());
        bean.setUsername(txtUserCode.getText());
        bean.setIDCard(txtUserIDCode.getText());
        bean.setAddr_no(txtUser_Addr.getText());
        bean.setAddr_moo(txtUser_AddrNo.getText());
        bean.setAddr_road(ThaiUtil.Unicode2ASCII(txtUser_AddrRoad.getText()));
        bean.setAddr_soi(ThaiUtil.Unicode2ASCII(txtUser_AddrSoi.getText()));
        bean.setAddr_tambon(ThaiUtil.Unicode2ASCII(txtUser_AddrTambon.getText()));
        bean.setAddr_amphur(ThaiUtil.Unicode2ASCII(txtUser_AddrAmphur.getText()));
        bean.setAddr_province(ThaiUtil.Unicode2ASCII(txtUser_AddrProvince.getText()));
        bean.setAddr_post(txtUser_AddrPost.getText());
        bean.setAddr_tel(txtUser_AddrTel.getText());
        bean.setAddr_tel_home(txtUser_AddrHome.getText());
        
        getUserControl().saveUser(bean);
        JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
        resetFormEmp();

        loadListGroup();
        loadListUser();
    }

}
