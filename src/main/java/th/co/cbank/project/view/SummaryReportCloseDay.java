package th.co.cbank.project.view;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.control.MySQLConnect;
import th.co.cbank.util.DateChooseDialog;

public class SummaryReportCloseDay extends BaseDialogSwing {
    private final Logger logger = Logger.getLogger(SummaryReportCloseDay.class);
    private final Frame parent;

    public SummaryReportCloseDay(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.parent = parent;

        txtDate1.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        loadData();
        txtDate1.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDeposit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWithdraw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaveBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSaveINT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSaveFee = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtHoonBuyQty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtHoonSaleQty = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtHoonTransfer = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHoonBuyAmt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtHoonSaleAmt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtLoanFeeOverAmt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtLoanzPayAmt = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtFeeOpenAmt = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtFeeLoanAmt = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtFeeProjectAmt = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtDate1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtExpendAmt = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("รายการปิดสิ้นวัน");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("รายงานการปิดสิ้นวัน");
        jLabel1.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายงานเงินฝาก ถอน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ยอดเงินฝาก");

        txtDeposit.setEditable(false);
        txtDeposit.setBackground(new java.awt.Color(255, 255, 204));
        txtDeposit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDeposit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDeposit.setText("0.00");
        txtDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("ยอดเงินถอน");

        txtWithdraw.setEditable(false);
        txtWithdraw.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdraw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWithdraw.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdraw.setText("0.00");
        txtWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("เงินฝากคงเหลือ");

        txtSaveBalance.setEditable(false);
        txtSaveBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveBalance.setText("0.00");
        txtSaveBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel5.setText("าท");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("บาท");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("บาท");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("บาท");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ดอกเบี้ยจ่าย");

        txtSaveINT.setEditable(false);
        txtSaveINT.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveINT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveINT.setText("0.00");
        txtSaveINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveINTActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("ค่าธรรมเนียม");

        txtSaveFee.setEditable(false);
        txtSaveFee.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveFee.setText("0.00");
        txtSaveFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("บาท");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSaveINT, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtSaveFee)
                    .addComponent(txtSaveBalance, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtWithdraw)
                    .addComponent(txtDeposit))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaveBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSaveINT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายงานการถือหุ้น", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("จำนวนการซื้อหุ้น");

        txtHoonBuyQty.setEditable(false);
        txtHoonBuyQty.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonBuyQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonBuyQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonBuyQty.setText("0");
        txtHoonBuyQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel12.setText("าท");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("หุ้น");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("จำนวนการขายหุ้น");

        txtHoonSaleQty.setEditable(false);
        txtHoonSaleQty.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonSaleQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonSaleQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonSaleQty.setText("0");
        txtHoonSaleQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("หุ้น");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("จำนวนการโอนหุ้น");

        txtHoonTransfer.setEditable(false);
        txtHoonTransfer.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonTransfer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonTransfer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonTransfer.setText("0");
        txtHoonTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("หุ้น");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("มูลค่าการซื้อ");

        txtHoonBuyAmt.setEditable(false);
        txtHoonBuyAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonBuyAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonBuyAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonBuyAmt.setText("0.00");
        txtHoonBuyAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("บาท");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("มูลค่าการขาย");

        txtHoonSaleAmt.setEditable(false);
        txtHoonSaleAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonSaleAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoonSaleAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonSaleAmt.setText("0.00");
        txtHoonSaleAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("บาท");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22)
                    .addComponent(jLabel10)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoonSaleQty)
                    .addComponent(txtHoonTransfer)
                    .addComponent(txtHoonBuyAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(txtHoonSaleAmt)
                    .addComponent(txtHoonBuyQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(jLabel14)
                    .addComponent(jLabel25)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHoonBuyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtHoonBuyAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtHoonSaleQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtHoonSaleAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtHoonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายงานการกู้ยืมเงิน", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel5.setOpaque(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("จำนวนเงินกู้");

        txtLoanAmt.setEditable(false);
        txtLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanAmt.setText("0.00");
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("ค่าปรับ");

        txtLoanFeeOverAmt.setEditable(false);
        txtLoanFeeOverAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanFeeOverAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanFeeOverAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanFeeOverAmt.setText("0.00");
        txtLoanFeeOverAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel32.setText("าท");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("บาท");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("บาท");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("ยอดเงินรับชำระ");

        txtLoanzPayAmt.setEditable(false);
        txtLoanzPayAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanzPayAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanzPayAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLoanzPayAmt.setText("0.00");
        txtLoanzPayAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("บาท");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtLoanFeeOverAmt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanzPayAmt, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(73, 73, 73)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtLoanzPayAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtLoanFeeOverAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)))
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายการค่าธรรมเนียม", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel6.setOpaque(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("ค่าธรรมเนียมเปิดบัตร");

        txtFeeOpenAmt.setEditable(false);
        txtFeeOpenAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeOpenAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeeOpenAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeOpenAmt.setText("0.00");
        txtFeeOpenAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("ค่าธรรมเนียมกู้เงิน");

        txtFeeLoanAmt.setEditable(false);
        txtFeeLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeeLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeLoanAmt.setText("0.00");
        txtFeeLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel41.setText("าท");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("บาท");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("บาท");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("ค่าธรรมเนียมโครงการ");

        txtFeeProjectAmt.setEditable(false);
        txtFeeProjectAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeProjectAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFeeProjectAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFeeProjectAmt.setText("0.00");
        txtFeeProjectAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("บาท");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFeeProjectAmt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(txtFeeLoanAmt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFeeOpenAmt, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtFeeOpenAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtFeeLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtFeeProjectAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setOpaque(false);

        txtDate1.setEditable(false);
        txtDate1.setBackground(new java.awt.Color(255, 255, 204));
        txtDate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDate1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDate1FocusGained(evt);
            }
        });
        txtDate1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDate1KeyPressed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("วันที่");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ค้นหาข้อมูล");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("บันทึก/พิมพ์รายงาน");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("ออก (Close)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "รายการค่าใช้จ่าย", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel8.setOpaque(false);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("ยอดรวมค่าใช้จ่าย");

        txtExpendAmt.setEditable(false);
        txtExpendAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtExpendAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtExpendAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExpendAmt.setText("0.00");
        txtExpendAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel48.setText("าท");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel49.setText("บาท");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpendAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtExpendAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDate1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDate1FocusGained
        txtDate1.selectAll();
    }//GEN-LAST:event_txtDate1FocusGained

    private void txtDate1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDate1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_txtDate1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reportCloseDay();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Point point = txtDate1.getLocationOnScreen();
        point.setLocation(point.getX() + txtDate1.getWidth(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(parent, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDate1.setText(dcd.getDateString());
            txtDate1.requestFocus();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtSaveINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveINTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaveINTActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtDeposit;
    private javax.swing.JTextField txtExpendAmt;
    private javax.swing.JTextField txtFeeLoanAmt;
    private javax.swing.JTextField txtFeeOpenAmt;
    private javax.swing.JTextField txtFeeProjectAmt;
    private javax.swing.JTextField txtHoonBuyAmt;
    private javax.swing.JTextField txtHoonBuyQty;
    private javax.swing.JTextField txtHoonSaleAmt;
    private javax.swing.JTextField txtHoonSaleQty;
    private javax.swing.JTextField txtHoonTransfer;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanFeeOverAmt;
    private javax.swing.JTextField txtLoanzPayAmt;
    private javax.swing.JTextField txtSaveBalance;
    private javax.swing.JTextField txtSaveFee;
    private javax.swing.JTextField txtSaveINT;
    private javax.swing.JTextField txtWithdraw;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        Date date = DateFormat.getLocal_ddMMyyyy(txtDate1.getText());
        String dateMySQL = DateFormat.getMySQL_Date(date);

        //รายการเงินฝาก
        try {
            String sql = "select sum(money_in), sum(money_out), "
                    + "sum(money_in-money_out) t_balance, "
                    + "sum(t_interest), sum(t_fee) "
                    + "from cb_transaction_save "
                    + "where t_date='" + dateMySQL + "' "
                    + "and t_status in('1','2','3','8') ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                txtDeposit.setText(NumberFormat.showDouble2(rs.getDouble(1)));
                txtWithdraw.setText(NumberFormat.showDouble2(rs.getDouble(2)));
                txtSaveBalance.setText(NumberFormat.showDouble2(rs.getDouble(3)));
                txtSaveINT.setText(NumberFormat.showDouble2(rs.getDouble(4)));
                txtSaveFee.setText(NumberFormat.showDouble2(rs.getDouble(5)));
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //รายการหุ้น
        try {
            String sql = "select t_status, sum(t_amount), sum(t_hoon_amt) "
                    + "from cb_transaction_save "
                    + "where t_date='" + dateMySQL + "' "
                    + "and t_status in('4','5','9') "
                    + "group by t_status";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            double hBuy = 0.00;
            double hSale = 0.00;
            double hTran = 0.00;
            double hAmtBuy = 0.00;
            double hAmtSale = 0.00;
            while (rs.next()) {
                String t_status = rs.getString(1);
                switch (t_status) {
                    case "4":
                        hBuy += rs.getDouble(2);
                        hAmtBuy += rs.getDouble(3);
                        break;
                    case "5":
                        hSale += rs.getDouble(2);
                        hAmtSale += rs.getDouble(3);
                        break;
                    case "9":
                        hTran += rs.getDouble(2);
                        break;
                }
            }

            txtHoonBuyQty.setText(NumberFormat.showDouble2(hBuy));
            txtHoonBuyAmt.setText(NumberFormat.showDouble2(hAmtBuy));
            txtHoonSaleQty.setText(NumberFormat.showDouble2(hSale));
            txtHoonSaleAmt.setText(NumberFormat.showDouble2(hAmtSale));
            txtHoonTransfer.setText(NumberFormat.showDouble2(hTran));

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //เงินกู้
        try {
            String sql = "select t_status, sum(t_amount) "
                    + "from cb_transaction_save "
                    + "where t_date='" + dateMySQL + "' "
                    + "and t_status in('10','7') "
                    + "group by t_status";
            double loanAmt = 0.00;
            double payAmt = 0.00;
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                String t_status = rs.getString(1);
                switch (t_status) {
                    case AppConstants.CB_STATUS_LOAN:
                        loanAmt += rs.getDouble(2);
                        break;
                    case AppConstants.CB_STATUS_PAYMENT:
                        payAmt += rs.getDouble(2);
                        break;
                }
            }

            txtLoanAmt.setText(NumberFormat.showDouble2(loanAmt));
            txtLoanzPayAmt.setText(NumberFormat.showDouble2(payAmt));

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //ค่าใช้จ่าย
        try {
            String sql = "select sum(emp_amount) from cb_exp_transaction "
                    + "where exp_date=curdate();";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                txtExpendAmt.setText(NumberFormat.showDouble2(rs.getDouble(1)));
            }

            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void reportCloseDay() {

    }

}
