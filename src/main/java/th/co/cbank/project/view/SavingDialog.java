package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.control.Value;
import th.co.cbank.util.CopyFile;
import th.co.cbank.util.ImageSample;
import th.co.cbank.util.PIDCheck;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.CbWithdrawAllowBean;
import th.co.cbank.project.model.CbMemberTypeBean;
import th.co.cbank.project.model.CbPrefixBean;
import th.co.cbank.project.model.CbProjectBean;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.ImagePreviewPanel;

public class SavingDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(SavingDialog.class);
    private String imgName = "";
    private File imgFile = null;
    boolean isRegister = true;
    private Frame parent;

    public SavingDialog(java.awt.Frame parent, boolean modal, boolean isRegister) {
        super(parent, modal);
        this.parent = parent;
        initComponents();

        this.isRegister = isRegister;
        init();
        loadProjectList();

        if (!isRegister) {
            setTitle("แก้ไขข้อมูลลูกค้า");
            loadCustomerEdit();
            txtCode.setText(Value.CUST_CODE);
            txtCodeFocusLost(null);
            btnExit.setVisible(true);
            jButton3.setVisible(false);

            jTabbedPane2.setEnabledAt(5, false);
        } else {
            setTitle("ลงทะเบียนลูกค้า");
            //btnExit.setVisible(false);
        }

        loadPersonApp();

        txtMemberStartDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        chkDisableMember.setVisible(!isRegister);
        //jTabbedPane1.setEnabledAt(1, !isRegister);

        setLocation(0, 0);
        setSize(parent.getMaximumSize());

        txtCode.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSpouseSurname = new javax.swing.JTextField();
        cbSex1 = new javax.swing.JComboBox();
        jLabel53 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtSpouseName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        cbSex = new javax.swing.JComboBox();
        cbReligion = new javax.swing.JComboBox();
        txtNation = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBirthDate = new javax.swing.JButton();
        cbProfileStatus = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMemberStartDate = new javax.swing.JTextField();
        btnMemStartDate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cb_prefix = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        txtExpireCard = new javax.swing.JTextField();
        btnMemEndDate1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtMemberEndDate = new javax.swing.JTextField();
        btnMemEndDate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lbPicture = new javax.swing.JLabel();
        chkDisableMember = new javax.swing.JCheckBox();
        cbMemberType = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        txtApproveLimit = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtAddrProvince1 = new javax.swing.JTextField();
        txtAddrPost1 = new javax.swing.JTextField();
        txtAddrAmphur1 = new javax.swing.JTextField();
        txtAddrTambon1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddrMobile1 = new javax.swing.JTextField();
        txtAddrTel1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAddNo1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtAddrRoad1 = new javax.swing.JTextField();
        txtAddrSoi1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtAddrMoo1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtAddrMooName1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtAddrNo2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtAddrMoo2 = new javax.swing.JTextField();
        txtAddrSoi2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtAddrRoad2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtAddrTambon2 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtAddrAmphur2 = new javax.swing.JTextField();
        txtAddrPost2 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtAddrProvince2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel51 = new javax.swing.JLabel();
        txtAddrMooName2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        txtAddrNo3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtAddrRoad3 = new javax.swing.JTextField();
        txtAddrTambon3 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtAddrProvince3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtAddrPost3 = new javax.swing.JTextField();
        txtAddrAmphur3 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtAddrSoi3 = new javax.swing.JTextField();
        txtAddrMoo3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtAddr3ComName = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtAddrMooName3 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        txtAddrNo4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtAddrRoad4 = new javax.swing.JTextField();
        txtAddrTambon4 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtAddrProvince4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtAddrPost4 = new javax.swing.JTextField();
        txtAddrAmphur4 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAddrSoi4 = new javax.swing.JTextField();
        txtAddrMoo4 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtDownDeed1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtDownRai = new javax.swing.JTextField();
        txtDownDeed2 = new javax.swing.JTextField();
        txtDownDeed3 = new javax.swing.JTextField();
        txtDownDeed4 = new javax.swing.JTextField();
        cbProject = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtAddrMooName4 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtCustAppCode = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListPersonApp = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtFeeMember = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        txtFeeProject = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtFeeTotal = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        lbProjectWarning = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ลงทะเบียนลูกค้า");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "ข้อมูลลูกค้า", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("รหัสสมาชิก");

        txtCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodeFocusLost(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ลำดับที่");

        txtIndex.setEditable(false);
        txtIndex.setBackground(new java.awt.Color(255, 255, 204));
        txtIndex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIndex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndex.setText("1");
        txtIndex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("นามสกุล");

        txtSpouseSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSpouseSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSpouseSurname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSpouseSurnameFocusGained(evt);
            }
        });
        txtSpouseSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSpouseSurnameKeyPressed(evt);
            }
        });

        cbSex1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbSex1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ชาย", "หญิง", "อื่นๆ" }));
        cbSex1.setSelectedIndex(1);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("เพศ");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("ชื่อคู่สมรส");

        txtSpouseName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSpouseName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSpouseName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSpouseNameFocusGained(evt);
            }
        });
        txtSpouseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSpouseNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSpouseName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSpouseSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpouseName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel6)
                    .addComponent(txtSpouseSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(cbSex1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setOpaque(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("ศาสนา");

        cbSex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ชาย", "หญิง", "อื่นๆ" }));

        cbReligion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbReligion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "พุทธ", "คริตส์", "อิสสลาม", "อื่นๆ" }));

        txtNation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNationKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("เพศ");

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 204));
        txtAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAge.setText("0");
        txtAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateKeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("สัญชาติ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("นามสกุล");

        txtSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSurnameKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("วันเกิด");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("อายุ (ปี)");

        btnBirthDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBirthDate.setText("...");
        btnBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirthDateActionPerformed(evt);
            }
        });

        cbProfileStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbProfileStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "โสด", "สมรส", "หย่าร้าง", "หม้าย" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("สถานะภาพ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("วันที่สมัครสมาชิก");

        txtMemberStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMemberStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberStartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMemberStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMemberStartDateKeyPressed(evt);
            }
        });

        btnMemStartDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemStartDate.setText("...");
        btnMemStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemStartDateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("คำนำหน้า");

        cb_prefix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("วันหมดอายุบัตร");

        txtExpireCard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExpireCard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExpireCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtExpireCard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtExpireCardKeyPressed(evt);
            }
        });

        btnMemEndDate1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemEndDate1.setText("...");
        btnMemEndDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemEndDate1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("วันที่ออกบัตร");

        txtMemberEndDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMemberEndDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberEndDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMemberEndDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMemberEndDateFocusGained(evt);
            }
        });
        txtMemberEndDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMemberEndDateKeyPressed(evt);
            }
        });

        btnMemEndDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMemEndDate.setText("...");
        btnMemEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemEndDateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("ชื่อ/องค์กร");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("อาชีพ");

        txtOccupation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOccupation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtOccupation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOccupationKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtMemberStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMemStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel62)
                    .addComponent(jLabel4)
                    .addComponent(jLabel33)
                    .addComponent(jLabel25)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpireCard, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMemEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtMemberEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMemEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_prefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbProfileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtNation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(cbReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMemberStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel62)
                            .addComponent(txtExpireCard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemEndDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtMemberEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMemEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbPicture.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        lbPicture.setText("Click เลือกรูปถ่าย");
        lbPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPictureMouseClicked(evt);
            }
        });

        chkDisableMember.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkDisableMember.setForeground(new java.awt.Color(204, 0, 0));
        chkDisableMember.setText("ยกเลิกการใช้งาน");
        chkDisableMember.setOpaque(false);
        chkDisableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkDisableMemberMouseClicked(evt);
            }
        });

        cbMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbMemberType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMemberTypeItemStateChanged(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("สามารถค้ำประกันได้");

        txtApproveLimit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtApproveLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApproveLimit.setText("0");
        txtApproveLimit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("ครั้ง");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMemberType, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApproveLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(chkDisableMember)))))
                .addGap(18, 18, 18)
                .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMemberType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel72)
                        .addComponent(txtApproveLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73)))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(chkDisableMember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("ตำบล/แขวง");

        txtAddrProvince1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince1KeyPressed(evt);
            }
        });

        txtAddrPost1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost1KeyPressed(evt);
            }
        });

        txtAddrAmphur1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur1KeyPressed(evt);
            }
        });

        txtAddrTambon1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon1KeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("อำเภอ/เขต");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("รหัสไปรษณีย์");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("จังหวัด");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("เบอร์โทรศัพท์");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("เบอร์บ้าน");

        txtAddrMobile1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrMobile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMobile1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMobile1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMobile1KeyPressed(evt);
            }
        });

        txtAddrTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTel1KeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("บ้านเลขที่");

        txtAddNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddNo1KeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("ถนน");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("ซอย");

        txtAddrRoad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad1KeyPressed(evt);
            }
        });

        txtAddrSoi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi1KeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("หมู่ที่");

        txtAddrMoo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo1KeyPressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("ชื่อหมู่บ้าน");

        txtAddrMooName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtAddrSoi1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtAddrMooName1)
                    .addComponent(txtAddrPost1)
                    .addComponent(txtAddrTel1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtAddrSoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddrTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ที่อยู่ปัจจุบัน", jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("บ้านเลขที่");

        txtAddrNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrNo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrNo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrNo2KeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("หมู่ที่");

        txtAddrMoo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo2KeyPressed(evt);
            }
        });

        txtAddrSoi2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi2KeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("ซอย");

        txtAddrRoad2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad2KeyPressed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("ถนน");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("ตำบล/แขวง");

        txtAddrTambon2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon2KeyPressed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("อำเภอ/เขต");

        txtAddrAmphur2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur2KeyPressed(evt);
            }
        });

        txtAddrPost2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost2KeyPressed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("รหัสไปรษณีย์");

        txtAddrProvince2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince2KeyPressed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("จังหวัด");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox3.setText("ใช้ตามที่อยู่ปัจจุบัน");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("ชื่อหมู่บ้าน");

        txtAddrMooName2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAddrTambon2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddrRoad2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(txtAddrNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddrMoo2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddrProvince2))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel51))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel24)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel56))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddrPost2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrSoi2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtAddrAmphur2)
                            .addComponent(txtAddrMooName2))))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddrMooName2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtAddrNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(txtAddrMoo2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtAddrRoad2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtAddrSoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtAddrTambon2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtAddrProvince2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ที่อยู่ตามบัตรประชาชน", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox4.setText("ใช้ตามที่อยู่ปัจจุบัน");
        jCheckBox4.setOpaque(false);
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        txtAddrNo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrNo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrNo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrNo3KeyPressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("เลขที่");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("ถนน");

        txtAddrRoad3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad3KeyPressed(evt);
            }
        });

        txtAddrTambon3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon3KeyPressed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("ตำบล/แขวง");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("จังหวัด");

        txtAddrProvince3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince3KeyPressed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("รหัสไปรษณีย์");

        txtAddrPost3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost3KeyPressed(evt);
            }
        });

        txtAddrAmphur3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur3KeyPressed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("อำเภอ/เขต");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("ซอย");

        txtAddrSoi3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi3KeyPressed(evt);
            }
        });

        txtAddrMoo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo3KeyPressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("หมู่ที่");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("ชื่อบริษัท");

        txtAddr3ComName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddr3ComName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddr3ComName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddr3ComNameKeyPressed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("ชื่อหมู่บ้าน");

        txtAddrMooName3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtAddrTambon3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddrRoad3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(txtAddrNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddrMoo3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddrProvince3))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel61)
                                        .addComponent(jLabel36)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel60)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel52)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddrMooName3)
                            .addComponent(txtAddrPost3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrSoi3, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(txtAddrAmphur3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddr3ComName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox4))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(txtAddr3ComName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAddrMooName3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(txtAddrNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(txtAddrMoo3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtAddrRoad3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txtAddrSoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtAddrTambon3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtAddrProvince3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ที่อยู่ที่ทำงาน", jPanel10);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox5.setText("เข้าร่วมโครงการปลูกถั่วดาวอินคา");
        jCheckBox5.setOpaque(false);
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        txtAddrNo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrNo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrNo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrNo4KeyPressed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("เลขที่");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("ถนน");

        txtAddrRoad4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad4KeyPressed(evt);
            }
        });

        txtAddrTambon4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon4KeyPressed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("ตำบล/แขวง");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("จังหวัด");

        txtAddrProvince4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince4KeyPressed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("รหัสไปรษณีย์");

        txtAddrPost4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost4KeyPressed(evt);
            }
        });

        txtAddrAmphur4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur4KeyPressed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("อำเภอ/เขต");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("ซอย");

        txtAddrSoi4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi4KeyPressed(evt);
            }
        });

        txtAddrMoo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo4KeyPressed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("หมู่ที่");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("ชื่อโครงการที่เข้าร่วม");

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("เลขที่โฉนด");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("ไร่");

        txtDownDeed1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDownDeed1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDownDeed1KeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("จำนวนไร่");

        txtDownRai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDownRai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDownRai.setText("0");
        txtDownRai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDownRai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDownRaiFocusGained(evt);
            }
        });
        txtDownRai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDownRaiKeyPressed(evt);
            }
        });

        txtDownDeed2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDownDeed2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDownDeed2KeyPressed(evt);
            }
        });

        txtDownDeed3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDownDeed3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDownDeed3KeyPressed(evt);
            }
        });

        txtDownDeed4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtDownRai, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49))
                    .addComponent(txtDownDeed1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDownDeed2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDownDeed3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDownDeed4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtDownRai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(txtDownDeed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDownDeed2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDownDeed3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDownDeed4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        cbProject.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("เหมือนกับที่อยู่ปัจจุบัน");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        txtAddrMooName4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAddrTambon4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addComponent(txtAddrNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addComponent(txtAddrRoad4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrProvince4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addGap(75, 75, 75)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel66)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(txtAddrMoo4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddrMooName4))
                    .addComponent(txtAddrSoi4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtAddrAmphur4, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(txtAddrPost4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAddrMooName4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrMoo4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(txtAddrRoad4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrSoi4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(txtAddrTambon4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrAmphur4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(txtAddrProvince4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrPost4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel46))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtAddrNo4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel41)))
                .addGap(119, 119, 119))
        );

        jTabbedPane2.addTab("ที่อยู่โครงการปลูกถั่วดาวอินคา", jPanel13);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("เลขที่บัตรประชาชน");

        txtCustAppCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCustAppCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCustAppCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustAppCodeKeyPressed(evt);
            }
        });

        jButton20.setText("OK");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jButton20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton20KeyPressed(evt);
            }
        });

        tbListPersonApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ", "นามสกุล"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListPersonApp);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCustAppCode, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtCustAppCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("ข้อมูลผู้มีอำนาจลงนาม", jPanel11);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("บาท");

        txtFeeMember.setEditable(false);
        txtFeeMember.setBackground(new java.awt.Color(255, 255, 255));
        txtFeeMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFeeMember.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeMember.setText("0.00");
        txtFeeMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFeeMember.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeeMemberFocusGained(evt);
            }
        });
        txtFeeMember.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeeMemberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFeeMemberKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("ค่าธรรมเนียมสมัครสมาชิก");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("บันทึก/พิมพ์ใบเสร็จรับเงิน");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("ค่าธรรมเนียมโครงการ");

        txtFeeProject.setEditable(false);
        txtFeeProject.setBackground(new java.awt.Color(255, 255, 255));
        txtFeeProject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFeeProject.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeProject.setText("0.00");
        txtFeeProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFeeProject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeeProjectFocusGained(evt);
            }
        });
        txtFeeProject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeeProjectKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFeeProjectKeyReleased(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("บาท");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("รวม");

        txtFeeTotal.setEditable(false);
        txtFeeTotal.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFeeTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeTotal.setText("0.00");
        txtFeeTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("บาท");

        lbProjectWarning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbProjectWarning.setForeground(new java.awt.Color(204, 51, 0));
        lbProjectWarning.setText("   ");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("ใช้ค่าธรรมเนียมจากระบบ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFeeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFeeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtFeeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbProjectWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(txtFeeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(lbProjectWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtFeeMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtFeeTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ค่าธรรมเนียม", jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ข้อมูลเบื้องต้น", jPanel5);

        btnSave.setBackground(new java.awt.Color(0, 204, 102));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
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

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("เริ่มต้นใหม่ (Clear)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("ออก (Exit)");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        boolean isValid = false;
        if (cbMemberType.getSelectedIndex() == 1) {
            if (tbListPersonApp.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "กรุณาเลือกสมาชิกเข้าร่วมกลุ่ม !");
                jTabbedPane2.setSelectedIndex(4);
                txtCustAppCode.requestFocus();
            } else {
                isValid = true;
            }
        } else {
            isValid = true;
        }

        if (isValid) {
            if (saveData()) {
                txtFeeProject.setEditable(true);
                txtFeeMember.setEditable(true);
                jButton1.setEnabled(true);
                if (!isRegister) {//เป็นการแก้ไขข้อมูล
                    JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
                    dispose();
                } else {
                    int iConfirm = JOptionPane.showConfirmDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว ท่านต้องการบันทึกค่าธรรมเนียมต่อหรือไม่ ?");
                    btnExit.setVisible(true);
                    if (iConfirm == JOptionPane.YES_OPTION) {
                        jTabbedPane2.setSelectedIndex(5);
                    } else {
                        clearForm();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSurname.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDate.requestFocus();
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDate.requestFocus();
        }
    }//GEN-LAST:event_txtSurnameKeyPressed

    private void txtDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtDate.getText().equals("")) {
                String[] db = txtDate.getText().split("/");
                Calendar c = Calendar.getInstance();
                int year = Integer.parseInt(db[2]);
                int month = Integer.parseInt(db[1]);
                int day = Integer.parseInt(db[0]);

                c.set(year, month, day);
                txtAge.setText("" + getAgeInt(c.getTime()));
            }
            txtOccupation.requestFocus();
        }
    }//GEN-LAST:event_txtDateKeyPressed

    private void txtAddrProvince1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrProvince1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrPost1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrProvince1KeyPressed

    private void txtAddrPost1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrPost1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMobile1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrPost1KeyPressed

    private void txtAddrAmphur1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrAmphur1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrProvince1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrAmphur1KeyPressed

    private void txtAddrTambon1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTambon1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrAmphur1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTambon1KeyPressed

    private void txtAddrMobile1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMobile1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTel1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMobile1KeyPressed

    private void txtAddrTel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTel1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTabbedPane2.setSelectedIndex(1);
            txtAddrNo2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTel1KeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_btnSaveKeyPressed

    private void txtFeeMemberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeMemberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_txtFeeMemberKeyPressed

    private void txtOccupationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOccupationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNation.requestFocus();
        }
    }//GEN-LAST:event_txtOccupationKeyPressed

    private void txtNationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMemberStartDate.requestFocus();
        }
    }//GEN-LAST:event_txtNationKeyPressed

    private void txtFeeMemberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeeMemberFocusGained
        txtFeeMember.selectAll();
    }//GEN-LAST:event_txtFeeMemberFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (saveData()) {
            printFee();
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCode.getText().trim().equals("")) {
                txtName.requestFocus();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusLost
        if (!txtCode.getText().trim().equals("")) {
            loadCustomerEdit();
        }
    }//GEN-LAST:event_txtCodeFocusLost

    private void txtCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodeFocusGained
        jTabbedPane2.setSelectedIndex(0);
        txtCode.selectAll();
    }//GEN-LAST:event_txtCodeFocusGained

    private void txtMemberEndDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMemberEndDateFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberEndDateFocusGained

    private void txtMemberEndDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberEndDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtExpireCard.requestFocus();
        }
    }//GEN-LAST:event_txtMemberEndDateKeyPressed

    private void txtSpouseSurnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSpouseSurnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpouseSurnameFocusGained

    private void txtSpouseSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpouseSurnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddNo1.requestFocus();
        }
    }//GEN-LAST:event_txtSpouseSurnameKeyPressed

    private void txtSpouseNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSpouseNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpouseNameFocusGained

    private void txtSpouseNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpouseNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSpouseSurname.requestFocus();
        }
    }//GEN-LAST:event_txtSpouseNameKeyPressed

    private void txtAddrTambon2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTambon2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrAmphur2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTambon2KeyPressed

    private void txtAddrAmphur2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrAmphur2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrProvince2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrAmphur2KeyPressed

    private void txtAddrPost2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrPost2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTabbedPane2.setSelectedIndex(2);
            txtAddr3ComName.requestFocus();
        }
    }//GEN-LAST:event_txtAddrPost2KeyPressed

    private void txtAddrProvince2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrProvince2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrPost2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrProvince2KeyPressed

    private void txtAddrTambon3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTambon3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrAmphur3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTambon3KeyPressed

    private void txtAddrProvince3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrProvince3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrPost3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrProvince3KeyPressed

    private void txtAddrPost3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrPost3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTabbedPane2.setSelectedIndex(3);
            txtFeeMember.requestFocus();
        }
    }//GEN-LAST:event_txtAddrPost3KeyPressed

    private void txtAddrAmphur3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrAmphur3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrProvince3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrAmphur3KeyPressed

    private void lbPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPictureMouseClicked
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
            lbPicture.setText("");
            lbPicture.setIcon(new javax.swing.ImageIcon(chooser.getSelectedFile().getAbsolutePath()));
            this.imgFile = chooser.getSelectedFile();
            this.imgName = chooser.getSelectedFile().getName();
        }
    }//GEN-LAST:event_lbPictureMouseClicked

    private void txtMemberStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemberStartDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMemberEndDate.requestFocus();
        }
    }//GEN-LAST:event_txtMemberStartDateKeyPressed

    private void txtAddNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddNo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo1.requestFocus();
        }
    }//GEN-LAST:event_txtAddNo1KeyPressed

    private void txtAddrMoo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMooName1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo1KeyPressed

    private void txtAddrRoad1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrRoad1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrSoi1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrRoad1KeyPressed

    private void txtAddrSoi1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrSoi1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTambon1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrSoi1KeyPressed

    private void txtAddrNo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrNo2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrNo2KeyPressed

    private void txtAddrMoo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMooName2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo2KeyPressed

    private void txtAddrRoad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrRoad2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrSoi2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrRoad2KeyPressed

    private void txtAddrSoi2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrSoi2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTambon2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrSoi2KeyPressed

    private void txtAddrNo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrNo3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrNo3KeyPressed

    private void txtAddrMoo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMooName3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo3KeyPressed

    private void txtAddrRoad3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrRoad3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrSoi3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrRoad3KeyPressed

    private void txtAddrSoi3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrSoi3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTambon3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrSoi3KeyPressed

    private void txtAddr3ComNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddr3ComNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrNo3.requestFocus();
        }
    }//GEN-LAST:event_txtAddr3ComNameKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnMemStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemStartDateActionPerformed
        Point point = txtMemberStartDate.getLocationOnScreen();
        point.setLocation(point.getX() + txtMemberStartDate.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtMemberStartDate.setText(dcd.getDateString());
            txtMemberStartDate.requestFocus();
        }
    }//GEN-LAST:event_btnMemStartDateActionPerformed

    private void chkDisableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkDisableMemberMouseClicked
        int conf = JOptionPane.showConfirmDialog(this, "ท่านต้องการยกเลิกสมาชิกนี้ใช้หรือไม่ ?", "ยืนยันการยกเลิกสมาชิก",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (conf == JOptionPane.YES_OPTION) {
            if (processCancelMember()) {                
                getEnableControl().enableComponents(jTabbedPane1, false);

                btnSave.setEnabled(false);
                jButton3.setEnabled(false);
            }
        } else {
            chkDisableMember.setSelected(false);
        }
    }//GEN-LAST:event_chkDisableMemberMouseClicked

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        if (jCheckBox4.isSelected()) {
            txtAddrNo3.setText(txtAddNo1.getText());
            txtAddrMoo3.setText(txtAddrMoo1.getText());
            txtAddrMooName3.setText(txtAddrMooName1.getText());
            txtAddrRoad3.setText(txtAddrRoad1.getText());
            txtAddrSoi3.setText(txtAddrSoi1.getText());
            txtAddrTambon3.setText(txtAddrTambon1.getText());
            txtAddrAmphur3.setText(txtAddrAmphur1.getText());
            txtAddrProvince3.setText(txtAddrProvince1.getText());
            txtAddrPost3.setText(txtAddrPost1.getText());
        }
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        if (jCheckBox3.isSelected()) {
            txtAddrNo2.setText(txtAddNo1.getText());
            txtAddrMoo2.setText(txtAddrMoo1.getText());
            txtAddrMooName2.setText(txtAddrMooName1.getText());
            txtAddrRoad2.setText(txtAddrRoad1.getText());
            txtAddrSoi2.setText(txtAddrSoi1.getText());
            txtAddrTambon2.setText(txtAddrTambon1.getText());
            txtAddrAmphur2.setText(txtAddrAmphur1.getText());
            txtAddrProvince2.setText(txtAddrProvince1.getText());
            txtAddrPost2.setText(txtAddrPost1.getText());
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        if (!jCheckBox5.isSelected()) {
            txtFeeProject.setEnabled(false);
            lbProjectWarning.setText("*** ท่านต้องเลือกเข้าร่วมโครงการก่อน !");
        } else {
            txtFeeProject.setEditable(true);
            txtFeeProject.setEnabled(true);
            txtFeeProject.selectAll();
            lbProjectWarning.setText("   ");
        }
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void txtAddrNo4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrNo4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrNo4KeyPressed

    private void txtAddrRoad4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrRoad4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrSoi4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrRoad4KeyPressed

    private void txtAddrTambon4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrTambon4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrAmphur4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrTambon4KeyPressed

    private void txtAddrProvince4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrProvince4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrPost4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrProvince4KeyPressed

    private void txtAddrPost4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrPost4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDownRai.requestFocus();
        }
    }//GEN-LAST:event_txtAddrPost4KeyPressed

    private void txtAddrAmphur4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrAmphur4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrProvince4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrAmphur4KeyPressed

    private void txtAddrSoi4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrSoi4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrTambon4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrSoi4KeyPressed

    private void txtAddrMoo4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad4.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo4KeyPressed

    private void txtFeeProjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeeProjectFocusGained
        jCheckBox5ItemStateChanged(null);
    }//GEN-LAST:event_txtFeeProjectFocusGained

    private void txtFeeProjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeProjectKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFeeMember.requestFocus();
        }
    }//GEN-LAST:event_txtFeeProjectKeyPressed

    private void txtFeeProjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeProjectKeyReleased
        computeTotalFee();
    }//GEN-LAST:event_txtFeeProjectKeyReleased

    private void txtFeeMemberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeMemberKeyReleased
        computeTotalFee();
    }//GEN-LAST:event_txtFeeMemberKeyReleased

    private void txtDownRaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDownRaiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDownDeed1.requestFocus();
        }
    }//GEN-LAST:event_txtDownRaiKeyPressed

    private void txtDownDeed1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDownDeed1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDownDeed2.requestFocus();
        }
    }//GEN-LAST:event_txtDownDeed1KeyPressed

    private void txtDownDeed2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDownDeed2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDownDeed3.requestFocus();
        }
    }//GEN-LAST:event_txtDownDeed2KeyPressed

    private void txtDownDeed3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDownDeed3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDownDeed4.requestFocus();
        }
    }//GEN-LAST:event_txtDownDeed3KeyPressed

    private void txtDownRaiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDownRaiFocusGained
        txtDownRai.selectAll();
    }//GEN-LAST:event_txtDownRaiFocusGained

    private void btnBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirthDateActionPerformed
        Point point = txtDate.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate.setText(dcd.getDateString());
            txtDate.requestFocus();
            txtAge.setText("" + getAgeInt(dcd.getSelectDate().getTime()));
        }
    }//GEN-LAST:event_btnBirthDateActionPerformed

    private void btnMemEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemEndDateActionPerformed
        Point point = txtMemberEndDate.getLocationOnScreen();
        point.setLocation(point.getX() + txtMemberEndDate.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtMemberEndDate.setText(dcd.getDateString());
            txtMemberEndDate.requestFocus();
        }
    }//GEN-LAST:event_btnMemEndDateActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected()) {
            txtAddrNo4.setText(txtAddNo1.getText());
            txtAddrMoo4.setText(txtAddrMoo1.getText());
            txtAddrMooName4.setText(txtAddrMooName1.getText());
            txtAddrRoad4.setText(txtAddrRoad1.getText());
            txtAddrSoi4.setText(txtAddrSoi1.getText());
            txtAddrTambon4.setText(txtAddrTambon1.getText());
            txtAddrAmphur4.setText(txtAddrAmphur1.getText());
            txtAddrProvince4.setText(txtAddrProvince1.getText());
            txtAddrPost4.setText(txtAddrPost1.getText());
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void cbMemberTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMemberTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            if (cbMemberType.getSelectedIndex() == 0) {//รายบุคคล
                txtApproveLimit.setText("3");
                txtApproveLimit.setEnabled(true);
                jTabbedPane2.setEnabledAt(4, false);
            } else {//รายกลุ่ม
                txtApproveLimit.setText("0");
                txtApproveLimit.setEnabled(false);
                jTabbedPane2.setEnabledAt(4, true);
                
                //enable = false
                txtSurname.setEnabled(false);
                txtOccupation.setEnabled(false);
                txtNation.setEnabled(false);
                cbProfileStatus.setEnabled(false);
                cbSex.setEnabled(false);
                cbReligion.setEnabled(false);
                txtSpouseName.setEnabled(false);
                txtSpouseSurname.setEnabled(false);
                cbSex1.setEnabled(false);
                
                GroupAlertDialog ga = new GroupAlertDialog(null, true, cbMemberType.getLocationOnScreen());
                ga.setVisible(true);
                
                txtCode.requestFocus();
            }
        }
    }//GEN-LAST:event_cbMemberTypeItemStateChanged

    private void txtCustAppCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustAppCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addPersonAllow();
        }
    }//GEN-LAST:event_txtCustAppCodeKeyPressed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        addPersonAllow();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton20KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton20ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton20KeyPressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Value.CUST_CODE =  null;
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConfigBean cBean = getConfigControl().getConfigBean();
        txtFeeMember.setText(NumberFormat.showDouble2(cBean.getFeeAmt()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtAddrMooName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMooName1KeyPressed

    private void txtAddrMooName2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad2.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMooName2KeyPressed

    private void txtAddrMooName3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad3.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMooName3KeyPressed

    private void txtAddrMooName4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrMooName4KeyPressed

    private void btnMemEndDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemEndDate1ActionPerformed
        Point point = txtExpireCard.getLocationOnScreen();
        point.setLocation(point.getX() + txtExpireCard.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtExpireCard.setText(dcd.getDateString());
            txtExpireCard.requestFocus();
        }
    }//GEN-LAST:event_btnMemEndDate1ActionPerformed

    private void txtExpireCardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpireCardKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtSpouseName.requestFocus();
        }
    }//GEN-LAST:event_txtExpireCardKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBirthDate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMemEndDate;
    private javax.swing.JButton btnMemEndDate1;
    private javax.swing.JButton btnMemStartDate;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbMemberType;
    private javax.swing.JComboBox cbProfileStatus;
    private javax.swing.JComboBox cbProject;
    private javax.swing.JComboBox cbReligion;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JComboBox cbSex1;
    private javax.swing.JComboBox cb_prefix;
    private javax.swing.JCheckBox chkDisableMember;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbPicture;
    private javax.swing.JLabel lbProjectWarning;
    private javax.swing.JTable tbListPersonApp;
    private javax.swing.JTextField txtAddNo1;
    private javax.swing.JTextField txtAddr3ComName;
    private javax.swing.JTextField txtAddrAmphur1;
    private javax.swing.JTextField txtAddrAmphur2;
    private javax.swing.JTextField txtAddrAmphur3;
    private javax.swing.JTextField txtAddrAmphur4;
    private javax.swing.JTextField txtAddrMobile1;
    private javax.swing.JTextField txtAddrMoo1;
    private javax.swing.JTextField txtAddrMoo2;
    private javax.swing.JTextField txtAddrMoo3;
    private javax.swing.JTextField txtAddrMoo4;
    private javax.swing.JTextField txtAddrMooName1;
    private javax.swing.JTextField txtAddrMooName2;
    private javax.swing.JTextField txtAddrMooName3;
    private javax.swing.JTextField txtAddrMooName4;
    private javax.swing.JTextField txtAddrNo2;
    private javax.swing.JTextField txtAddrNo3;
    private javax.swing.JTextField txtAddrNo4;
    private javax.swing.JTextField txtAddrPost1;
    private javax.swing.JTextField txtAddrPost2;
    private javax.swing.JTextField txtAddrPost3;
    private javax.swing.JTextField txtAddrPost4;
    private javax.swing.JTextField txtAddrProvince1;
    private javax.swing.JTextField txtAddrProvince2;
    private javax.swing.JTextField txtAddrProvince3;
    private javax.swing.JTextField txtAddrProvince4;
    private javax.swing.JTextField txtAddrRoad1;
    private javax.swing.JTextField txtAddrRoad2;
    private javax.swing.JTextField txtAddrRoad3;
    private javax.swing.JTextField txtAddrRoad4;
    private javax.swing.JTextField txtAddrSoi1;
    private javax.swing.JTextField txtAddrSoi2;
    private javax.swing.JTextField txtAddrSoi3;
    private javax.swing.JTextField txtAddrSoi4;
    private javax.swing.JTextField txtAddrTambon1;
    private javax.swing.JTextField txtAddrTambon2;
    private javax.swing.JTextField txtAddrTambon3;
    private javax.swing.JTextField txtAddrTambon4;
    private javax.swing.JTextField txtAddrTel1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtApproveLimit;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCustAppCode;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDownDeed1;
    private javax.swing.JTextField txtDownDeed2;
    private javax.swing.JTextField txtDownDeed3;
    private javax.swing.JTextField txtDownDeed4;
    private javax.swing.JTextField txtDownRai;
    private javax.swing.JTextField txtExpireCard;
    private javax.swing.JTextField txtFeeMember;
    private javax.swing.JTextField txtFeeProject;
    private javax.swing.JTextField txtFeeTotal;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtMemberEndDate;
    private javax.swing.JTextField txtMemberStartDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNation;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtSpouseName;
    private javax.swing.JTextField txtSpouseSurname;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables

    private int getAgeInt(Date time) {
        SimpleDateFormat sThai = new SimpleDateFormat("yyyy");
        try {
            int yearCurrent = Integer.parseInt(sThai.format(new Date()));
            int yearStart = Integer.parseInt(sThai.format(time));

            return yearCurrent - yearStart;
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        return 0;
    }

    private void loadArGroupData(String custtypeCode) {
        String sql = "select SP_Type,SP_TypeName,"
                + "SP_CrAmount,SP_CreditDays,SP_Interest from custtype "
                + "where SP_Type='" + custtypeCode + "'";
        DecimalFormat dec = new DecimalFormat("#,##0.00");
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
//                lbArGroupName.setText(ThaiUtil.ASCII2Unicode(rs.getString("SP_TypeName")));
//                txtCreditAmt.setText(dec.format(rs.getDouble("SP_CrAmount")));
//                txtCreditDays.setText("" + rs.getInt("SP_CreditDays"));
//                txtCreditInterest.setText("" + rs.getInt("SP_Interest"));
            }

            rs.close();
        } catch (Exception e) {
            Log.write.error(e.getMessage());
        }
    }

    private boolean saveData() {
        boolean feeCheck = false;
        //บันทึกข้อมูลลูกค้า
        boolean isSaveData;
        try {
            Double.parseDouble(txtFeeMember.getText().replace(",", ""));
            feeCheck = true;
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        String idCard = txtCode.getText();

        if (idCard.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสบัตรประชาชน/รหัสกลุ่มสมาชิก !");
            txtCode.setText("");
            txtCode.requestFocus();
            return false;
        }

        if (cbMemberType.getSelectedIndex() == 0) {
            if (idCard.trim().length() != 13) {
                JOptionPane.showMessageDialog(this, "รหัสบัตรประชาชนต้องเป็น 13 หลักเท่านั้น");
                txtCode.setText("");
                txtCode.requestFocus();
                return false;
            } else if (!PIDCheck.checkPID(idCard)) {
                JOptionPane.showMessageDialog(this, "ท่านระบุรหัสบัตรประชาชนไม่ถูกต้อง กรุณาตรวจสอบ");
                txtCode.setText("");
                txtCode.requestFocus();
                return false;
            }
        }

        if (txtName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุชื่อด้วย");
            txtName.requestFocus();
            return false;
        } else if (!feeCheck) {
            JOptionPane.showMessageDialog(this, "ค่าธรรมเนียมต้องเป็นตัวเลขเท่านั้น");
            return false;
        } else {
            ProfileBean bean = new ProfileBean();
            bean.setP_index(Integer.parseInt(txtIndex.getText()));
            bean.setP_custType("1");

            bean.setApproveLimit(Integer.parseInt(txtApproveLimit.getText()));

            bean.setP_custCode(idCard);
            bean.setP_custName(ThaiUtil.Unicode2ASCII(txtName.getText()));
            bean.setP_custSurname(ThaiUtil.Unicode2ASCII(txtSurname.getText()));
            bean.setP_custAge(Integer.parseInt(txtAge.getText()));

            bean.setP_custBirthDay(DateFormat.getLocal_ddMMyyyy(txtDate.getText()));
            bean.setP_member_start(DateFormat.getLocal_ddMMyyyy(txtMemberStartDate.getText()));
            bean.setP_member_start(DateFormat.getLocal_ddMMyyyy(txtExpireCard.getText()));

            if (txtMemberEndDate.getText().equals("")) {
                Calendar c = Calendar.getInstance();
                c.add(Calendar.YEAR, 50);
                bean.setP_member_end(c.getTime());
            } else {
                bean.setP_member_end(DateFormat.getLocal_ddMMyyyy(txtMemberEndDate.getText()));
            }

            String status;
            if (cbProfileStatus.getSelectedIndex() == 0) {
                status = "0";
            } else if (cbProfileStatus.getSelectedIndex() == 1) {
                status = "1";
            } else if (cbProfileStatus.getSelectedIndex() == 2) {
                status = "2";
            } else {
                status = "3";
            }
            bean.setP_cust_status(status);
            if (isRegister) {
                bean.setStatus(ThaiUtil.Unicode2ASCII("ยังไม่เปิดบัญชี"));
            } else {
                ProfileBean bbBean = getProfileControl().listCbProfile(bean.getP_custCode());
                bean.setStatus(ThaiUtil.Unicode2ASCII(bbBean.getStatus()));
            }
            bean.setP_custOccupation(ThaiUtil.Unicode2ASCII(txtOccupation.getText()));
            bean.setP_custNation(ThaiUtil.Unicode2ASCII(txtNation.getText()));
            bean.setP_cust_religion(ThaiUtil.Unicode2ASCII("" + cbReligion.getSelectedItem()));

            String sex;
            if (cbSex.getSelectedIndex() == 0) {
                sex = "M";
            } else if (cbSex.getSelectedIndex() == 1) {
                sex = "F";
            } else {
                sex = "O";
            }
            bean.setP_custSex(sex);
            String sex2;
            if (cbSex1.getSelectedIndex() == 0) {
                sex2 = "M";
            } else if (cbSex1.getSelectedIndex() == 1) {
                sex2 = "F";
            } else {
                sex2 = "O";
            }

            bean.setP_spouse_name(ThaiUtil.Unicode2ASCII(txtSpouseName.getText()));
            bean.setP_spouse_surname(ThaiUtil.Unicode2ASCII(txtSpouseSurname.getText()));
            bean.setP_spouse_sex(ThaiUtil.Unicode2ASCII(sex2));

            try {
                bean.setP_fee(Double.parseDouble(txtFeeMember.getText()));
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                bean.setP_fee(0.00);
            }

            // move image
            if (this.imgFile != null) {
                try {
                    new File("img").mkdir();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                try {
                    BufferedImage originalImage = ImageIO.read(this.imgFile);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
                    BufferedImage resizeImageJpg = ImageSample.resizeImage(originalImage, type);
                    String newImgName = idCard + ".jpg";
                    ImageIO.write(resizeImageJpg, "jpg", new File(newImgName));
                    CopyFile.copy(new File(newImgName), new File("img/" + newImgName));
                    new File(newImgName).delete();
                    bean.setP_cust_pic_url("img/" + newImgName);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                ProfileBean bbBean = getProfileControl().listCbProfile(bean.getP_custCode());
                if (bbBean != null) {
                    bean.setP_cust_pic_url(bbBean.getP_cust_pic_url());
                } else {
                    bean.setP_cust_pic_url("");
                }
            }

            try {
                double dd = Double.parseDouble(txtFeeProject.getText());
                bean.setP_down_fee(dd);
            } catch (NumberFormatException e) {
                bean.setP_down_fee(0);
            }

            if (cb_prefix.getItemCount() == 0) {
                bean.setP_prefix(ThaiUtil.Unicode2ASCII("คุณ"));
            } else {
                bean.setP_prefix(ThaiUtil.Unicode2ASCII("" + cb_prefix.getSelectedItem()));
            }

            if (cbMemberType.getItemCount() == 0) {
                bean.setP_member_type("");
            } else {
                String[] m = cbMemberType.getSelectedItem().toString().split("-");
                String memberType = m[0].trim();
                bean.setP_member_type(memberType);
            }
            
            if(!txtExpireCard.getText().equals("")){
                Date dateExpire = DateFormat.getLocal_ddMMyyyy(txtExpireCard.getText());
                bean.setCard_Expire(dateExpire);
            }

            if (getProfileControl().saveProfile(bean)) {
                if (cbMemberType.getSelectedIndex() == 0) {
                    CbWithdrawAllowBean wBean = new CbWithdrawAllowBean();
                    wBean.setAccount_no(txtCode.getText());
                    wBean.setAllow_person_qty(tbListPersonApp.getRowCount());
                    wBean.setCust_code(txtCode.getText());
                    wBean.setCust_name(txtName.getText());
                    wBean.setCust_surname(txtSurname.getText());
                    wBean.setIndex(getCbWithdrawAllowControl().getMaxIndex(txtCode.getText()));

                    getCbWithdrawAllowControl().saveCbWithdrawAllow(wBean);
                }

                Value.CUST_CODE = idCard;
                //ที่อยู่ตามทะเบียนบ้าน
                AddressBean aBean1 = new AddressBean();
                aBean1.setAddr_No(txtAddNo1.getText());
                aBean1.setAddr_Moo(txtAddrMoo1.getText());
                aBean1.setAddr_MooName(ThaiUtil.Unicode2ASCII(txtAddrMooName1.getText()));
                aBean1.setAddr_Road(ThaiUtil.Unicode2ASCII(txtAddrRoad1.getText()));
                aBean1.setAddr_Soi(ThaiUtil.Unicode2ASCII(txtAddrSoi1.getText()));
                aBean1.setAddr_Tambon(ThaiUtil.Unicode2ASCII(txtAddrTambon1.getText()));
                aBean1.setAddr_Aumphur(ThaiUtil.Unicode2ASCII(txtAddrAmphur1.getText()));
                aBean1.setAddr_Province(ThaiUtil.Unicode2ASCII(txtAddrProvince1.getText()));
                aBean1.setAddr_Post(txtAddrPost1.getText());
                aBean1.setAddr_type("1");
                aBean1.setAddr_Mobile(txtAddrMobile1.getText());
                aBean1.setAddr_Tel(txtAddrTel1.getText());
                aBean1.setCompany_Name("");
                aBean1.setCust_Code(idCard);
                aBean1.setCust_Type("1");

                aBean1.setDown_rai(0);
                aBean1.setDown_deed_1("");
                aBean1.setDown_deed_2("");
                aBean1.setDown_deed_3("");
                aBean1.setDown_deed_4("");

                getAddressControl().saveProfileAddress(aBean1);

                //ที่อยู่ตามบัตรประชาชน
                AddressBean aBean2 = new AddressBean();
                if (jCheckBox3.isSelected()) {
                    aBean2 = aBean1;
                    aBean2.setAddr_type("2");
                } else {
                    aBean2.setAddr_No(txtAddrNo2.getText());
                    aBean2.setAddr_Moo(txtAddrMoo2.getText());
                    aBean2.setAddr_MooName(ThaiUtil.Unicode2ASCII(txtAddrMooName2.getText()));
                    aBean2.setAddr_Road(ThaiUtil.Unicode2ASCII(txtAddrRoad2.getText()));
                    aBean2.setAddr_Soi(ThaiUtil.Unicode2ASCII(txtAddrSoi2.getText()));
                    aBean2.setAddr_Tambon(ThaiUtil.Unicode2ASCII(txtAddrTambon2.getText()));
                    aBean2.setAddr_Aumphur(ThaiUtil.Unicode2ASCII(txtAddrAmphur2.getText()));
                    aBean2.setAddr_Province(ThaiUtil.Unicode2ASCII(txtAddrProvince2.getText()));
                    aBean2.setAddr_Post(txtAddrPost2.getText());
                    aBean2.setAddr_type("2");
                    aBean2.setAddr_Mobile("");
                    aBean2.setAddr_Tel("");
                    aBean2.setCompany_Name("");
                    aBean2.setCust_Code(idCard);
                    aBean2.setCust_Type("1");
                }

                aBean2.setDown_rai(0);
                aBean2.setDown_deed_1("");
                aBean2.setDown_deed_2("");
                aBean2.setDown_deed_3("");
                aBean2.setDown_deed_4("");
                getAddressControl().saveProfileAddress(aBean2);

                //ที่อยู่ที่ทำงาน
                AddressBean aBean3 = new AddressBean();
                if (jCheckBox4.isSelected()) {
                    aBean3 = aBean1;
                    aBean3.setAddr_type("3");
                    aBean3.setCompany_Name(ThaiUtil.Unicode2ASCII(txtAddr3ComName.getText()));
                } else {
                    aBean3.setAddr_No(txtAddrNo3.getText());
                    aBean3.setAddr_Moo(txtAddrMoo3.getText());
                    aBean3.setAddr_MooName(ThaiUtil.Unicode2ASCII(txtAddrMooName3.getText()));
                    aBean3.setAddr_Road(ThaiUtil.Unicode2ASCII(txtAddrRoad3.getText()));
                    aBean3.setAddr_Soi(ThaiUtil.Unicode2ASCII(txtAddrSoi3.getText()));
                    aBean3.setAddr_Tambon(ThaiUtil.Unicode2ASCII(txtAddrTambon3.getText()));
                    aBean3.setAddr_Aumphur(ThaiUtil.Unicode2ASCII(txtAddrAmphur3.getText()));
                    aBean3.setAddr_Province(ThaiUtil.Unicode2ASCII(txtAddrProvince3.getText()));
                    aBean3.setAddr_Post(txtAddrPost3.getText());
                    aBean3.setAddr_type("3");
                    aBean3.setAddr_Mobile("");
                    aBean3.setAddr_Tel("");
                    aBean3.setCompany_Name(ThaiUtil.Unicode2ASCII(txtAddr3ComName.getText()));
                    aBean3.setCust_Code(idCard);
                    aBean3.setCust_Type("1");
                }

                aBean3.setDown_rai(0);
                aBean3.setDown_deed_1("");
                aBean3.setDown_deed_2("");
                aBean3.setDown_deed_3("");
                aBean3.setDown_deed_4("");

                getAddressControl().saveProfileAddress(aBean3);

                if (jCheckBox5.isSelected()) {
                    //ที่อยู่ปลูกดาวอินคา
                    AddressBean aBean4 = new AddressBean();
                    aBean4.setAddr_No(txtAddrNo4.getText());
                    aBean4.setAddr_Moo(txtAddrMoo4.getText());
                    aBean4.setAddr_MooName(ThaiUtil.Unicode2ASCII(txtAddrMooName4.getText()));
                    aBean4.setAddr_Road(ThaiUtil.Unicode2ASCII(txtAddrRoad4.getText()));
                    aBean4.setAddr_Soi(ThaiUtil.Unicode2ASCII(txtAddrSoi4.getText()));
                    aBean4.setAddr_Tambon(ThaiUtil.Unicode2ASCII(txtAddrTambon4.getText()));
                    aBean4.setAddr_Aumphur(ThaiUtil.Unicode2ASCII(txtAddrAmphur4.getText()));
                    aBean4.setAddr_Province(ThaiUtil.Unicode2ASCII(txtAddrProvince4.getText()));
                    aBean4.setAddr_Post(txtAddrPost4.getText());
                    aBean4.setAddr_type("4");
                    aBean4.setAddr_Mobile("");
                    aBean4.setAddr_Tel("");
                    aBean4.setCompany_Name(ThaiUtil.Unicode2ASCII("" + cbProject.getSelectedItem()));
                    aBean4.setCust_Code(idCard);
                    aBean4.setCust_Type("1");

                    try {
                        aBean4.setDown_rai(Integer.parseInt(txtDownRai.getText()));
                    } catch (NumberFormatException e) {
                        aBean4.setDown_rai(0);
                    }
                    aBean4.setDown_deed_1(txtDownDeed1.getText());
                    aBean4.setDown_deed_2(txtDownDeed2.getText());
                    aBean4.setDown_deed_3(txtDownDeed3.getText());
                    aBean4.setDown_deed_4(txtDownDeed4.getText());

                    getAddressControl().saveProfileAddress(aBean4);
                }
                isSaveData = true;
            } else {
                Value.CUST_CODE = null;
                return false;
            }
        }

        return isSaveData;
    }

    private void init() {
        txtIndex.setText(getProfileControl().getMaxIndex());

        ConfigBean cBean = getConfigControl().getConfigBean();
        txtFeeMember.setText(NumberFormat.showDouble2(cBean.getFeeAmt()));

        tbListPersonApp.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbListPersonApp.setRowHeight(30);
        JTableHeader tHeader = tbListPersonApp.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));

        double a1 = Double.parseDouble(txtFeeProject.getText());
        double a2 = Double.parseDouble(txtFeeMember.getText());
        txtFeeTotal.setText(NumberFormat.showDouble2("" + (a1 + a2)));

        txtCode.requestFocus();
    }

    private void loadCustomerEdit() {
        ProfileBean p = getProfileControl().listCbProfile(txtCode.getText());
        if (p != null) {
            Value.CUST_CODE = txtCode.getText();

            //jTabbedPane1.setEnabledAt(1, true);
            txtIndex.setText("" + p.getP_index());
            txtCode.setText(p.getP_custCode());
            txtCode.setEnabled(false);
            txtName.requestFocus();
            if (p.getP_member_type() != null) {
                switch (p.getP_member_type()) {
                    case "1":
                        cbMemberType.setSelectedIndex(0);
                        break;
                    case "2":
                        cbMemberType.setSelectedIndex(1);
                        break;
                }
            }

            cbMemberType.setEnabled(false);

            txtName.setText(p.getP_custName());
            txtSurname.setText(p.getP_custSurname());
            txtOccupation.setText(p.getP_custOccupation());
            try {
                cbProfileStatus.setSelectedItem(Integer.parseInt(p.getP_cust_status()));
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }

            cb_prefix.setSelectedItem(p.getP_prefix());
            try {
                cbProfileStatus.setSelectedIndex(Integer.parseInt(p.getP_cust_status()));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            cbReligion.setSelectedItem(p.getP_cust_religion());

            txtDate.setText(DateFormat.getLocale_ddMMyyyy(p.getP_custBirthDay()));
            switch (p.getP_custSex()) {
                case "M":
                    cbSex.setSelectedIndex(0);
                    break;
                case "F":
                    cbSex.setSelectedIndex(1);
                    break;
                default:
                    cbSex.setSelectedIndex(2);
                    break;
            }
            txtMemberStartDate.setText(DateFormat.getLocale_ddMMyyyy(p.getP_member_start()));
            txtMemberEndDate.setText(DateFormat.getLocale_ddMMyyyy(p.getP_member_end()));
            txtExpireCard.setText(DateFormat.getLocale_ddMMyyyy(p.getCard_Expire()));

            txtSpouseName.setText(p.getP_spouse_name());
            txtSpouseSurname.setText(p.getP_spouse_surname());

            if (p.getP_spouse_sex().equals("M")) {
                cbSex1.setSelectedIndex(0);
            } else if (p.getP_custSex().equals("F")) {
                cbSex1.setSelectedIndex(1);
            } else {
                cbSex1.setSelectedIndex(2);
            }

            if (!p.getP_cust_pic_url().equals("")) {
                lbPicture.setIcon(new javax.swing.ImageIcon(p.getP_cust_pic_url()));
                lbPicture.setText("");
            } else {
                lbPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
                lbPicture.setText("");
            }

            txtNation.setText(p.getP_custNation());
            txtAge.setText("" + p.getP_custAge());
            txtDate.setText(DateFormat.getLocale_ddMMyyyy(p.getP_custBirthDay()));
            txtFeeMember.setText("" + p.getP_fee());
            txtFeeProject.setText("" + p.getP_down_fee());
            txtFeeTotal.setText("" + (p.getP_fee() + p.getP_down_fee()));

            //show Address
            AddressBean aBean1 = getAddressControl().listProfileAddress(p.getP_custCode(), "1");
            txtAddNo1.setText(aBean1.getAddr_No());
            txtAddrMoo1.setText(aBean1.getAddr_Moo());
            txtAddrMooName1.setText(aBean1.getAddr_MooName());
            txtAddrRoad1.setText(aBean1.getAddr_Road());
            txtAddrSoi1.setText(aBean1.getAddr_Soi());
            txtAddrTambon1.setText(aBean1.getAddr_Tambon());
            txtAddrAmphur1.setText(aBean1.getAddr_Aumphur());
            txtAddrProvince1.setText(aBean1.getAddr_Province());
            txtAddrPost1.setText(aBean1.getAddr_Post());
            txtAddrMobile1.setText(aBean1.getAddr_Mobile());
            txtAddrTel1.setText(aBean1.getAddr_Tel());

            AddressBean aBean = getAddressControl().listProfileAddress(p.getP_custCode(), "2");
            txtAddrNo2.setText(aBean.getAddr_No());
            txtAddrMoo2.setText(aBean.getAddr_Moo());
            txtAddrMooName2.setText(aBean.getAddr_MooName());
            txtAddrRoad2.setText(aBean.getAddr_Road());
            txtAddrSoi2.setText(aBean.getAddr_Soi());
            txtAddrTambon2.setText(aBean.getAddr_Tambon());
            txtAddrAmphur2.setText(aBean.getAddr_Aumphur());
            txtAddrProvince2.setText(aBean.getAddr_Province());
            txtAddrPost2.setText(aBean.getAddr_Post());

            AddressBean aBean3 = getAddressControl().listProfileAddress(p.getP_custCode(), "3");
            txtAddr3ComName.setText(aBean3.getCompany_Name());
            txtAddrNo3.setText(aBean3.getAddr_No());
            txtAddrMoo3.setText(aBean3.getAddr_Moo());
            txtAddrMooName3.setText(aBean3.getAddr_MooName());
            txtAddrRoad3.setText(aBean3.getAddr_Road());
            txtAddrSoi3.setText(aBean3.getAddr_Soi());
            txtAddrTambon3.setText(aBean3.getAddr_Tambon());
            txtAddrAmphur3.setText(aBean3.getAddr_Aumphur());
            txtAddrProvince3.setText(aBean3.getAddr_Province());
            txtAddrPost3.setText(aBean3.getAddr_Post());

            AddressBean aBean4 = getAddressControl().listProfileAddress(p.getP_custCode(), "4");
            String pjName = aBean4.getCompany_Name();
            if (pjName == null) {
                pjName = "";
            } else {
                if (cbProject.getItemCount() > 0) {
                    cbProject.setSelectedItem("" + aBean4.getCompany_Name());
                }
            }
            txtAddrNo4.setText(aBean4.getAddr_No());
            txtAddrMoo4.setText(aBean4.getAddr_Moo());
            txtAddrMooName4.setText(aBean4.getAddr_MooName());
            txtAddrRoad4.setText(aBean4.getAddr_Road());
            txtAddrSoi4.setText(aBean4.getAddr_Soi());
            txtAddrTambon4.setText(aBean4.getAddr_Tambon());
            txtAddrAmphur4.setText(aBean4.getAddr_Aumphur());
            txtAddrProvince4.setText(aBean4.getAddr_Province());
            txtAddrPost4.setText(aBean4.getAddr_Post());
            txtDownRai.setText("" + aBean4.getDown_rai());
            txtDownDeed1.setText(aBean4.getDown_deed_1());
            txtDownDeed2.setText(aBean4.getDown_deed_2());
            txtDownDeed3.setText(aBean4.getDown_deed_3());
            txtDownDeed4.setText(aBean4.getDown_deed_4());
            if (!pjName.equals("")) {
                jCheckBox5.setSelected(true);
            } else {
                jCheckBox5.setSelected(false);
            }
        } else {
            txtName.requestFocus();
        }
    }

    private void clearForm() {
        Value.CUST_CODE = null;
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        txtCode.setEnabled(true);
        cbMemberType.setEnabled(true);

        txtCode.setText("");
        txtName.setText("");
        txtName.setText("");
        txtDate.setText("");
        txtAge.setText("0");
        txtSurname.setText("");
        cbSex.setSelectedIndex(0);
        txtOccupation.setText("");
        txtNation.setText("");
        cbProfileStatus.setSelectedIndex(0);
        cbReligion.setSelectedIndex(0);
        txtMemberEndDate.setText("");
        txtSpouseName.setText("");
        txtSpouseSurname.setText("");
        cbSex1.setSelectedIndex(0);
        txtAddNo1.setText("");
        txtAddrMoo1.setText("");
        txtAddrRoad1.setText("");
        txtAddrSoi1.setText("");
        txtAddrTambon1.setText("");
        txtAddrAmphur1.setText("");
        txtAddrProvince1.setText("");
        txtAddrPost1.setText("");
        txtAddrMobile1.setText("");
        txtAddrTel1.setText("");

        txtAddr3ComName.setText("");
        txtAddrNo2.setText("");
        txtAddrMoo2.setText("");
        txtAddrRoad2.setText("");
        txtAddrSoi2.setText("");
        txtAddrTambon2.setText("");
        txtAddrAmphur2.setText("");
        txtAddrProvince2.setText("");
        txtAddrPost2.setText("");

        txtAddrNo3.setText("");
        txtAddrMoo3.setText("");
        txtAddrRoad3.setText("");
        txtAddrSoi3.setText("");
        txtAddrTambon3.setText("");
        txtAddrAmphur3.setText("");
        txtAddrProvince3.setText("");
        txtAddrPost3.setText("");
        computeTotalFee();
        txtFeeProject.setText("0.00");

        lbPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
        init();

        txtCode.setEditable(true);
        txtCode.requestFocus();
    }

    private boolean processCancelMember() {
        try {
            String sql = "update cb_profile set "
                    + "status='Cancel' "
                    + "where p_custCode='" + txtCode.getText() + "'";
            MySQLConnect.exeUpdate(sql);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error MySQL !", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return false;
    }

    private void printFee() {
        PrintCOM pc = new PrintCOM();
        ConfigBean bean = getConfigControl().getConfigBean();
        String docNo;
        if (bean.getBranchPrefix().equals("Y")) {
            BranchBean bBean = getBranchControl().getData();
            docNo = bBean.getCode() + bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        } else {
            docNo = bean.getSaveDocPrefix() + getRunning(bean.getFeeRunning());
        }

        if (pc.printMemberFee(txtCode.getText(), txtFeeMember.getText(), docNo, txtFeeProject.getText())) {
            try {
                String sql = "update cb_config set FeeRunning=FeeRunning+1";
                MySQLConnect.exeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error MySQL !", JOptionPane.ERROR_MESSAGE);
                Log.write.error(e.getMessage());
            }
        }

    }

    private String getRunning(int run) {
        if (run < 10) {
            return "000000" + run;
        } else if (run < 100) {
            return "00000" + run;
        } else if (run < 1000) {
            return "0000" + run;
        } else if (run < 10000) {
            return "000" + run;
        } else if (run < 100000) {
            return "00" + run;
        } else if (run < 1000000) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    private void computeTotalFee() {
        try {
            double a = Double.parseDouble(txtFeeMember.getText());
            double b = Double.parseDouble(txtFeeProject.getText());
            double total = a + b;
            DecimalFormat dec = new DecimalFormat("#,##0.00");
            txtFeeTotal.setText(dec.format(total));
        } catch (NumberFormatException e) {
            txtFeeMember.setText("0.00");
            txtFeeProject.setText("0.00");
            txtFeeTotal.setText("0.00");
        }

    }

    private void loadProjectList() {
        ArrayList<CbProjectBean> listBean = getProjectControl().listProject();
        if (cbProject.getItemCount() > 0) {
            cbProject.removeAllItems();
        }
        for (int i = 0; i < listBean.size(); i++) {
            CbProjectBean bean = (CbProjectBean) listBean.get(i);
            cbProject.addItem(bean.getProductName());
        }

        ArrayList<CbMemberTypeBean> listExp = getMemberTypeControl().listMemberType();
        cbMemberType.removeAllItems();
        for (int i = 0; i < listExp.size(); i++) {
            CbMemberTypeBean bean = (CbMemberTypeBean) listExp.get(i);
            cbMemberType.addItem(bean.getTypeCode() + " - " + bean.getTypeName());
        }

        //cb_prefix
        ArrayList<CbPrefixBean> listPre = getPrefixControl().listPrefix();
        cb_prefix.removeAllItems();
        for (int i = 0; i < listPre.size(); i++) {
            CbPrefixBean bean = (CbPrefixBean) listPre.get(i);
            cb_prefix.addItem(bean.getName());
        }
    }

    private void addPersonAllow() {
        if (!txtCustAppCode.getText().equals("")) {
            ProfileBean pBean = getProfileControl().listCbProfile(txtCustAppCode.getText());

            if (pBean != null) {
                CbWithdrawAllowBean wBean = new CbWithdrawAllowBean();
                if (cbMemberType.getSelectedIndex() == 1) {
                    wBean.setAccount_no(txtCode.getText());
                    wBean.setAllow_person_qty(tbListPersonApp.getRowCount());
                } else {
                    wBean.setAccount_no(pBean.getP_custCode());
                    wBean.setAllow_person_qty(1);
                }

                wBean.setCust_code(pBean.getP_custCode());
                wBean.setCust_name(pBean.getP_custName());
                wBean.setCust_surname(pBean.getP_custSurname());
                wBean.setIndex(getCbWithdrawAllowControl().getMaxIndex(pBean.getP_custCode()));

                getCbWithdrawAllowControl().saveCbWithdrawAllow(wBean);

                //load data
                loadPersonApp();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลสมาชิกในกลุ่ม \n"
                        + "กรุณาลงทะเบียนข้อมูลสมาชิกในกลุ่มก่อน !");
                txtCustAppCode.requestFocus();
            }
        } else {
            txtCustAppCode.requestFocus();
        }
    }

    private void loadPersonApp() {
        DefaultTableModel model = (DefaultTableModel) tbListPersonApp.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        String accountCode = txtCode.getText();
        ArrayList<CbWithdrawAllowBean> listWithdraw = getCbWithdrawAllowControl().listCbWithdrawAllow(accountCode);
        for (int i = 0; i < listWithdraw.size(); i++) {
            CbWithdrawAllowBean bean = (CbWithdrawAllowBean) listWithdraw.get(i);
            model.addRow(new Object[]{
                bean.getIndex(),
                bean.getCust_code(),
                bean.getCust_name(),
                bean.getCust_surname()
            });
        }

        txtCustAppCode.setText("");
        txtCustAppCode.requestFocus();
    }

}
