package th.co.cbank.project.view;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.project.control.ViewReport;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.TableUtil;

public class LoanReportPaymentDialog extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(LoanReportPaymentDialog.class);
    private SimpleDateFormat simp = new SimpleDateFormat("dd/MM/yyyy");
    private DecimalFormat dec = new DecimalFormat("#,##0.00");
    private Frame parent;

    public LoanReportPaymentDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.parent = parent;

        initTable();

        setLocation(0, 0);
        setSize(parent.getMaximumSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaction = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate1 = new javax.swing.JTextField();
        txtDate2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbAccItem = new javax.swing.JComboBox();
        txtAccCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCustCode = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTotalPeople = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotalIncome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotalINT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLoanPayAmt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายงานการรับชำระ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("รายงานการรับชำระเงิน");

        tbTransaction.setAutoCreateRowSorter(true);
        tbTransaction.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "วันที่", "เวลา", "บัญชี", "รายการ", "จำนวนเงิน", "รหัสบัตร", "ชื่อ-สกุล", "พนักงาน", "สาขา"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransaction.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbTransaction);
        if (tbTransaction.getColumnModel().getColumnCount() > 0) {
            tbTransaction.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbTransaction.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbTransaction.getColumnModel().getColumn(4).setPreferredWidth(150);
            tbTransaction.getColumnModel().getColumn(5).setPreferredWidth(120);
            tbTransaction.getColumnModel().getColumn(6).setPreferredWidth(175);
            tbTransaction.getColumnModel().getColumn(7).setPreferredWidth(200);
            tbTransaction.getColumnModel().getColumn(8).setPreferredWidth(100);
            tbTransaction.getColumnModel().getColumn(9).setPreferredWidth(200);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "เลือกวันที่ทำรายการ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("วัน");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("ถึง");

        txtDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtDate2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("...");
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
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDate1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDate2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setText("ล้างค่าการค้นหา");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnShowAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnShowAll.setText("แสดงทั้งหมด");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "รายละเอียดบัญชี", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("เลขที่บัญชี");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("รหัสบัตรประชาชน");

        cbAccItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbAccItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ทั้งหมด", "กู้เงิน", "ชำระเงินกู้" }));
        cbAccItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbAccItemKeyPressed(evt);
            }
        });

        txtAccCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("เลือกรายการ");

        txtCustCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAccCode)
                    .addComponent(cbAccItem, 0, 185, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbAccItem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("ออก (Exit)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("พิมพ์เอกสาร");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("จำนวนคน");

        txtTotalPeople.setEditable(false);
        txtTotalPeople.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalPeople.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPeople.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPeople.setText("0");
        txtTotalPeople.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("รายรับ");

        txtTotalIncome.setEditable(false);
        txtTotalIncome.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalIncome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalIncome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalIncome.setText("0");
        txtTotalIncome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("ดอกเบี้ย");

        txtTotalINT.setEditable(false);
        txtTotalINT.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalINT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalINT.setText("0");
        txtTotalINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("เงินกู้");

        txtLoanAmt.setEditable(false);
        txtLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("รับชำระ");

        txtLoanPayAmt.setEditable(false);
        txtLoanPayAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanPayAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPayAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoanPayAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalINT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtTotalPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtLoanPayAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtTotalINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        showAll();
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Point point = txtDate1.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate1.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate1.setText(dcd.getDateString());
            txtDate1.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Point point = txtDate2.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate2.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate2.setText(dcd.getDateString());
            txtDate2.requestFocus();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbAccItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbAccItemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_cbAccItemKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exportReport();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnShowAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbAccItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTransaction;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtCustCode;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDate2;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanPayAmt;
    private javax.swing.JTextField txtTotalINT;
    private javax.swing.JTextField txtTotalIncome;
    private javax.swing.JTextField txtTotalPeople;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tbTransaction.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransaction.setRowHeight(30);

        JTableHeader tHeader = tbTransaction.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tbTransaction.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbTransaction.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        txtDate1.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtDate2.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }
    
    private String sqlAll = "";

    private void showAll() {
        DefaultTableModel model = (DefaultTableModel) tbTransaction.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        try {
            String sql = "select b.code, t.*, p_custName,p_custSurname "
                    + "from cb_transaction_loan t, cb_profile p, cb_branch b "
                    + "where t.t_custcode=p.p_custcode "
                    + "and t_status in('7') ";

            if (!txtDate1.getText().equals("") && !txtDate2.getText().equals("")) {
                Date date1 = DateFormat.getLocal_ddMMyyyy(txtDate1.getText());
                Date date2 = DateFormat.getLocal_ddMMyyyy(txtDate2.getText());
                sql += " and t_date between '" + DateFormat.getMySQL_Date(date1) + "' "
                        + "and '" + DateFormat.getMySQL_Date(date2) + "' ";
            }

            if (!txtAccCode.getText().equals("")) {
                sql += " and t_acccode='" + txtAccCode.getText() + "' ";
            }

            if (!txtCustCode.getText().equals("")) {
                sql += " and t_custcode='" + txtCustCode.getText() + "' ";
            }

            int count = 0;
            double balance = 0;
            double totalDeposit = 0;
            double totalWithdraw = 0;

            sql += " order by t_date, t_time";
            sqlAll = sql;
            System.out.println(sqlAll);
            String tempCust = "";
            ResultSet rs2 = MySQLConnect.getResultSet(sql);
            int countCust = 0;
            while (rs2.next()) {
                if (tempCust.equals("")) {
                    tempCust = rs2.getString("t_custcode");
                    countCust++;
                } else if (!tempCust.equals(rs2.getString("t_custcode"))) {
                    tempCust = rs2.getString("t_custcode");
                    countCust++;
                }
            }
            rs2.close();

            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                count++;
                model.addRow(new Object[]{
                    count,
                    simp.format(rs.getDate("t_date")),
                    rs.getString("t_time"),
                    rs.getString("t_acccode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("t_description")),
                    rs.getDouble("t_amount"),
                    rs.getString("t_custcode"),
                    ThaiUtil.ASCII2Unicode(rs.getString("p_custName") + " " + rs.getString("p_custSurname")),
                    rs.getString("t_empcode"),
                    rs.getString("code")
                });

                String checkType = ThaiUtil.ASCII2Unicode(rs.getString("t_description"));
                double amount = rs.getDouble("t_amount");
                switch (checkType) {
                    case "ชำระเงินกู้":
                        totalDeposit += amount;
                        break;
                    case "กู้เงิน":
                        totalWithdraw += amount;
                        break;
                }

                balance += amount;
            }
            
            TableUtil.alignTable(tbTransaction, 5, SwingConstants.RIGHT);

            txtTotalPeople.setText("" + countCust);
            if (totalWithdraw < 0) {
                totalWithdraw *= -1;
            }
            txtLoanPayAmt.setText(dec.format(totalDeposit));
            txtLoanAmt.setText(dec.format(totalWithdraw));
            txtTotalIncome.setText(dec.format(balance));

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void exportReport() {
        ViewReport v = new ViewReport();
        v.printReportLoanTran(sqlAll);
    }

    private void resetData() {
        txtAccCode.setText("");
        txtCustCode.setText("");
        cbAccItem.setSelectedIndex(0);

        txtAccCode.requestFocus();
    }
}
