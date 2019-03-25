package th.co.cbank.project.view;

import com.sun.glass.events.KeyEvent;
import java.awt.Font;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.util.DateUtil;
import th.co.cbank.util.NumberUtil;

public class HoonInvestDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(HoonInvestDialog.class);
    private DefaultTableModel model;
    private double balanceAmt = 0;

    public HoonInvestDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        initTable();
        lbBranchName.setText(getBranchControl().getData().getName());
        lbDateProcess.setText(DateUtil.getCurrentDateStr());

        txtTotalHoonAmt.setText(NumberFormat.showDouble2(getProfileControl().getTotalHoonQty()));

        setLocation(0, 0);
        setSize(parent.getMaximumSize());
        txtProfitOpAmt.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDividendMemberList = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbBranchName = new javax.swing.JLabel();
        lbDateProcess = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTotalBenefitAmt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNetDividendAmt = new javax.swing.JTextField();
        txtDividendPerYearAmt = new javax.swing.JTextField();
        txtDividendPerMonthAmt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalHoonAmt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotalReserveFundAmt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtProfitOpAmt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtReserveFundAmt = new javax.swing.JTextField();
        txtPublicBenefitAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnSaveData = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTotalDividendPerMemberAmt = new javax.swing.JTextField();
        txtTtBLAftDvdAmt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("การปันผลหุ้น");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("ตารางแสดงรายการเงินปันผลสมาชิก");

        tbDividendMemberList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ชื่อ", "นามสกุล", "หุ้นหลัก", "เงินปันผล", "หุ้นระหว่างปี", "เดือนที่ซื้อ", "จำนวนเดือนที่ถือ", "เงินปันผล", "เงินปันผลสุทธิ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDividendMemberList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbDividendMemberList);
        if (tbDividendMemberList.getColumnModel().getColumnCount() > 0) {
            tbDividendMemberList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbDividendMemberList.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbDividendMemberList.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbDividendMemberList.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbDividendMemberList.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbDividendMemberList.getColumnModel().getColumn(5).setPreferredWidth(80);
            tbDividendMemberList.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbDividendMemberList.getColumnModel().getColumn(7).setPreferredWidth(150);
            tbDividendMemberList.getColumnModel().getColumn(8).setPreferredWidth(80);
            tbDividendMemberList.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("คำนวณเงินปันผล");

        lbBranchName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbBranchName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBranchName.setText("สถาบัน...");

        lbDateProcess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDateProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDateProcess.setText("วันที่ 31 มีนาคม 2561");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbBranchName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbDateProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lbBranchName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDateProcess)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtTotalBenefitAmt.setEditable(false);
        txtTotalBenefitAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalBenefitAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalBenefitAmt.setText("0.00");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("สถานะประโยชน์");

        txtNetDividendAmt.setEditable(false);
        txtNetDividendAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNetDividendAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNetDividendAmt.setText("0.00");

        txtDividendPerYearAmt.setEditable(false);
        txtDividendPerYearAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDividendPerYearAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDividendPerYearAmt.setText("0.00");

        txtDividendPerMonthAmt.setEditable(false);
        txtDividendPerMonthAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDividendPerMonthAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDividendPerMonthAmt.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("บาท");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("เงินปันผลสุทธิ");

        jLabel12.setText("%");

        txtTotalHoonAmt.setEditable(false);
        txtTotalHoonAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalHoonAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalHoonAmt.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("เงินสำรองกองทุน");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("บาท");

        txtTotalReserveFundAmt.setEditable(false);
        txtTotalReserveFundAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTotalReserveFundAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalReserveFundAmt.setText("0.00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("หัก");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("หุ้นทั้งหมด");

        txtProfitOpAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProfitOpAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtProfitOpAmt.setText("0.00");
        txtProfitOpAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProfitOpAmtFocusGained(evt);
            }
        });
        txtProfitOpAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProfitOpAmtKeyPressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("ปันผลต่อหุ้น/เดือน");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("บาท");

        txtReserveFundAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtReserveFundAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtReserveFundAmt.setText("0");
        txtReserveFundAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtReserveFundAmtFocusGained(evt);
            }
        });
        txtReserveFundAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReserveFundAmtKeyPressed(evt);
            }
        });

        txtPublicBenefitAmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPublicBenefitAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPublicBenefitAmt.setText("0");
        txtPublicBenefitAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPublicBenefitAmtFocusGained(evt);
            }
        });
        txtPublicBenefitAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPublicBenefitAmtKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("หัก");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("ปันผลต่อหุ้น/ปี");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("บาท");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("กำไรจากการดำเนินกิจการ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("บาท");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("หุ้น");

        jLabel9.setText("%");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalculate.setText("คำนวณรายการ >>");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        btnCalculate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalculateKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPublicBenefitAmt)
                                    .addComponent(txtReserveFundAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTotalHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDividendPerYearAmt)
                                .addComponent(txtDividendPerMonthAmt))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNetDividendAmt)
                            .addComponent(txtTotalBenefitAmt)
                            .addComponent(txtTotalReserveFundAmt)
                            .addComponent(txtProfitOpAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtProfitOpAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalReserveFundAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtReserveFundAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalBenefitAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtPublicBenefitAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel15)
                    .addComponent(txtNetDividendAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDividendPerYearAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDividendPerMonthAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnClose.setBackground(new java.awt.Color(255, 102, 102));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setText("ออก");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setText("Export Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnSaveData.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveData.setText("บันทึกข้อมูล");
        btnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDataActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("เงินคงเหลือจากการปันหุ้น");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("รวมเงินปันผลจริง");

        txtTotalDividendPerMemberAmt.setEditable(false);
        txtTotalDividendPerMemberAmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalDividendPerMemberAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalDividendPerMemberAmt.setText("0.00");

        txtTtBLAftDvdAmt.setEditable(false);
        txtTtBLAftDvdAmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTtBLAftDvdAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTtBLAftDvdAmt.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTtBLAftDvdAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtTotalDividendPerMemberAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDividendPerMemberAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(txtTtBLAftDvdAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(btnExport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProfitOpAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProfitOpAmtFocusGained
        txtProfitOpAmt.selectAll();
    }//GEN-LAST:event_txtProfitOpAmtFocusGained

    private void txtProfitOpAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfitOpAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtReserveFundAmt.requestFocus();
        }
    }//GEN-LAST:event_txtProfitOpAmtKeyPressed

    private void txtReserveFundAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtReserveFundAmtFocusGained
        txtReserveFundAmt.selectAll();
    }//GEN-LAST:event_txtReserveFundAmtFocusGained

    private void txtReserveFundAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReserveFundAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double profitOpAmt = NumberUtil.toDouble(txtProfitOpAmt.getText());
            double reserveFundAmt = NumberUtil.toDouble(txtReserveFundAmt.getText());
            double total = profitOpAmt * reserveFundAmt / 100;
            balanceAmt = profitOpAmt - total;
            txtTotalReserveFundAmt.setText(NumberFormat.showDouble2(total));
            txtPublicBenefitAmt.requestFocus();
        }
    }//GEN-LAST:event_txtReserveFundAmtKeyPressed

    private void txtPublicBenefitAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicBenefitAmtFocusGained
        txtPublicBenefitAmt.selectAll();
    }//GEN-LAST:event_txtPublicBenefitAmtFocusGained

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        loadData();
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtPublicBenefitAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPublicBenefitAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calculate();

            btnCalculate.requestFocus();
        }
    }//GEN-LAST:event_txtPublicBenefitAmtKeyPressed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        exportExcel();
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDataActionPerformed
        saveData();
    }//GEN-LAST:event_btnSaveDataActionPerformed

    private void btnCalculateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalculateKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            loadData();
        }
    }//GEN-LAST:event_btnCalculateKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSaveData;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBranchName;
    private javax.swing.JLabel lbDateProcess;
    private javax.swing.JTable tbDividendMemberList;
    private javax.swing.JTextField txtDividendPerMonthAmt;
    private javax.swing.JTextField txtDividendPerYearAmt;
    private javax.swing.JTextField txtNetDividendAmt;
    private javax.swing.JTextField txtProfitOpAmt;
    private javax.swing.JTextField txtPublicBenefitAmt;
    private javax.swing.JTextField txtReserveFundAmt;
    private javax.swing.JTextField txtTotalBenefitAmt;
    private javax.swing.JTextField txtTotalDividendPerMemberAmt;
    private javax.swing.JTextField txtTotalHoonAmt;
    private javax.swing.JTextField txtTotalReserveFundAmt;
    private javax.swing.JTextField txtTtBLAftDvdAmt;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        model = (DefaultTableModel) tbDividendMemberList.getModel();
        JTableHeader tHeader = tbDividendMemberList.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbDividendMemberList.setRowHeight(30);
        tbDividendMemberList.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void exportExcel() {

    }

    private void calculate() {
        double profitOpAmt = NumberUtil.toDouble(txtProfitOpAmt.getText());
        double publicBenefitAmt = NumberUtil.toDouble(txtPublicBenefitAmt.getText());
        double totalBenefitAmt = profitOpAmt * publicBenefitAmt / 100;
        balanceAmt = profitOpAmt - totalBenefitAmt;
        txtTotalBenefitAmt.setText(NumberFormat.showDouble2(totalBenefitAmt));

        double totalReserveFundAmt = NumberUtil.toDouble(txtTotalReserveFundAmt.getText());
        double netDividendAmt = profitOpAmt - (totalReserveFundAmt + totalBenefitAmt);
        txtNetDividendAmt.setText(NumberFormat.showDouble2(netDividendAmt));

        //total summary
        double totalHoonAmt = NumberUtil.toDouble(txtTotalHoonAmt.getText());
        double dividendPerYearAmt = netDividendAmt / totalHoonAmt;
        txtDividendPerYearAmt.setText(NumberFormat.showDouble4(dividendPerYearAmt));

        double dividendPerMonthAmt = dividendPerYearAmt / 12;
        txtDividendPerMonthAmt.setText(NumberFormat.showDouble4(dividendPerMonthAmt));
    }

    private void loadData() {
        List<ProfileBean> listProfile = getProfileControl().listProfileHoon();
        double dividendPerYearAmt = NumberUtil.toDouble(txtDividendPerYearAmt.getText());
        for(ProfileBean bean: listProfile){
            
            model.addRow(new Object[]{
                bean.getP_index(),
                bean.getP_custName(),
                bean.getP_custSurname(),
                bean.getHoon_Qty(),
                dividendPerYearAmt*bean.getHoon_Qty(),
                0,
                "",
                0,
                0,
                0.00
            });
        }
    }

    private void saveData() {
        
    }
}
