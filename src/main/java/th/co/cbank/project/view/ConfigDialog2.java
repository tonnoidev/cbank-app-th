package th.co.cbank.project.view;

import gnu.io.CommPortIdentifier;
import th.co.cbank.project.control.MySQLConnect;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import javax.print.PrintService;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.CbHoonConfigBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.CbSaveConfigBean;

public class ConfigDialog2 extends BaseDialogSwing {

    private final Logger logger = Logger.getLogger(ConfigDialog2.class);
    private final DecimalFormat dec = new DecimalFormat("0.00");

    public ConfigDialog2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initChk();
        loadInitConfig();
        loadDataSaveType();
        loadHoonList();
        loadConfigLoadList();

        setLocation(0, 0);
        setSize(parent.getMaximumSize());

        txtAccPrefix.requestFocus();
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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        chkManual2 = new javax.swing.JRadioButton();
        chkAuto2 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtSaveDocPrefix = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSaveDocRunning = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtWitdrawDocPrefix = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        txtWitdrawDocRunning = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txtIntDocPrefix = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        txtIntDocRunning = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        chkManual3 = new javax.swing.JRadioButton();
        chkAuto3 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        txtHoonDocPrefix = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHoonDocRunning = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        txtHoonSaleDocPrefix = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txtHoonSaleDocRunning = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        txtHoonCompoundDocPrefix = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        txtHoonCompoundDocRunning = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        txtHoonTranferDocPrefix = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txtHoonTransferDocRunning = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        chkManual4 = new javax.swing.JRadioButton();
        chkAuto4 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        txtLoanDocPrefix = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtLoanDocRunning = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        txtPaymentDocPrefix = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        txtPaymentDocRunning = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cbPrinterPassBookName = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbBookSpec = new javax.swing.JComboBox();
        jPanel12 = new javax.swing.JPanel();
        cbPrintSlipDriver = new javax.swing.JComboBox();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        cbPrinterDirect = new javax.swing.JComboBox();
        btnTestPrint = new javax.swing.JButton();
        btnPrintTransaction4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        chkManual1 = new javax.swing.JRadioButton();
        chkAuto1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        txtAccPrefix = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAccRunning = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNoteNo = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtProgramStartDate = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txtFeeAmt = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtFeePrefix = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        txtFeeRunning = new javax.swing.JTextField();
        chkBranchPrefix = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtTypeCode = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtTypeName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtTypeINT = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        rdType1 = new javax.swing.JRadioButton();
        rdType2 = new javax.swing.JRadioButton();
        txtRDType2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbRDType2 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        rdTypeMonth = new javax.swing.JRadioButton();
        rdTypeYear = new javax.swing.JRadioButton();
        rdTypeDay = new javax.swing.JRadioButton();
        rdType3 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        rdPayINT1 = new javax.swing.JRadioButton();
        rdPayINT2 = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        cbPayType1 = new javax.swing.JComboBox();
        cbPayType2 = new javax.swing.JComboBox();
        cbPayType4 = new javax.swing.JComboBox();
        cbPayType3 = new javax.swing.JComboBox();
        jLabel38 = new javax.swing.JLabel();
        rdPayINT3 = new javax.swing.JRadioButton();
        cbPayType6 = new javax.swing.JComboBox();
        cbPayType5 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        rdPayINT4 = new javax.swing.JRadioButton();
        cbPayType7 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        txtPayINT = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        rdPayINT5 = new javax.swing.JRadioButton();
        jLabel42 = new javax.swing.JLabel();
        txtFundINT = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbConfigSaveType = new javax.swing.JTable();
        btnSaveType = new javax.swing.JButton();
        btnCancelType = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        txtMinDeposit = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtMinWitdraw = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtFixOverDeposit = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtSaveRunning = new javax.swing.JTextField();
        btnSaveType1 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        txtNoRunning = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtHCode = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtHoonRate = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtHoonDividen = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtHName = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txtHoonVolumnMax = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtHoonBuyMin = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtIntTurnover = new javax.swing.JTextField();
        txtIntNormal = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtIntBadDebt = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        chkINT_FlatRate = new javax.swing.JRadioButton();
        chkINT_Effective_Rate = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        chkMinPay = new javax.swing.JCheckBox();
        txtMinPayPercent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMinPayBaht = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        chkPIntTable = new javax.swing.JRadioButton();
        chkPIntCapital = new javax.swing.JRadioButton();
        jLabel56 = new javax.swing.JLabel();
        txtLoanPenaltyINT = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbLoanConfig = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        txtLoanName = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtLoanFee = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txtLoanCode = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtLoanPenaltyDay = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        txtLoanMaxAmount = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtLoanINT = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtLoanRunning = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtLoanBookNo = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtLoanPerMonth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ตั้งข้อมูลบัญชี/ลูกหนี้/หุ้น");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เลขที่เอกสารรายการฝาก - ถอนเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkManual2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkManual2);
        chkManual2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkManual2.setText("Manual");

        chkAuto2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(chkAuto2);
        chkAuto2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkAuto2.setSelected(true);
        chkAuto2.setText("Auto");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("รายการฝากเงิน");

        txtSaveDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveDocPrefix.setText("DM");
        txtSaveDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaveDocPrefixFocusGained(evt);
            }
        });
        txtSaveDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaveDocPrefixKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("เลข Running");

        txtSaveDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveDocRunning.setText("1");
        txtSaveDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaveDocRunningFocusGained(evt);
            }
        });
        txtSaveDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaveDocRunningKeyPressed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setText("รายการถอนเงิน/ปิดบัญชี");

        txtWitdrawDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWitdrawDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWitdrawDocPrefix.setText("WD");
        txtWitdrawDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWitdrawDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWitdrawDocPrefixFocusGained(evt);
            }
        });
        txtWitdrawDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWitdrawDocPrefixKeyPressed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel98.setText("เลข Running");

        txtWitdrawDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWitdrawDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWitdrawDocRunning.setText("1");
        txtWitdrawDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWitdrawDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWitdrawDocRunningFocusGained(evt);
            }
        });
        txtWitdrawDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWitdrawDocRunningKeyPressed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel103.setText("รายการดอกเบี้ย");

        txtIntDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntDocPrefix.setText("INT");
        txtIntDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntDocPrefixFocusGained(evt);
            }
        });
        txtIntDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntDocPrefixKeyPressed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setText("เลข Running");

        txtIntDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntDocRunning.setText("1");
        txtIntDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntDocRunningFocusGained(evt);
            }
        });
        txtIntDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntDocRunningKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(chkAuto2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel103))
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIntDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWitdrawDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaveDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaveDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWitdrawDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIntDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(chkManual2)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkManual2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAuto2)
                    .addComponent(jLabel18)
                    .addComponent(txtSaveDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtSaveDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(txtWitdrawDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98)
                    .addComponent(txtWitdrawDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(txtIntDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(txtIntDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เลขที่เอกสารรายการซื้อ - ขายหุ้น", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkManual3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(chkManual3);
        chkManual3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkManual3.setText("Manual");

        chkAuto3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(chkAuto3);
        chkAuto3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkAuto3.setSelected(true);
        chkAuto3.setText("Auto");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("รายการซื้อหุ้น");

        txtHoonDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonDocPrefix.setText("BH");
        txtHoonDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonDocPrefixFocusGained(evt);
            }
        });
        txtHoonDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonDocPrefixKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("เลข Running");

        txtHoonDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonDocRunning.setText("1");
        txtHoonDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonDocRunningFocusGained(evt);
            }
        });
        txtHoonDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonDocRunningKeyPressed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("รายการขายหุ้น");

        txtHoonSaleDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonSaleDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonSaleDocPrefix.setText("SH");
        txtHoonSaleDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonSaleDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonSaleDocPrefixFocusGained(evt);
            }
        });
        txtHoonSaleDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonSaleDocPrefixKeyPressed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setText("เลข Running");

        txtHoonSaleDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonSaleDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonSaleDocRunning.setText("1");
        txtHoonSaleDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonSaleDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonSaleDocRunningFocusGained(evt);
            }
        });
        txtHoonSaleDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonSaleDocRunningKeyPressed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("รายการปันผล");

        txtHoonCompoundDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonCompoundDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonCompoundDocPrefix.setText("CI");
        txtHoonCompoundDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonCompoundDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonCompoundDocPrefixFocusGained(evt);
            }
        });
        txtHoonCompoundDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonCompoundDocPrefixKeyPressed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("เลข Running");

        txtHoonCompoundDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonCompoundDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonCompoundDocRunning.setText("1");
        txtHoonCompoundDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonCompoundDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonCompoundDocRunningFocusGained(evt);
            }
        });
        txtHoonCompoundDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonCompoundDocRunningKeyPressed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel110.setText("รายการโอนหุ้น");

        txtHoonTranferDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonTranferDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonTranferDocPrefix.setText("TH");
        txtHoonTranferDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonTranferDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonTranferDocPrefixFocusGained(evt);
            }
        });
        txtHoonTranferDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonTranferDocPrefixKeyPressed(evt);
            }
        });

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel111.setText("เลข Running");

        txtHoonTransferDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonTransferDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonTransferDocRunning.setText("1");
        txtHoonTransferDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonTransferDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonTransferDocRunningFocusGained(evt);
            }
        });
        txtHoonTransferDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonTransferDocRunningKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(chkAuto3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel101)
                                    .addComponent(jLabel110))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoonCompoundDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoonSaleDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoonDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoonTranferDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonSaleDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel102)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonCompoundDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonTransferDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(chkManual3)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkManual3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAuto3)
                    .addComponent(jLabel20)
                    .addComponent(txtHoonDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtHoonDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(txtHoonSaleDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100)
                    .addComponent(txtHoonSaleDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(txtHoonTranferDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addComponent(txtHoonTransferDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(txtHoonCompoundDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(txtHoonCompoundDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เลขที่เอกสารคำขอกู้เงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkManual4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(chkManual4);
        chkManual4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkManual4.setText("Manual");

        chkAuto4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(chkAuto4);
        chkAuto4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkAuto4.setSelected(true);
        chkAuto4.setText("Auto");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("เลขนำหน้า (Prefix)");

        txtLoanDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocPrefix.setText("LN");
        txtLoanDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanDocPrefixFocusGained(evt);
            }
        });
        txtLoanDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDocPrefixKeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("เลข Running");

        txtLoanDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocRunning.setText("1");
        txtLoanDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanDocRunningFocusGained(evt);
            }
        });
        txtLoanDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDocRunningKeyPressed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel105.setText("รายการรับชำระ");

        txtPaymentDocPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDocPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaymentDocPrefix.setText("PM");
        txtPaymentDocPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentDocPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentDocPrefixFocusGained(evt);
            }
        });
        txtPaymentDocPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentDocPrefixKeyPressed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel106.setText("เลข Running");

        txtPaymentDocRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDocRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaymentDocRunning.setText("1");
        txtPaymentDocRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentDocRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentDocRunningFocusGained(evt);
            }
        });
        txtPaymentDocRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentDocRunningKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPaymentDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaymentDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkManual4)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(chkAuto4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoanDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoanDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkManual4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAuto4)
                    .addComponent(jLabel22)
                    .addComponent(txtLoanDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtLoanDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(txtPaymentDocPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106)
                    .addComponent(txtPaymentDocRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เครื่องพิมพ์สมุดเงินฝาก", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("เลือกเครื่องพิมพ์หลัก (หากไม่เลือกระบบจะ default จากเครื่อง)");

        cbPrinterPassBookName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ประเภทสมุด");

        cbBookSpec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBookSpec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "หนองยาง", "กำแพงเพ็ชร" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cbPrinterPassBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBookSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPrinterPassBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbBookSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เครื่องพิมพ์สลิป การรับชำระเงินกู้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        cbPrintSlipDriver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        rd1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rd1);
        rd1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd1.setSelected(true);
        rd1.setText(" Driver");

        rd2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(rd2);
        rd2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd2.setText(" Direct");

        cbPrinterDirect.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTestPrint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTestPrint.setText("Test Print");
        btnTestPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(rd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPrinterDirect, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTestPrint))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(rd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPrintSlipDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd1)
                    .addComponent(cbPrintSlipDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd2)
                    .addComponent(cbPrinterDirect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTestPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPrintTransaction4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintTransaction4.setText("บันทึกข้อมูล");
        btnPrintTransaction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTransaction4ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เลขที่บัญชีสมุดฝากเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkManual1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(chkManual1);
        chkManual1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkManual1.setText("Manual");

        chkAuto1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup6.add(chkAuto1);
        chkAuto1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkAuto1.setSelected(true);
        chkAuto1.setText("Auto");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("เลขนำหน้า (Prefix)");

        txtAccPrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccPrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccPrefix.setText("AC");
        txtAccPrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccPrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccPrefixFocusGained(evt);
            }
        });
        txtAccPrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccPrefixKeyPressed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("เลข Running");

        txtAccRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccRunning.setText("1");
        txtAccRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccRunningFocusGained(evt);
            }
        });
        txtAccRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccRunningKeyPressed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("สมุดเล่มที่");

        txtNoteNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoteNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoteNo.setText("1");
        txtNoteNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNoteNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoteNoFocusGained(evt);
            }
        });
        txtNoteNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoteNoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkManual1)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(chkAuto1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccPrefix, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(txtNoteNo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkManual1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAuto1)
                    .addComponent(jLabel25)
                    .addComponent(txtAccPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtAccRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtNoteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เกี่ยวกับโปรแกรม", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("เริ่มใช้งานโปรแกรม");

        txtProgramStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProgramStartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtProgramStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProgramStartDateKeyPressed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("ค่าธรรมเนียมสมาชิก");

        txtFeeAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeeAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFeeAmt.setText("0.00");
        txtFeeAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFeeAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeeAmtFocusGained(evt);
            }
        });
        txtFeeAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeeAmtKeyPressed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("บาท");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel108.setText("รายการค่าธรรมเนียม");

        txtFeePrefix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeePrefix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFeePrefix.setText("FEE");
        txtFeePrefix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFeePrefix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeePrefixFocusGained(evt);
            }
        });
        txtFeePrefix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeePrefixKeyPressed(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel109.setText("เลข Running");

        txtFeeRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeeRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFeeRunning.setText("1");
        txtFeeRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFeeRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeeRunningFocusGained(evt);
            }
        });
        txtFeeRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeeRunningKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel84)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProgramStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFeeAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(txtFeePrefix))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel109)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFeeRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel85))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtProgramStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(txtFeeAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(txtFeePrefix, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109)
                    .addComponent(txtFeeRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chkBranchPrefix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkBranchPrefix.setSelected(true);
        chkBranchPrefix.setText("ทุกเอกสารให้ขึ้นต้นด้วยรหัสสาขา");
        chkBranchPrefix.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("ยกเลิก");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnPrintTransaction4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chkBranchPrefix)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkBranchPrefix)
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrintTransaction4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ข้อมูลพื้นฐานโปรแกรม", jPanel7);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("รหัสประเภท");

        txtTypeCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTypeCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTypeCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTypeCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTypeCodeFocusGained(evt);
            }
        });
        txtTypeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeCodeKeyPressed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("ชื่อประเภทเงินฝาก");

        txtTypeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTypeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeNameKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("อัตราดอกเบี้ย/ปี");

        txtTypeINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTypeINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTypeINT.setText("0.00");
        txtTypeINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTypeINT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTypeINTFocusGained(evt);
            }
        });
        txtTypeINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTypeINTKeyPressed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("%");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เงื่อนไขของการฝากเงินฝาก-ถอน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rdType1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rdType1);
        rdType1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdType1.setSelected(true);
        rdType1.setText("ฝาก-ถอน ไม่จำกัด");

        rdType2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rdType2);
        rdType2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdType2.setText("ฝากประจำเท่ากันทุกงวด");

        txtRDType2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRDType2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRDType2.setText("0.00");
        txtRDType2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRDType2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRDType2FocusGained(evt);
            }
        });
        txtRDType2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRDType2KeyPressed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("บาท");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("ห้ามถอนก่อน");

        cbRDType2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbRDType2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ห้ามถอน", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("เดือน");

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rdTypeMonth.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rdTypeMonth);
        rdTypeMonth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdTypeMonth.setSelected(true);
        rdTypeMonth.setText("รายเดือน");

        rdTypeYear.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rdTypeYear);
        rdTypeYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdTypeYear.setText("รายปี");

        rdTypeDay.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(rdTypeDay);
        rdTypeDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdTypeDay.setText("รายวัน");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdTypeDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdTypeMonth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdTypeYear)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTypeDay)
                    .addComponent(rdTypeMonth)
                    .addComponent(rdTypeYear))
                .addContainerGap())
        );

        rdType3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup8.add(rdType3);
        rdType3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdType3.setText("ฝากไม่จำกัด แต่ถอนได้ในกรณีปิดบัญชีเท่านั้น");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdType1)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(rdType2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRDType2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbRDType2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdType3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(rdType1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdType2)
                            .addComponent(txtRDType2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(cbRDType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdType3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เงื่อนไขการจ่ายดอกเบี้ย", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rdPayINT1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rdPayINT1);
        rdPayINT1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPayINT1.setText("ฝากออมทรัพย์ จ่ายทุกเดือน");

        rdPayINT2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rdPayINT2);
        rdPayINT2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPayINT2.setText("ฝากออมทรัพย์ จ่ายปีละ 1 ครั้ง");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("จ่ายทุกวันที่");

        cbPayType1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbPayType2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมพาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbPayType2.setSelectedIndex(11);

        cbPayType4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมพาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbPayType4.setSelectedIndex(5);

        cbPayType3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("ครั้งที่ 1 จ่ายทุกวันที่");

        rdPayINT3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rdPayINT3);
        rdPayINT3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPayINT3.setSelected(true);
        rdPayINT3.setText("ฝากออมทรัพย์ จ่ายปีละ 2 ครั้ง");

        cbPayType6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "มกราคม", "กุมพาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฏาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" }));
        cbPayType6.setSelectedIndex(11);

        cbPayType5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPayType5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("ครั้งที่ 2 จ่ายทุกวันที่");

        rdPayINT4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rdPayINT4);
        rdPayINT4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPayINT4.setText("ฝากประจำจ่ายทุกๆ");

        cbPayType7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("เดือน (นับจากวันที่เปิดบัญชี) ใช้กับเงินฝากประจำเท่านั้น ถอนก่อนกำหนดคิดดอกเบี้ย");

        txtPayINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPayINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayINT.setText("0.00");
        txtPayINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPayINT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayINTFocusGained(evt);
            }
        });
        txtPayINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayINTKeyPressed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("%");

        rdPayINT5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup9.add(rdPayINT5);
        rdPayINT5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdPayINT5.setText("จ่ายปันผลตอนสิ้นปี");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("จากยอดเงินฝาก");

        txtFundINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFundINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFundINT.setText("0.00");
        txtFundINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFundINT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFundINTFocusGained(evt);
            }
        });
        txtFundINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFundINTKeyPressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("%");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdPayINT1)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rdPayINT4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPayType7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPayINT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(rdPayINT5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFundINT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rdPayINT2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPayType1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPayType2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(rdPayINT3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPayType3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPayType4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPayType5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPayType6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdPayINT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPayINT2)
                    .addComponent(jLabel37)
                    .addComponent(cbPayType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPayType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPayINT3)
                    .addComponent(jLabel38)
                    .addComponent(cbPayType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPayType4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(cbPayType5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPayType6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPayINT4)
                    .addComponent(cbPayType7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtPayINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPayINT5)
                    .addComponent(jLabel42)
                    .addComponent(txtFundINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbConfigSaveType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ชื่อประเภทเงินฝาก", "อัตราดอกเบี้ย/ปี"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConfigSaveType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConfigSaveTypeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbConfigSaveType);
        if (tbConfigSaveType.getColumnModel().getColumnCount() > 0) {
            tbConfigSaveType.getColumnModel().getColumn(0).setPreferredWidth(80);
            tbConfigSaveType.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbConfigSaveType.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        btnSaveType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveType.setText("บันทึกข้อมูล");
        btnSaveType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveTypeActionPerformed(evt);
            }
        });

        btnCancelType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelType.setText("ยกเลิก");
        btnCancelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTypeActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("ขั้นต่ำในการฝากเงิน");

        txtMinDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMinDeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinDeposit.setText("0.00");
        txtMinDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMinDeposit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinDepositFocusGained(evt);
            }
        });
        txtMinDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinDepositKeyPressed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("บาท");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("บาท");

        txtMinWitdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMinWitdraw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinWitdraw.setText("0.00");
        txtMinWitdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMinWitdraw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinWitdrawFocusGained(evt);
            }
        });
        txtMinWitdraw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinWitdrawKeyPressed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("ขั้นต่ำในการถอนเงิน");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("ห้ามฝากเกิน");

        txtFixOverDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFixOverDeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFixOverDeposit.setText("999,999,999.00");
        txtFixOverDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFixOverDeposit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFixOverDepositFocusGained(evt);
            }
        });
        txtFixOverDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFixOverDepositKeyPressed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("บาท");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel78.setText("คิดภาษีเงินฝาก");

        txtTax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTax.setText("0.00");
        txtTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTaxFocusGained(evt);
            }
        });
        txtTax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaxKeyPressed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setText("%");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Running");

        txtSaveRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveRunning.setText("1");
        txtSaveRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaveRunningFocusGained(evt);
            }
        });
        txtSaveRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaveRunningKeyPressed(evt);
            }
        });

        btnSaveType1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveType1.setText("ลบข้อมูล");
        btnSaveType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveType1ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("เล่มที่");

        txtNoRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNoRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoRunning.setText("1");
        txtNoRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtNoRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNoRunningFocusGained(evt);
            }
        });
        txtNoRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoRunningKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ค่าธรรมเนียม");

        txtFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFee.setText("0.00");
        txtFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFeeFocusGained(evt);
            }
        });
        txtFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel32)
                                .addComponent(jLabel30)
                                .addComponent(jLabel76))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTypeINT, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(txtTypeCode))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addComponent(jLabel33)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel72))
                                        .addComponent(jLabel31))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addComponent(txtMinDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel73)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel75)
                                                .addComponent(jLabel78))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtTax, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(txtMinWitdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                                        .addComponent(txtTypeName))
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                            .addGap(64, 64, 64)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel45)
                                                .addComponent(jLabel44))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSaveRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                                    .addComponent(jLabel79)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtFee))
                                                .addGroup(jPanel15Layout.createSequentialGroup()
                                                    .addComponent(jLabel74)
                                                    .addGap(85, 85, 85)
                                                    .addComponent(txtNoRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(jPanel15Layout.createSequentialGroup()
                                    .addComponent(txtFixOverDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel77))))
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnSaveType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveType1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelType, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtSaveRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel75)
                        .addComponent(txtMinWitdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74)
                        .addComponent(jLabel45)
                        .addComponent(txtNoRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(txtTypeINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33)
                        .addComponent(jLabel72)
                        .addComponent(txtMinDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(txtFixOverDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveType1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("ประเภทเงินฝาก", jPanel15);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("บันทึกข้อมูล");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("รหัสประเภท");

        txtHCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHCodeFocusGained(evt);
            }
        });
        txtHCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHCodeKeyPressed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("อัตราค่าหุ้น/หน่วย");

        txtHoonRate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonRate.setText("0.00");
        txtHoonRate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonRateFocusGained(evt);
            }
        });
        txtHoonRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonRateKeyPressed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("อัตราเงินปันผล");

        txtHoonDividen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonDividen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonDividen.setText("0.00");
        txtHoonDividen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonDividen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonDividenFocusGained(evt);
            }
        });
        txtHoonDividen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonDividenKeyPressed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("%");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel64.setText("ชื่อประเภทหุ้น");

        txtHName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHNameKeyPressed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("จำนวนหุ้น");

        txtHoonVolumnMax.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonVolumnMax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonVolumnMax.setText("0");
        txtHoonVolumnMax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonVolumnMax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonVolumnMaxFocusGained(evt);
            }
        });
        txtHoonVolumnMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonVolumnMaxKeyPressed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("จำนวนซื้อขั้นต่ำ");

        txtHoonBuyMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonBuyMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHoonBuyMin.setText("0");
        txtHoonBuyMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonBuyMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonBuyMinFocusGained(evt);
            }
        });
        txtHoonBuyMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonBuyMinKeyPressed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("หุ้น");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("หุ้น");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("บาท");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel60)
                        .addGap(4, 4, 4)
                        .addComponent(txtHCode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel61)
                        .addGap(4, 4, 4)
                        .addComponent(txtHoonRate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel71))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel62)
                        .addGap(4, 4, 4)
                        .addComponent(txtHoonDividen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel63)))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHName, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel65)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonVolumnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoonBuyMin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel60)))
                .addGap(6, 6, 6)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoonRate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoonVolumnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel71)
                            .addComponent(jLabel65))))
                .addGap(6, 6, 6)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoonDividen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoonBuyMin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel66))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ชื่อประเภทหุ้น", "อัตราเงินปันผล", "ราคาหุ้นต่อหน่วย"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(300);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("ยกเลิก");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setText("ลบข้อมูล");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(4, 4, 4)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(650, 729, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addContainerGap())))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("ประเภทหุ้น", jPanel20);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "วิธีคิดดอกเบี้ยเงินกู้/ปี", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("%");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("ดอกเบี้ยเงินกู้");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("สำรองหนี้สูญ");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel51.setText("ค่าดำเนินการ");

        txtIntTurnover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntTurnover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntTurnover.setText("0.00");
        txtIntTurnover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntTurnover.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntTurnoverFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntTurnoverFocusLost(evt);
            }
        });
        txtIntTurnover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntTurnoverKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIntTurnoverKeyReleased(evt);
            }
        });

        txtIntNormal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntNormal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntNormal.setText("0.00");
        txtIntNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntNormal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntNormalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntNormalFocusLost(evt);
            }
        });
        txtIntNormal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntNormalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIntNormalKeyReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("%");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("%");

        txtIntBadDebt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIntBadDebt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntBadDebt.setText("0.00");
        txtIntBadDebt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntBadDebt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIntBadDebtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIntBadDebtFocusLost(evt);
            }
        });
        txtIntBadDebt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIntBadDebtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIntBadDebtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel54)
                    .addComponent(jLabel52))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "วิธีคิดดอกเบี้ยเงินกู้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        chkINT_FlatRate.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(chkINT_FlatRate);
        chkINT_FlatRate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkINT_FlatRate.setSelected(true);
        chkINT_FlatRate.setText("1. เงินต้นคงที่ (Flat Interest Rate)");

        chkINT_Effective_Rate.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup10.add(chkINT_Effective_Rate);
        chkINT_Effective_Rate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkINT_Effective_Rate.setText("2. ลดต้นลดดอก (Effective Interest Rate)");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkINT_FlatRate)
                    .addComponent(chkINT_Effective_Rate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkINT_FlatRate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkINT_Effective_Rate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "วิธีรับชำระเงินกู้", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkMinPay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkMinPay.setText("กำหนดขั้นต่ำ");
        chkMinPay.setOpaque(false);
        chkMinPay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkMinPayItemStateChanged(evt);
            }
        });

        txtMinPayPercent.setEditable(false);
        txtMinPayPercent.setBackground(new java.awt.Color(255, 255, 204));
        txtMinPayPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMinPayPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinPayPercent.setText("0");
        txtMinPayPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMinPayPercent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinPayPercentFocusGained(evt);
            }
        });
        txtMinPayPercent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinPayPercentKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("%");

        txtMinPayBaht.setEditable(false);
        txtMinPayBaht.setBackground(new java.awt.Color(255, 255, 204));
        txtMinPayBaht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMinPayBaht.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMinPayBaht.setText("0.00");
        txtMinPayBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtMinPayBaht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMinPayBahtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMinPayBahtFocusLost(evt);
            }
        });
        txtMinPayBaht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinPayBahtKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("บาท");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ต่อยอดเงินต้นคงเหลือ");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkMinPay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMinPayBaht, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtMinPayPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMinPay)
                    .addComponent(txtMinPayPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinPayBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "การคิดค่าปรับกรณีชำระล่าช้า", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        chkPIntTable.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup12.add(chkPIntTable);
        chkPIntTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkPIntTable.setSelected(true);
        chkPIntTable.setText("คิดดอกเบี้ยปรับจากดอกเบี้ยค้าง");

        chkPIntCapital.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup12.add(chkPIntCapital);
        chkPIntCapital.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkPIntCapital.setText("คิดดอกเบี้ยปรับจากเงินต้นคงเหลือ");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("ดอกเบี้ยค่าปรับ");

        txtLoanPenaltyINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanPenaltyINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPenaltyINT.setText("0.00");
        txtLoanPenaltyINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanPenaltyINT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanPenaltyINTFocusGained(evt);
            }
        });
        txtLoanPenaltyINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanPenaltyINTKeyPressed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("%");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPIntCapital)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel57))
                    .addComponent(chkPIntTable, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkPIntTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPIntCapital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56))
                .addContainerGap())
        );

        tbLoanConfig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัส", "ชื่อประเภทเงินกู้", "อัตราดอกเบี้ย/ปี(%)", "สำรองหนี้สูญ(%)", "ค่าดำเนินการ(%)", "ดอกเบี้ยเงินกู้(%)", "ประเภท", "ค่าปรับ(%)", "ชำระขั้นต่ำ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoanConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoanConfigMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbLoanConfig);
        if (tbLoanConfig.getColumnModel().getColumnCount() > 0) {
            tbLoanConfig.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("รหัสประเภท");

        txtLoanName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanNameKeyPressed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("ชื่อประเภทเงินกู้");

        txtLoanFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanFee.setText("0.00");
        txtLoanFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanFeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoanFeeFocusLost(evt);
            }
        });
        txtLoanFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanFeeKeyPressed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("ค่าธรรมเนียม(%)");

        txtLoanCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanCodeKeyPressed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("หากชำระล่าช้าเกิน");

        txtLoanPenaltyDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanPenaltyDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPenaltyDay.setText("7");
        txtLoanPenaltyDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanPenaltyDay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanPenaltyDayFocusGained(evt);
            }
        });
        txtLoanPenaltyDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanPenaltyDayKeyPressed(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("วัน จะต้องชำระค่าปรับ");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("วงเงินกู้สูงสุด");

        txtLoanMaxAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanMaxAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanMaxAmount.setText("0.00");
        txtLoanMaxAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanMaxAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanMaxAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoanMaxAmountFocusLost(evt);
            }
        });
        txtLoanMaxAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanMaxAmountKeyPressed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("บาท");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel80.setText("ดอกเบี้ย/ปี");

        txtLoanINT.setEditable(false);
        txtLoanINT.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanINT.setText("0.00");
        txtLoanINT.setToolTipText("");
        txtLoanINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanINT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanINTFocusGained(evt);
            }
        });
        txtLoanINT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanINTKeyPressed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel81.setText("%");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("Running");

        txtLoanRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanRunning.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanRunning.setText("1");
        txtLoanRunning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanRunning.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanRunningFocusGained(evt);
            }
        });
        txtLoanRunning.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanRunningKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เล่มที่");

        txtLoanBookNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanBookNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanBookNo.setText("1");
        txtLoanBookNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanBookNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanBookNoFocusGained(evt);
            }
        });
        txtLoanBookNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanBookNoKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("ระยะเวลาการชำระไม่เกิน");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("งวด");

        txtLoanPerMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPerMonth.setText("0");
        txtLoanPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanPerMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanPerMonthFocusGained(evt);
            }
        });
        txtLoanPerMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanPerMonthKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("(0 หมายถึงไม่กำหนดงวด)");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel48))
                    .addComponent(jLabel58)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(txtLoanPenaltyDay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59))
                    .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoanMaxAmount)
                    .addComponent(txtLoanINT)
                    .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel68))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(txtLoanINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(txtLoanMaxAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel83)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(txtLoanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(txtLoanPenaltyDay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107)
                            .addComponent(txtLoanRunning, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtLoanBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("บันทึกข้อมูล");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("ยกเลิก");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setText("ลบรายการ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ประเภทเงินกู้", jPanel19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintTransaction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTransaction4ActionPerformed
        ConfigBean bean = new ConfigBean();
        if (chkManual2.isSelected()) {
            bean.setSaveDocType("M");
        } else {
            bean.setSaveDocType("A");
        }

        bean.setSaveDocPrefix(txtSaveDocPrefix.getText());
        bean.setSaveDocRunning(Integer.parseInt(txtSaveDocRunning.getText()));

        if (chkManual3.isSelected()) {
            bean.setHoonDocType("M");
        } else {
            bean.setHoonDocType("A");
        }
        bean.setHoonDocPrefix(txtHoonDocPrefix.getText());
        bean.setHoonDocRunning(Integer.parseInt(txtHoonDocRunning.getText()));
        bean.setHoonTransferDocPrefix(txtHoonTranferDocPrefix.getText());
        bean.setHoonTransferDocRunning(Integer.parseInt(txtHoonTransferDocRunning.getText()));

        if (chkManual4.isSelected()) {
            bean.setLoanDocType("M");
        } else {
            bean.setLoanDocType("A");
        }

        bean.setLoanDocPrefix(txtLoanDocPrefix.getText());
        bean.setLoanDocRunning(Integer.parseInt(txtLoanDocRunning.getText()));

        bean.setPrinterPassBook(ThaiUtil.Unicode2ASCII("" + cbPrinterPassBookName.getSelectedItem()));

        if (rd1.isSelected()) {
            bean.setPrintSlipType("DV");
        } else {
            bean.setPrintSlipType("DR");
        }
        bean.setPrintSlipDriverName(ThaiUtil.Unicode2ASCII("" + cbPrintSlipDriver.getSelectedItem()));
        bean.setPrintSlipPort("" + cbPrinterDirect.getSelectedItem());

        if (chkManual1.isSelected()) {
            bean.setAccountDocType("M");
        } else {
            bean.setAccountDocType("A");
        }
        bean.setAccountPrefix(txtAccPrefix.getText());
        bean.setAccountRunning(Integer.parseInt(txtAccRunning.getText()));

        String[] dateSplit = txtProgramStartDate.getText().split("/");
        String date = dateSplit[2] + "-" + dateSplit[1] + "-" + dateSplit[0];
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            bean.setProgramStartDate(simp.parse(date));
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        if (chkBranchPrefix.isSelected()) {
            bean.setBranchPrefix("Y");
        } else {
            bean.setBranchPrefix("N");
        }

        bean.setWithdrawDocPrefix(txtWitdrawDocPrefix.getText());
        try {
            bean.setWithdrawDocRunning(Integer.parseInt(txtWitdrawDocRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setWithdrawDocRunning(0);
        }

        bean.setIntDocPrefix(txtIntDocPrefix.getText());
        try {
            bean.setIntDocRunning(Integer.parseInt(txtIntDocRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setIntDocRunning(0);
        }

        bean.setHoonSaleDocPrefix(txtHoonSaleDocPrefix.getText());
        try {
            bean.setHoonSaleDocRunning(Integer.parseInt(txtHoonSaleDocRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setHoonSaleDocRunning(0);
        }

        bean.setCompoundDocPrefix(txtHoonCompoundDocPrefix.getText());
        try {
            bean.setCompoundDocRunning(Integer.parseInt(txtHoonCompoundDocRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setCompoundDocRunning(0);
        }

        bean.setPaymentDocPrefix(txtPaymentDocPrefix.getText());
        try {
            bean.setPaymentDocRunning(Integer.parseInt(txtPaymentDocRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setPaymentDocRunning(0);
        }

        bean.setFeePrefix(txtFeePrefix.getText());
        try {
            bean.setFeeRunning(Integer.parseInt(txtFeeRunning.getText()));
        } catch (NumberFormatException e) {
            bean.setFeeRunning(0);
        }

        try {
            bean.setFeeAmt(Double.parseDouble(txtFeeAmt.getText()));
        } catch (NumberFormatException e) {
            bean.setFeeAmt(0);
        }

        try {
            //txtNoteNo
            bean.setNoteNo(Integer.parseInt(txtNoteNo.getText()));
        } catch (NumberFormatException e) {
            bean.setNoteNo(1);
        }

        bean.setBookSpec(cbBookSpec.getSelectedIndex());

        if (getConfigControl().saveConfig(bean)) {
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
        }
    }//GEN-LAST:event_btnPrintTransaction4ActionPerformed

    private void btnSaveTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveTypeActionPerformed
        if (!txtTypeCode.getText().equals("")) {
            saveData();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบถ้วน");
            txtTypeCode.requestFocus();
        }
    }//GEN-LAST:event_btnSaveTypeActionPerformed

    private void btnCancelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTypeActionPerformed
        clearConfigSaveForm();
    }//GEN-LAST:event_btnCancelTypeActionPerformed

    private void txtTypeCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtTypeCode.getText().equals("")) {
                loadData(txtTypeCode.getText());
                txtTypeName.requestFocus();
            } else {
                txtTypeCode.requestFocus();
            }
        }
    }//GEN-LAST:event_txtTypeCodeKeyPressed

    private void txtTypeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSaveRunning.requestFocus();
        }
    }//GEN-LAST:event_txtTypeNameKeyPressed

    private void txtTypeINTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeINTFocusGained
        txtTypeINT.selectAll();
    }//GEN-LAST:event_txtTypeINTFocusGained

    private void txtRDType2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRDType2FocusGained
        txtRDType2.selectAll();
    }//GEN-LAST:event_txtRDType2FocusGained

    private void txtPayINTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayINTFocusGained
        txtPayINT.selectAll();
    }//GEN-LAST:event_txtPayINTFocusGained

    private void tbConfigSaveTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConfigSaveTypeMouseClicked
        if (evt.getClickCount() == 2) {
            int rows = tbConfigSaveType.getSelectedRow();
            if (rows > -1) {
                loadData("" + tbConfigSaveType.getValueAt(rows, 0));
            }
        }
    }//GEN-LAST:event_tbConfigSaveTypeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!txtHCode.getText().equals("")) {
            save();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบถ้วน");
            txtHCode.requestFocus();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFixOverDepositFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFixOverDepositFocusGained
        txtFixOverDeposit.selectAll();
    }//GEN-LAST:event_txtFixOverDepositFocusGained

    private void txtTaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaxFocusGained
        txtTax.selectAll();
    }//GEN-LAST:event_txtTaxFocusGained

    private void txtHCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtHCode.getText().equals("")) {
                String hCode = txtHCode.getText();
                CbHoonConfigBean bean = getHoonConfigControl().listCbHoonConfig(hCode);
                if (bean != null) {
                    txtHCode.setEditable(false);
                    txtHCode.setText(bean.getHoonCode());
                    txtHName.setText(bean.getHoonName());
                    txtHoonRate.setText(dec.format(bean.getHoonRate()));
                    txtHoonDividen.setText(dec.format(bean.getHoonDeviden()));
                    txtHoonVolumnMax.setText("" + bean.getHoonVolumnMax());
                    txtHoonBuyMin.setText("" + bean.getHoonBuyMin());

                    txtHName.requestFocus();
                } else {
                    txtHName.requestFocus();
                }
            } else {
                txtHCode.requestFocus();
            }

        }
    }//GEN-LAST:event_txtHCodeKeyPressed

    private void txtHNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonRate.requestFocus();
        }
    }//GEN-LAST:event_txtHNameKeyPressed

    private void txtHoonRateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonRateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonVolumnMax.requestFocus();
        }
    }//GEN-LAST:event_txtHoonRateKeyPressed

    private void txtHoonVolumnMaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonVolumnMaxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonDividen.requestFocus();
        }
    }//GEN-LAST:event_txtHoonVolumnMaxKeyPressed

    private void txtHoonDividenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonDividenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonBuyMin.requestFocus();
        }
    }//GEN-LAST:event_txtHoonDividenKeyPressed

    private void txtHoonBuyMinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonBuyMinKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton3.requestFocus();
        }
    }//GEN-LAST:event_txtHoonBuyMinKeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (evt.getClickCount() == 2) {
            int row = jTable2.getSelectedRow();
            if (row != -1) {
                String hCode = jTable2.getValueAt(row, 0).toString();
                CbHoonConfigBean bean = getHoonConfigControl().listCbHoonConfig(hCode);
                txtHCode.setText(bean.getHoonCode());
                txtHName.setText(bean.getHoonName());
                txtHoonRate.setText(dec.format(bean.getHoonRate()));
                txtHoonDividen.setText(dec.format(bean.getHoonDeviden()));
                txtHoonVolumnMax.setText("" + bean.getHoonVolumnMax());
                txtHoonBuyMin.setText("" + bean.getHoonBuyMin());

                txtHCode.setEditable(false);
                txtHName.requestFocus();
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        resetHoon();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txtLoanCode.getText().equals("")) {
            saveLoanConfig();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลให้ครบถ้วน");
            txtLoanCode.requestFocus();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        resetConfigLoan();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbLoanConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoanConfigMouseClicked
        if (evt.getClickCount() == 2) {
            int row = tbLoanConfig.getSelectedRow();
            if (row != -1) {
                String LoanCode = tbLoanConfig.getValueAt(row, 0).toString();
                loadDataLoanConfig(LoanCode);
            }
        }
    }//GEN-LAST:event_tbLoanConfigMouseClicked

    private void txtLoanCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtLoanCode.getText().equals("")) {
                loadDataLoanConfig(txtLoanCode.getText());
                txtLoanName.requestFocus();
            }
        }
    }//GEN-LAST:event_txtLoanCodeKeyPressed

    private void txtLoanNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanFee.requestFocus();
        }
    }//GEN-LAST:event_txtLoanNameKeyPressed

    private void txtLoanINTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanINTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanFee.requestFocus();
        }
    }//GEN-LAST:event_txtLoanINTKeyPressed

    private void txtLoanFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanPenaltyDay.requestFocus();
        }
    }//GEN-LAST:event_txtLoanFeeKeyPressed

    private void txtLoanPenaltyINTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanPenaltyINTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMinPayPercent.requestFocus();
        }
    }//GEN-LAST:event_txtLoanPenaltyINTKeyPressed

    private void txtLoanPenaltyDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanPenaltyDayKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanMaxAmount.requestFocus();
        }
    }//GEN-LAST:event_txtLoanPenaltyDayKeyPressed

    private void txtLoanMaxAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanMaxAmountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanRunning.requestFocus();
        }
    }//GEN-LAST:event_txtLoanMaxAmountKeyPressed

    private void txtIntBadDebtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntBadDebtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntTurnover.requestFocus();
        }
    }//GEN-LAST:event_txtIntBadDebtKeyPressed

    private void txtIntTurnoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntTurnoverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntNormal.requestFocus();
        }
    }//GEN-LAST:event_txtIntTurnoverKeyPressed

    private void btnTestPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestPrintActionPerformed
        PrintCOM pc = new PrintCOM();
        pc.printTest("" + cbPrinterDirect.getSelectedItem());
    }//GEN-LAST:event_btnTestPrintActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!txtLoanCode.getText().equals("")) {
            deleteLoanData();
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการลบ");
            txtLoanCode.setText("");
            txtLoanCode.setEditable(true);
            txtLoanCode.requestFocus();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtLoanINTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanINTFocusGained
        txtLoanINT.selectAll();
    }//GEN-LAST:event_txtLoanINTFocusGained

    private void txtLoanFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanFeeFocusGained
        txtLoanFee.selectAll();
    }//GEN-LAST:event_txtLoanFeeFocusGained

    private void txtLoanPenaltyINTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanPenaltyINTFocusGained
        txtLoanPenaltyINT.selectAll();
    }//GEN-LAST:event_txtLoanPenaltyINTFocusGained

    private void txtLoanPenaltyDayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanPenaltyDayFocusGained
        txtLoanPenaltyDay.selectAll();
    }//GEN-LAST:event_txtLoanPenaltyDayFocusGained

    private void txtLoanMaxAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanMaxAmountFocusGained
        txtLoanMaxAmount.selectAll();
    }//GEN-LAST:event_txtLoanMaxAmountFocusGained

    private void txtIntBadDebtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusGained
        txtIntBadDebt.selectAll();
    }//GEN-LAST:event_txtIntBadDebtFocusGained

    private void txtIntTurnoverFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusGained
        txtIntTurnover.selectAll();
    }//GEN-LAST:event_txtIntTurnoverFocusGained

    private void txtIntNormalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusGained
        txtIntNormal.selectAll();
    }//GEN-LAST:event_txtIntNormalFocusGained

    private void txtLoanRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanRunningFocusGained
        txtLoanRunning.selectAll();
    }//GEN-LAST:event_txtLoanRunningFocusGained

    private void txtLoanRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanBookNo.requestFocus();
        }
    }//GEN-LAST:event_txtLoanRunningKeyPressed

    private void btnSaveType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveType1ActionPerformed
        if (!txtTypeCode.getText().equals("")) {
            try {
                String sql = "select TypeCode from cb_save_config "
                        + "where TypeCode='" + txtTypeCode.getText() + "'";
                ResultSet rs = MySQLConnect.getResultSet(sql);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "มีการนำข้อมูลเงินฝากประเภทนี้ไปใช้งานแล้ว ไม่สามารถลบรายการนี้ได้ !");
                } else {
                    if (getSaveConfigControl().deleteConfig(txtTypeCode.getText())) {
                        JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อยแล้ว");
                        loadDataSaveType();
                        clearConfigSaveForm();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                Log.write.error(e.getMessage());
            }
        } else {
            txtTypeCode.requestFocus();
        }
    }//GEN-LAST:event_btnSaveType1ActionPerformed

    private void txtSaveRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaveRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTypeINT.requestFocus();
        }
    }//GEN-LAST:event_txtSaveRunningKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!txtHCode.getText().equals("")) {
            if (getHoonConfigControl().deleteMaster(txtHCode.getText())) {
                loadHoonList();
                resetHoon();
                JOptionPane.showMessageDialog(this, "ลบข้อมูลหุ้นเรียบร้อย !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกข้อมูลที่ต้องการลบ");
            txtHCode.setEditable(true);
            txtHCode.requestFocus();
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtTypeINTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeINTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMinDeposit.requestFocus();
        }
    }//GEN-LAST:event_txtTypeINTKeyPressed

    private void txtMinDepositKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinDepositKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMinWitdraw.requestFocus();
        }
    }//GEN-LAST:event_txtMinDepositKeyPressed

    private void txtMinWitdrawKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinWitdrawKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNoRunning.requestFocus();
        }
    }//GEN-LAST:event_txtMinWitdrawKeyPressed

    private void txtFixOverDepositKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFixOverDepositKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTax.requestFocus();
        }
    }//GEN-LAST:event_txtFixOverDepositKeyPressed

    private void txtTaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFee.requestFocus();
        }
    }//GEN-LAST:event_txtTaxKeyPressed

    private void txtRDType2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRDType2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPayINT.requestFocus();
        }
    }//GEN-LAST:event_txtRDType2KeyPressed

    private void txtPayINTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayINTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFundINT.requestFocus();
        }
    }//GEN-LAST:event_txtPayINTKeyPressed

    private void txtFundINTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFundINTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveType.requestFocus();
        }
    }//GEN-LAST:event_txtFundINTKeyPressed

    private void txtFundINTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFundINTFocusGained
        txtFundINT.selectAll();
    }//GEN-LAST:event_txtFundINTFocusGained

    private void txtMinDepositFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinDepositFocusGained
        txtMinDeposit.selectAll();
    }//GEN-LAST:event_txtMinDepositFocusGained

    private void txtSaveRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaveRunningFocusGained
        txtSaveRunning.selectAll();
    }//GEN-LAST:event_txtSaveRunningFocusGained

    private void txtAccPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccRunning.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtAccPrefixKeyPressed

    private void txtAccRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNoteNo.requestFocus();
        }
    }//GEN-LAST:event_txtAccRunningKeyPressed

    private void txtNoteNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoteNoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSaveDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtNoteNoKeyPressed

    private void txtSaveDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaveDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSaveDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtSaveDocPrefixKeyPressed

    private void txtSaveDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaveDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtWitdrawDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtSaveDocRunningKeyPressed

    private void txtWitdrawDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWitdrawDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtWitdrawDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtWitdrawDocPrefixKeyPressed

    private void txtWitdrawDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWitdrawDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtWitdrawDocRunningKeyPressed

    private void txtIntDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtIntDocPrefixKeyPressed

    private void txtIntDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtIntDocRunningKeyPressed

    private void txtHoonDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtHoonDocPrefixKeyPressed

    private void txtHoonDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonSaleDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtHoonDocRunningKeyPressed

    private void txtHoonSaleDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonSaleDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonSaleDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtHoonSaleDocPrefixKeyPressed

    private void txtHoonSaleDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonSaleDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonTranferDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtHoonSaleDocRunningKeyPressed

    private void txtHoonTranferDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonTranferDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonTransferDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtHoonTranferDocPrefixKeyPressed

    private void txtHoonTransferDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonTransferDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonCompoundDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtHoonTransferDocRunningKeyPressed

    private void txtHoonCompoundDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonCompoundDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtHoonCompoundDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtHoonCompoundDocPrefixKeyPressed

    private void txtHoonCompoundDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonCompoundDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtHoonCompoundDocRunningKeyPressed

    private void txtLoanDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDocPrefixKeyPressed

    private void txtLoanDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPaymentDocPrefix.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDocRunningKeyPressed

    private void txtPaymentDocPrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentDocPrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPaymentDocRunning.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentDocPrefixKeyPressed

    private void txtPaymentDocRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentDocRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtProgramStartDate.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentDocRunningKeyPressed

    private void txtProgramStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProgramStartDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFeeAmt.requestFocus();
        }
    }//GEN-LAST:event_txtProgramStartDateKeyPressed

    private void txtFeeAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFeePrefix.requestFocus();
        }
    }//GEN-LAST:event_txtFeeAmtKeyPressed

    private void txtFeePrefixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeePrefixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFeeRunning.requestFocus();
        }
    }//GEN-LAST:event_txtFeePrefixKeyPressed

    private void txtFeeRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPrintTransaction4.requestFocus();
        }
    }//GEN-LAST:event_txtFeeRunningKeyPressed

    private void txtLoanBookNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanBookNoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanPerMonth.requestFocus();
        }
    }//GEN-LAST:event_txtLoanBookNoKeyPressed

    private void txtLoanBookNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanBookNoFocusGained
        txtLoanBookNo.selectAll();
    }//GEN-LAST:event_txtLoanBookNoFocusGained

    private void txtIntBadDebtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntBadDebtKeyReleased
        computeTotalNetINT();
    }//GEN-LAST:event_txtIntBadDebtKeyReleased

    private void txtIntNormalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNormalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanPenaltyINT.requestFocus();
        }
    }//GEN-LAST:event_txtIntNormalKeyPressed

    private void txtIntTurnoverKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntTurnoverKeyReleased
        computeTotalNetINT();
    }//GEN-LAST:event_txtIntTurnoverKeyReleased

    private void txtIntNormalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNormalKeyReleased
        computeTotalNetINT();
    }//GEN-LAST:event_txtIntNormalKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkMinPayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkMinPayItemStateChanged
        if (chkMinPay.isSelected()) {
            txtMinPayPercent.setEditable(true);
            txtMinPayBaht.setEditable(true);
        } else {
            txtMinPayPercent.setEditable(false);
            txtMinPayBaht.setEditable(false);
        }
    }//GEN-LAST:event_chkMinPayItemStateChanged

    private void txtFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeeFocusGained
        txtFee.selectAll();
    }//GEN-LAST:event_txtFeeFocusGained

    private void txtFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRDType2.requestFocus();
        }
    }//GEN-LAST:event_txtFeeKeyPressed

    private void txtMinWitdrawFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinWitdrawFocusGained
        txtMinWitdraw.selectAll();
    }//GEN-LAST:event_txtMinWitdrawFocusGained

    private void txtNoRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoRunningFocusGained
        txtNoRunning.selectAll();
    }//GEN-LAST:event_txtNoRunningFocusGained

    private void txtLoanMaxAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanMaxAmountFocusLost
        try {
            double a = Double.parseDouble(txtLoanMaxAmount.getText().replace(",", ""));
            txtLoanMaxAmount.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtLoanMaxAmount.setText("0.00");
        }
    }//GEN-LAST:event_txtLoanMaxAmountFocusLost

    private void txtLoanFeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanFeeFocusLost
        try {
            double a = Double.parseDouble(txtLoanFee.getText().replace(",", ""));
            txtLoanFee.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtLoanFee.setText("0.00");
        }
    }//GEN-LAST:event_txtLoanFeeFocusLost

    private void txtIntBadDebtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusLost
        try {
            double a = Double.parseDouble(txtIntBadDebt.getText().replace(",", ""));
            txtIntBadDebt.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtIntBadDebt.setText("0.00");
        }
    }//GEN-LAST:event_txtIntBadDebtFocusLost

    private void txtIntTurnoverFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusLost
        try {
            double a = Double.parseDouble(txtIntTurnover.getText().replace(",", ""));
            txtIntTurnover.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtIntTurnover.setText("0.00");
        }
    }//GEN-LAST:event_txtIntTurnoverFocusLost

    private void txtIntNormalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusLost
        try {
            double a = Double.parseDouble(txtIntNormal.getText().replace(",", ""));
            txtIntNormal.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtIntNormal.setText("0.00");
        }
    }//GEN-LAST:event_txtIntNormalFocusLost

    private void txtMinPayBahtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinPayBahtFocusLost
        try {
            double a = Double.parseDouble(txtMinPayBaht.getText().replace(",", ""));
            txtMinPayBaht.setText(NumberFormat.showDouble2(a));
        } catch (NumberFormatException e) {
            txtMinPayBaht.setText("0.00");
        }
    }//GEN-LAST:event_txtMinPayBahtFocusLost

    private void txtMinPayPercentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinPayPercentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMinPayBaht.requestFocus();
        }
    }//GEN-LAST:event_txtMinPayPercentKeyPressed

    private void txtMinPayBahtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinPayBahtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton4.requestFocus();
        }
    }//GEN-LAST:event_txtMinPayBahtKeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton4ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void txtMinPayPercentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinPayPercentFocusGained
        txtMinPayPercent.selectAll();
    }//GEN-LAST:event_txtMinPayPercentFocusGained

    private void txtMinPayBahtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMinPayBahtFocusGained
        txtMinPayBaht.selectAll();
    }//GEN-LAST:event_txtMinPayBahtFocusGained

    private void txtLoanPerMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanPerMonthKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntBadDebt.requestFocus();
        }
    }//GEN-LAST:event_txtLoanPerMonthKeyPressed

    private void txtLoanPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanPerMonthFocusGained
        txtLoanPerMonth.selectAll();
    }//GEN-LAST:event_txtLoanPerMonthFocusGained

    private void txtHCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHCodeFocusGained
        txtHCode.selectAll();
    }//GEN-LAST:event_txtHCodeFocusGained

    private void txtHoonRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonRateFocusGained
        txtHoonRate.selectAll();
    }//GEN-LAST:event_txtHoonRateFocusGained

    private void txtHoonVolumnMaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonVolumnMaxFocusGained
        txtHoonVolumnMax.selectAll();
    }//GEN-LAST:event_txtHoonVolumnMaxFocusGained

    private void txtHoonDividenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonDividenFocusGained
        txtHoonDividen.selectAll();
    }//GEN-LAST:event_txtHoonDividenFocusGained

    private void txtHoonBuyMinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonBuyMinFocusGained
        txtHoonBuyMin.selectAll();
    }//GEN-LAST:event_txtHoonBuyMinFocusGained

    private void txtTypeCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeCodeFocusGained
        txtTypeCode.selectAll();
    }//GEN-LAST:event_txtTypeCodeFocusGained

    private void txtNoRunningKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoRunningKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtFixOverDeposit.requestFocus();
        }
    }//GEN-LAST:event_txtNoRunningKeyPressed

    private void txtAccPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccPrefixFocusGained
        txtAccPrefix.selectAll();
    }//GEN-LAST:event_txtAccPrefixFocusGained

    private void txtAccRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccRunningFocusGained
        txtAccRunning.selectAll();
    }//GEN-LAST:event_txtAccRunningFocusGained

    private void txtNoteNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoteNoFocusGained
        txtNoteNo.selectAll();
    }//GEN-LAST:event_txtNoteNoFocusGained

    private void txtLoanDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanDocPrefixFocusGained
        txtLoanDocPrefix.selectAll();
    }//GEN-LAST:event_txtLoanDocPrefixFocusGained

    private void txtLoanDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanDocRunningFocusGained
        txtLoanDocRunning.selectAll();
    }//GEN-LAST:event_txtLoanDocRunningFocusGained

    private void txtPaymentDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentDocPrefixFocusGained
        txtPaymentDocPrefix.selectAll();
    }//GEN-LAST:event_txtPaymentDocPrefixFocusGained

    private void txtPaymentDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentDocRunningFocusGained
        txtPaymentDocRunning.selectAll();
    }//GEN-LAST:event_txtPaymentDocRunningFocusGained

    private void txtSaveDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaveDocPrefixFocusGained
        txtSaveDocPrefix.selectAll();
    }//GEN-LAST:event_txtSaveDocPrefixFocusGained

    private void txtSaveDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaveDocRunningFocusGained
        txtSaveDocRunning.selectAll();
    }//GEN-LAST:event_txtSaveDocRunningFocusGained

    private void txtWitdrawDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWitdrawDocPrefixFocusGained
        txtWitdrawDocPrefix.selectAll();
    }//GEN-LAST:event_txtWitdrawDocPrefixFocusGained

    private void txtWitdrawDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWitdrawDocRunningFocusGained
        txtWitdrawDocRunning.selectAll();
    }//GEN-LAST:event_txtWitdrawDocRunningFocusGained

    private void txtIntDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntDocPrefixFocusGained
        txtIntDocPrefix.selectAll();
    }//GEN-LAST:event_txtIntDocPrefixFocusGained

    private void txtIntDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntDocRunningFocusGained
        txtIntDocRunning.selectAll();
    }//GEN-LAST:event_txtIntDocRunningFocusGained

    private void txtHoonDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonDocPrefixFocusGained
        txtHoonDocPrefix.selectAll();
    }//GEN-LAST:event_txtHoonDocPrefixFocusGained

    private void txtHoonDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonDocRunningFocusGained
        txtHoonDocRunning.selectAll();
    }//GEN-LAST:event_txtHoonDocRunningFocusGained

    private void txtHoonSaleDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonSaleDocPrefixFocusGained
        txtHoonSaleDocPrefix.selectAll();
    }//GEN-LAST:event_txtHoonSaleDocPrefixFocusGained

    private void txtHoonSaleDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonSaleDocRunningFocusGained
        txtHoonSaleDocRunning.selectAll();
    }//GEN-LAST:event_txtHoonSaleDocRunningFocusGained

    private void txtHoonTranferDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonTranferDocPrefixFocusGained
        txtHoonTranferDocPrefix.selectAll();
    }//GEN-LAST:event_txtHoonTranferDocPrefixFocusGained

    private void txtHoonTransferDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonTransferDocRunningFocusGained
        txtHoonTransferDocRunning.selectAll();
    }//GEN-LAST:event_txtHoonTransferDocRunningFocusGained

    private void txtHoonCompoundDocPrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonCompoundDocPrefixFocusGained
        txtHoonCompoundDocPrefix.selectAll();
    }//GEN-LAST:event_txtHoonCompoundDocPrefixFocusGained

    private void txtHoonCompoundDocRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonCompoundDocRunningFocusGained
        txtHoonCompoundDocRunning.selectAll();
    }//GEN-LAST:event_txtHoonCompoundDocRunningFocusGained

    private void txtFeeAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeeAmtFocusGained
        txtFeeAmt.selectAll();
    }//GEN-LAST:event_txtFeeAmtFocusGained

    private void txtFeePrefixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeePrefixFocusGained
        txtFeePrefix.selectAll();
    }//GEN-LAST:event_txtFeePrefixFocusGained

    private void txtFeeRunningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFeeRunningFocusGained
        txtFeeRunning.selectAll();
    }//GEN-LAST:event_txtFeeRunningFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelType;
    private javax.swing.JButton btnPrintTransaction4;
    private javax.swing.JButton btnSaveType;
    private javax.swing.JButton btnSaveType1;
    private javax.swing.JButton btnTestPrint;
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
    private javax.swing.JComboBox cbBookSpec;
    private javax.swing.JComboBox cbPayType1;
    private javax.swing.JComboBox cbPayType2;
    private javax.swing.JComboBox cbPayType3;
    private javax.swing.JComboBox cbPayType4;
    private javax.swing.JComboBox cbPayType5;
    private javax.swing.JComboBox cbPayType6;
    private javax.swing.JComboBox cbPayType7;
    private javax.swing.JComboBox cbPrintSlipDriver;
    private javax.swing.JComboBox cbPrinterDirect;
    private javax.swing.JComboBox cbPrinterPassBookName;
    private javax.swing.JComboBox cbRDType2;
    private javax.swing.JRadioButton chkAuto1;
    private javax.swing.JRadioButton chkAuto2;
    private javax.swing.JRadioButton chkAuto3;
    private javax.swing.JRadioButton chkAuto4;
    private javax.swing.JCheckBox chkBranchPrefix;
    private javax.swing.JRadioButton chkINT_Effective_Rate;
    private javax.swing.JRadioButton chkINT_FlatRate;
    private javax.swing.JRadioButton chkManual1;
    private javax.swing.JRadioButton chkManual2;
    private javax.swing.JRadioButton chkManual3;
    private javax.swing.JRadioButton chkManual4;
    private javax.swing.JCheckBox chkMinPay;
    private javax.swing.JRadioButton chkPIntCapital;
    private javax.swing.JRadioButton chkPIntTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
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
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rdPayINT1;
    private javax.swing.JRadioButton rdPayINT2;
    private javax.swing.JRadioButton rdPayINT3;
    private javax.swing.JRadioButton rdPayINT4;
    private javax.swing.JRadioButton rdPayINT5;
    private javax.swing.JRadioButton rdType1;
    private javax.swing.JRadioButton rdType2;
    private javax.swing.JRadioButton rdType3;
    private javax.swing.JRadioButton rdTypeDay;
    private javax.swing.JRadioButton rdTypeMonth;
    private javax.swing.JRadioButton rdTypeYear;
    private javax.swing.JTable tbConfigSaveType;
    private javax.swing.JTable tbLoanConfig;
    private javax.swing.JTextField txtAccPrefix;
    private javax.swing.JTextField txtAccRunning;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtFeeAmt;
    private javax.swing.JTextField txtFeePrefix;
    private javax.swing.JTextField txtFeeRunning;
    private javax.swing.JTextField txtFixOverDeposit;
    private javax.swing.JTextField txtFundINT;
    private javax.swing.JTextField txtHCode;
    private javax.swing.JTextField txtHName;
    private javax.swing.JTextField txtHoonBuyMin;
    private javax.swing.JTextField txtHoonCompoundDocPrefix;
    private javax.swing.JTextField txtHoonCompoundDocRunning;
    private javax.swing.JTextField txtHoonDividen;
    private javax.swing.JTextField txtHoonDocPrefix;
    private javax.swing.JTextField txtHoonDocRunning;
    private javax.swing.JTextField txtHoonRate;
    private javax.swing.JTextField txtHoonSaleDocPrefix;
    private javax.swing.JTextField txtHoonSaleDocRunning;
    private javax.swing.JTextField txtHoonTranferDocPrefix;
    private javax.swing.JTextField txtHoonTransferDocRunning;
    private javax.swing.JTextField txtHoonVolumnMax;
    private javax.swing.JTextField txtIntBadDebt;
    private javax.swing.JTextField txtIntDocPrefix;
    private javax.swing.JTextField txtIntDocRunning;
    private javax.swing.JTextField txtIntNormal;
    private javax.swing.JTextField txtIntTurnover;
    private javax.swing.JTextField txtLoanBookNo;
    private javax.swing.JTextField txtLoanCode;
    private javax.swing.JTextField txtLoanDocPrefix;
    private javax.swing.JTextField txtLoanDocRunning;
    private javax.swing.JTextField txtLoanFee;
    private javax.swing.JTextField txtLoanINT;
    private javax.swing.JTextField txtLoanMaxAmount;
    private javax.swing.JTextField txtLoanName;
    private javax.swing.JTextField txtLoanPenaltyDay;
    private javax.swing.JTextField txtLoanPenaltyINT;
    private javax.swing.JTextField txtLoanPerMonth;
    private javax.swing.JTextField txtLoanRunning;
    private javax.swing.JTextField txtMinDeposit;
    private javax.swing.JTextField txtMinPayBaht;
    private javax.swing.JTextField txtMinPayPercent;
    private javax.swing.JTextField txtMinWitdraw;
    private javax.swing.JTextField txtNoRunning;
    private javax.swing.JTextField txtNoteNo;
    private javax.swing.JTextField txtPayINT;
    private javax.swing.JTextField txtPaymentDocPrefix;
    private javax.swing.JTextField txtPaymentDocRunning;
    private javax.swing.JTextField txtProgramStartDate;
    private javax.swing.JTextField txtRDType2;
    private javax.swing.JTextField txtSaveDocPrefix;
    private javax.swing.JTextField txtSaveDocRunning;
    private javax.swing.JTextField txtSaveRunning;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTypeCode;
    private javax.swing.JTextField txtTypeINT;
    private javax.swing.JTextField txtTypeName;
    private javax.swing.JTextField txtWitdrawDocPrefix;
    private javax.swing.JTextField txtWitdrawDocRunning;
    // End of variables declaration//GEN-END:variables

    private final JCheckBox[] chkAll = new JCheckBox[23];

    private void initChk() {
        tbConfigSaveType.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        jTable2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbLoanConfig.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbConfigSaveType.setRowHeight(30);
        jTable2.setRowHeight(30);
        tbLoanConfig.setRowHeight(30);

        JTableHeader uGroup1 = tbConfigSaveType.getTableHeader();
        uGroup1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        JTableHeader uGroup2 = jTable2.getTableHeader();
        uGroup2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        JTableHeader uGroup3 = tbLoanConfig.getTableHeader();
        uGroup3.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        loadPrinterDriver();
        loadPort();
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

    private void loadPrinterDriver() {
        try {
            cbPrinterPassBookName.removeAllItems();
            cbPrintSlipDriver.removeAllItems();

            PrintService[] printService = PrinterJob.lookupPrintServices();
            for (PrintService printService1 : printService) {
                cbPrinterPassBookName.addItem(printService1.getName());
                cbPrintSlipDriver.addItem(printService1.getName());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private void loadPort() {
        try {
            CommPortIdentifier portId;
            cbPrinterDirect.removeAllItems();
            Enumeration portList = CommPortIdentifier.getPortIdentifiers();
            while (portList.hasMoreElements()) {
                portId = (CommPortIdentifier) portList.nextElement();
                if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                    cbPrinterDirect.addItem(portId.getName());
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private void loadInitConfig() {
        ConfigBean bean = getConfigControl().getConfigBean();

        if (bean == null) {
            return;
        }

        chkBranchPrefix.setSelected("Y".equals(bean.getBranchPrefix()));

        if (bean.getAccountDocType().equals("M")) {
            chkManual1.setSelected(true);
        } else {
            chkAuto1.setSelected(true);
        }

        if (bean.getSaveDocType().equals("M")) {
            chkManual2.setSelected(true);
        } else {
            chkAuto2.setSelected(true);
        }

        if (bean.getHoonDocType().equals("M")) {
            chkManual3.setSelected(true);
        } else {
            chkAuto3.setSelected(true);
        }

        if (bean.getLoanDocType().equals("M")) {
            chkManual4.setSelected(true);
        } else {
            chkAuto4.setSelected(true);
        }

        txtAccPrefix.setText(bean.getAccountPrefix());
        txtSaveDocPrefix.setText(bean.getSaveDocPrefix());
        txtHoonDocPrefix.setText(bean.getHoonDocPrefix());
        txtLoanDocPrefix.setText(bean.getLoanDocPrefix());

        txtAccRunning.setText("" + bean.getAccountRunning());
        txtNoteNo.setText("" + bean.getNoteNo());
        txtSaveDocRunning.setText("" + bean.getSaveDocRunning());
        txtHoonDocRunning.setText("" + bean.getHoonDocRunning());
        txtLoanDocRunning.setText("" + bean.getLoanDocRunning());

        cbPrinterPassBookName.setSelectedItem("" + bean.getPrinterPassBook());
        cbPrintSlipDriver.setSelectedItem("" + bean.getPrintSlipDriverName());
        cbPrinterDirect.setSelectedItem("" + bean.getPrintSlipPort());

        if (bean.getPrintSlipType().equals("DV")) {
            rd1.setSelected(true);
        }

        SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        txtProgramStartDate.setText(simp.format(bean.getProgramStartDate()));

        txtWitdrawDocPrefix.setText(bean.getWithdrawDocPrefix());
        txtWitdrawDocRunning.setText("" + bean.getWithdrawDocRunning());
        txtIntDocPrefix.setText(bean.getIntDocPrefix());
        txtIntDocRunning.setText("" + bean.getIntDocRunning());
        txtHoonSaleDocPrefix.setText(bean.getHoonSaleDocPrefix());
        txtHoonSaleDocRunning.setText("" + bean.getHoonSaleDocRunning());
        txtHoonCompoundDocPrefix.setText(bean.getCompoundDocPrefix());
        txtHoonCompoundDocRunning.setText("" + bean.getCompoundDocRunning());
        txtFeePrefix.setText(bean.getFeePrefix());
        txtFeeRunning.setText("" + bean.getFeeRunning());
        txtFeeAmt.setText(NumberFormat.showDouble2(bean.getFeeAmt()));
        txtPaymentDocRunning.setText("" + bean.getPaymentDocRunning());
        txtHoonTranferDocPrefix.setText(bean.getHoonTransferDocPrefix());
        txtHoonTransferDocRunning.setText("" + bean.getHoonTransferDocRunning());

        cbBookSpec.setSelectedIndex(bean.getBookSpec());
    }

    private void loadDataSaveType() {
        DefaultTableModel model = (DefaultTableModel) tbConfigSaveType.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        ArrayList<CbSaveConfigBean> listBean = getSaveConfigControl().listSaveConfig();
        for (int i = 0; i < listBean.size(); i++) {
            CbSaveConfigBean bean = (CbSaveConfigBean) listBean.get(i);
            model.addRow(new Object[]{
                bean.getTypeCode(),
                bean.getTypeName(),
                NumberFormat.showDouble2(bean.getTypeINT())
            });
        }
    }

    private void loadData(String typeCode) {
        CbSaveConfigBean bean = getSaveConfigControl().loadConfig(typeCode);
        if (bean == null) {
            txtTypeCode.requestFocus();
        } else {
            txtTypeCode.setEditable(false);
            txtTypeCode.setText(bean.getTypeCode());
            txtTypeName.setText(bean.getTypeName());
            txtTypeINT.setText(NumberFormat.showDouble2(bean.getTypeINT()));
            switch (bean.getTypeCondition()) {
                case "1":
                    rdType1.setSelected(true);
                    break;
                case "2":
                    rdType2.setSelected(true);
                    break;
                default:
                    rdType3.setSelected(true);
                    break;
            }
            txtRDType2.setText(NumberFormat.showDouble2(bean.getRDType2()));
            cbRDType2.setSelectedIndex(bean.getCbRDType2());
            switch (bean.getRdTypeDialy()) {
                case "D":
                    rdTypeDay.setSelected(true);
                    break;
                case "M":
                    rdTypeMonth.setSelected(true);
                    break;
                default:
                    rdTypeYear.setSelected(true);
                    break;
            }
            switch (bean.getPayType()) {
                case "1":
                    rdPayINT1.setSelected(true);
                    break;
                case "2":
                    rdPayINT2.setSelected(true);
                    break;
                case "3":
                    rdPayINT3.setSelected(true);
                    break;
                case "4":
                    rdPayINT4.setSelected(true);
                    break;
                default:
                    rdPayINT5.setSelected(true);
                    break;
            }

            cbPayType1.setSelectedIndex(bean.getCbPayType1());
            cbPayType2.setSelectedIndex(bean.getCbPayType2());
            if (bean.getCbPayType3() > 0) {
                cbPayType3.setSelectedIndex(bean.getCbPayType3() - 1);
            } else {
                cbPayType3.setSelectedIndex(0);
            }
            if (bean.getCbPayType4() > 0) {
                cbPayType4.setSelectedIndex(bean.getCbPayType4() - 1);
            } else {
                cbPayType4.setSelectedIndex(0);
            }
            if (bean.getCbPayType5() > 0) {
                cbPayType5.setSelectedIndex(bean.getCbPayType5() - 1);
            } else {
                cbPayType5.setSelectedIndex(0);
            }
            if (bean.getCbPayType6() > 0) {
                cbPayType6.setSelectedIndex(bean.getCbPayType6() - 1);
            } else {
                cbPayType6.setSelectedIndex(0);
            }
            if (bean.getCbPayType7() > 0) {
                cbPayType7.setSelectedIndex(bean.getCbPayType7() - 1);
            } else {
                cbPayType7.setSelectedIndex(0);
            }

            txtPayINT.setText(NumberFormat.showDouble2(bean.getPayINT()));
            txtSaveRunning.setText("" + bean.getSaveRunning());
            txtNoRunning.setText("" + bean.getNoRunning());
            txtFee.setText(NumberFormat.showDouble2(bean.getSaveFee()));

            txtMinDeposit.setText(NumberFormat.showDouble2(bean.getMinDeposit()));
            txtMinWitdraw.setText(NumberFormat.showDouble2(bean.getMinWitdraw()));
        }

    }

    private void clearConfigSaveForm() {
        txtTypeCode.setEditable(true);
        txtTypeCode.setText("");
        txtTypeName.setText("");
        txtTypeINT.setText("0.00");
        txtRDType2.setText("0.00");
        txtPayINT.setText("0.00");
        txtNoRunning.setText("1");
        cbRDType2.setSelectedIndex(0);
        cbPayType1.setSelectedIndex(30);
        cbPayType2.setSelectedIndex(11);
        cbPayType3.setSelectedIndex(0);
        cbPayType4.setSelectedIndex(5);
        cbPayType5.setSelectedIndex(0);
        cbPayType6.setSelectedIndex(11);
        cbPayType7.setSelectedIndex(0);
        txtFee.setText("0.00");
        txtMinDeposit.setText("0.00");
        txtMinWitdraw.setText("0.00");

        rdType1.setSelected(true);
        rdTypeMonth.setSelected(true);

        rdPayINT3.setSelected(true);
        txtSaveRunning.setText("1");

        txtTypeCode.requestFocus();
    }

    private void save() {
        try {
            CbHoonConfigBean bean = new CbHoonConfigBean();
            bean.setHoonCode(txtHCode.getText());
            bean.setHoonName(ThaiUtil.Unicode2ASCII(txtHName.getText()));
            bean.setHoonRate(Double.parseDouble(txtHoonRate.getText().replace(",", "")));
            bean.setHoonVolumnMax(Integer.parseInt(txtHoonVolumnMax.getText().replace(",", "")));
            bean.setHoonDeviden(Double.parseDouble(txtHoonDividen.getText().replace(",", "")));
            bean.setHoonBuyMin(Integer.parseInt(txtHoonBuyMin.getText().replace(",", "")));

            if (getHoonConfigControl().saveCbHoonConfig(bean)) {
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
                resetHoon();
                loadHoonList();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private double computeTaxINT() {
        double typeINT;
        try {
            typeINT = Double.parseDouble(txtTypeINT.getText());
            double taxINT = Double.parseDouble(txtTax.getText());
            typeINT = typeINT - (typeINT * taxINT / 100.00);
            txtTypeINT.setText("" + typeINT);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return 0.00;
        }

        return typeINT;
    }

    private void loadHoonList() {
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        int size = model2.getRowCount();
        for (int i = 0; i < size; i++) {
            model2.removeRow(0);
        }

        ArrayList<CbHoonConfigBean> listHoonConfig = getHoonConfigControl().listCbHoonConfig();
        for (int i = 0; i < listHoonConfig.size(); i++) {
            CbHoonConfigBean hBean = (CbHoonConfigBean) listHoonConfig.get(i);
            model2.addRow(new Object[]{
                hBean.getHoonCode(),
                hBean.getHoonName(),
                NumberFormat.showDouble2(hBean.getHoonDeviden()),
                NumberFormat.showDouble2(hBean.getHoonRate())
            });
        }
    }

    private void saveLoanConfig() {
        CbLoanConfigBean lBean = new CbLoanConfigBean();
        lBean.setLoanCode(txtLoanCode.getText());
        lBean.setLoanName(ThaiUtil.Unicode2ASCII(txtLoanName.getText()));
        lBean.setLoanINT(Double.parseDouble(txtLoanINT.getText().replace(",", "")));
        lBean.setLoanFee(Double.parseDouble(txtLoanFee.getText().replace(",", "")));
        lBean.setLoanPenaltyINT(Double.parseDouble(txtLoanPenaltyINT.getText().replace(",", "")));
        lBean.setLoanPenaltyDay(Integer.parseInt(txtLoanPenaltyDay.getText().replace(",", "")));
        lBean.setLoanMinAmount(Double.parseDouble(txtLoanMaxAmount.getText().replace(",", "")));
        if (chkINT_FlatRate.isSelected()) {
            lBean.setIntFixed("F");
        } else if (chkINT_Effective_Rate.isSelected()) {
            lBean.setIntFixed("E");
        }
        lBean.setIntBadDebt(Double.parseDouble(txtIntBadDebt.getText().replace(",", "")));
        lBean.setIntTurnover(Double.parseDouble(txtIntTurnover.getText().replace(",", "")));
        lBean.setIntNormal(Double.parseDouble(txtIntNormal.getText().replace(",", "")));
        if (chkPIntCapital.isSelected()) {
            lBean.setChkPIntCapital("1");
        } else {
            lBean.setChkPIntCapital("2");
        }

        if (chkPIntTable.isSelected()) {
            lBean.setChkPIntTable("1");
        } else {
            lBean.setChkPIntTable("2");
        }

        lBean.setLoanPerMonth(Integer.parseInt("" + txtLoanPerMonth.getText()));
        lBean.setLoanRunning(Integer.parseInt("" + txtLoanRunning.getText()));
        lBean.setBookNo(Integer.parseInt("" + txtLoanBookNo.getText()));

        String checkMinPayment = "N";
        if (chkMinPay.isSelected()) {
            checkMinPayment = "Y";
        }
        lBean.setCheckMinPayment(checkMinPayment);
        lBean.setMinPaymentPercent(Double.parseDouble(txtMinPayPercent.getText().replace(",", "")));
        lBean.setMinPaymentBaht(Double.parseDouble(txtMinPayBaht.getText().replace(",", "")));

        if (getLoanConfigControl().saveLoanConfig(lBean)) {
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
            resetConfigLoan();
            //load list data
            loadConfigLoadList();
        }
    }

    private void loadDataLoanConfig(String LoanCode) {
        CbLoanConfigBean bean = getLoanConfigControl().listLoanConfig(LoanCode);
        if (bean != null) {
            txtLoanCode.setText(bean.getLoanCode());
            txtLoanName.setText(bean.getLoanName());
            txtLoanINT.setText(NumberFormat.showDouble2(bean.getLoanINT()));
            txtLoanFee.setText(NumberFormat.showDouble2(bean.getLoanFee()));
            txtLoanPenaltyINT.setText(NumberFormat.showDouble2(bean.getLoanPenaltyINT()));
            txtLoanPenaltyDay.setText("" + bean.getLoanPenaltyDay());
            txtLoanMaxAmount.setText(NumberFormat.showDouble2(bean.getLoanMinAmount()));
            txtLoanRunning.setText("" + bean.getLoanRunning());
            txtLoanBookNo.setText("" + bean.getBookNo());

            chkINT_FlatRate.setSelected(bean.getIntFixed().equals(AppConstants.INT_FLAT_RATE));
            chkINT_Effective_Rate.setSelected(bean.getIntFixed().equals(AppConstants.INT_EFFITIVE_RATE));

            txtIntBadDebt.setText(NumberFormat.showDouble2(bean.getIntBadDebt()));
            txtIntTurnover.setText(NumberFormat.showDouble2(bean.getIntTurnover()));
            txtIntNormal.setText(NumberFormat.showDouble2(bean.getIntNormal()));
            chkPIntCapital.setSelected(bean.getChkPIntCapital().equals("1"));

            chkPIntTable.setSelected(bean.getChkPIntTable().equals("1"));

            txtLoanPerMonth.setText("" + bean.getLoanPerMonth());

            txtLoanCode.setEditable(false);
            txtLoanName.requestFocus();
        } else {
            txtLoanName.requestFocus();
        }
    }

    private void resetConfigLoan() {
        txtLoanCode.setEditable(true);
        txtLoanCode.setText("");
        txtLoanName.setText("");
        txtLoanINT.setText("0.00");
        txtLoanFee.setText("0.00");
        txtLoanPenaltyINT.setText("0.00");
        txtLoanPenaltyDay.setText(AppConstants.CB_STATUS_PAYMENT);
        txtLoanMaxAmount.setText("0.00");
        txtLoanRunning.setText("1");
        txtLoanBookNo.setText("1");

        chkINT_FlatRate.setSelected(true);
        txtIntBadDebt.setText("0.00");
        txtIntTurnover.setText("0.00");
        txtIntNormal.setText("0.00");
        chkPIntCapital.setSelected(true);
        chkPIntTable.setSelected(true);

        txtLoanPerMonth.setText("0");

        txtLoanCode.requestFocus();
    }

    private void loadConfigLoadList() {
        DefaultTableModel model1 = (DefaultTableModel) tbLoanConfig.getModel();
        int sizeLoan = model1.getRowCount();
        for (int i = 0; i < sizeLoan; i++) {
            model1.removeRow(0);
        }

        ArrayList<CbLoanConfigBean> listLoan = getLoanConfigControl().listLoanConfig();
        for (int i = 0; i < listLoan.size(); i++) {
            CbLoanConfigBean ll = (CbLoanConfigBean) listLoan.get(i);
            String loanType = ll.getIntFixed();
            switch (loanType) {
                case AppConstants.INT_FLAT_RATE:
                    loanType = "ดอกเบี้ยคงที่";
                    break;
                case AppConstants.INT_EFFITIVE_RATE:
                    loanType = "ลดต้นลดดอก";
                    break;
            }
            double per = ll.getMinPaymentPercent();
            if (per == 0) {
                per = ll.getMinPaymentBaht();
            }

            model1.addRow(new Object[]{
                ll.getLoanCode(),
                ll.getLoanName(),
                NumberFormat.showDouble2(ll.getLoanINT()),
                NumberFormat.showDouble2(ll.getIntBadDebt()),
                NumberFormat.showDouble2(ll.getIntTurnover()),
                NumberFormat.showDouble2(ll.getIntNormal()),
                loanType,
                NumberFormat.showDouble2(ll.getLoanPenaltyINT()),
                NumberFormat.showDouble2(per)
            });
        }
    }

    private void saveData() {
        CbSaveConfigBean bean = new CbSaveConfigBean();
        bean.setTypeCode(txtTypeCode.getText());
        bean.setTypeName(ThaiUtil.Unicode2ASCII(txtTypeName.getText()));
        bean.setTypeINT(computeTaxINT());
        if (rdType1.isSelected()) {
            bean.setTypeCondition("1");
        } else if (rdType2.isSelected()) {
            bean.setTypeCondition("2");
        } else {
            bean.setTypeCondition("3");
        }

        bean.setRDType2(Double.parseDouble(txtRDType2.getText()));

        bean.setCbRDType2(cbRDType2.getSelectedIndex());
        if (rdTypeDay.isSelected()) {
            bean.setRdTypeDialy("D");
        } else if (rdTypeMonth.isSelected()) {
            bean.setRdTypeDialy("M");
        } else if (rdTypeYear.isSelected()) {
            bean.setRdTypeDialy("Y");
        }

        if (rdPayINT1.isSelected()) {
            bean.setPayType("1");
        } else if (rdPayINT2.isSelected()) {
            bean.setPayType("2");
        } else if (rdPayINT3.isSelected()) {
            bean.setPayType("3");
        } else if (rdPayINT4.isSelected()) {
            bean.setPayType("4");
        } else {
            bean.setPayType("5");
        }

        try {
            bean.setTAX(Double.parseDouble(txtTax.getText()));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

        bean.setCbPayType1(cbPayType1.getSelectedIndex());
        bean.setCbPayType2(cbPayType2.getSelectedIndex());
        bean.setCbPayType3(cbPayType3.getSelectedIndex());
        bean.setCbPayType4(cbPayType4.getSelectedIndex());
        bean.setCbPayType5(cbPayType5.getSelectedIndex());
        bean.setCbPayType6(cbPayType6.getSelectedIndex());
        bean.setCbPayType7(cbPayType7.getSelectedIndex());
        bean.setPayINT(Double.parseDouble(txtPayINT.getText()));
        bean.setMaxDeposit(Double.parseDouble(txtFixOverDeposit.getText().replace(",", "")));
        bean.setSaveRunning(Integer.parseInt(txtSaveRunning.getText()));
        bean.setNoRunning(Integer.parseInt(txtNoRunning.getText()));

        bean.setSaveFee(Double.parseDouble(txtFee.getText()));

        bean.setMinDeposit(Double.parseDouble(txtMinDeposit.getText().replace(",", "")));
        bean.setMinWitdraw(Double.parseDouble(txtMinWitdraw.getText().replace(",", "")));

        if (getSaveConfigControl().saveCbSaveConfig(bean)) {
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
            clearConfigSaveForm();
            loadDataSaveType();
        }
    }

    private void resetHoon() {
        txtHCode.setEditable(true);
        txtHCode.setText("");
        txtHName.setText("");
        txtHoonRate.setText("0.00");
        txtHoonDividen.setText("0.00");
        txtHoonVolumnMax.setText("0");
        txtHoonBuyMin.setText("0");

        txtHCode.requestFocus();
    }

    private void deleteLoanData() {
        try {
            if (getLoanConfigControl().deleteLoanMaster(txtLoanCode.getText())) {
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                loadConfigLoadList();
                resetConfigLoan();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่สามารถลบข้อมูลได้");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            Log.write.error(e.getMessage());
        }
    }

    private void computeTotalNetINT() {
        try {
            double a = Double.parseDouble(txtIntBadDebt.getText().replace(",", ""));
            double b = Double.parseDouble(txtIntTurnover.getText().replace(",", ""));
            double c = Double.parseDouble(txtIntNormal.getText().replace(",", ""));
            double total = (a + b + c);
            txtLoanINT.setText(dec.format(total));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }

    }
}
