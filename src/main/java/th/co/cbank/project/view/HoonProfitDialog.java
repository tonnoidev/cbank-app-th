package th.co.cbank.project.view;

import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.model.CbHoonSummaryBean;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

public class HoonProfitDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(HoonProfitDialog.class);
    private DecimalFormat dec = new DecimalFormat("#,##0.00");

    public HoonProfitDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        loadSummary();

        tbTransaction.setRowHeight(30);
        tbTransaction.setShowGrid(true);

        cbYear.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTotalBalance = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        txtTotalHoonBalance = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานการปันหุ้นประจำปี");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("บันทึกข้อมูล");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("พิมพ์เอกสาร");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายงานการปันหุ้นประจำปี", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("หักค่าสำรองกองทุน");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("กำไรสุทธิจากการดำเนินงาน");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("บาท");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("บาท");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0.00");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0.00");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("0");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jLabel1.setText("%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("หักค่าสาธารณะประโยชน์");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel13.setText("%");

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 204));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText("0.00");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("บาท");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ยอดเงินคงเหลือ");

        txtTotalBalance.setEditable(false);
        txtTotalBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalBalance.setText("0.00");
        txtTotalBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("เงินปันผล");

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 204));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("0");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("จำนวนปันผล/หุ้น");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0.00");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel15.setText("%");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0.00");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("บาท");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("บาท (คิดเป็นเปอร์เซ็นต์)");

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 204));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setText("%");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("ปีดำเนินการ");

        cbYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2555", "2556", "2557", "2558", "2559", "2560" }));
        cbYear.setSelectedIndex(2);
        cbYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbYearItemStateChanged(evt);
            }
        });
        cbYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbYearKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ออก (Exit)");
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

        txtTotalHoonBalance.setEditable(false);
        txtTotalHoonBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalHoonBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalHoonBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalHoonBalance.setText("0");
        txtTotalHoonBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotalHoonBalance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalHoonBalanceFocusGained(evt);
            }
        });
        txtTotalHoonBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalHoonBalanceKeyPressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("จำนวนหุ้นที่ทั้งหมดในระบบ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("หุ้น");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalHoonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHoonBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("เพิ่มข้อมูล", jPanel2);

        tbTransaction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ปีดำเนินการ", "กำไรสุทธิ", "หักค่ากองทุน", "หักค่าสาธารณูปโภค", "ยอดเงินคงเหลือ", "เงินปันผล(%)", "เงินปันผล(บาท)", "จำนวนปันผล/หุ้น(%)", "จำนวนปันผล/หุ้น(บาท)"
            }
        ));
        tbTransaction.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbTransaction);
        if (tbTransaction.getColumnModel().getColumnCount() > 0) {
            tbTransaction.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(1).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(2).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(3).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(4).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(5).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(6).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(7).setPreferredWidth(125);
            tbTransaction.getColumnModel().getColumn(8).setPreferredWidth(125);
        }

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("พิมพ์เอกสาร");
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("รายละเอียด", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printDoc();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            compute();
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            compute();
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.selectAll();
        jTextField1.requestFocus();
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        jTextField6.selectAll();
        jTextField6.requestFocus();
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            compute();
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        jTextField7.selectAll();
        jTextField7.requestFocus();
    }//GEN-LAST:event_jTextField7FocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        save();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbYearItemStateChanged
        loadDefault();
    }//GEN-LAST:event_cbYearItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbYearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbYearKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_cbYearKeyPressed

    private void txtTotalHoonBalanceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalHoonBalanceFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoonBalanceFocusGained

    private void txtTotalHoonBalanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalHoonBalanceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoonBalanceKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTextField txtTotalBalance;
    private javax.swing.JTextField txtTotalHoonBalance;
    // End of variables declaration//GEN-END:variables

    private void printDoc() {

    }

    private void compute() {
        double d1 = 0;
        double d2 = 0;
        double d3 = 0;
        double d4 = 0;
        double d7 = 0;
        double d8 = 0;

        try {
            String s = jTextField1.getText();
            s = s.replace(",", "");
            try {
                jTextField1.setText(dec.format(Double.parseDouble(s)));
            } catch (NumberFormatException e) {
            }
            d1 = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            String s = jTextField6.getText();
            s = s.replace(",", "");
            d2 = Double.parseDouble(s);
            if (d2 == 0) {
                jTextField2.setText(dec.format(0));
            } else {
                double t = (d2 / 100) * d1;
                jTextField2.setText(dec.format(t));
            }

            String ss = jTextField2.getText();
            ss = ss.replace(",", "");
            d7 = Double.parseDouble(ss);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            String s = jTextField7.getText();
            s = s.replace(",", "");
            d3 = Double.parseDouble(s);
            if (d3 == 0) {
                jTextField8.setText(dec.format(0));
            } else {
                double t = (d3 / 100) * d1;
                jTextField8.setText(dec.format(t));
            }

            String ss = jTextField8.getText();
            ss = ss.replace(",", "");
            d8 = Double.parseDouble(ss);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        // start total purchase
//        try {
//            String sql = "select sum(Member_TotalScore) Member_TotalScore "
//                    + "from " + MySQLConnect.DATABASE_MEMBER + ".memmaster;";
//            ResultSet rs = MySQLConnect.getResultSet(sql);
//            if (rs.next()) {
//                txtMember_TotalScore.setText(dec.format(rs.getDouble("Member_TotalScore")));
//            }
//
//            rs.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
        // end total purchase
        double total = d1 - d7 - d8;
        txtTotalBalance.setText(dec.format(total));

        total += d4;

        double totalHoon = 0;
        try {
            String sql = "select sum(hoonvolumn) total from cb_hoon_balance;";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                totalHoon = rs.getDouble("total");
            }

            rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        String sAA = txtTotalBalance.getText();
        sAA = sAA.replace(",", "");
        double aa = Double.parseDouble(sAA);
        double bb = Double.parseDouble("0");
        jTextField4.setText(dec.format(aa - bb));

        String strX1 = txtTotalBalance.getText();
        strX1 = strX1.replace(",", "");
        String strX2 = "0";
        strX2 = strX2.replace(",", "");
        double x1 = Double.parseDouble(strX1);
        double x2 = Double.parseDouble(strX2);
        double total3 = ((x1 - x2) * 100) / d1;
        DecimalFormat ddInt = new DecimalFormat("#0.00");
        jTextField9.setText(ddInt.format(total3));

        if (totalHoon == 0) {
            totalHoon = 1;
        }
        double total4 = (x1 - x2) / totalHoon;
        jTextField5.setText(dec.format(total4));

        double total5 = (total4 / d1) * 100;
        jTextField10.setText(ddInt.format(total5));
    }

    private void save() {
        // create temp
        try {
            MySQLConnect.exeUpdate("alter table cb_hoon_balance add column Year_At varchar(4);");
            String sql1 = "create table if not exists cb_hoon_summary_history select * from cb_hoon_balance limit 0,0;";
            String sql2 = "alter table cb_hoon_summary_history add column Year_At varchar(4);";
            MySQLConnect.exeUpdate(sql1);
            MySQLConnect.exeUpdate(sql2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        CbHoonSummaryBean bean = new CbHoonSummaryBean();
        bean.setYear_at(cbYear.getSelectedItem().toString());
        bean.setUser_action(Value.USER_CODE);
        bean.setProfit_total(Double.parseDouble(jTextField1.getText().replace(",", "")));
        bean.setReduce_value_second(Integer.parseInt(jTextField6.getText().replace(",", "")));
        bean.setReduce_benefit(Integer.parseInt(jTextField7.getText().replace(",", "")));
        bean.setReduce_v_baht(Double.parseDouble(jTextField2.getText().replace(",", "")));
        bean.setReduce_b_baht(Double.parseDouble(jTextField8.getText().replace(",", "")));
        bean.setBalance_total(Double.parseDouble(txtTotalBalance.getText().replace(",", "")));
        bean.setDividend_buy(0);
        bean.setDividend_money(Double.parseDouble(jTextField9.getText().replace(",", "")));
        bean.setDividend_by(Double.parseDouble(jTextField10.getText().replace(",", "")));
        bean.setDividend_baht(Double.parseDouble(jTextField4.getText().replace(",", "")));
        bean.setDividend_value_baht(Double.parseDouble(jTextField5.getText().replace(",", "")));

        try {
            String sql = "insert into cb_hoon_summary"
                    + "(year_at,action_time,user_action,profit_total,"
                    + "reduce_value_second,reduce_benefit,reduce_v_baht,"
                    + "reduce_b_baht,balance_total,dividend_buy,dividend_money,"
                    + "dividend_by,dividend_baht,dividend_value_baht) "
                    + "values('" + bean.getYear_at() + "',now(),"
                    + "'" + bean.getUser_action() + "','" + bean.getProfit_total() + "',"
                    + "'" + bean.getReduce_value_second() + "','" + bean.getReduce_benefit() + "',"
                    + "'" + bean.getReduce_v_baht() + "','" + bean.getReduce_b_baht() + "',"
                    + "'" + bean.getBalance_total() + "','" + bean.getDividend_buy() + "',"
                    + "'" + bean.getDividend_money() + "','" + bean.getDividend_by() + "',"
                    + "'" + bean.getDividend_baht() + "','" + bean.getDividend_value_baht() + "')";
            String sqlUpd = "update cb_hoon_summary set "
                    + "action_time=now(), "
                    + "user_action='" + bean.getUser_action() + "', "
                    + "profit_total='" + bean.getProfit_total() + "', "
                    + "reduce_value_second='" + bean.getReduce_value_second() + "', "
                    + "reduce_benefit='" + bean.getReduce_benefit() + "', "
                    + "reduce_v_baht='" + bean.getReduce_v_baht() + "', "
                    + "reduce_b_baht='" + bean.getReduce_b_baht() + "', "
                    + "balance_total='" + bean.getBalance_total() + "', "
                    + "dividend_buy='" + bean.getDividend_buy() + "', "
                    + "dividend_money='" + bean.getDividend_money() + "', "
                    + "dividend_by='" + bean.getDividend_by() + "', "
                    + "dividend_baht='" + bean.getDividend_baht() + "', "
                    + "dividend_value_baht='" + bean.getDividend_value_baht() + "' "
                    + "where year_at='" + bean.getYear_at() + "'";
            String chk = "select * from cb_hoon_summary "
                    + "where year_at='" + bean.getYear_at() + "'";
            ResultSet rs = MySQLConnect.getResultSet(chk);
            if (rs.next()) {
                MySQLConnect.exeUpdate(sqlUpd);
            } else {
                MySQLConnect.exeUpdate(sql);
            }

            try {
                String sqlHoon = "select HoonCode, HoonVolumn from cb_hoon_balance order by HoonCode";
                ResultSet rsHoon = MySQLConnect.getResultSet(sqlHoon);
                while (rsHoon.next()) {
                    String HoonCode = rsHoon.getString("HoonCode");
                    double HoonVolumn = rsHoon.getDouble("HoonVolumn");
                    double dividend = HoonVolumn * bean.getDividend_value_baht();

                    String sqlM = "select Member_TotalScore "
                            + "from " + MySQLConnect.DATABASE_MEMBER + ".memmaster "
                            + "where Member_Code='" + HoonCode + "';";
                    double mTotalPoint = 0.00;
                    try {
                        ResultSet sqlMPoint = MySQLConnect.getResultSet(sqlM);
                        while (sqlMPoint.next()) {
                            mTotalPoint = sqlMPoint.getDouble("Member_TotalScore");
                        }

                        sqlMPoint.close();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    double totalARAmount = 0.00;
                    try {
                        //check balance credit amount
                        String sqlAR = "select sum(S_CreditAmt+S_Interest) S_CreditAmt "
                                + "from custarrear "
                                + "where S_SPCode='" + HoonCode + "' "
                                + "and S_MarkFlag='N';";
                        ResultSet rsAR = MySQLConnect.getResultSet(sqlAR);
                        if (rsAR.next()) {
                            totalARAmount = rsAR.getDouble("S_CreditAmt");
                        }

                        rsAR.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }

                    String sqlD = "update cb_hoon_balance set "
                            + "devidend='" + dividend + "',"
                            + "Point='" + mTotalPoint + "',"
                            + "ARAmount='" + totalARAmount + "',"
                            + "year_at='" + bean.getYear_at() + "' "
                            + "where HoonCode='" + HoonCode + "'";
                    MySQLConnect.exeUpdate(sqlD);

                    // update history
                    try {
                        String sqlIns = "insert into cb_hoon_summary_history "
                                + "select * from cb_hoon_balance "
                                + "where HoonCode='" + HoonCode + "' ";

                        // delete tmp
                        MySQLConnect.exeUpdate("delete from cb_hoon_summary_history "
                                + "where HoonCode='" + HoonCode + "' "
                                + "and year_at='" + bean.getYear_at() + "'");
                        // insert tmp
                        MySQLConnect.exeUpdate(sqlIns);

                        // update year_at
                        MySQLConnect.exeUpdate("update cb_hoon_summary_history "
                                + "set year_at='" + bean.getYear_at() + "' "
                                + "where HoonCode='" + HoonCode + "' "
                                + "and year_at is null");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }

                rsHoon.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

            String listBalance = "select * from cb_hoon_balance";
            ResultSet rsList = MySQLConnect.getResultSet(listBalance);
            while (rsList.next()) {
                String HoonCode = rsList.getString("HoonCode");
                try {
                    //check balance credit amount
                    String sqlX = "select sum(S_CreditAmt+S_Interest) S_CreditAmt "
                            + "from custarrear "
                            + "where S_SPCode='" + HoonCode + "' "
                            + "and S_MarkFlag='N';";
                    double totalBalanceAmount = 0.00;
                    ResultSet rsX = MySQLConnect.getResultSet(sqlX);
                    if (rsX.next()) {
                        totalBalanceAmount = rsX.getDouble("S_CreditAmt");
                    }

                    String sqlDX = "update cb_hoon_balance "
                            + "set ARAmount='" + totalBalanceAmount + "' "
                            + "where hoonCode='" + HoonCode + "'";
                    MySQLConnect.exeUpdate(sqlDX);

                    rsX.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }

            rsList.close();

            rs.close();

            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อย");
            jTabbedPane1.setSelectedIndex(1);
            loadSummary();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void loadDefault() {
        // load default        
        CbHoonSummaryBean bean = getSummaryControl().getData(cbYear.getSelectedItem().toString());
        if (bean != null) {
            jTextField1.setText(dec.format(bean.getProfit_total()));
            jTextField6.setText("" + bean.getReduce_value_second());
            jTextField2.setText(dec.format(bean.getReduce_v_baht()));
            jTextField7.setText("" + bean.getReduce_benefit());
            jTextField8.setText(dec.format(bean.getReduce_b_baht()));
            txtTotalBalance.setText(dec.format(bean.getBalance_total()));
            jTextField9.setText("" + bean.getDividend_money());
            jTextField4.setText(dec.format(bean.getDividend_baht()));
            jTextField10.setText("" + bean.getDividend_by());
            jTextField5.setText(dec.format(bean.getDividend_value_baht()));

            btnSave.setEnabled(false);
            jTextField1.setEditable(false);
            jTextField6.setEditable(false);
            jTextField7.setEditable(false);
        } else {
            btnSave.setEnabled(true);
            jTextField1.setEditable(true);
            jTextField6.setEditable(true);
            jTextField7.setEditable(true);

            jTextField1.setText("0.00");
            jTextField1.selectAll();
            jTextField1.requestFocus();

            jTextField6.setText("0");
            jTextField7.setText("0");
            jTextField2.setText("0.00");
            jTextField8.setText("0.00");
            txtTotalBalance.setText("0.00");
            jTextField9.setText("0");
            jTextField4.setText("0.00");
            jTextField10.setText("0");
            jTextField5.setText("0.00");
        }

        try {
            String sql = "select sum(hoonvolumn) total from cb_hoon_balance";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                txtTotalHoonBalance.setText(dec.format(rs.getDouble("total")));
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void loadSummary() {
        loadDefault();

        DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
        tbTransaction.setRowHeight(30);

        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        ArrayList<CbHoonSummaryBean> listBean = getSummaryControl().getAllData();
        for (int i = 0; i < listBean.size(); i++) {
            CbHoonSummaryBean bean = (CbHoonSummaryBean) listBean.get(i);
            model.addRow(new Object[]{
                bean.getYear_at(),
                dec.format(bean.getProfit_total()),
                dec.format(bean.getReduce_v_baht()),
                dec.format(bean.getReduce_b_baht()),
                dec.format(bean.getBalance_total()),
                bean.getDividend_money(),
                dec.format(bean.getDividend_baht()),
                bean.getDividend_by(),
                dec.format(bean.getDividend_value_baht())
            });
        }
    }

}
