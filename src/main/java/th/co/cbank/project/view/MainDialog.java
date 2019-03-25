package th.co.cbank.project.view;

import java.awt.Component;
import java.awt.Container;
import th.co.cbank.project.model.BranchBean;
import th.co.cbank.project.model.ProfileBean;
import th.co.cbank.project.control.Value;
import th.co.cbank.project.control.ViewReport;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.apache.log4j.Logger;
import th.co.cbank.util.JTableUtil;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.MoneyToWord;
import th.co.cbank.util.NumberFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.model.ConfigBean;
import th.co.cbank.project.control.PrintCOM;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.AddressBean;
import th.co.cbank.project.model.CbBondsmanBean;
import th.co.cbank.project.model.CbFeeBean;
import th.co.cbank.project.model.CbFeeTransactionBean;
import th.co.cbank.project.model.CbLoanTablePaymentBean;
import th.co.cbank.project.model.CbTransactionLoanBean;
import th.co.cbank.project.model.CbWithdrawAllowBean;
import th.co.cbank.project.model.DocumentGarunteeBean;
import th.co.cbank.project.model.CbHoonConfigBean;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.project.model.PrintSlipBean;
import th.co.cbank.project.model.CbSaveAccountBean;
import th.co.cbank.project.model.CbSaveConfigBean;
import th.co.cbank.project.model.SaveSummaryBean;
import th.co.cbank.project.model.CbTransactionSaveBean;
import th.co.cbank.project.model.mapping.LoadLoanMapping;
import th.co.cbank.project.control.PassBook_PSiPR9;
import th.co.cbank.project.model.ReportOrangeBean;
import th.co.cbank.project.report.view.DialyReportDialog;
import th.co.cbank.project.report.view.ReportInvoiceHoon;
import th.co.cbank.project.report.view.ReportPersonDetail;
import th.co.cbank.util.DateChooseDialog;
import th.co.cbank.util.DateUtil;
import th.co.cbank.util.ImagePreviewPanel;
import th.co.cbank.util.NumberUtil;
import th.co.cbank.util.StringUtil;

public class MainDialog extends BaseSwing {
    private final Logger logger = Logger.getLogger(MainDialog.class);
    private final LoginDialog login;
    private boolean profileIsActive = false;
    private boolean isEffitiveRate = false;

    public MainDialog(java.awt.Frame parent, boolean modal) {
        initComponents();

        System.out.println(this.getTitle());

        // Test Run main Page
        try {
            Image im = ImageIO.read(getClass().getResource("/img/deposit.png"));
            setIconImage(im);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        login = new LoginDialog(this, true);
        login.setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        loadSummary();
        clearFormAll();

        tbTransSave.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbTransSave.setRowHeight(30);
        JTableHeader tTran = tbTransSave.getTableHeader();
        tTran.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        jTabbedPane1.setEnabledAt(4, false);
        jTabbedPane1.setEnabledAt(5, false);

        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        if (Value.USER_CODE.contains("admin")) {
            jMenuItem38.setVisible(true);
        } else {
            jMenuItem38.setVisible(false);
        }

        checkMenuLoadFile();

        txtProfileCode.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel31 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnPrintSliplOpenAcc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        chkSave1 = new javax.swing.JCheckBox();
        lblSaveEvidence = new javax.swing.JLabel();
        lblSaveAccountNo = new javax.swing.JLabel();
        txtAccountCode = new javax.swing.JTextField();
        chkSave2 = new javax.swing.JCheckBox();
        lblSaveBookNo = new javax.swing.JLabel();
        txtBookNo = new javax.swing.JTextField();
        lblSaveFee = new javax.swing.JLabel();
        txtSaveFee = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblSelectSaveAccount = new javax.swing.JLabel();
        cbAccType = new javax.swing.JComboBox();
        btnSaveAccOpen = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        lblSaveOpenTitle = new javax.swing.JLabel();
        btnCancelOpenAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDepCode = new javax.swing.JTextField();
        lbMoneyText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDepositBaht = new javax.swing.JTextField();
        txtRemark1 = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        txtBalanceInterest = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtBookPage = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BookPageAt = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        txtAccCodeLoad = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtDepositDate = new javax.swing.JTextField();
        btnSaveMoney = new javax.swing.JButton();
        btnCancelOpenAcc4 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        lblSaveAccountTitle = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        btnCancelSaveMoney = new javax.swing.JButton();
        btnTransactionSaveDialog = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        txtBalanceTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        txtWithdrawalCode = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        txtWithdrawalBaht = new javax.swing.JTextField();
        lbMoneyText1 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        txtRemark2 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        txtWithdrawAccTypeName = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtWithdrawDate = new javax.swing.JTextField();
        btnWithdrawMoney = new javax.swing.JButton();
        btnCancelWithdrawMoney = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        lblWithdrawAccountTitle = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        txtCloseRemark = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txtStartDateOpenSaveAccount = new javax.swing.JTextField();
        txtSaveCloseBalance = new javax.swing.JTextField();
        txtSaveCloseInterest = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        txTotalMoneyClose = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        btnCloseSaveAccount = new javax.swing.JButton();
        btnCancelCloseSaveAccount = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        lblCloseAccountTitle = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTransSave = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtHoonQTY = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDocNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtValueBaht = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtCashPay = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnSaveByHoon = new javax.swing.JButton();
        btnCancelBuyHoon = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        cbHoonType = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        txtHoonTon = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        lblBuyHoonTitle = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        txtTotalSellHoonAmount = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        txtDateSell = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        txtPriceValue = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        btnChooseDateSellHoon = new javax.swing.JButton();
        chkSelectAllSellHoon = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        txtDocNo1 = new javax.swing.JTextField();
        btnSellHoon = new javax.swing.JButton();
        btnCancelSellHoon = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        lblSellHoonTitle = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        txtTotaTransferHoonAmt = new javax.swing.JTextField();
        txtDateTransfer = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        txtTransferPerson = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        btnChooseDateTransfer = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        txtDocnoTransfer = new javax.swing.JTextField();
        btnFindPersonToTransfer = new javax.swing.JButton();
        jLabel154 = new javax.swing.JLabel();
        txtTransferAppCode = new javax.swing.JPasswordField();
        btnTransferHoon = new javax.swing.JButton();
        btnCancelTransferHoon = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        txtProfileCode2 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        txtAccCode2 = new javax.swing.JTextField();
        btnChooseAccToTranHoon = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        lblTransferHoonTitle = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel180 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel195 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel200 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        lblLoanPromiseTitle = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel60 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtAddrProvince1 = new javax.swing.JTextField();
        txtAddrPost1 = new javax.swing.JTextField();
        txtAddrAmphur1 = new javax.swing.JTextField();
        txtAddrTambon1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtAddrMobile1 = new javax.swing.JTextField();
        txtAddrTel1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtAddNo1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtAddrRoad1 = new javax.swing.JTextField();
        txtAddrSoi1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtAddrMoo1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtAddrMooName1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        txtLoanName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        LoanCustID = new javax.swing.JTextField();
        txtLoanAge = new javax.swing.JTextField();
        txtLoanCardExpire = new javax.swing.JTextField();
        txtLoanBirthDate = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        txtLoanSex = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txtLoanOccu = new javax.swing.JTextField();
        jLabel202 = new javax.swing.JLabel();
        txtLoanRegMember = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        cbAddrType = new javax.swing.JComboBox();
        jPanel26 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        cbLoanAcc = new javax.swing.JComboBox();
        cbLoanTypePayment = new javax.swing.JComboBox();
        btnApproveMoreMoney = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtLoanDocCode = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtLoanFee = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtLoanDateStart = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtLoanDateEnd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtPayPerMonth = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIntFixedName = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txtFeeRateName = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        txtLoanPenaltyINT = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        txtLoanIntPercent = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        txtLoanPerMonth = new javax.swing.JTextField();
        jLabel209 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        txtStartLoanDate = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        txtIntBadDebt = new javax.swing.JTextField();
        jLabel198 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        txtIntTurnover = new javax.swing.JTextField();
        jLabel201 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        txtIntNormal = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbArGroup1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        txtB1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtB2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txtB3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtB4 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtB5 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        txtLoanCustName = new javax.swing.JTextField();
        jLabel190 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        txtLoanCustCode = new javax.swing.JTextField();
        jLabel194 = new javax.swing.JLabel();
        txtLoanCustSurname = new javax.swing.JTextField();
        btnSaveGuarantor = new javax.swing.JButton();
        btnCancelSaveGuarantor = new javax.swing.JButton();
        btnChooseGuarantor = new javax.swing.JButton();
        btnDelSaveGuarantor = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbGuarantor = new javax.swing.JTable();
        jLabel196 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAssetGaruntee1 = new javax.swing.JTextArea();
        btnAssetGaruntee = new javax.swing.JButton();
        txtImg1 = new javax.swing.JTextField();
        jLabel197 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        txtImg2 = new javax.swing.JTextField();
        txtImg3 = new javax.swing.JTextField();
        btn6 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        btnSaveLoanAccountRegister = new javax.swing.JButton();
        btnCancelSaveLoanAccountRegister = new javax.swing.JButton();
        btnPrintLoanPaper = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel45 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txtPaymentDate = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        txtPaymentPerMonth = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txtPaymentFee = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtPaymentAmountCash = new javax.swing.JTextField();
        btnConfirmPayment = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        txtIntLost = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtArIntMgr = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txtArLoanInt = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        btnCancelPayment = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        txtLoanStartDate = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbArGroup2 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        txtArTotalBalance = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtArNetAmt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHistoryPayment = new javax.swing.JTable();
        jButton15 = new javax.swing.JButton();
        jPanel54 = new javax.swing.JPanel();
        lblPaymentLoanTitle = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        txtProfileCode = new javax.swing.JTextField();
        txtProfileName = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        txtAccCode = new javax.swing.JTextField();
        lbPic = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        txtAccTypeName = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        txtLimitLoanAmt = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        txtTotalValue = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        txtTotalSave = new javax.swing.JTextField();
        txtARProduct = new javax.swing.JTextField();
        txtStartAcc = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        txtTotalAccount = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        txtIndexNo = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtBranchName = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtShowEmpName = new javax.swing.JTextField();
        txtShowEmpCode = new javax.swing.JTextField();
        txtMemQty = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        btnTimeShow = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnConfigSystem = new javax.swing.JMenuItem();
        mnSetupConfig = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnExit = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnMember = new javax.swing.JMenuItem();
        mnMemberType = new javax.swing.JMenuItem();
        mnExpense = new javax.swing.JMenuItem();
        mnProject = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnPrefix = new javax.swing.JMenuItem();
        mnStatus = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnFee = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        mnSaveAccount = new javax.swing.JMenuItem();
        mnLoanAccount = new javax.swing.JMenuItem();
        mnLoadExcel = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnSaveExpense = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnCloseDialoyDay = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnPrintHistorySave = new javax.swing.JMenuItem();
        mnSaveHistoryLoan = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnCancelOpenAccount = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnRptMember = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnRptOpenAccount = new javax.swing.JMenuItem();
        mnRptCloseAccount = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnMainRptHoon = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mnMainRptLoan = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        mnRptFee = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnRptProfitCompany = new javax.swing.JMenuItem();
        mnRptCheckAudit = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnRptTransaction = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem37 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ระบบบริหารธนาคารชุมชน V 1.0.4");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel165.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(204, 204, 204));
        jLabel165.setText("กรุณาเลือกเมนูเพื่อทำรายการ");

        jLabel167.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(204, 204, 204));
        jLabel167.setText("บริษัทสยามคอนวีเนียน จำกัด  Copy Right 2014-2015");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167))
                .addGap(153, 153, 153))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel167)
                .addGap(253, 253, 253))
        );

        jTabbedPane1.addTab("", jPanel31);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnPrintSliplOpenAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintSliplOpenAcc.setText("ออกสลิปใบเสร็จ");
        btnPrintSliplOpenAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintSliplOpenAccActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        chkSave1.setBackground(new java.awt.Color(255, 255, 255));
        chkSave1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave1.setText("สำเนาบัตรประชาชน");

        lblSaveEvidence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveEvidence.setText("หลักฐาน");

        lblSaveAccountNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveAccountNo.setText("เลขที่บัญชี");

        txtAccountCode.setEditable(false);
        txtAccountCode.setBackground(new java.awt.Color(255, 255, 204));
        txtAccountCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        chkSave2.setBackground(new java.awt.Color(255, 255, 255));
        chkSave2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSave2.setText("สำเนาทะเบียนบ้าน");

        lblSaveBookNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveBookNo.setText("สมุดเล่มที่");

        txtBookNo.setEditable(false);
        txtBookNo.setBackground(new java.awt.Color(255, 255, 204));
        txtBookNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBookNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblSaveFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSaveFee.setText("ค่าธรรมเนียม");

        txtSaveFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSaveFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSaveFee.setText("0.00");
        txtSaveFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtSaveFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSaveFeeFocusGained(evt);
            }
        });
        txtSaveFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSaveFeeKeyPressed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("บาท");

        lblSelectSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSelectSaveAccount.setText("เลือกบัญชี");

        cbAccType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbAccType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAccTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSelectSaveAccount)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSaveFee)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSaveEvidence, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveAccountNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSaveBookNo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addComponent(chkSave2)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSave1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectSaveAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveAccountNo)
                    .addComponent(txtAccountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaveBookNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSaveFee)
                    .addComponent(txtSaveFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSave1)
                        .addComponent(lblSaveEvidence))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(chkSave2)))
                .addContainerGap())
        );

        btnSaveAccOpen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveAccOpen.setText("บันทึกข้อมูล");
        btnSaveAccOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAccOpenActionPerformed(evt);
            }
        });
        btnSaveAccOpen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveAccOpenKeyPressed(evt);
            }
        });

        jPanel38.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveOpenTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveOpenTitle.setText("เปิดบัญชีเงินฝาก");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveOpenTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelOpenAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOpenAccount.setText("ยกเลิกรายการ");
        btnCancelOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOpenAccountActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(btnPrintSliplOpenAcc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSaveAccOpen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCancelOpenAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelOpenAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(679, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrintSliplOpenAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSaveAccOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelOpenAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><font color=white bgcolor=green>เปิดบัญชีเงินฝาก</font></html>", jPanel7);

        jTabbedPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane8.setRequestFocusEnabled(false);
        jTabbedPane8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane8MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("เลขที่ใบฝากเงิน");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ยอดเงินในบัญชี");

        txtDepCode.setEditable(false);
        txtDepCode.setBackground(new java.awt.Color(255, 255, 204));
        txtDepCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDepCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepCodeKeyPressed(evt);
            }
        });

        lbMoneyText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText.setText("(...)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("บาท");

        txtDepositBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDepositBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDepositBaht.setText("0.00");
        txtDepositBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepositBaht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepositBahtFocusGained(evt);
            }
        });
        txtDepositBaht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDepositBahtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDepositBahtKeyReleased(evt);
            }
        });

        txtRemark1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRemark1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRemark1KeyPressed(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalance.setText("0.00");
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("บาท");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("หมายเหตุ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("ฝากเงินเข้า");

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel146.setText("ดอกเบี้ยสะสม");

        txtBalanceInterest.setEditable(false);
        txtBalanceInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceInterest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBalanceInterest.setText("0.00");
        txtBalanceInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel148.setText("บาท");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("บรรทัดที่พิมพ์");

        txtBookPage.setEditable(false);
        txtBookPage.setBackground(new java.awt.Color(255, 255, 255));
        txtBookPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBookPage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBookPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel48.setText("หน้าความเคลื่อนไหวที่");

        BookPageAt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BookPageAt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BookPageAt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel168.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel168.setText("ประเภทบัญชี");

        txtAccCodeLoad.setEditable(false);
        txtAccCodeLoad.setBackground(new java.awt.Color(255, 255, 204));
        txtAccCodeLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccCodeLoad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCodeLoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("วันที่ฝากเงิน");

        txtDepositDate.setEditable(false);
        txtDepositDate.setBackground(new java.awt.Color(255, 255, 204));
        txtDepositDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDepositDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDepositDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepositDateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel146))
                            .addComponent(jLabel168))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBalanceInterest, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtAccCodeLoad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbMoneyText, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                        .addComponent(txtRemark1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel168)
                    .addComponent(txtAccCodeLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(txtDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBalanceInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(jLabel146))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDepositBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(lbMoneyText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtBookPage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(BookPageAt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveMoney.setText("บันทึกข้อมูล");
        btnSaveMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMoneyActionPerformed(evt);
            }
        });
        btnSaveMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveMoneyKeyPressed(evt);
            }
        });

        btnCancelOpenAcc4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelOpenAcc4.setText("ยกเลิก");
        btnCancelOpenAcc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOpenAcc4ActionPerformed(evt);
            }
        });

        jPanel41.setBackground(new java.awt.Color(204, 255, 204));

        lblSaveAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaveAccountTitle.setText("ฝากเงินเข้าบัญชี");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveAccountTitle)
                .addContainerGap(562, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaveAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel170.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel170.setText("รายงานการฝากเงินล่าสุด");

        btnCancelSaveMoney.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelSaveMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveMoney.setText("ยกเลิกรายการ");
        btnCancelSaveMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSaveMoneyActionPerformed(evt);
            }
        });

        btnTransactionSaveDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransactionSaveDialog.setText("แสดงรายละเอียดความเคลื่อนไหว");
        btnTransactionSaveDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionSaveDialogActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jPanel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnSaveMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCancelOpenAcc4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel170, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnCancelSaveMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnTransactionSaveDialog, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(btnCancelOpenAcc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSaveMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel170)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSaveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelOpenAcc4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTransactionSaveDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel170)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        jTabbedPane8.addTab("ฝากเงิน", jPanel8);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setOpaque(false);

        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel135.setText("จำนวนเงินที่ถอน");

        txtBalanceTotal.setEditable(false);
        txtBalanceTotal.setBackground(new java.awt.Color(255, 255, 204));
        txtBalanceTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalanceTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBalanceTotal.setText("0.00");
        txtBalanceTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("เลขที่ใบแจ้งถอน");

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel141.setText("หมายเหตุ");

        txtWithdrawalCode.setEditable(false);
        txtWithdrawalCode.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawalCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWithdrawalCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawalCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawalCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWithdrawalCodeKeyPressed(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel143.setText("บาท");

        txtWithdrawalBaht.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtWithdrawalBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdrawalBaht.setText("0.00");
        txtWithdrawalBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawalBaht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWithdrawalBahtFocusGained(evt);
            }
        });
        txtWithdrawalBaht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWithdrawalBahtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWithdrawalBahtKeyReleased(evt);
            }
        });

        lbMoneyText1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMoneyText1.setText("(...)");

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel140.setText("ยอดเงินที่ถอนได้");

        txtRemark2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRemark2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtRemark2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRemark2KeyPressed(evt);
            }
        });

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel142.setText("บาท");

        jLabel169.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel169.setText("ประเภทบัญชี");

        txtWithdrawAccTypeName.setEditable(false);
        txtWithdrawAccTypeName.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawAccTypeName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawAccTypeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawAccTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("วันที่ถอนเงิน");

        txtWithdrawDate.setEditable(false);
        txtWithdrawDate.setBackground(new java.awt.Color(255, 255, 204));
        txtWithdrawDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWithdrawDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWithdrawDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtWithdrawDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWithdrawDateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel135)
                            .addComponent(jLabel140)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel141)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtWithdrawalCode)
                            .addComponent(txtBalanceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawDate, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtWithdrawAccTypeName)))
                        .addGap(230, 230, 230))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel142)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtWithdrawalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(txtWithdrawAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(txtBalanceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(jLabel68)
                    .addComponent(txtWithdrawDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(txtWithdrawalBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel142)
                    .addComponent(lbMoneyText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRemark2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141))
                .addContainerGap())
        );

        btnWithdrawMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnWithdrawMoney.setText("บันทึกข้อมูล");
        btnWithdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawMoneyActionPerformed(evt);
            }
        });
        btnWithdrawMoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnWithdrawMoneyKeyPressed(evt);
            }
        });

        btnCancelWithdrawMoney.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelWithdrawMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelWithdrawMoney.setText("ยกเลิกรายการ");
        btnCancelWithdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelWithdrawMoneyActionPerformed(evt);
            }
        });

        jPanel42.setBackground(new java.awt.Color(255, 204, 204));

        lblWithdrawAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWithdrawAccountTitle.setText("ถอนเงินออกจากบัญชี");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdrawAccountTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWithdrawAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setLayer(jPanel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnWithdrawMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(btnCancelWithdrawMoney, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel42, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 731, Short.MAX_VALUE)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(btnWithdrawMoney)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelWithdrawMoney)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelWithdrawMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3)
        );

        jTabbedPane8.addTab("ถอนเงิน", jPanel40);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtCloseRemark.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCloseRemark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCloseRemark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCloseRemarkKeyPressed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel71.setText("บาท");

        txtStartDateOpenSaveAccount.setEditable(false);
        txtStartDateOpenSaveAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtStartDateOpenSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartDateOpenSaveAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartDateOpenSaveAccount.setText("04/05/2558");
        txtStartDateOpenSaveAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseBalance.setEditable(false);
        txtSaveCloseBalance.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveCloseBalance.setText("0.00");
        txtSaveCloseBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtSaveCloseInterest.setEditable(false);
        txtSaveCloseInterest.setBackground(new java.awt.Color(255, 255, 204));
        txtSaveCloseInterest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSaveCloseInterest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSaveCloseInterest.setText("0.00");
        txtSaveCloseInterest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("วันที่เปิดบัญชี");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel74.setText("จำนวนดอกเบี้ย");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel76.setText("ยอดเงินในบัญชี");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("สาเหตูการปิดบัญชี");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel101.setText("บาท");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel128.setText("จำนวนเงินที่รับคืน");

        txTotalMoneyClose.setEditable(false);
        txTotalMoneyClose.setBackground(new java.awt.Color(255, 255, 204));
        txTotalMoneyClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txTotalMoneyClose.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txTotalMoneyClose.setText("0.00");
        txTotalMoneyClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel134.setText("บาท");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel134)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txtStartDateOpenSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtCloseRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtSaveCloseBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(txtSaveCloseInterest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(txTotalMoneyClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCloseSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCloseSaveAccount.setText("ยืนยันปิดบัญชี");
        btnCloseSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseSaveAccountActionPerformed(evt);
            }
        });
        btnCloseSaveAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCloseSaveAccountKeyPressed(evt);
            }
        });

        btnCancelCloseSaveAccount.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelCloseSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelCloseSaveAccount.setText("ยกเลิกรายการ");
        btnCancelCloseSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCloseSaveAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelCloseSaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCloseSaveAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnCancelCloseSaveAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel46.setBackground(new java.awt.Color(255, 204, 204));

        lblCloseAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAccountTitle.setText("ปิดบัญชีเงินฝาก");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCloseAccountTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCloseAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane8.addTab("ปิดบัญชีเงินฝาก", jPanel15);

        jPanel56.setBackground(new java.awt.Color(255, 204, 153));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel104.setText("รวมทั้งหมด");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel103.setText("------------------------------------");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("บัญชีทั้งหมด");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("เงินฝากทั้งหมด");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel105.setText("====================");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel102.setText("ดอกเบี้ยสะสม");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0.00");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 255, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("0.00");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 255, 204));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0.00");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel106.setText("บัญชี");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("บาท");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel108.setText("บาท");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel109.setText("บาท");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel57Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel102)))
                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel106)
                            .addComponent(jLabel107)
                            .addComponent(jLabel108)
                            .addComponent(jLabel109)))
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105))
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel110.setText("ยอดเคลื่อนไหวรายวัน");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("-------------------------------------");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel112.setText("เปิดบัญชีวันนี้");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel113.setText("ฝากเงินวันนี้");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("====================");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel115.setText("ถอนเงินวันนี้");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 255, 204));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.setText("0");
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 255, 204));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText("0.00");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 255, 204));
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText("0.00");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(204, 255, 204));
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.setText("0.00");
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel116.setText("บัญชี");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel117.setText("บาท");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel118.setText("บาท");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel119.setText("บาท");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel122.setText("ปิดบัญชีวันนี้");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(204, 255, 204));
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("0");
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel123.setText("บัญชี");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel124.setText("ค่าธรรมเนียม");

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 255, 204));
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setText("0.00");
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel133.setText("บาท");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel136.setText("====================");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel110)
                            .addGroup(jPanel58Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel124)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addComponent(jTextField12)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117)
                    .addComponent(jLabel118)
                    .addComponent(jLabel119)
                    .addComponent(jLabel123)
                    .addComponent(jLabel133))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel136))
        );

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbTransSave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขที่เอกสาร", "วันที่", "เวลา", "ฝากเงิน", "ถอนเงิน", "เงินต้นคงเหลือ", "หมายเหตุ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransSave.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane4.setViewportView(tbTransSave);
        if (tbTransSave.getColumnModel().getColumnCount() > 0) {
            tbTransSave.getColumnModel().getColumn(0).setPreferredWidth(130);
            tbTransSave.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbTransSave.getColumnModel().getColumn(5).setPreferredWidth(110);
            tbTransSave.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane8)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("<html><font color=white bgcolor=green>ฝาก/ถอน</font></html>", jPanel1);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane5.setRequestFocusEnabled(false);
        jTabbedPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane5MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("จำนวนเงินรวม");

        txtHoonQTY.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoonQTY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonQTY.setText("0");
        txtHoonQTY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtHoonQTY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoonQTYFocusGained(evt);
            }
        });
        txtHoonQTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoonQTYKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoonQTYKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("บาท");

        txtDocNo.setEditable(false);
        txtDocNo.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("จำนวนหุ้นที่ซื้อ");

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.setText("0.00");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("เลขที่เอกสาร");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("หุ้น");

        txtValueBaht.setEditable(false);
        txtValueBaht.setBackground(new java.awt.Color(255, 255, 204));
        txtValueBaht.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValueBaht.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValueBaht.setText("0.00");
        txtValueBaht.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("บาท/หุ้น");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("ราคาหุ้น");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCashPay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCashPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCashPay.setText("0.00");
        txtCashPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCashPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashPayFocusGained(evt);
            }
        });
        txtCashPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCashPayKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("บาท");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ชำระเงินสด");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(txtCashPay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSaveByHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveByHoon.setText("บันทึกข้อมูล");
        btnSaveByHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveByHoonActionPerformed(evt);
            }
        });
        btnSaveByHoon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveByHoonKeyPressed(evt);
            }
        });

        btnCancelBuyHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelBuyHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelBuyHoon.setText("ยกเลิกรายการ");
        btnCancelBuyHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelBuyHoonActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel53.setText("ประเภทหุ้น");

        cbHoonType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbHoonType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHoonTypeItemStateChanged(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("เงินทอน");

        txtHoonTon.setEditable(false);
        txtHoonTon.setBackground(new java.awt.Color(255, 255, 204));
        txtHoonTon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtHoonTon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoonTon.setText("0.00");
        txtHoonTon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setText("บาท");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel34)
                        .addGap(12, 12, 12)
                        .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtValueBaht, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtDocNo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtHoonQTY))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel21))
                                        .addGap(84, 84, 84))
                                    .addComponent(cbHoonType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnSaveByHoon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelBuyHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(txtDocNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHoonType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel18)
                    .addComponent(txtValueBaht, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoonTon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveByHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelBuyHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBackground(new java.awt.Color(255, 255, 204));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblBuyHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBuyHoonTitle.setText("ซื้อหุ้น");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuyHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane6.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(jPanel47, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6)
        );

        jTabbedPane5.addTab("ซื้อหุ้น", jPanel10);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.setOpaque(false);

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel132.setText("บาท");

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel129.setText("หุ้น");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel127.setText("วันที่ขาย");

        txtTotalSellHoonAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalSellHoonAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSellHoonAmount.setText("0");
        txtTotalSellHoonAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotalSellHoonAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalSellHoonAmountFocusGained(evt);
            }
        });
        txtTotalSellHoonAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotalSellHoonAmountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalSellHoonAmountKeyReleased(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel126.setText("บาท/หุ้น");

        txtTotalAmount.setEditable(false);
        txtTotalAmount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAmount.setText("0.00");
        txtTotalAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel131.setText("จำนวนเงิน");

        txtDateSell.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateSell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateSell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel130.setText("จำนวนหุ้นที่ขาย");

        txtPriceValue.setEditable(false);
        txtPriceValue.setBackground(new java.awt.Color(255, 255, 204));
        txtPriceValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPriceValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPriceValue.setText("0.00");
        txtPriceValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel125.setText("ราคาขาย");

        btnChooseDateSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateSellHoon.setText("...");
        btnChooseDateSellHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDateSellHoonActionPerformed(evt);
            }
        });

        chkSelectAllSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkSelectAllSellHoon.setText("ขายหุ้นทั้งหมด");
        chkSelectAllSellHoon.setOpaque(false);
        chkSelectAllSellHoon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkSelectAllSellHoonItemStateChanged(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel52.setText("เลขที่เอกสาร");

        txtDocNo1.setEditable(false);
        txtDocNo1.setBackground(new java.awt.Color(255, 255, 204));
        txtDocNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel125, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkSelectAllSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel126)
                    .addComponent(jLabel132))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel52)
                    .addComponent(txtDocNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(txtDateSell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel130)
                        .addComponent(txtTotalSellHoonAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel129))
                    .addComponent(chkSelectAllSellHoon, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(txtPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132))
                .addContainerGap())
        );

        btnSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSellHoon.setText("บันทึกข้อมูล");
        btnSellHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellHoonActionPerformed(evt);
            }
        });
        btnSellHoon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSellHoonKeyPressed(evt);
            }
        });

        btnCancelSellHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelSellHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSellHoon.setText("ยกเลิกรายการ");
        btnCancelSellHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSellHoonActionPerformed(evt);
            }
        });

        jPanel48.setBackground(new java.awt.Color(255, 204, 204));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblSellHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSellHoonTitle.setText("ขายหุ้น");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle)
                .addContainerGap(679, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSellHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane7.setLayer(jPanel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnSellHoon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(btnCancelSellHoon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jPanel48, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(btnSellHoon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSellHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7)
        );

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("ขายหุ้น", jPanel36);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel138.setText("หุ้น");

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel139.setText("วันที่โอนหุ้น");

        txtTotaTransferHoonAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotaTransferHoonAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotaTransferHoonAmt.setText("0");
        txtTotaTransferHoonAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTotaTransferHoonAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotaTransferHoonAmtFocusGained(evt);
            }
        });
        txtTotaTransferHoonAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTotaTransferHoonAmtKeyPressed(evt);
            }
        });

        txtDateTransfer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDateTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDateTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel147.setText("จำนวนหุ้นที่โอน");

        txtTransferPerson.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTransferPerson.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTransferPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTransferPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTransferPersonKeyPressed(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel152.setText("โอนให้กับ");

        btnChooseDateTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseDateTransfer.setText("...");
        btnChooseDateTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDateTransferActionPerformed(evt);
            }
        });

        jLabel153.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel153.setText("เลขที่เอกสาร");

        txtDocnoTransfer.setEditable(false);
        txtDocnoTransfer.setBackground(new java.awt.Color(255, 255, 204));
        txtDocnoTransfer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDocnoTransfer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDocnoTransfer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnFindPersonToTransfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindPersonToTransfer.setText("ค้นหา");
        btnFindPersonToTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPersonToTransferActionPerformed(evt);
            }
        });

        jLabel154.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel154.setText("รหัสอนุมัติ");

        txtTransferAppCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTransferAppCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel139)
                    .addComponent(jLabel147)
                    .addComponent(jLabel152)
                    .addComponent(jLabel153)
                    .addComponent(jLabel154))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTransferPerson)
                    .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtDateTransfer)
                    .addComponent(txtDocnoTransfer)
                    .addComponent(txtTransferAppCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138)
                    .addComponent(btnFindPersonToTransfer))
                .addGap(133, 133, 133))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel153)
                    .addComponent(txtDocnoTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(txtDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel147)
                    .addComponent(txtTotaTransferHoonAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFindPersonToTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransferPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(txtTransferAppCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        btnTransferHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTransferHoon.setText("บันทึกข้อมูล");
        btnTransferHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferHoonActionPerformed(evt);
            }
        });

        btnCancelTransferHoon.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelTransferHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelTransferHoon.setText("ยกเลิกรายการ");
        btnCancelTransferHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelTransferHoonActionPerformed(evt);
            }
        });

        jLabel185.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel185.setText("รหัสสมาชิก");

        txtProfileCode2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel189.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel189.setText("บัญชีเงินฝาก");

        txtAccCode2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnChooseAccToTranHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseAccToTranHoon.setText("เลือกบัญชี");
        btnChooseAccToTranHoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseAccToTranHoonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel185)
                    .addComponent(jLabel189))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btnTransferHoon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProfileCode2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccCode2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChooseAccToTranHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel185)
                    .addComponent(txtProfileCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel189)
                    .addComponent(btnChooseAccToTranHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelTransferHoon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel49.setBackground(new java.awt.Color(255, 204, 204));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        lblTransferHoonTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTransferHoonTitle.setText("โอนหุ้น");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTransferHoonTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jTabbedPane5.addTab("โอนหุ้น", jPanel14);

        jPanel59.setBackground(new java.awt.Color(255, 204, 153));
        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel59.setText("ผู้ถือหุ้นทั้งหมด");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel84.setText("จำนวนหุ้นทั้งหมด");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel145.setText("====================");

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(204, 255, 204));
        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setText("0");
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 255, 204));
        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField16.setText("0");
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel149.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel149.setText("คน");

        jLabel150.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel150.setText("หุ้น");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel59))
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149)
                    .addComponent(jLabel150))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel145)
                .addGap(95, 95, 95))
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel171.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel171.setText("หุ้นที่ซื้อวันนี้");

        jLabel175.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel175.setText("จำนวนหุ้นคงเหลือ");

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(204, 255, 204));
        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField24.setText("0");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(204, 255, 204));
        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField25.setText("0");
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel180.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel180.setText("หุ้น");

        jLabel182.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel182.setText("หุ้น");

        jLabel188.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel188.setText("หุ้นที่ขายวันนี้");

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(204, 255, 204));
        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField29.setText("0");
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel195.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel195.setText("หุ้น");

        jLabel199.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel199.setText("หุ้นที่โอนวันนี้");

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(204, 255, 204));
        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField33.setText("0");
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel200.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel200.setText("หุ้น");

        jLabel203.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel203.setText("====================");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel64Layout.createSequentialGroup()
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel171)
                            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel199, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel175))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180)
                    .addComponent(jLabel182)
                    .addComponent(jLabel195)
                    .addComponent(jLabel200))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel171)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel188)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel195))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel199)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel200))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel175)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel182))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel203))
        );

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html><font bgcolor=yellow>ซื้อขายหุ้น</font></html>", jPanel3);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(255, 204, 204));

        lblLoanPromiseTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLoanPromiseTitle.setText("ทำสัญญาเงินกู้");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoanPromiseTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "ที่อยู่ติดต่อ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("ตำบล/แขวง");

        txtAddrProvince1.setEditable(false);
        txtAddrProvince1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrProvince1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrProvince1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrProvince1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrProvince1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrProvince1KeyPressed(evt);
            }
        });

        txtAddrPost1.setEditable(false);
        txtAddrPost1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrPost1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrPost1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrPost1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrPost1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrPost1KeyPressed(evt);
            }
        });

        txtAddrAmphur1.setEditable(false);
        txtAddrAmphur1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrAmphur1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrAmphur1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrAmphur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrAmphur1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrAmphur1KeyPressed(evt);
            }
        });

        txtAddrTambon1.setEditable(false);
        txtAddrTambon1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTambon1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTambon1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTambon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTambon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTambon1KeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("อำเภอ/เขต");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("รหัสไปรษณีย์");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("จังหวัด");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("เบอร์โทรศัพท์");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel45.setText("เบอร์บ้าน");

        txtAddrMobile1.setEditable(false);
        txtAddrMobile1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMobile1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrMobile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMobile1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMobile1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMobile1KeyPressed(evt);
            }
        });

        txtAddrTel1.setEditable(false);
        txtAddrTel1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrTel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAddrTel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrTel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrTel1KeyPressed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel46.setText("บ้านเลขที่");

        txtAddNo1.setEditable(false);
        txtAddNo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddNo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddNo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddNo1KeyPressed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel47.setText("ถนน");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel56.setText("ซอย");

        txtAddrRoad1.setEditable(false);
        txtAddrRoad1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrRoad1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrRoad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrRoad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrRoad1KeyPressed(evt);
            }
        });

        txtAddrSoi1.setEditable(false);
        txtAddrSoi1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrSoi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrSoi1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrSoi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrSoi1KeyPressed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel57.setText("หมู่ที่");

        txtAddrMoo1.setEditable(false);
        txtAddrMoo1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMoo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddrMoo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAddrMoo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMoo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMoo1KeyPressed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel61.setText("ชื่อหมู่บ้าน");

        txtAddrMooName1.setEditable(false);
        txtAddrMooName1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddrMooName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddrMooName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAddrMooName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddrMooName1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel56)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtAddrSoi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(txtAddrPost1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrTel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46)
                        .addComponent(txtAddNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(txtAddrMoo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddrMooName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtAddrRoad1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(txtAddrSoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtAddrTambon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrAmphur1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtAddrProvince1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddrPost1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtAddrMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtAddrTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("ชื่อ-นามสกุล");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel83.setText("ปี");

        txtLoanName.setEditable(false);
        txtLoanName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("วันหมดอายุบัตร");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("รหัสบัตรประชาชน");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel93.setText("วันเกิด");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel72.setText("อายุ");

        LoanCustID.setEditable(false);
        LoanCustID.setBackground(new java.awt.Color(255, 255, 204));
        LoanCustID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoanCustID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanAge.setEditable(false);
        txtLoanAge.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanCardExpire.setEditable(false);
        txtLoanCardExpire.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCardExpire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanCardExpire.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanCardExpire.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtLoanBirthDate.setEditable(false);
        txtLoanBirthDate.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanBirthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanBirthDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel137.setText("เพศ");

        txtLoanSex.setEditable(false);
        txtLoanSex.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLoanSex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel144.setText("อาชีพ");

        txtLoanOccu.setEditable(false);
        txtLoanOccu.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanOccu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanOccu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel202.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel202.setText("วันที่สมัครสมาชิก");

        txtLoanRegMember.setEditable(false);
        txtLoanRegMember.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanRegMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanRegMember.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanRegMember.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel205.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel205.setText("เลือกที่อยู่ในการทำสัญญากู้เงิน");

        cbAddrType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbAddrType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ที่อยู่ปัจจุบัน", "ที่อยู่ตามบัตรประชาชน", "ที่อยู่ที่ทำงาน" }));
        cbAddrType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAddrTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel62)
                    .addComponent(jLabel72)
                    .addComponent(jLabel93)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel137)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel202))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                        .addComponent(jLabel144)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(255, 255, 255))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(LoanCustID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLoanAge, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel205)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(407, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LoanCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(txtLoanSex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtLoanName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(txtLoanAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel144)
                    .addComponent(txtLoanOccu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(txtLoanBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202)
                    .addComponent(txtLoanRegMember, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel205)
                    .addComponent(cbAddrType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanCardExpire, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("รายละเอียดผู้กู้", jPanel60);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setOpaque(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("เลือกบัญชี");

        jLabel172.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel172.setText("วงเงินที่ขอกู้");

        txtLoanAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanAmt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanAmt.setText("0.00");
        txtLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanAmtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoanAmtFocusLost(evt);
            }
        });
        txtLoanAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanAmtKeyPressed(evt);
            }
        });

        jLabel179.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel179.setText("บาท");

        cbLoanAcc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbLoanAcc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoanAccItemStateChanged(evt);
            }
        });

        cbLoanTypePayment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLoanTypePayment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รายวัน", "รายเดือน", "รายปี" }));
        cbLoanTypePayment.setSelectedIndex(1);
        cbLoanTypePayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLoanTypePaymentItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanAmt))
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel179)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cbLoanAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel172)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(cbLoanTypePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnApproveMoreMoney.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnApproveMoreMoney.setText("ให้วงเงินเพิ่ม");
        btnApproveMoreMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveMoreMoneyActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel55.setText("เลขที่สัญญา");

        txtLoanDocCode.setEditable(false);
        txtLoanDocCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDocCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDocCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDocCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDocCodeKeyPressed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel58.setText("ค่าธรรมเนียม");

        txtLoanFee.setEditable(false);
        txtLoanFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanFee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanFee.setText("0.00");
        txtLoanFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanFeeFocusGained(evt);
            }
        });
        txtLoanFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanFeeKeyPressed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("กำหนดเริ่มชำระ");

        txtLoanDateStart.setEditable(false);
        txtLoanDateStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDateStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDateStartKeyPressed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setText("...");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("งวดสุดท้าย");

        txtLoanDateEnd.setEditable(false);
        txtLoanDateEnd.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanDateEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanDateEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanDateEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanDateEnd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoanDateEndFocusGained(evt);
            }
        });
        txtLoanDateEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanDateEndKeyPressed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("ผ่อนชำระงวดล่ะ");

        txtPayPerMonth.setEditable(false);
        txtPayPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPayPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayPerMonth.setText("0.00");
        txtPayPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPayPerMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayPerMonthFocusGained(evt);
            }
        });
        txtPayPerMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayPerMonthKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel82.setText("บาท");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("ประเภทดอกเบี้ย");

        txtIntFixedName.setEditable(false);
        txtIntFixedName.setBackground(new java.awt.Color(255, 255, 204));
        txtIntFixedName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIntFixedName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel97.setText("การคิดค่าปรับ");

        txtFeeRateName.setEditable(false);
        txtFeeRateName.setBackground(new java.awt.Color(255, 255, 204));
        txtFeeRateName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFeeRateName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel120.setText("ดอกเบี้ยค่าปรับ");

        txtLoanPenaltyINT.setEditable(false);
        txtLoanPenaltyINT.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanPenaltyINT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPenaltyINT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPenaltyINT.setText("0.00");
        txtLoanPenaltyINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel121.setText("%");

        jLabel206.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel206.setText("ดอกเบี้ย");

        txtLoanIntPercent.setEditable(false);
        txtLoanIntPercent.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanIntPercent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanIntPercent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanIntPercent.setText("0.00");
        txtLoanIntPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel207.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel207.setText("%");

        jLabel208.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel208.setText("จำนวนงวด");

        txtLoanPerMonth.setEditable(false);
        txtLoanPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLoanPerMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanPerMonth.setText("1");
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

        jLabel209.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel209.setText("งวด");

        jLabel211.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel211.setText("วันที่ออกสัญญา");

        txtStartLoanDate.setEditable(false);
        txtStartLoanDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStartLoanDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtStartLoanDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartLoanDateFocusGained(evt);
            }
        });
        txtStartLoanDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartLoanDateKeyPressed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("...");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel82))
                            .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel206)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFeeRateName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIntFixedName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLoanDocCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(txtStartLoanDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel209))
                                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel207))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel211)
                    .addComponent(txtStartLoanDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIntFixedName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFeeRateName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(txtLoanPenaltyINT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121)
                    .addComponent(jLabel206)
                    .addComponent(txtLoanIntPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel207))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanDocCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtLoanFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel208)
                    .addComponent(txtLoanPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel209))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLoanDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtPayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addContainerGap())
        );

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel50.setText("สำรองหนี้สูญ");

        txtIntBadDebt.setEditable(false);
        txtIntBadDebt.setBackground(new java.awt.Color(255, 255, 204));
        txtIntBadDebt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntBadDebt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntBadDebt.setText("0.00");
        txtIntBadDebt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntBadDebt.setEnabled(false);
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
        });

        jLabel198.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel198.setText("%");

        jLabel187.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel187.setText("ค่าจัดการ");

        txtIntTurnover.setEditable(false);
        txtIntTurnover.setBackground(new java.awt.Color(255, 255, 204));
        txtIntTurnover.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntTurnover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntTurnover.setText("0.00");
        txtIntTurnover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntTurnover.setEnabled(false);
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
        });

        jLabel201.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel201.setText("%");

        jLabel184.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel184.setText("ดอกเบี้ยเงินกู้");

        txtIntNormal.setEditable(false);
        txtIntNormal.setBackground(new java.awt.Color(255, 255, 204));
        txtIntNormal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntNormal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntNormal.setText("0.00");
        txtIntNormal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntNormal.setEnabled(false);
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
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel99.setText("%");

        tbArGroup1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArGroup1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "งวดที่", "เงินต้น", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ยกู้", "รวมยอดชำระ", "คงเหลือ", "วันที่รับชำระ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArGroup1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(tbArGroup1);
        if (tbArGroup1.getColumnModel().getColumnCount() > 0) {
            tbArGroup1.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbArGroup1.getColumnModel().getColumn(0).setHeaderValue("งวดที่");
            tbArGroup1.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbArGroup1.getColumnModel().getColumn(1).setHeaderValue("เงินต้น");
            tbArGroup1.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("เงินต้น");

        txtB1.setEditable(false);
        txtB1.setBackground(new java.awt.Color(255, 255, 255));
        txtB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB1.setText("0.00");
        txtB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("สำรองหนี้");

        txtB2.setEditable(false);
        txtB2.setBackground(new java.awt.Color(255, 255, 255));
        txtB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB2.setText("0.00");
        txtB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel54.setText("ค่าจัดการ");

        txtB3.setEditable(false);
        txtB3.setBackground(new java.awt.Color(255, 255, 255));
        txtB3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB3.setText("0.00");
        txtB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel60.setText("ดอกเบี้ยกู้");

        txtB4.setEditable(false);
        txtB4.setBackground(new java.awt.Color(255, 255, 255));
        txtB4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB4.setText("0.00");
        txtB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel66.setText("ยอดชำระ");

        txtB5.setEditable(false);
        txtB5.setBackground(new java.awt.Color(255, 255, 255));
        txtB5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB5.setText("0.00");
        txtB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addGap(19, 19, 19))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel198)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel187)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel201)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel184)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel99)))
                .addGap(0, 120, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(btnApproveMoreMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(txtIntBadDebt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel198)
                            .addComponent(jLabel187)
                            .addComponent(txtIntTurnover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel201)
                            .addComponent(jLabel184)
                            .addComponent(txtIntNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54)
                            .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)
                            .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(20, 20, 20))))
        );

        jTabbedPane3.addTab("รายละเอียดสัญญา", jPanel26);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));

        jPanel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel50.setOpaque(false);

        txtLoanCustName.setEditable(false);
        txtLoanCustName.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel190.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel190.setText("นามสกุล");

        jLabel193.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel193.setText("ชื่อ");

        txtLoanCustCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtLoanCustCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoanCustCodeKeyPressed(evt);
            }
        });

        jLabel194.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel194.setText("รหัสผู้ค้ำประกัน");

        txtLoanCustSurname.setEditable(false);
        txtLoanCustSurname.setBackground(new java.awt.Color(255, 255, 204));
        txtLoanCustSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanCustSurname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveGuarantor.setText("บันทึกข้อมูลผู้ค้ำ");
        btnSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveGuarantorActionPerformed(evt);
            }
        });
        btnSaveGuarantor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveGuarantorKeyPressed(evt);
            }
        });

        btnCancelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveGuarantor.setText("ยกเลิกรายการ");
        btnCancelSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSaveGuarantorActionPerformed(evt);
            }
        });

        btnChooseGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnChooseGuarantor.setText("...");
        btnChooseGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseGuarantorActionPerformed(evt);
            }
        });

        btnDelSaveGuarantor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelSaveGuarantor.setText("ลบรายการ");
        btnDelSaveGuarantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelSaveGuarantorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoanCustCode)
                    .addComponent(btnSaveGuarantor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnChooseGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel193)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel190)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(btnCancelSaveGuarantor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelSaveGuarantor)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel194)
                    .addComponent(txtLoanCustCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel193)
                    .addComponent(txtLoanCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel190)
                    .addComponent(txtLoanCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelSaveGuarantor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tbGuarantor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "รหัสบัตร", "ชื่อ", "นามสกุล", "ความสัมพันธ์"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGuarantor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(tbGuarantor);
        if (tbGuarantor.getColumnModel().getColumnCount() > 0) {
            tbGuarantor.getColumnModel().getColumn(1).setPreferredWidth(135);
            tbGuarantor.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbGuarantor.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jLabel196.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel196.setText("โฉนดที่ดิน");

        txtAssetGaruntee1.setColumns(20);
        txtAssetGaruntee1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAssetGaruntee1.setRows(5);
        jScrollPane7.setViewportView(txtAssetGaruntee1);

        btnAssetGaruntee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAssetGaruntee.setText("บันทึกข้อมูล");
        btnAssetGaruntee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssetGarunteeActionPerformed(evt);
            }
        });

        txtImg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel197.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel197.setText("เอกสารรูปภาพ");

        btn4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn4.setText("เลือกภาพ");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn5.setText("เลือกภาพ");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        txtImg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtImg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btn6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn6.setText("เลือกภาพ");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton30.setText("ยกเลิกข้อมูล");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel196)
                    .addComponent(jLabel197)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn4)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssetGaruntee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel196)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(btnAssetGaruntee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel197)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("บุคคลค้ำประกัน", jPanel44);

        btnSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSaveLoanAccountRegister.setText("บันทึกข้อมูลสัญญากู้เงิน");
        btnSaveLoanAccountRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLoanAccountRegisterActionPerformed(evt);
            }
        });
        btnSaveLoanAccountRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveLoanAccountRegisterKeyPressed(evt);
            }
        });

        btnCancelSaveLoanAccountRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelSaveLoanAccountRegister.setText("ยกเลิกรายการ");
        btnCancelSaveLoanAccountRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSaveLoanAccountRegisterActionPerformed(evt);
            }
        });

        btnPrintLoanPaper.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintLoanPaper.setText("พิมพ์สัญญาเงินกู้");
        btnPrintLoanPaper.setEnabled(false);
        btnPrintLoanPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintLoanPaperActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelSaveLoanAccountRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane3)
            .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelSaveLoanAccountRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintLoanPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("<html><font bgcolor=red color=white>เปิดบัญชีเงินกู้</font></html>", jPanel20);

        jTabbedPane7.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabbedPane7.setRequestFocusEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPaymentDate.setEditable(false);
        txtPaymentDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPaymentDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPaymentDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentDateFocusGained(evt);
            }
        });
        txtPaymentDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentDateKeyPressed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel65.setText("ชำระ");

        jLabel151.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel151.setText("วันที่กู้");

        txtPaymentPerMonth.setEditable(false);
        txtPaymentPerMonth.setBackground(new java.awt.Color(255, 255, 204));
        txtPaymentPerMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPaymentPerMonth.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentPerMonth.setText("0.00");
        txtPaymentPerMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentPerMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentPerMonthFocusGained(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setText("ค่าปรับ");

        txtPaymentFee.setEditable(false);
        txtPaymentFee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPaymentFee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentFee.setText("0.00");
        txtPaymentFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentFee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentFeeFocusGained(evt);
            }
        });
        txtPaymentFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentFeeKeyPressed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("รับชำระ");

        txtPaymentAmountCash.setEditable(false);
        txtPaymentAmountCash.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPaymentAmountCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPaymentAmountCash.setText("0.00");
        txtPaymentAmountCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPaymentAmountCash.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaymentAmountCashFocusGained(evt);
            }
        });
        txtPaymentAmountCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentAmountCashKeyPressed(evt);
            }
        });

        btnConfirmPayment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirmPayment.setText("ยืนยันการรับชำระ");
        btnConfirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmPaymentActionPerformed(evt);
            }
        });
        btnConfirmPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmPaymentKeyPressed(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel89.setText("กันหนี้สูญ");

        txtIntLost.setEditable(false);
        txtIntLost.setBackground(new java.awt.Color(255, 255, 204));
        txtIntLost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIntLost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIntLost.setText("0.00");
        txtIntLost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel92.setText("ค่าดำเนินการ");

        txtArIntMgr.setEditable(false);
        txtArIntMgr.setBackground(new java.awt.Color(255, 255, 204));
        txtArIntMgr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArIntMgr.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArIntMgr.setText("0.00");
        txtArIntMgr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel100.setText("ดอกเบี้ยกู้");

        txtArLoanInt.setEditable(false);
        txtArLoanInt.setBackground(new java.awt.Color(255, 255, 204));
        txtArLoanInt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArLoanInt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArLoanInt.setText("0.00");
        txtArLoanInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton20.setText("...");
        jButton20.setEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        btnCancelPayment.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelPayment.setText("ยกเลิกรายการ");
        btnCancelPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPaymentActionPerformed(evt);
            }
        });

        jLabel155.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel155.setText("วันที่ชำระ");

        txtLoanStartDate.setEditable(false);
        txtLoanStartDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanStartDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLoanStartDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel155))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel34Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtPaymentFee)
                    .addComponent(txtIntLost)
                    .addComponent(txtArIntMgr)
                    .addComponent(txtPaymentPerMonth)
                    .addComponent(btnCancelPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaymentDate)
                            .addComponent(txtLoanStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtArLoanInt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(txtPaymentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel75))
                    .addComponent(txtPaymentFee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIntLost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel89)))
                .addGap(7, 7, 7)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArIntMgr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtArLoanInt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtPaymentPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPaymentAmountCash, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel69)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("ตารางรับชำระ");

        tbArGroup2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArGroup2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่ปรับดอก", "ค่าปรับ", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ยกู้", "เงินต้น", "ชำระรวม", "ชำระแล้ว", "คงเหลือ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArGroup2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane8.setViewportView(tbArGroup2);
        if (tbArGroup2.getColumnModel().getColumnCount() > 0) {
            tbArGroup2.getColumnModel().getColumn(0).setPreferredWidth(115);
            tbArGroup2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("ยอดหนี้คงเหลือ/ปิดบัญชี");

        txtArTotalBalance.setEditable(false);
        txtArTotalBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArTotalBalance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArTotalBalance.setText("0.00");
        txtArTotalBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel43.setText("ยอดหนี้เต็มจำนวน");

        txtArNetAmt.setEditable(false);
        txtArNetAmt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtArNetAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtArNetAmt.setText("0.00");
        txtArNetAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addContainerGap(678, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArNetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(txtArTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(txtArNetAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("รายละเอียดการรับชำระ", jPanel45);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane7.addTab("รับชำระเงินกู้", jPanel4);

        tbHistoryPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "วันที่", "เลขที่บัญชี", "สำรองหนี้สูญ", "ค่าจัดการ", "ดอกเบี้ย", "ค่าปรับ", "รวมรับชำระ", "คงหลือ", "พนักงาน", "สาขา"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbHistoryPayment);
        if (tbHistoryPayment.getColumnModel().getColumnCount() > 0) {
            tbHistoryPayment.getColumnModel().getColumn(1).setPreferredWidth(120);
        }

        jButton15.setBackground(new java.awt.Color(255, 51, 51));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setText("กลับหน้าหลัก");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("ประวัติการรับชำระ", jPanel13);

        jPanel54.setBackground(new java.awt.Color(255, 204, 204));

        lblPaymentLoanTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPaymentLoanTitle.setText("รับชำระเงินกู้");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPaymentLoanTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane7)
            .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane7)
                .addContainerGap())
        );

        jTabbedPane1.addTab("<html><font bgcolor=red color=white>กู้เงิน/รับชำระ</font></html>", jPanel17);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel177.setText("รหัสสมาชิก");

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel178.setText("ชื่อ-สกุล");

        txtProfileCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtProfileCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProfileCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfileCodeKeyReleased(evt);
            }
        });

        txtProfileName.setEditable(false);
        txtProfileName.setBackground(new java.awt.Color(255, 255, 204));
        txtProfileName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProfileName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfileName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel186.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel186.setText("สมุดบัญชี");

        txtAccCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtAccCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccCodeKeyPressed(evt);
            }
        });

        lbPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png"))); // NOI18N
        lbPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel183.setText("ประเภทบัญชี");

        txtAccTypeName.setEditable(false);
        txtAccTypeName.setBackground(new java.awt.Color(255, 255, 204));
        txtAccTypeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccTypeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccTypeName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtLimitLoanAmt.setEditable(false);
        txtLimitLoanAmt.setBackground(new java.awt.Color(255, 255, 204));
        txtLimitLoanAmt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLimitLoanAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLimitLoanAmt.setText("0.00");
        txtLimitLoanAmt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel176.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel176.setText("หุ้น");

        jLabel174.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel174.setText("บาท");

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel157.setText("เงินฝาก");

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel162.setText("วันที่ลงทะเบียน");

        jLabel163.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel163.setText("บาท");

        txtTotalValue.setEditable(false);
        txtTotalValue.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValue.setText("0.00");
        txtTotalValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel161.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel161.setText("หนี้ค้างชำระ");

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel158.setText("หุ้น");

        jLabel173.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel173.setText("บาท");

        txtTotalSave.setEditable(false);
        txtTotalSave.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalSave.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalSave.setText("0.00");
        txtTotalSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtARProduct.setEditable(false);
        txtARProduct.setBackground(new java.awt.Color(255, 255, 204));
        txtARProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtARProduct.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtARProduct.setText("0.00");
        txtARProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtStartAcc.setEditable(false);
        txtStartAcc.setBackground(new java.awt.Color(255, 255, 204));
        txtStartAcc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStartAcc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel166.setText("วงเงินกู้");

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel159.setText("จำนวนบัญชี");

        txtTotalAccount.setEditable(false);
        txtTotalAccount.setBackground(new java.awt.Color(255, 255, 204));
        txtTotalAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalAccount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalAccount.setText("0");
        txtTotalAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel164.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel164.setText("บัญชี");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel166)
                    .addComponent(jLabel161)
                    .addComponent(jLabel158)
                    .addComponent(jLabel162)
                    .addComponent(jLabel157)
                    .addComponent(jLabel159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(txtARProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel173))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel174))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalSave)
                            .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAccount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163)
                            .addComponent(jLabel176)
                            .addComponent(jLabel164)))
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel162))
                .addGap(7, 7, 7)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel157)
                    .addComponent(jLabel163))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel159)
                    .addComponent(jLabel164))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel158)
                    .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtARProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel173)
                    .addComponent(jLabel161))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel166)
                    .addComponent(txtLimitLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("ลำดับที่");

        txtIndexNo.setEditable(false);
        txtIndexNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIndexNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIndexNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel177)
                            .addComponent(jLabel178)
                            .addComponent(jLabel186)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccCode)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIndexNo)))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel183)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addComponent(lbPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel64)
                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel177)
                    .addComponent(txtProfileCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel178)
                    .addComponent(txtProfileName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel183))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        btnRegister.setBackground(new java.awt.Color(0, 102, 0));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("ลงทะเบียน");
        btnRegister.setRequestFocusEnabled(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel12.add(btnRegister);

        btnEdit.setBackground(new java.awt.Color(0, 102, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("แก้ไขข้อมูล");
        btnEdit.setRequestFocusEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel12.add(btnEdit);

        btnFind.setBackground(new java.awt.Color(0, 102, 0));
        btnFind.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("ค้นหาข้อมูล");
        btnFind.setRequestFocusEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel12.add(btnFind);

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("บริษัทสยามคอนวีเนียน จำกัด เลขที่ 9/39 หมู่3 ซอยวัดศรีประวัติ ถ.จงกลถนอม ต.ศาลากลาง อ.บางกรวย จ.นนทบุรี 11130");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("โทร. 0-2497-8608, 096-989-4159 แฟกซ์. 0-2497-8608");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("รหัสพนักงาน");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel85.setText("ชื่อพนักงาน");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setText("จำนวนสมาชิก");

        txtBranchName.setEditable(false);
        txtBranchName.setBackground(new java.awt.Color(255, 255, 204));
        txtBranchName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBranchName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBranchName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel86.setText("สถาบัน");

        txtShowEmpName.setEditable(false);
        txtShowEmpName.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtShowEmpCode.setEditable(false);
        txtShowEmpCode.setBackground(new java.awt.Color(255, 255, 204));
        txtShowEmpCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowEmpCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtShowEmpCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtMemQty.setEditable(false);
        txtMemQty.setBackground(new java.awt.Color(255, 255, 204));
        txtMemQty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMemQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemQty.setText("0");
        txtMemQty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.GridLayout(1, 0));

        btnTimeShow.setBackground(new java.awt.Color(255, 255, 255));
        btnTimeShow.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        btnTimeShow.setForeground(new java.awt.Color(0, 0, 255));
        btnTimeShow.setText("00:00:00");
        jPanel43.add(btnTimeShow);

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShowEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel41)
                            .addComponent(txtShowEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85)
                            .addComponent(txtShowEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(txtBranchName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMemQty, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );

        jMenu1.setText("เมนูหลัก");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnConfigSystem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnConfigSystem.setText("การตั้งค่าระบบ");
        mnConfigSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConfigSystemActionPerformed(evt);
            }
        });
        jMenu1.add(mnConfigSystem);

        mnSetupConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSetupConfig.setText("ตั้งข้อมูลบัญชี/ลูกหนี้/หุ้น");
        mnSetupConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSetupConfigActionPerformed(evt);
            }
        });
        jMenu1.add(mnSetupConfig);
        jMenu1.add(jSeparator3);

        mnExit.setBackground(new java.awt.Color(204, 0, 0));
        mnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnExit.setText("ออกจากระบบ (Exit)");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnExit);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("แฟ้มข้อมูล");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMember.setText("แฟ้มข้อมูลสมาชิก");
        mnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMemberActionPerformed(evt);
            }
        });
        jMenu6.add(mnMember);

        mnMemberType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnMemberType.setText("แฟ้มข้อมูลประเภทสมาชิก");
        mnMemberType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMemberTypeActionPerformed(evt);
            }
        });
        jMenu6.add(mnMemberType);

        mnExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnExpense.setText("แฟ้มข้อมูลค่าใช้จ่าย");
        mnExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExpenseActionPerformed(evt);
            }
        });
        jMenu6.add(mnExpense);

        mnProject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnProject.setText("แฟ้มข้อมูลโครงการ");
        mnProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProjectActionPerformed(evt);
            }
        });
        jMenu6.add(mnProject);
        jMenu6.add(jSeparator1);

        mnPrefix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrefix.setText("แฟ้มข้อมูลคำนำหน้า");
        mnPrefix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPrefixActionPerformed(evt);
            }
        });
        jMenu6.add(mnPrefix);

        mnStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnStatus.setText("แฟ้มข้อมูลสถานะ");
        mnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStatusActionPerformed(evt);
            }
        });
        jMenu6.add(mnStatus);
        jMenu6.add(jSeparator8);

        mnFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnFee.setText("แฟ้มข้อมูลค่าธรรมเนียม");
        mnFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFeeActionPerformed(evt);
            }
        });
        jMenu6.add(mnFee);

        jMenuBar1.add(jMenu6);

        jMenu13.setText("บัญชีใช้งาน");
        jMenu13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveAccount.setText("บัญชีเงินฝาก");
        mnSaveAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveAccountActionPerformed(evt);
            }
        });
        jMenu13.add(mnSaveAccount);

        mnLoanAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoanAccount.setText("บัญชีเงินกู้");
        mnLoanAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoanAccountActionPerformed(evt);
            }
        });
        jMenu13.add(mnLoanAccount);

        mnLoadExcel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnLoadExcel.setText("บันทึกข้อมูลเงินกู้จาก Excel");
        mnLoadExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLoadExcelActionPerformed(evt);
            }
        });
        jMenu13.add(mnLoadExcel);

        jMenuBar1.add(jMenu13);

        jMenu2.setText("การดำเนินการ");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnSaveExpense.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveExpense.setText("บันทึกค่าใช้จ่าย");
        mnSaveExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveExpenseActionPerformed(evt);
            }
        });
        jMenu2.add(mnSaveExpense);
        jMenu2.add(jSeparator9);

        mnCloseDialoyDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCloseDialoyDay.setText("รายการปิดสิ้นวัน");
        mnCloseDialoyDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCloseDialoyDayActionPerformed(evt);
            }
        });
        jMenu2.add(mnCloseDialoyDay);
        jMenu2.add(jSeparator13);

        mnPrintHistorySave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnPrintHistorySave.setText("พิมพ์รายการฝากถอนย้อนหลัง");
        mnPrintHistorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPrintHistorySaveActionPerformed(evt);
            }
        });
        jMenu2.add(mnPrintHistorySave);

        mnSaveHistoryLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnSaveHistoryLoan.setText("พิมพ์รายการเงินกู้ย้อนหลัง");
        mnSaveHistoryLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveHistoryLoanActionPerformed(evt);
            }
        });
        jMenu2.add(mnSaveHistoryLoan);
        jMenu2.add(jSeparator12);

        mnCancelOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnCancelOpenAccount.setText("ยกเลิกการเปิดบัญชี");
        mnCancelOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCancelOpenAccountActionPerformed(evt);
            }
        });
        jMenu2.add(mnCancelOpenAccount);
        jMenu2.add(jSeparator4);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("สรุปรายวันเงินสด");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setText("สรุปรายวันทั่วไป");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("รายงาน");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnRptMember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptMember.setText("รายงานทะเบียนสมาชิก");
        mnRptMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptMemberActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptMember);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("รายงานสรุปการดำเนินงาน");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator10);

        mnRptOpenAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptOpenAccount.setText("รายงานการเปิดบัญชี");
        mnRptOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptOpenAccountActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptOpenAccount);

        mnRptCloseAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptCloseAccount.setText("รายงานการปิดบัญชี");
        mnRptCloseAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptCloseAccountActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptCloseAccount);

        jMenu5.setText("รายงานเงินฝาก/ถอน");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setText("รายงานความเคลื่อนไหวเงินฝาก/ถอน");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setText("แสดงรายละเอียด การจ่ายดอกเบี้ยเงินฝาก");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenu3.add(jMenu5);

        mnMainRptHoon.setText("รายงานหุ้น");
        mnMainRptHoon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem7.setText("รายงานความเคลื่อนไหวหุ้น");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnMainRptHoon.add(jMenuItem7);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setText("การปันผลหุ้น");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        mnMainRptHoon.add(jMenuItem5);

        jMenu3.add(mnMainRptHoon);

        mnMainRptLoan.setText("รายงานเงินกู้");
        mnMainRptLoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItem43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem43.setText("รายงานการกู้เงิน");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem43);

        jMenuItem44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem44.setText("รายงานการรับชำระ");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem44);
        mnMainRptLoan.add(jSeparator11);

        jMenuItem45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem45.setText("รายงานลูกหนี้ค้างชำระ/เกินกำหนด");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem45);

        jMenuItem46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem46.setText("รายงานค่าปรับ");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        mnMainRptLoan.add(jMenuItem46);

        jMenu3.add(mnMainRptLoan);

        mnRptFee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptFee.setText("รายงานค่าธรรมเนียมต่าง ๆ");
        mnRptFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptFeeActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptFee);
        jMenu3.add(jSeparator2);

        mnRptProfitCompany.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptProfitCompany.setText("รายงานผลประกอบการ");
        mnRptProfitCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptProfitCompanyActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptProfitCompany);

        mnRptCheckAudit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptCheckAudit.setText("รายงานความเคลื่อนไหวรายบุคคล");
        mnRptCheckAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptCheckAuditActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptCheckAudit);
        jMenu3.add(jSeparator14);

        mnRptTransaction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mnRptTransaction.setText("รายงานสรุปความเคลื่อนไหว");
        mnRptTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRptTransactionActionPerformed(evt);
            }
        });
        jMenu3.add(mnRptTransaction);

        jMenuItem8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem8.setText("หนังสือแจ้งเงินกู้และค่าหุ้น");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setText("รายละเอียดสมาชิกทุกรายการ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("ช่วยเหลือ (Help)");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setText("สำรองข้อมูล");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem38.setText("Reset Data");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem38);

        jMenuItem47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem47.setText("อัพเดตความเคลื่อนไหว");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem47);
        jMenu4.add(jSeparator7);

        jMenuItem37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem37.setText("อัพเดตโปรแกรม");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem37);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        btnRegister();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtProfileCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfileCodeKeyReleased
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_F1:
                SavingDialog reg = new SavingDialog(null, true, true);
                reg.setVisible(true);
                break;
            case KeyEvent.VK_F2:
                btnFind();
                break;
            case KeyEvent.VK_F3:
                btnEdit();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_txtProfileCodeKeyReleased

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        btnFind();
    }//GEN-LAST:event_btnFindActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        exitConfirm();
    }//GEN-LAST:event_formWindowClosing

    private void txtProfileCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfileCodeKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                if (StringUtil.isEmpty(txtProfileCode.getText())) {
                    exitConfirm();
                } else {
                    clearProfile();
                }
                break;
            case KeyEvent.VK_ENTER:
                if (StringUtil.isNotNullString(txtProfileCode.getText())) {
                    ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
                    if (pBean != null) {
                        jTabbedPane8.setSelectedIndex(0);
                        Value.CUST_CODE = txtProfileCode.getText();

                        showAccountQty();

                        jTabbedPane1.setEnabledAt(1, true);
                        jTabbedPane1.setEnabledAt(2, true);
                        jTabbedPane1.setEnabledAt(3, true);
                        jTabbedPane1.setEnabledAt(4, true);

                        enterAccount();
                    } else {
                        JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลลูกค้าในระบบ กรุณาตรวจสอบ");
                        txtProfileCode.selectAll();
                        txtProfileCode.requestFocus();
                    }
                }
                break;
            case KeyEvent.VK_F1:
                btnFind();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_txtProfileCodeKeyPressed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnEdit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtAccCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtAccCode.getText())) {
                CbSaveAccountBean sBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
                if (sBean != null) {
                    txtProfileCode.setText(sBean.getB_CUST_CODE());
                    findCustomer();
                    showAccount();

                    //เข้าหน้าจอ dashboard ก่อน
                    Value.CUST_ACCOUNT_CODE = txtAccCode.getText();
                    showListSelect(Value.CUST_ACCOUNT_CODE, "1");
                } else {
                    findCustomer();
                    CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
                    if (lBean != null) {
                        txtProfileCode.setText(lBean.getCust_code());
                        loadLoan();
                        loadLoanDetail();

                        //เข้าหน้าจอ dashboard ก่อน
                        Value.CUST_LOAN_CODE = txtAccCode.getText();
                        showListSelect(Value.CUST_LOAN_CODE, "2");
                    }
                }
            } else {
                txtAccCode.requestFocus();
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if ("".equals(txtAccCode.getText())) {
                exitConfirm();
            }
        }
    }//GEN-LAST:event_txtAccCodeKeyPressed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 4) {
            LoanCustID.requestFocus();
            ProfileBean pBean = getProfileControl().listCbProfile(LoanCustID.getText());
            if (pBean != null) {
                LoanCustID.setText(pBean.getP_custCode());
                txtLoanName.setText(pBean.getP_custName() + " " + pBean.getP_custSurname());
                txtLoanAge.setText("" + pBean.getP_custAge());
                txtLoanCardExpire.setText(DateFormat.getLocale_ddMMyyyy(pBean.getCard_Expire()));
                txtLoanBirthDate.setText(DateFormat.getLocale_ddMMyyyy(pBean.getP_custBirthDay()));
                switch (pBean.getP_custSex()) {
                    case "M":
                        txtLoanSex.setText("ผู้ชาย");
                        break;
                    case "F":
                        txtLoanSex.setText("ผู้หญิง");
                        break;
                    default:
                        txtLoanSex.setText("อื่นๆ");
                        break;
                }
                txtLoanOccu.setText(pBean.getP_custOccupation());
                txtLoanRegMember.setText(DateFormat.getLocale_ddMMyyyy(pBean.getP_member_start()));

                loadAddressLoan();
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txtTotalSellHoonAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountKeyReleased
        double price = NumberUtil.toDouble(txtPriceValue.getText());
        double total = NumberUtil.toDouble(txtTotalSellHoonAmount.getText());
        total *= price;
        txtTotalAmount.setText(NumberFormat.showDouble2(total));
    }//GEN-LAST:event_txtTotalSellHoonAmountKeyReleased

    private void txtTotalSellHoonAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountFocusGained
        txtDocNo.setText("");
        initHoonWithdraw();
        txtTotalSellHoonAmount.selectAll();
    }//GEN-LAST:event_txtTotalSellHoonAmountFocusGained

    private void btnChooseDateSellHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDateSellHoonActionPerformed
        Point point = txtDateSell.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(this, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDateSell.setText(dcd.getDateString());
            txtDateSell.requestFocus();
        }
    }//GEN-LAST:event_btnChooseDateSellHoonActionPerformed

    private void txtCashPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashPayKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveByHoon.requestFocus();
        }
    }//GEN-LAST:event_txtCashPayKeyPressed

    private void txtCashPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashPayFocusGained
        txtCashPay.selectAll();
    }//GEN-LAST:event_txtCashPayFocusGained

    private void txtHoonQTYKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonQTYKeyReleased
        double total;
        double a = 0.00;
        double b = 0.00;
        if (!"".equals(txtHoonQTY.getText().trim())) {
            a = NumberUtil.toDouble(txtHoonQTY.getText());
        }
        if (!"".equals(txtValueBaht.getText().trim())) {
            b = NumberUtil.toDouble(txtValueBaht.getText());
        }

        total = a * b;
        txtAmount.setText(NumberFormat.showDouble2(total));
    }//GEN-LAST:event_txtHoonQTYKeyReleased

    private void txtHoonQTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoonQTYKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCashPay.requestFocus();
        }
    }//GEN-LAST:event_txtHoonQTYKeyPressed

    private void txtHoonQTYFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoonQTYFocusGained
        txtDocNo1.setText("");
        initHoon();
        txtHoonQTY.selectAll();
    }//GEN-LAST:event_txtHoonQTYFocusGained

    private void txtWithdrawalBahtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtKeyReleased
        if (txtWithdrawalBaht.getText().trim().length() != 0) {
            MoneyToWord c = new MoneyToWord(NumberUtil.toDouble(txtWithdrawalBaht.getText()));
            lbMoneyText1.setText("(" + c.toString() + ")");
        } else {
            lbMoneyText1.setText("(...)");
        }
    }//GEN-LAST:event_txtWithdrawalBahtKeyReleased

    private void txtWithdrawalBahtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtFocusGained
        showDocAuto3();
        txtWithdrawalBaht.selectAll();
    }//GEN-LAST:event_txtWithdrawalBahtFocusGained

    private void txtDepositBahtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepositBahtFocusGained
        showDocAuto2();
        txtDepositBaht.selectAll();
    }//GEN-LAST:event_txtDepositBahtFocusGained

    private void btnPrintSliplOpenAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintSliplOpenAccActionPerformed
        if (cbAccType.getItemCount() > 0) {
            PrintCOM pc = new PrintCOM();
            pc.printFeeOpen(txtProfileCode.getText(), txtSaveFee.getText());
        }
    }//GEN-LAST:event_btnPrintSliplOpenAccActionPerformed

    private void btnSaveAccOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAccOpenActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการเปิดบัญชีเงินฝากใช่หรือไม่ ?");
        if (confirm == JOptionPane.YES_OPTION) {
            saveOpenSave();
        }
    }//GEN-LAST:event_btnSaveAccOpenActionPerformed

    private void btnWithdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawMoneyActionPerformed
        btnWithdrawMoney();
    }//GEN-LAST:event_btnWithdrawMoneyActionPerformed

    private void btnCancelWithdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelWithdrawMoneyActionPerformed
        clearWithdraw();
        btnRegister();
    }//GEN-LAST:event_btnCancelWithdrawMoneyActionPerformed

    private void btnSaveMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMoneyActionPerformed
        saveAccountAct();
    }//GEN-LAST:event_btnSaveMoneyActionPerformed

    private void btnCancelOpenAcc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOpenAcc4ActionPerformed
        resetDepositMoney();
    }//GEN-LAST:event_btnCancelOpenAcc4ActionPerformed

    private void txtDepCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDepositBaht.requestFocus();
        }
    }//GEN-LAST:event_txtDepCodeKeyPressed

    private void txtRemark1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemark1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveMoney.requestFocus();
        }
    }//GEN-LAST:event_txtRemark1KeyPressed

    private void txtDepositBahtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepositBahtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRemark1.requestFocus();
        }
    }//GEN-LAST:event_txtDepositBahtKeyPressed

    private void txtDepositBahtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepositBahtKeyReleased
        if (txtDepositBaht.getText().trim().length() != 0) {
            double d = NumberUtil.toDouble(txtDepositBaht.getText());
            MoneyToWord c = new MoneyToWord(d);
            lbMoneyText.setText("(" + c.toString() + ")");
        } else {
            lbMoneyText.setText("(...)");
        }
    }//GEN-LAST:event_txtDepositBahtKeyReleased

    private void txtWithdrawalCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtWithdrawalBaht.requestFocus();
        }
    }//GEN-LAST:event_txtWithdrawalCodeKeyPressed

    private void txtWithdrawalBahtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWithdrawalBahtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRemark2.requestFocus();
        }
    }//GEN-LAST:event_txtWithdrawalBahtKeyPressed

    private void txtRemark2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemark2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnWithdrawMoney.requestFocus();
        }
    }//GEN-LAST:event_txtRemark2KeyPressed

    private void txtLoanDateStartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDateStartKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            computeFinishPay();
            computeBahtPerMonth();

            txtPayPerMonth.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDateStartKeyPressed

    private void btnCancelBuyHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelBuyHoonActionPerformed
        resetBuyHoon();
        btnRegister();
    }//GEN-LAST:event_btnCancelBuyHoonActionPerformed

    private void btnSaveByHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveByHoonActionPerformed
        btnSaveHoon();
    }//GEN-LAST:event_btnSaveByHoonActionPerformed

    private void btnSellHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellHoonActionPerformed
        btnSellHoon();
    }//GEN-LAST:event_btnSellHoonActionPerformed

    private void btnCancelSellHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSellHoonActionPerformed
        resetSaleHoon();
        btnRegister();
    }//GEN-LAST:event_btnCancelSellHoonActionPerformed

    private void txtSaveFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaveFeeFocusGained
        txtSaveFee.selectAll();
    }//GEN-LAST:event_txtSaveFeeFocusGained

    private void txtSaveFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaveFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveAccOpen.requestFocus();
        }
    }//GEN-LAST:event_txtSaveFeeKeyPressed

    private void chkSelectAllSellHoonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkSelectAllSellHoonItemStateChanged
        if (chkSelectAllSellHoon.isSelected()) {
            txtTotalSellHoonAmount.setText(txtTotalValue.getText());
            txtTotalSellHoonAmount.requestFocus();
        } else {
            txtTotalSellHoonAmount.requestFocus();
        }
    }//GEN-LAST:event_chkSelectAllSellHoonItemStateChanged

    private void btnSaveLoanAccountRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLoanAccountRegisterActionPerformed
        btnSaveLoanAccountRegister();
    }//GEN-LAST:event_btnSaveLoanAccountRegisterActionPerformed

    private void txtLoanDateEndKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDateEndKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister.requestFocus();
        }
    }//GEN-LAST:event_txtLoanDateEndKeyPressed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        HoonProfitDialog hp = new HoonProfitDialog(this, true);
        hp.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        exitConfirm();
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnConfigSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConfigSystemActionPerformed
        ConfigDialog cd = new ConfigDialog(this, true);
        cd.setVisible(true);
    }//GEN-LAST:event_mnConfigSystemActionPerformed

    private void mnRptProfitCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptProfitCompanyActionPerformed
        SummaryReportDialog sr = new SummaryReportDialog(this, true);
        sr.setVisible(true);
    }//GEN-LAST:event_mnRptProfitCompanyActionPerformed

    private void mnSetupConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSetupConfigActionPerformed
        ConfigDialog2 cd = new ConfigDialog2(this, true);
        cd.setVisible(true);

        clearProfile();
        clearOpenAccount();
    }//GEN-LAST:event_mnSetupConfigActionPerformed

    private void txtLoanDateEndFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanDateEndFocusGained
        txtLoanDateEnd.selectAll();
    }//GEN-LAST:event_txtLoanDateEndFocusGained

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        HoonReportAllDialog s = new HoonReportAllDialog(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void cbHoonTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHoonTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            if (cbHoonType.getItemCount() > 0) {
                initHoon();
            }
        }
    }//GEN-LAST:event_cbHoonTypeItemStateChanged

    private void mnExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExpenseActionPerformed
        ExpendDialog exp = new ExpendDialog(this, true);
        exp.setVisible(true);
    }//GEN-LAST:event_mnExpenseActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        dumpDB();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jTabbedPane8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane8MouseClicked
        int tabSelected = jTabbedPane8.getSelectedIndex();
        if (tabSelected != -1) {
            switch (tabSelected) {
                case 0:
                    txtDepositBaht.requestFocus();
                    break;
                case 1:
                    txtWithdrawalBaht.requestFocus();
                    break;
                case 2:
                    txtCloseRemark.requestFocus();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jTabbedPane8MouseClicked

    private void jTabbedPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane5MouseClicked
        int rowSelected = jTabbedPane5.getSelectedIndex();
        if (rowSelected != -1) {
            switch (rowSelected) {
                case 0:
                    txtHoonQTY.requestFocus();
                    break;
                case 1:
                    txtTotalSellHoonAmount.requestFocus();
                    break;
                case 2:
                    txtTotaTransferHoonAmt.requestFocus();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jTabbedPane5MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        int rowSelected = jTabbedPane1.getSelectedIndex();
        if (rowSelected != -1) {
            switch (rowSelected) {
                case 0:
                    if (jTabbedPane7.getSelectedIndex() == 1) {
                        txtDepositBaht.requestFocus();
                    } else if (jTabbedPane7.getSelectedIndex() == 0) {
                        txtLoanFee.requestFocus();
                    }
                    break;
                case 1:
                    txtHoonQTY.requestFocus();
                    break;
                case 2:
                    ArrayList<CbLoanAccountBean> listBean = getLoanAccountControl().listLoanAccountCust(txtProfileCode.getText());
                    if (listBean.size() > 0) {
                        enableComponents(jPanel22, false);
                    }
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cbAccTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAccTypeItemStateChanged
        if (evt.getStateChange() == 1) {
            if (cbAccType.getItemCount() > 0) {
                showDocAuto1();
            }
        }
    }//GEN-LAST:event_cbAccTypeItemStateChanged

    private void txtTotalSellHoonAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalSellHoonAmountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSellHoon.requestFocus();
        }
    }//GEN-LAST:event_txtTotalSellHoonAmountKeyPressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        HoonInvestDialog hpd = new HoonInvestDialog(this, true);
        hpd.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void mnCloseDialoyDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCloseDialoyDayActionPerformed
        SummaryReportCloseDay report = new SummaryReportCloseDay(this, true);
        report.setVisible(true);
    }//GEN-LAST:event_mnCloseDialoyDayActionPerformed

    private void mnSaveExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveExpenseActionPerformed
        ExpendFormDialog ed = new ExpendFormDialog(this, true);
        ed.setVisible(true);
    }//GEN-LAST:event_mnSaveExpenseActionPerformed

    private void mnProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProjectActionPerformed
        ProjectDialog pj = new ProjectDialog(this, true);
        pj.setVisible(true);
    }//GEN-LAST:event_mnProjectActionPerformed

    private void mnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMemberActionPerformed
        CustomerMasterDialog cm = new CustomerMasterDialog(this, true);
        cm.setVisible(true);
    }//GEN-LAST:event_mnMemberActionPerformed

    private void mnMemberTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMemberTypeActionPerformed
        MemberTypeDialog mt = new MemberTypeDialog(this, true);
        mt.setVisible(true);
    }//GEN-LAST:event_mnMemberTypeActionPerformed

    private void mnPrefixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPrefixActionPerformed
        PrefixDialog prefix = new PrefixDialog(this, true);
        prefix.setVisible(true);
    }//GEN-LAST:event_mnPrefixActionPerformed

    private void txtLoanFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanFeeFocusGained
        txtLoanFee.selectAll();
    }//GEN-LAST:event_txtLoanFeeFocusGained

    private void txtLoanFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanPerMonth.requestFocus();
        }
    }//GEN-LAST:event_txtLoanFeeKeyPressed

    private void mnRptOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptOpenAccountActionPerformed
        OpenAccountReport report = new OpenAccountReport(this, true);
        report.setVisible(true);
    }//GEN-LAST:event_mnRptOpenAccountActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Point point = txtLoanDateStart.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(this, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtLoanDateStart.setText(dcd.getDateString());
            computeFinishPay();

            computeBahtPerMonth();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void btnCancelSaveLoanAccountRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSaveLoanAccountRegisterActionPerformed
        clearFormLoan();
        btnRegister();
    }//GEN-LAST:event_btnCancelSaveLoanAccountRegisterActionPerformed

    private void mnRptFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptFeeActionPerformed
        FeeReportDialog feeDialog = new FeeReportDialog(this, true);
        feeDialog.setVisible(true);
    }//GEN-LAST:event_mnRptFeeActionPerformed

    private void mnRptCloseAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptCloseAccountActionPerformed
        CloseAccountReportDialog cl = new CloseAccountReportDialog(this, true);
        cl.setVisible(true);
    }//GEN-LAST:event_mnRptCloseAccountActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        UpdateVersionDialog uv = new UpdateVersionDialog(this, true);
        uv.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        ResetDataToNewProgramDialog r = new ResetDataToNewProgramDialog(null, true);
        r.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void mnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStatusActionPerformed
        StatusMsgDialog sd = new StatusMsgDialog(this, true);
        sd.setVisible(true);
    }//GEN-LAST:event_mnStatusActionPerformed

    private void btnSaveMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveMoneyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveAccountAct();
        }
    }//GEN-LAST:event_btnSaveMoneyKeyPressed

    private void btnWithdrawMoneyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnWithdrawMoneyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnWithdrawMoney();
        }
    }//GEN-LAST:event_btnWithdrawMoneyKeyPressed

    private void mnFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFeeActionPerformed
        FeeDialog feeDialog = new FeeDialog(this, true);
        feeDialog.setVisible(true);
    }//GEN-LAST:event_mnFeeActionPerformed

    private void txtPayPerMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayPerMonthKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister.requestFocus();
        }
    }//GEN-LAST:event_txtPayPerMonthKeyPressed

    private void txtPayPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayPerMonthFocusGained
        txtPayPerMonth.selectAll();
    }//GEN-LAST:event_txtPayPerMonthFocusGained

    private void btnPrintLoanPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintLoanPaperActionPerformed
        btnPrintLoanPaper();
    }//GEN-LAST:event_btnPrintLoanPaperActionPerformed

    private void mnRptMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptMemberActionPerformed
        ProfileListDialog pd = new ProfileListDialog(this, true);
        pd.setVisible(true);
    }//GEN-LAST:event_mnRptMemberActionPerformed

    private void btnSaveByHoonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveByHoonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveHoon();
        }
    }//GEN-LAST:event_btnSaveByHoonKeyPressed

    private void btnSellHoonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSellHoonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSellHoon();
        }
    }//GEN-LAST:event_btnSellHoonKeyPressed

    private void mnRptCheckAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptCheckAuditActionPerformed
        CheckAuditDialog check = new CheckAuditDialog(this, true);
        check.setVisible(true);
    }//GEN-LAST:event_mnRptCheckAuditActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        LoanReportAllDialog s = new LoanReportAllDialog(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        LoanReportPaymentDialog s = new LoanReportPaymentDialog(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void btnApproveMoreMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveMoreMoneyActionPerformed
        AddCreditLoanDialog addDialog = new AddCreditLoanDialog(this, true);
        addDialog.setVisible(true);

        ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        txtLimitLoanAmt.setText(NumberFormat.showDouble2((int) pBean.getLoan_Credit_Balance()));
    }//GEN-LAST:event_btnApproveMoreMoneyActionPerformed

    private void btnSaveLoanAccountRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveLoanAccountRegisterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveLoanAccountRegister();
        }
    }//GEN-LAST:event_btnSaveLoanAccountRegisterKeyPressed

    private void mnPrintHistorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPrintHistorySaveActionPerformed
        PrintSavingBookDialog dialog = new PrintSavingBookDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mnPrintHistorySaveActionPerformed

    private void mnSaveHistoryLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveHistoryLoanActionPerformed
        PrintLoanBookDialog dialog = new PrintLoanBookDialog(this, true, null);
        dialog.setVisible(true);
    }//GEN-LAST:event_mnSaveHistoryLoanActionPerformed

    private void txtPaymentPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentPerMonthFocusGained
        txtPaymentPerMonth.selectAll();
    }//GEN-LAST:event_txtPaymentPerMonthFocusGained

    private void txtPaymentFeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentFeeFocusGained
        txtPaymentFee.selectAll();
    }//GEN-LAST:event_txtPaymentFeeFocusGained

    private void txtPaymentFeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentFeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPaymentAmountCash.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentFeeKeyPressed

    private void btnConfirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmPaymentActionPerformed
        paymentConfirm();
    }//GEN-LAST:event_btnConfirmPaymentActionPerformed

    private void btnConfirmPaymentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmPaymentKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            paymentConfirm();
        }
    }//GEN-LAST:event_btnConfirmPaymentKeyPressed

    private void txtPaymentAmountCashFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentAmountCashFocusGained
        computeLoanInterest();
    }//GEN-LAST:event_txtPaymentAmountCashFocusGained

    private void txtPaymentAmountCashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentAmountCashKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirmPayment.requestFocus();
        }
    }//GEN-LAST:event_txtPaymentAmountCashKeyPressed

    private void txtCloseRemarkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCloseRemarkKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCloseSaveAccount.requestFocus();
        }
    }//GEN-LAST:event_txtCloseRemarkKeyPressed

    private void btnCloseSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseSaveAccountActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการยกเลิกบัญชีนี้ใช่หรือไม่ ?");
        if (confirm == JOptionPane.YES_OPTION) {
            closeAccount();
        }
    }//GEN-LAST:event_btnCloseSaveAccountActionPerformed

    private void btnCloseSaveAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCloseSaveAccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการยกเลิกบัญชีนี้ใช่หรือไม่ ?");
            if (confirm == JOptionPane.YES_OPTION) {
                closeAccount();
            }
        }
    }//GEN-LAST:event_btnCloseSaveAccountKeyPressed

    private void txtTotaTransferHoonAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotaTransferHoonAmtFocusGained
        initHoonTransfer();
        txtTotaTransferHoonAmt.selectAll();
    }//GEN-LAST:event_txtTotaTransferHoonAmtFocusGained

    private void txtTotaTransferHoonAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotaTransferHoonAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTransferPerson.requestFocus();
        }
    }//GEN-LAST:event_txtTotaTransferHoonAmtKeyPressed

    private void txtTransferPersonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTransferPersonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtProfileCode.getText().equals(txtTransferPerson.getText())) {
                JOptionPane.showMessageDialog(this, "ไม่สามารถโอนหุ้นให้กับบุคคลเดียวกันได้ !!!");
                txtTransferPerson.setText("");
                txtTransferPerson.requestFocus();
            } else {
                txtTransferAppCode.requestFocus();
            }
        }
    }//GEN-LAST:event_txtTransferPersonKeyPressed

    private void btnChooseDateTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDateTransferActionPerformed
        Point point = txtDateTransfer.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(null, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtDateTransfer.setText(dcd.getDateString());
            txtDateTransfer.requestFocus();
        }
    }//GEN-LAST:event_btnChooseDateTransferActionPerformed

    private void btnFindPersonToTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPersonToTransferActionPerformed
        ListCustomerDialog listDialog = new ListCustomerDialog(null, true);
        listDialog.setVisible(true);

        if (listDialog.getCUST_CODE() != null) {
            txtTransferPerson.setText(listDialog.getCUST_CODE());
            txtTransferAppCode.requestFocus();
        } else {
            txtTransferPerson.setText("");
            txtTransferPerson.requestFocus();
        }
    }//GEN-LAST:event_btnFindPersonToTransferActionPerformed

    private void btnTransferHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferHoonActionPerformed
        btnTransferHoon();
    }//GEN-LAST:event_btnTransferHoonActionPerformed

    private void btnCancelTransferHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelTransferHoonActionPerformed
        clearHoonTransfer();
        btnRegister();
    }//GEN-LAST:event_btnCancelTransferHoonActionPerformed

    private void btnChooseAccToTranHoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseAccToTranHoonActionPerformed
        if (!"".equals(txtProfileCode.getText())) {
            ShowAccountDialog sa = new ShowAccountDialog(null, true, Value.CUST_CODE);
            sa.setVisible(true);
            if (sa.getSelectText() != null) {
                if (Value.CUST_ACCOUNT_CODE != null) {
                    txtAccCode2.setText(Value.CUST_ACCOUNT_CODE);
                }
            } else {
                txtAccCode2.requestFocus();
            }
        } else {
            txtProfileCode.requestFocus();
        }
    }//GEN-LAST:event_btnChooseAccToTranHoonActionPerformed

    private void txtLoanCustCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanCustCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSaveGuarantor.requestFocus();
        }
    }//GEN-LAST:event_txtLoanCustCodeKeyPressed

    private void btnSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveGuarantorActionPerformed
        addBoundsman();
    }//GEN-LAST:event_btnSaveGuarantorActionPerformed

    private void btnSaveGuarantorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveGuarantorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addBoundsman();
        }
    }//GEN-LAST:event_btnSaveGuarantorKeyPressed

    private void btnCancelSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSaveGuarantorActionPerformed
        clearBondman();
    }//GEN-LAST:event_btnCancelSaveGuarantorActionPerformed

    private void btnChooseGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseGuarantorActionPerformed
        ApproveDialog a = new ApproveDialog(this, true);
        a.setVisible(true);

        if (a.getCUST_CODE() != null) {
            txtLoanCustCode.setText(a.getCUST_CODE());
            ProfileBean pBean = getProfileControl().listCbProfile(txtLoanCustCode.getText());
            txtLoanCustName.setText(pBean.getP_custName());
            txtLoanCustSurname.setText(pBean.getP_custSurname());
        }

        btnSaveGuarantor.requestFocus();
    }//GEN-LAST:event_btnChooseGuarantorActionPerformed

    private void btnDelSaveGuarantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelSaveGuarantorActionPerformed
        btnDelSaveGuarantor();
    }//GEN-LAST:event_btnDelSaveGuarantorActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg1.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg2.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        JFileChooser chooser = new JFileChooser();
        ImagePreviewPanel preview = new ImagePreviewPanel();
        chooser.setAccessory(preview);
        chooser.addPropertyChangeListener(preview);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Files", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            txtImg3.setText(chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnAssetGarunteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssetGarunteeActionPerformed
        btnAssetGaruntee();
    }//GEN-LAST:event_btnAssetGarunteeActionPerformed

    private void txtLoanAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanAmtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enterLoan();
        }
    }//GEN-LAST:event_txtLoanAmtKeyPressed

    private void txtLoanAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanAmtFocusGained
        txtLoanAmt.selectAll();
    }//GEN-LAST:event_txtLoanAmtFocusGained

    private void txtIntTurnoverFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusGained
        txtIntTurnover.selectAll();
    }//GEN-LAST:event_txtIntTurnoverFocusGained

    private void txtIntTurnoverFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntTurnoverFocusLost
        double intTurnoverAmt = NumberUtil.toDouble(txtIntTurnover.getText());
        txtIntTurnover.setText(NumberFormat.showDouble2(intTurnoverAmt));
    }//GEN-LAST:event_txtIntTurnoverFocusLost

    private void txtIntTurnoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntTurnoverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntNormal.requestFocus();
        }
    }//GEN-LAST:event_txtIntTurnoverKeyPressed

    private void txtIntNormalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusGained
        txtIntNormal.selectAll();
    }//GEN-LAST:event_txtIntNormalFocusGained

    private void txtIntNormalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntNormalFocusLost
        double intNormalAmt = NumberUtil.toDouble(txtIntNormal.getText());
        txtIntNormal.setText(NumberFormat.showDouble2(intNormalAmt));
    }//GEN-LAST:event_txtIntNormalFocusLost

    private void txtIntNormalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntNormalKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }//GEN-LAST:event_txtIntNormalKeyPressed

    private void txtIntBadDebtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusGained
        txtIntBadDebt.selectAll();
    }//GEN-LAST:event_txtIntBadDebtFocusGained

    private void txtIntBadDebtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIntBadDebtFocusLost
        double intBadDebtAmt = NumberUtil.toDouble(txtIntBadDebt.getText());
        txtIntBadDebt.setText(NumberFormat.showDouble2(intBadDebtAmt));
    }//GEN-LAST:event_txtIntBadDebtFocusLost

    private void txtIntBadDebtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntBadDebtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtIntTurnover.requestFocus();
        }
    }//GEN-LAST:event_txtIntBadDebtKeyPressed

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
        }
    }//GEN-LAST:event_txtAddrTel1KeyPressed

    private void txtAddNo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddNo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMoo1.requestFocus();
        }
    }//GEN-LAST:event_txtAddNo1KeyPressed

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

    private void txtAddrMoo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMoo1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrMooName1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMoo1KeyPressed

    private void txtAddrMooName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddrMooName1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddrRoad1.requestFocus();
        }
    }//GEN-LAST:event_txtAddrMooName1KeyPressed

    private void cbLoanAccItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoanAccItemStateChanged
        if (evt.getStateChange() == 1) {
            String id = getIDCombobox(cbLoanAcc);
            CbLoanConfigBean loanBean = getLoanConfigControl().listLoanConfig(id);
            if (loanBean != null) {
                switch (loanBean.getIntFixed()) {
                    case AppConstants.INT_FLAT_RATE:
                        txtIntFixedName.setText("เงินต้นคงที่ (Flat Interest Rate)");
                        break;
                    case AppConstants.INT_EFFITIVE_RATE:
                        txtIntFixedName.setText("ลดต้นลดดอก (Effective Interest Rate)");
                        break;
                    default:
                        txtIntFixedName.setText("");
                        break;
                }

                switch (loanBean.getChkPIntTable()) {
                    case "1":
                        txtFeeRateName.setText("คิดดอกเบี้ยปรับจากดอกเบี้ยค้าง");
                        break;
                    case "2":
                        txtFeeRateName.setText("คิดดอกเบี้ยปรับจากเงินต้นคงเหลือ");
                        break;
                    default:
                        txtFeeRateName.setText("");
                        break;
                }

                txtIntBadDebt.setText(NumberFormat.showDouble2(loanBean.getIntBadDebt()));
                txtIntTurnover.setText(NumberFormat.showDouble2(loanBean.getIntTurnover()));
                txtIntNormal.setText(NumberFormat.showDouble2(loanBean.getIntNormal()));
                txtLoanPenaltyINT.setText(NumberFormat.showDouble2(loanBean.getLoanPenaltyINT()));

                double intPerYear1 = loanBean.getLoanINT();//ต่อปี
                double intPerMonth1 = intPerYear1 / 12;
                double intPerDay1 = intPerMonth1 / 30;

                double intPerYear2 = loanBean.getIntBadDebt();//กันหนี้สูญ
                double intPerMonth2 = intPerYear2 / 12;
                double intPerDay2 = intPerMonth2 / 30;

                double intPerYear3 = loanBean.getIntTurnover();//ค่าจัดการ
                double intPerMonth3 = intPerYear3 / 12;
                double intPerDay3 = intPerMonth3 / 30;

                double intPerYear4 = loanBean.getIntNormal();//ดอกเบี้ยเงินกู้
                double intPerMonth4 = intPerYear4 / 12;
                double intPerDay4 = intPerMonth4 / 30;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 0:
                        txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerDay1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerDay2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerDay3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerDay4));
                        break;
                    case 1:
                        txtLoanIntPercent.setText(NumberFormat.showDouble3(intPerMonth1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerMonth2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerMonth3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerMonth4));
                        break;
                    default:
                        txtLoanIntPercent.setText(NumberFormat.showDouble3(intPerYear1));
                        txtIntBadDebt.setText(NumberFormat.showDouble3(intPerYear2));
                        txtIntTurnover.setText(NumberFormat.showDouble3(intPerYear3));
                        txtIntNormal.setText(NumberFormat.showDouble3(intPerYear4));
                        break;
                }
            }

            System.out.println("เลือก " + id);
        }
    }//GEN-LAST:event_cbLoanAccItemStateChanged

    private void txtLoanDocCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanDocCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtLoanDocCode.getText())) {
                txtLoanFee.requestFocus();
            } else {
                txtLoanDocCode.selectAll();
            }
        }
    }//GEN-LAST:event_txtLoanDocCodeKeyPressed

    private void cbAddrTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAddrTypeItemStateChanged
        loadAddressLoan();
    }//GEN-LAST:event_cbAddrTypeItemStateChanged

    private void cbLoanTypePaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLoanTypePaymentItemStateChanged
        String id = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean loanBean = getLoanConfigControl().listLoanConfig(id);
        if (loanBean != null) {
            double intPerYear = loanBean.getLoanINT();//ต่อปี
            double intPerMonth = intPerYear / 12;
            double intPerDay = intPerMonth / 30;
            switch (cbLoanTypePayment.getSelectedIndex()) {
                case 0:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerDay));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(loanBean.getIntBadDebt() / 12 / 30));
                    txtIntTurnover.setText(NumberFormat.showDouble4(loanBean.getIntTurnover() / 12 / 30));
                    txtIntNormal.setText(NumberFormat.showDouble4(loanBean.getIntNormal() / 12 / 30));
                    break;
                case 1:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerMonth));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(loanBean.getIntBadDebt() / 12));
                    txtIntTurnover.setText(NumberFormat.showDouble4(loanBean.getIntTurnover() / 12));
                    txtIntNormal.setText(NumberFormat.showDouble4(loanBean.getIntNormal() / 12));
                    break;
                default:
                    txtLoanIntPercent.setText(NumberFormat.showDouble2(intPerYear));
                    txtIntBadDebt.setText(NumberFormat.showDouble4(loanBean.getIntBadDebt()));
                    txtIntTurnover.setText(NumberFormat.showDouble4(loanBean.getIntTurnover()));
                    txtIntNormal.setText(NumberFormat.showDouble4(loanBean.getIntNormal()));
                    break;
            }

            computeBahtPerMonth();
        }

    }//GEN-LAST:event_cbLoanTypePaymentItemStateChanged

    private void txtLoanPerMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanPerMonthKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if ("".equals(txtLoanPerMonth.getText().trim())) {
                txtLoanPerMonth.setText("1");
                txtLoanPerMonth.requestFocus();
                return;
            }

            int loanPerMonth = NumberUtil.toInt(txtLoanPerMonth.getText());
            if (loanPerMonth <= 0) {
                txtLoanPerMonth.setText("1");
                loanPerMonth = 1;
            }
            String docType = getIDCombobox(cbLoanAcc);
            CbLoanConfigBean lBean = getLoanConfigControl().listLoanConfig(docType);
            if (loanPerMonth > lBean.getLoanPerMonth()) {
                JOptionPane.showMessageDialog(this, "ท่านกู้เกินจำนวนงวดตามที่สัญญากำหนดไว้ ต้องไม่เกิน " + lBean.getLoanPerMonth() + " งวด");
                txtLoanPerMonth.requestFocus();
            } else {
                computeFinishPay();
                txtLoanDateStart.requestFocus();
            }
        }
    }//GEN-LAST:event_txtLoanPerMonthKeyPressed

    private void txtLoanPerMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanPerMonthFocusGained
        txtLoanPerMonth.selectAll();
    }//GEN-LAST:event_txtLoanPerMonthFocusGained

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Point point = txtStartLoanDate.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(this, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtStartLoanDate.setText(dcd.getDateString());
            txtLoanDocCode.requestFocus();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void txtStartLoanDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartLoanDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtLoanFee.requestFocus();
        }
    }//GEN-LAST:event_txtStartLoanDateKeyPressed

    private void txtLoanAmtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanAmtFocusLost
        double loanAmt = NumberUtil.toDouble(txtLoanAmt.getText());
        txtLoanAmt.setText(NumberFormat.showDouble2(loanAmt));
    }//GEN-LAST:event_txtLoanAmtFocusLost

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        try {
            getDocumentGarunteeControl().deleteData(txtLoanDocCode.getText());
            txtAssetGaruntee1.setText("");
            txtImg1.setText("");
            txtImg2.setText("");
            txtImg3.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void btnSaveAccOpenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveAccOpenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveOpenSave();
        }
    }//GEN-LAST:event_btnSaveAccOpenKeyPressed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        Point point = txtPaymentDate.getLocationOnScreen();
        point.setLocation(point.getX(), point.getY());
        DateChooseDialog dcd = new DateChooseDialog(this, true, point);
        dcd.setVisible(true);

        if (dcd.getSelectDate() != null) {
            txtPaymentDate.setText(dcd.getDateString());
            txtPaymentDate.requestFocus();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "กรุณายืนยันการอัพเดตโปรแกรม จาก Transaction ?");
        if (conf == JOptionPane.YES_OPTION) {
            ArrayList<CbSaveAccountBean> listSaveAccount = getSaveAccountControl().listSaveAccount(" order by account_code ");
            for (CbSaveAccountBean bean : listSaveAccount) {
                String custCode = bean.getB_CUST_CODE();
                String accCode = bean.getAccount_code();

                getCbTransactionSaveControl().deleteData(custCode, accCode);

                TransactionAdvanceDialog dialog = new TransactionAdvanceDialog(new javax.swing.JFrame(), true, custCode, accCode);
                dialog.saveTransaction();
            }

            JOptionPane.showMessageDialog(this, "กระบวนการอัพเดตความเคลื่อนไหวเสร็จสมบูรณ์");

            btnRegister.setText("เริ่มใหม่");

            //reset form
            btnRegister();
        }
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void txtPaymentDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaymentDateFocusGained
        computeLoanInterest();
    }//GEN-LAST:event_txtPaymentDateFocusGained

    private void txtPaymentDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentDateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtAccCode.getText())) {
                CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
                if (lBean != null) {
                    txtPaymentFee.setEditable(true);
                    txtPaymentAmountCash.setEditable(true);

                    loadLoanDetailPayment();

                    txtPaymentAmountCash.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "กรุณาเลือกเลขที่บัญชีเงินกู้สำหรับรับชำระ !!!");
                    txtAccCode.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "กรุณาเลือกเลขที่บัญชีเงินกู้ที่ต้องการรับชำระ !!!");
                txtAccCode.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPaymentDateKeyPressed

    private void txtStartLoanDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartLoanDateFocusGained
        btnPrintLoanPaper.setEnabled(false);
    }//GEN-LAST:event_txtStartLoanDateFocusGained

    private void mnCancelOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCancelOpenAccountActionPerformed
        clearFormLoan();
        clearProfile();
        clearOpenAccount();
        btnRegister.setText("ลงทะเบียน");

        txtAccCode.setText("");

        CancelAccountDialog cad = new CancelAccountDialog(this, true);
        cad.setVisible(true);
    }//GEN-LAST:event_mnCancelOpenAccountActionPerformed

    private void mnRptTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRptTransactionActionPerformed
        DialyReportDialog d = new DialyReportDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_mnRptTransactionActionPerformed

    private void btnCancelOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOpenAccountActionPerformed
        btnRegister();
    }//GEN-LAST:event_btnCancelOpenAccountActionPerformed

    private void btnCancelSaveMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSaveMoneyActionPerformed
        btnRegister();
    }//GEN-LAST:event_btnCancelSaveMoneyActionPerformed

    private void btnCancelCloseSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCloseSaveAccountActionPerformed
        btnRegister();
    }//GEN-LAST:event_btnCancelCloseSaveAccountActionPerformed

    private void btnCancelPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPaymentActionPerformed
        btnRegister();
    }//GEN-LAST:event_btnCancelPaymentActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        btnRegister();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtDepositDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepositDateMouseClicked
        if (evt.getClickCount() == 2) {
            Point point = txtDepositDate.getLocationOnScreen();
            point.setLocation(point.getX(), point.getY());
            DateChooseDialog dcd = new DateChooseDialog(this, true, point);
            dcd.setVisible(true);

            if (dcd.getSelectDate() != null) {
                txtDepositDate.setText(dcd.getDateString());
                txtDepositDate.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDepositDateMouseClicked

    private void txtWithdrawDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWithdrawDateMouseClicked
        if (evt.getClickCount() == 2) {
            Point point = txtWithdrawDate.getLocationOnScreen();
            point.setLocation(point.getX(), point.getY());
            DateChooseDialog dcd = new DateChooseDialog(this, true, point);
            dcd.setVisible(true);

            if (dcd.getSelectDate() != null) {
                txtWithdrawDate.setText(dcd.getDateString());
                txtWithdrawDate.requestFocus();
            }
        }
    }//GEN-LAST:event_txtWithdrawDateMouseClicked

    private void btnTransactionSaveDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionSaveDialogActionPerformed
        if (!"".equals(txtAccCode.getText().trim()) && !"".equals(txtProfileCode.getText())) {
            TransactionAdvanceDialog ta = new TransactionAdvanceDialog(this, true, txtProfileCode.getText(), txtAccCode.getText());
            ta.setVisible(true);
        }
    }//GEN-LAST:event_btnTransactionSaveDialogActionPerformed

    private void mnSaveAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveAccountActionPerformed
        SaveAccountDialog saveAccDlg = new SaveAccountDialog(this, true);
        saveAccDlg.setVisible(true);
    }//GEN-LAST:event_mnSaveAccountActionPerformed

    private void mnLoanAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoanAccountActionPerformed
        SaveLoanDialog saveLoanDlg = new SaveLoanDialog(this, true);
        saveLoanDlg.setVisible(true);
    }//GEN-LAST:event_mnLoanAccountActionPerformed

    private void mnLoadExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLoadExcelActionPerformed
        saveLoanFromExcel();
    }//GEN-LAST:event_mnLoadExcelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ProfileList2Dialog dialog = new ProfileList2Dialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SaveReportAllDialog s = new SaveReportAllDialog(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PayInterestAmtDialog d = new PayInterestAmtDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormCashDialyDialog d = new FormCashDialyDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        SummaryDialyDialog d = new SummaryDialyDialog(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed

    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed

    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ReportPersonDetail pd = new ReportPersonDetail(this, true);
        pd.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ReportInvoiceHoon ih = new ReportInvoiceHoon(this, true);
        ih.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    public static void main(String args[]) {
        Log.write.info("Start Program");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            Font a = new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE);
            UIManager.put("OptionPane.buttonFont", a);
            // use uiResource for others
            FontUIResource ax = new FontUIResource(a);
            UIManager.put("OptionPane.messageFont", ax);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        File fExit = new File("cbanksystem.running");
        if (fExit.exists()) {
            JOptionPane.showMessageDialog(null, "โปรแกรมกำลังถูกเปิดใช้งานอยู่ หรือมีการออกจากระบบไม่สมบูรณ์ กรุณาเปิดใหม่อีกครั้ง !",
                    "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
            fExit.delete();
            System.exit(0);
        } else {
            try {
                fExit.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookPageAt;
    private javax.swing.JTextField LoanCustID;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btnApproveMoreMoney;
    private javax.swing.JButton btnAssetGaruntee;
    private javax.swing.JButton btnCancelBuyHoon;
    private javax.swing.JButton btnCancelCloseSaveAccount;
    private javax.swing.JButton btnCancelOpenAcc4;
    private javax.swing.JButton btnCancelOpenAccount;
    private javax.swing.JButton btnCancelPayment;
    private javax.swing.JButton btnCancelSaveGuarantor;
    private javax.swing.JButton btnCancelSaveLoanAccountRegister;
    private javax.swing.JButton btnCancelSaveMoney;
    private javax.swing.JButton btnCancelSellHoon;
    private javax.swing.JButton btnCancelTransferHoon;
    private javax.swing.JButton btnCancelWithdrawMoney;
    private javax.swing.JButton btnChooseAccToTranHoon;
    private javax.swing.JButton btnChooseDateSellHoon;
    private javax.swing.JButton btnChooseDateTransfer;
    private javax.swing.JButton btnChooseGuarantor;
    private javax.swing.JButton btnCloseSaveAccount;
    private javax.swing.JButton btnConfirmPayment;
    private javax.swing.JButton btnDelSaveGuarantor;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindPersonToTransfer;
    private javax.swing.JButton btnPrintLoanPaper;
    private javax.swing.JButton btnPrintSliplOpenAcc;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSaveAccOpen;
    private javax.swing.JButton btnSaveByHoon;
    private javax.swing.JButton btnSaveGuarantor;
    private javax.swing.JButton btnSaveLoanAccountRegister;
    private javax.swing.JButton btnSaveMoney;
    private javax.swing.JButton btnSellHoon;
    private javax.swing.JButton btnTimeShow;
    private javax.swing.JButton btnTransactionSaveDialog;
    private javax.swing.JButton btnTransferHoon;
    private javax.swing.JButton btnWithdrawMoney;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbAccType;
    private javax.swing.JComboBox cbAddrType;
    private javax.swing.JComboBox cbHoonType;
    private javax.swing.JComboBox cbLoanAcc;
    private javax.swing.JComboBox cbLoanTypePayment;
    private javax.swing.JCheckBox chkSave1;
    private javax.swing.JCheckBox chkSave2;
    private javax.swing.JCheckBox chkSelectAllSellHoon;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel211;
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
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
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
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbMoneyText;
    private javax.swing.JLabel lbMoneyText1;
    private javax.swing.JLabel lbPic;
    private javax.swing.JLabel lblBuyHoonTitle;
    private javax.swing.JLabel lblCloseAccountTitle;
    private javax.swing.JLabel lblLoanPromiseTitle;
    private javax.swing.JLabel lblPaymentLoanTitle;
    private javax.swing.JLabel lblSaveAccountNo;
    private javax.swing.JLabel lblSaveAccountTitle;
    private javax.swing.JLabel lblSaveBookNo;
    private javax.swing.JLabel lblSaveEvidence;
    private javax.swing.JLabel lblSaveFee;
    private javax.swing.JLabel lblSaveOpenTitle;
    private javax.swing.JLabel lblSelectSaveAccount;
    private javax.swing.JLabel lblSellHoonTitle;
    private javax.swing.JLabel lblTransferHoonTitle;
    private javax.swing.JLabel lblWithdrawAccountTitle;
    private javax.swing.JMenuItem mnCancelOpenAccount;
    private javax.swing.JMenuItem mnCloseDialoyDay;
    private javax.swing.JMenuItem mnConfigSystem;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenuItem mnExpense;
    private javax.swing.JMenuItem mnFee;
    private javax.swing.JMenuItem mnLoadExcel;
    private javax.swing.JMenuItem mnLoanAccount;
    private javax.swing.JMenu mnMainRptHoon;
    private javax.swing.JMenu mnMainRptLoan;
    private javax.swing.JMenuItem mnMember;
    private javax.swing.JMenuItem mnMemberType;
    private javax.swing.JMenuItem mnPrefix;
    private javax.swing.JMenuItem mnPrintHistorySave;
    private javax.swing.JMenuItem mnProject;
    private javax.swing.JMenuItem mnRptCheckAudit;
    private javax.swing.JMenuItem mnRptCloseAccount;
    private javax.swing.JMenuItem mnRptFee;
    private javax.swing.JMenuItem mnRptMember;
    private javax.swing.JMenuItem mnRptOpenAccount;
    private javax.swing.JMenuItem mnRptProfitCompany;
    private javax.swing.JMenuItem mnRptTransaction;
    private javax.swing.JMenuItem mnSaveAccount;
    private javax.swing.JMenuItem mnSaveExpense;
    private javax.swing.JMenuItem mnSaveHistoryLoan;
    private javax.swing.JMenuItem mnSetupConfig;
    private javax.swing.JMenuItem mnStatus;
    private javax.swing.JTable tbArGroup1;
    private javax.swing.JTable tbArGroup2;
    private javax.swing.JTable tbGuarantor;
    private javax.swing.JTable tbHistoryPayment;
    private javax.swing.JTable tbTransSave;
    private javax.swing.JTextField txTotalMoneyClose;
    private javax.swing.JTextField txtARProduct;
    private javax.swing.JTextField txtAccCode;
    private javax.swing.JTextField txtAccCode2;
    private javax.swing.JTextField txtAccCodeLoad;
    private javax.swing.JTextField txtAccTypeName;
    private javax.swing.JTextField txtAccountCode;
    private javax.swing.JTextField txtAddNo1;
    private javax.swing.JTextField txtAddrAmphur1;
    private javax.swing.JTextField txtAddrMobile1;
    private javax.swing.JTextField txtAddrMoo1;
    private javax.swing.JTextField txtAddrMooName1;
    private javax.swing.JTextField txtAddrPost1;
    private javax.swing.JTextField txtAddrProvince1;
    private javax.swing.JTextField txtAddrRoad1;
    private javax.swing.JTextField txtAddrSoi1;
    private javax.swing.JTextField txtAddrTambon1;
    private javax.swing.JTextField txtAddrTel1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtArIntMgr;
    private javax.swing.JTextField txtArLoanInt;
    private javax.swing.JTextField txtArNetAmt;
    private javax.swing.JTextField txtArTotalBalance;
    private javax.swing.JTextArea txtAssetGaruntee1;
    private javax.swing.JTextField txtB1;
    private javax.swing.JTextField txtB2;
    private javax.swing.JTextField txtB3;
    private javax.swing.JTextField txtB4;
    private javax.swing.JTextField txtB5;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBalanceInterest;
    private javax.swing.JTextField txtBalanceTotal;
    private javax.swing.JTextField txtBookNo;
    private javax.swing.JTextField txtBookPage;
    private javax.swing.JTextField txtBranchName;
    private javax.swing.JTextField txtCashPay;
    private javax.swing.JTextField txtCloseRemark;
    private javax.swing.JTextField txtDateSell;
    private javax.swing.JTextField txtDateTransfer;
    private javax.swing.JTextField txtDepCode;
    private javax.swing.JTextField txtDepositBaht;
    private javax.swing.JTextField txtDepositDate;
    private javax.swing.JTextField txtDocNo;
    private javax.swing.JTextField txtDocNo1;
    private javax.swing.JTextField txtDocnoTransfer;
    private javax.swing.JTextField txtFeeRateName;
    private javax.swing.JTextField txtHoonQTY;
    private javax.swing.JTextField txtHoonTon;
    private javax.swing.JTextField txtImg1;
    private javax.swing.JTextField txtImg2;
    private javax.swing.JTextField txtImg3;
    private javax.swing.JTextField txtIndexNo;
    private javax.swing.JTextField txtIntBadDebt;
    private javax.swing.JTextField txtIntFixedName;
    private javax.swing.JTextField txtIntLost;
    private javax.swing.JTextField txtIntNormal;
    private javax.swing.JTextField txtIntTurnover;
    private javax.swing.JTextField txtLimitLoanAmt;
    private javax.swing.JTextField txtLoanAge;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanBirthDate;
    private javax.swing.JTextField txtLoanCardExpire;
    private javax.swing.JTextField txtLoanCustCode;
    private javax.swing.JTextField txtLoanCustName;
    private javax.swing.JTextField txtLoanCustSurname;
    private javax.swing.JTextField txtLoanDateEnd;
    private javax.swing.JTextField txtLoanDateStart;
    private javax.swing.JTextField txtLoanDocCode;
    private javax.swing.JTextField txtLoanFee;
    private javax.swing.JTextField txtLoanIntPercent;
    private javax.swing.JTextField txtLoanName;
    private javax.swing.JTextField txtLoanOccu;
    private javax.swing.JTextField txtLoanPenaltyINT;
    private javax.swing.JTextField txtLoanPerMonth;
    private javax.swing.JTextField txtLoanRegMember;
    private javax.swing.JTextField txtLoanSex;
    private javax.swing.JTextField txtLoanStartDate;
    private javax.swing.JTextField txtMemQty;
    private javax.swing.JTextField txtPayPerMonth;
    private javax.swing.JTextField txtPaymentAmountCash;
    private javax.swing.JTextField txtPaymentDate;
    private javax.swing.JTextField txtPaymentFee;
    private javax.swing.JTextField txtPaymentPerMonth;
    private javax.swing.JTextField txtPriceValue;
    private javax.swing.JTextField txtProfileCode;
    private javax.swing.JTextField txtProfileCode2;
    private javax.swing.JTextField txtProfileName;
    private javax.swing.JTextField txtRemark1;
    private javax.swing.JTextField txtRemark2;
    private javax.swing.JTextField txtSaveCloseBalance;
    private javax.swing.JTextField txtSaveCloseInterest;
    private javax.swing.JTextField txtSaveFee;
    private javax.swing.JTextField txtShowEmpCode;
    private javax.swing.JTextField txtShowEmpName;
    private javax.swing.JTextField txtStartAcc;
    private javax.swing.JTextField txtStartDateOpenSaveAccount;
    private javax.swing.JTextField txtStartLoanDate;
    private javax.swing.JTextField txtTotaTransferHoonAmt;
    private javax.swing.JTextField txtTotalAccount;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalSave;
    private javax.swing.JTextField txtTotalSellHoonAmount;
    private javax.swing.JTextField txtTotalValue;
    private javax.swing.JPasswordField txtTransferAppCode;
    private javax.swing.JTextField txtTransferPerson;
    private javax.swing.JTextField txtValueBaht;
    private javax.swing.JTextField txtWithdrawAccTypeName;
    private javax.swing.JTextField txtWithdrawDate;
    private javax.swing.JTextField txtWithdrawalBaht;
    private javax.swing.JTextField txtWithdrawalCode;
    // End of variables declaration//GEN-END:variables

    private void loadLoan() {
        JTableHeader tHeader2 = tbArGroup1.getTableHeader();
        tHeader2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbArGroup1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbArGroup1.setRowHeight(25);

        List<LoadLoanMapping> listData = getModelControl().getDataLoan(txtProfileCode.getText());
        if (listData.isEmpty()) {
            clearFormLoan();
            jTabbedPane7.setSelectedIndex(0);
        }

        for (LoadLoanMapping bean : listData) {
            cbLoanAcc.setSelectedItem(bean.getLoan_type() + " - " + ThaiUtil.ASCII2Unicode(bean.getLoanName()));
            enableComponents(jPanel22, false);
        }
    }

    private void findCustomer() {
        double totalSaveBalance = 0.00;
        if ("".equals(txtProfileCode.getText())) {
            CbSaveAccountBean bean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
            if (bean != null) {
                txtProfileCode.setText(bean.getB_CUST_CODE());
                Value.CUST_CODE = bean.getB_CUST_CODE();
                LoanCustID.setText(Value.CUST_CODE);
                txtTotalSave.setText(NumberFormat.showDouble2(bean.getB_BALANCE()));
                totalSaveBalance = bean.getB_BALANCE();
            } else {
                CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
                if (lBean != null) {
                    txtProfileCode.setText(lBean.getCust_code());
                    Value.CUST_CODE = lBean.getCust_code();
                    LoanCustID.setText(Value.CUST_CODE);
                }
            }
        }
        ProfileBean profile = getProfileControl().listCbProfile(txtProfileCode.getText());
        if (profile != null) {
            txtIndexNo.setText("" + profile.getP_index());
            txtStartAcc.setText(DateFormat.getLocale_ddMMyyyy(profile.getP_member_start()));
            txtProfileCode.setText(profile.getP_custCode());
            LoanCustID.setText(profile.getP_custCode());
            txtProfileCode.setEditable(false);
            txtProfileName.setText(profile.getP_custName() + " " + profile.getP_custSurname());
            txtLimitLoanAmt.setText(NumberFormat.showDouble2((int) profile.getLoan_Credit_Balance()));

            if (totalSaveBalance == 0) {
                txtTotalSave.setText(NumberFormat.showDouble2(profile.getSave_Balance()));
            }

            //set Image
            if (!"".equals(profile.getP_cust_pic_url())) {
                lbPic.setIcon(new javax.swing.ImageIcon(profile.getP_cust_pic_url()));
            } else {
                lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
            }

            loadLoan();
            profileIsActive = true;

            enablePanelTrue();
            enableComponents(jPanel7, true);
            enableComponents(jPanel5, true);

            jTabbedPane8.setEnabledAt(1, false);
            jTabbedPane8.setEnabledAt(2, false);

            double hoonTotalAmt = NumberUtil.toDouble(txtTotalValue.getText());
            if (hoonTotalAmt > 0) {
                jTabbedPane5.setEnabledAt(1, true);
            } else {
                jTabbedPane5.setEnabledAt(1, false);
            }

            clearOldDataSave();
            cbHoonType.setEnabled(true);

            btnRegister.setText("เริ่มใหม่");
        }
    }

    private void clearProfile() {
        profileIsActive = false;
        txtAccCode.setText("");
        txtProfileCode.setText("");
        LoanCustID.setText("");

        txtProfileCode.setEditable(true);
        txtIndexNo.setText("");
        txtProfileName.setText("");
        txtStartAcc.setText("");
        txtLimitLoanAmt.setText("0.00");
        txtAccTypeName.setText("");
        txtTotalSave.setText("0.00");
        txtTotalValue.setText("0.00");
        txtARProduct.setText("0.00");
        txtTotalAccount.setText("0");
        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/no.png")));
        jTabbedPane1.setSelectedIndex(0);
        jTabbedPane8.setSelectedIndex(0);
        jTabbedPane5.setSelectedIndex(0);
        jTabbedPane7.setSelectedIndex(0);
        Value.CUST_CODE = null;
        Value.CUST_ACCOUNT_CODE = null;

        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanFee.setText("0.00");

        enableComponents(jTabbedPane8, false);

        DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        DefaultTableModel model2 = (DefaultTableModel) tbGuarantor.getModel();
        int size2 = model2.getRowCount();
        for (int i = 0; i < size2; i++) {
            model2.removeRow(0);
        }

        txtAssetGaruntee1.setText("");
        txtImg1.setText("");
        txtImg2.setText("");
        txtImg3.setText("");

        txtLoanCustCode.setText("");
        txtLoanCustName.setText("");
        txtLoanCustSurname.setText("");

        txtWithdrawDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtDepositDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        txtAccCode.requestFocus();
    }

    private void enablePanelTrue() {
        enableComponents(jTabbedPane1, true);
    }

    private void exitConfirm() {
        int ic = JOptionPane.showConfirmDialog(this, "ท่านต้องการออกจากระบบใช่หรือไม่ ?");
        if (ic == JOptionPane.YES_OPTION) {
            Value.clear();
            new File("cbanksystem.running").delete();
            PrintCOM printCom = new PrintCOM();
            printCom.printLOG("Logout by ... " + Value.CUST_CODE + "   End time: " + DateFormat.getLocale_ddMMyyyy(new Date()));
            System.exit(0);
        }

    }

    private void initWithdraw() {
        double balance = 0.00;
        String where = " and B_Cust_Code='" + txtProfileCode.getText() + "' and account_code='" + txtAccCode.getText() + "' ";
        String accountType = "";
        CbSaveAccountBean cbSaveAccountBean = getSaveAccountControl().getSaveAccount(where);
        if (cbSaveAccountBean != null) {
            balance = cbSaveAccountBean.getB_BALANCE();
            accountType = cbSaveAccountBean.getAccount_type();
        }

        txtBalanceTotal.setText(NumberFormat.showDouble2(balance));
        txtWithdrawAccTypeName.setText(accountType);
        lbMoneyText.setText("(...)");
    }

    private void initHoon() {
        ConfigBean bean = getConfigControl().getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = getBranchControl().getData();
            txtDocNo.setText(bBean.getCode() + bean.getHoonDocPrefix() + getRunning(bean.getHoonDocRunning()));
        } else {
            txtDocNo.setText(bean.getHoonDocPrefix() + getRunning(bean.getHoonDocRunning()));
        }

        String hType = getIDCombobox(cbHoonType);

        CbHoonConfigBean hBean = getHoonConfigControl().listCbHoonConfig(hType);
        txtValueBaht.setText(NumberFormat.showDouble2(hBean.getHoonRate()));
        txtPriceValue.setText("" + hBean.getHoonRate());

        txtHoonQTY.requestFocus();
    }

    private void initHoonWithdraw() {
        ConfigBean bean = getConfigControl().getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = getBranchControl().getData();
            txtDocNo1.setText(bBean.getCode() + bean.getHoonSaleDocPrefix() + getRunning(bean.getHoonSaleDocRunning()));
        } else {
            txtDocNo1.setText(bean.getHoonSaleDocPrefix() + getRunning(bean.getHoonSaleDocRunning()));
        }

        txtTotalSellHoonAmount.requestFocus();

        txtDateSell.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtTotalSellHoonAmount.requestFocus();
    }

    private void saveLoanForm() {
        //update front book
        String tDocNo = txtLoanDocCode.getText();
        String loan_person1 = "";
        String loan_person2 = "";
        String accCode = txtLoanDocCode.getText();

        CbLoanAccountBean bean = new CbLoanAccountBean();
        bean.setCust_code(txtProfileCode.getText());
        bean.setLoan_docno(accCode);
        bean.setLoan_start_date(DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText()));
        bean.setLoan_end_date(DateFormat.getLocal_ddMMyyyy(txtLoanDateEnd.getText()));
        bean.setLoan_amount(NumberUtil.toDouble(txtLoanAmt.getText()));
        bean.setLoan_interest(NumberUtil.toDouble(txtLoanIntPercent.getText()));
        bean.setLoan_person1(loan_person1);
        bean.setLoan_person2(loan_person2);
        bean.setPayPerAmount(NumberUtil.toDouble(txtPayPerMonth.getText()));
        bean.setPeriod_pay(NumberUtil.toInt(txtLoanPerMonth.getText()));
        bean.setChkPersonApprove("N");
        bean.setLoanCustomerPay(0);
        bean.setLoanPayMin(0);
        bean.setLoanDayQty(0);

        BranchBean branchBean = getBranchControl().getData();
        bean.setLoan_docdate(DateFormat.getLocal_ddMMyyyy(txtStartLoanDate.getText()));
        bean.setBranch_code(branchBean.getCode());
        bean.setLoan_datePay(DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText()));
        bean.setPay_user("");
        bean.setBook_evidence1(txtAssetGaruntee1.getText());
        bean.setBook_evidence2(txtImg1.getText());
        bean.setBook_evidence3(txtImg2.getText());
        bean.setBook_evidence4(txtImg3.getText());
        bean.setBook_no("001");
        bean.setLoan_type(getIDCombobox(cbLoanAcc));

        boolean isStep1 = false;
        if (getLoanAccountControl().saveLoanAccount(bean)) {
            try {
                String sql = "update cb_profile set "
                        + "Loan_Credit_Balance=Loan_Credit_Balance-" + bean.getLoan_amount() + ","
                        + "Loan_Balance=Loan_Balance+" + bean.getLoan_amount() + " "
                        + "where p_CustCode='" + bean.getCust_code() + "'";
                getProfileControl().update(sql);

                ProfileBean pBean = getProfileControl().listCbProfile(bean.getCust_code());
                txtLimitLoanAmt.setText(NumberFormat.showDouble2((int) pBean.getLoan_Credit_Balance()));

                String sql1 = "update cb_config set LoanDocRunning=LoanDocRunning+1";
                getConfigControl().update(sql1);

                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");

                int confrim = JOptionPane.showConfirmDialog(this, "ท่านต้องการพิมพ์หน้าสมุดเงินกู้ใช่หรือไม่ ?");
                if (confrim == JOptionPane.YES_OPTION) {
                    printLoanFrontBook();
                }

                loadSummary();
                isStep1 = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                Log.write.error(e.getMessage());
            }

            //ถ้าข้อมูลถูกอัพเดตเรียบร้อย
            if (isStep1) {
                ProfileBean pppBean = getProfileControl().listCbProfile(txtProfileCode.getText());
                txtARProduct.setText("" + pppBean.getLoan_Balance());

                CbTransactionLoanBean tLoanBean = new CbTransactionLoanBean();
                tLoanBean.setT_date(DateFormat.getLocal_ddMMyyyy(txtStartLoanDate.getText()));
                tLoanBean.setT_acccode(accCode);
                tLoanBean.setT_custcode(txtProfileCode.getText());
                tLoanBean.setT_description(ThaiUtil.Unicode2ASCII("" + cbLoanAcc.getSelectedItem()));
                tLoanBean.setT_amount(bean.getLoan_amount());
                tLoanBean.setMoney_in(0.00);
                tLoanBean.setMoney_out(0.00);
                tLoanBean.setT_empcode(Value.USER_CODE);
                tLoanBean.setT_docno(tDocNo);
                tLoanBean.setRemark("");
                tLoanBean.setT_status(AppConstants.CB_STATUS_LOAN);

                ConfigBean cBean = getConfigControl().getConfigBean();
                tLoanBean.setT_booktype(cBean.getLoanDocPrefix());
                tLoanBean.setLineNo(getCbTransactionLoanControl().getLineByAccount(accCode));
                tLoanBean.setPrintChk("N");
                tLoanBean.setT_index(getCbTransactionLoanControl().getMaxIndex(accCode));

                // get account Balance
                tLoanBean.setT_balance(bean.getLoan_amount());
                tLoanBean.setT_hoon(0);

                // get branch code
                tLoanBean.setBranch_code(Value.BRANCH_CODE);
                tLoanBean.setT_fee(NumberUtil.toDouble(txtLoanFee.getText()));

                if (getCbTransactionLoanControl().saveCbTransactionLoan(tLoanBean)) {
                    int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการบันทึกรายงานความเคลื่อนไหวลงสมุดใช่หรือไม่ ?");
                    if (confirm == JOptionPane.YES_OPTION) {
                        printTransactionLoanBook(accCode);
                    }
                }

                //add loan table
                DefaultTableModel modelAdd = (DefaultTableModel) tbArGroup1.getModel();
                int size = modelAdd.getRowCount();

                String loanDocNo = txtLoanDocCode.getText();
                for (int i = 0; i < size; i++) {
                    CbLoanTablePaymentBean ltBean = new CbLoanTablePaymentBean();
                    ltBean.setLoan_doc_no(loanDocNo);
                    ltBean.setLoan_index(i + 1);

                    double dBaseTotalAmount = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 1));
                    double dIntArLost = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 2));
                    double dIntArMgr = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 3));
                    double dIntArInt = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 4));
                    double dNetTotalAmt = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 5));
                    double dTableAvgCompute = NumberUtil.toDouble("" + tbArGroup1.getValueAt(i, 6));

                    ltBean.setBase_total_amount(dBaseTotalAmount);
                    ltBean.setLoan_int_ar_lost(dIntArLost);
                    ltBean.setLoan_int_ar_mgr(dIntArMgr);
                    ltBean.setLoan_int_ar_int(dIntArInt);
                    ltBean.setNet_total_pay(dNetTotalAmt);
                    ltBean.setTable_avg_compute(dTableAvgCompute);

                    ltBean.setPayment_money(0);
                    ltBean.setPayment_balance(0);
                    ltBean.setPayment_fee(0);
                    ltBean.setBalance_amount(dNetTotalAmt);

                    ltBean.setEmp_code(Value.USER_CODE);
                    ltBean.setBranch_code(Value.BRANCH_CODE);
                    ltBean.setDue_date(DateFormat.getLocal_ddMMyyyy("" + tbArGroup1.getValueAt(i, 7)));

                    //บันทึกข้อมูล
                    getCbLoanTablePaymentControl().saveCbLoanTablePayment(ltBean);

                    btnPrintLoanPaper.setEnabled(true);
                }

                loadLoanDetail();
                txtAccCode.setText(txtLoanDocCode.getText());

                btnSaveLoanAccountRegister.setEnabled(false);
                btnCancelSaveLoanAccountRegister.setEnabled(false);
                jButton17.setEnabled(false);
                txtPayPerMonth.setEnabled(false);
                txtLoanDateStart.setEnabled(false);
                txtLoanAmt.setEnabled(false);

                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลการกู้เงินเรียบร้อยแล้ว");
                btnPrintLoanPaper();
                btnRegister();
            }
        }
    }

    private void clearFormAll() {
        menuHide();

        clearProfile();
        clearOpenAccount();

        showTime();

        BranchBean bean = getBranchControl().getData();
        txtShowEmpCode.setText(Value.USER_CODE);
        txtShowEmpName.setText(Value.USER_NAME + " " + Value.USER_LAST_NAME);
        txtBranchName.setText(bean.getCode() + " - " + ThaiUtil.ASCII2Unicode(bean.getName()));

        txtMemQty.setText(getProfileControl().getPMax());

        tbGuarantor.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbGuarantor.setRowHeight(30);
        JTableHeader tHeader = tbGuarantor.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));
    }

    private void loadDataAccount() {
        ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        txtStartAcc.setText(DateFormat.getLocale_ddMMyyyy(pBean.getP_member_start()));
        txtTotalValue.setText("" + pBean.getHoon_Qty());
        txtARProduct.setText(NumberFormat.showDouble2(pBean.getAR_Balance()));
        txtLimitLoanAmt.setText(NumberFormat.showDouble2((int) pBean.getLoan_Credit_Balance()));
        if ("".equals(txtAccCode.getText())) {
            txtAccCode.setText(Value.CUST_ACCOUNT_CODE);
        }

        CbSaveAccountBean bean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
        if (bean != null) {
            txtTotalSave.setText(NumberFormat.showDouble2(bean.getB_BALANCE()));
            jTabbedPane8.setEnabledAt(1, true);
            jTabbedPane8.setEnabledAt(2, true);

            txtAccountCode.setText(bean.getAccount_code());
            txtBookNo.setText(bean.getBook_no());
            if (!"".equals(bean.getBook_evidence1())) {
                chkSave1.setSelected(true);
            }
            if (!"".equals(bean.getBook_evidence2())) {
                chkSave2.setSelected(true);
            }

            CbSaveConfigBean sBean = getSaveConfigControl().loadConfig(bean.getAccount_type());
            String typeName = sBean.getTypeCode() + " - " + sBean.getTypeName();
            cbAccType.setSelectedItem(typeName);
            txtAccTypeName.setText(sBean.getTypeName());
            txtBalance.setText(NumberFormat.showDouble2(bean.getB_BALANCE()));
            txtSaveCloseBalance.setText(NumberFormat.showDouble2(bean.getB_BALANCE()));
            txTotalMoneyClose.setText(NumberFormat.showDouble2(bean.getB_BALANCE() + bean.getB_INTEREST()));
            txtBalanceInterest.setText(NumberFormat.showDouble2(bean.getB_INTEREST()));
            txtSaveCloseInterest.setText(NumberFormat.showDouble2(bean.getB_INTEREST()));
            txtBalanceTotal.setText(NumberFormat.showDouble2(bean.getB_BALANCE()));
            txtDepositDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            txtWithdrawDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            switch (bean.getAccount_status()) {
                case "OPEN":
                    jTabbedPane8.setSelectedIndex(1);
                    txtDocNo1.setText("");
                    initHoon();
                    txtDocNo.setText("");
                    initHoonWithdraw();
                    txtDepositBaht.requestFocus();
                    break;
                case "CLOSE":
                    jTabbedPane8.setSelectedIndex(0);
                    jTabbedPane8.setEnabledAt(1, false);
                    jTabbedPane8.setEnabledAt(2, false);

                    break;
                default:
                    break;
            }

            loadTransactionPerson();
        }
    }

    private void clearOpenAccount() {
        chkSave1.setSelected(false);
        chkSave2.setSelected(false);

        txtAccountCode.setText("");
        txtBookNo.setText("");
        txtSaveFee.setText("0.00");
    }

    private void saveOpenSave() {
        if (cbAccType.getItemCount() == 0) {
            return;
        }

        double saveFeeAmt = NumberUtil.toDouble(txtSaveFee.getText());
        if (saveFeeAmt < 0) {
            txtSaveFee.requestFocus();
            return;
        }

        CbSaveAccountBean cbSaveAccountBean = getSaveAccountControl().getSaveAccountBean(txtAccountCode.getText());

        if (cbSaveAccountBean != null) {
            JOptionPane.showMessageDialog(this, "เลขที่บัญชีซ้ำกับในระบบ กรุณาตรวจสอบ");
            clearOpenAccount();
            return;
        }

        cbSaveAccountBean = new CbSaveAccountBean();
        cbSaveAccountBean.setAccount_code(txtAccountCode.getText());
        cbSaveAccountBean.setBook_no(txtBookNo.getText());
        cbSaveAccountBean.setB_BALANCE(0);
        cbSaveAccountBean.setRemark(ThaiUtil.Unicode2ASCII("เปิดบัญชี"));
        cbSaveAccountBean.setBook_evidence3("");
        cbSaveAccountBean.setBook_evidence4("");
        if (chkSave1.isSelected()) {
            cbSaveAccountBean.setBook_evidence1(ThaiUtil.Unicode2ASCII(chkSave1.getText()));
        } else {
            cbSaveAccountBean.setBook_evidence1("");
        }
        if (chkSave2.isSelected()) {
            cbSaveAccountBean.setBook_evidence2(ThaiUtil.Unicode2ASCII(chkSave2.getText()));
        } else {
            cbSaveAccountBean.setBook_evidence2("");
        }

        ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());

        cbSaveAccountBean.setB_CUST_CODE(txtProfileCode.getText());
        cbSaveAccountBean.setB_CUST_NAME(ThaiUtil.Unicode2ASCII(profileBean.getP_custName()));
        cbSaveAccountBean.setB_CUST_LASTNAME(ThaiUtil.Unicode2ASCII(profileBean.getP_custSurname()));
        cbSaveAccountBean.setB_INTEREST(0.00);
        cbSaveAccountBean.setHoon_balance(0);
        String accType = getIDCombobox(cbAccType);
        cbSaveAccountBean.setAccount_type(accType);

        cbSaveAccountBean.setB_FEE(NumberUtil.toDouble(txtSaveFee.getText()));
        cbSaveAccountBean.setBranch_Code(Value.BRANCH_CODE);
        cbSaveAccountBean.setEmp_Code(Value.USER_CODE);
        ProfileBean pBean = getProfileControl().listCbProfile(cbSaveAccountBean.getB_CUST_CODE());
        cbSaveAccountBean.setMEMBER_TYPE(pBean.getP_member_type());
        cbSaveAccountBean.setAccount_status("1");

        if (getSaveAccountControl().saveSaveAccount(cbSaveAccountBean)) {
            // save fee transaction            
            CbFeeBean feeBean = getCbFeeControl().getCbFee("2");
            if (feeBean != null) {
                if (cbSaveAccountBean.getB_FEE() > 0) {
                    CbFeeTransactionBean feeTBean = new CbFeeTransactionBean();
                    feeTBean.setFee_amount(cbSaveAccountBean.getB_FEE());
                    feeTBean.setFee_branch(Value.BRANCH_CODE);
                    feeTBean.setFee_code(feeBean.getExp_id());
                    feeTBean.setFee_desc(feeBean.getExp_desc());
                    feeTBean.setFee_emp_code(Value.USER_CODE);
                    feeTBean.setFee_cust_code(txtProfileCode.getText());

                    getCbFeeTransactionControl().saveCbFeeTransaction(feeTBean);
                }
            }

            JOptionPane.showMessageDialog(this, "เปิดบัญชีเรียบร้อยแล้ว");

            //บันทึกข้อมูลการเปิดบัญชี
            Value.CUST_ACCOUNT_CODE = txtAccountCode.getText();
            txtAccCode.setText(Value.CUST_ACCOUNT_CODE);
            showAccount();

            int iConfirm1 = JOptionPane.showConfirmDialog(this, "ท่านต้องการดำเนินการพิมพ์หน้าปกสมุดหรือไม่ ?");
            if (iConfirm1 == JOptionPane.YES_OPTION) {
                //print หน้าปก
                printFrontBook();
            }

            jTabbedPane8.setEnabledAt(1, true);
            jTabbedPane8.setEnabledAt(2, true);

            txtSaveFee.setText("0.00");
            txtDepositBaht.requestFocus();

            showAccountQty();

            jTabbedPane1.setSelectedIndex(0);
        }

        showListSelect("", "");
    }

    private void showAccount() {
        ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        if (profileBean != null) {
            loadDataAccount();
            enableComponents(jPanel5, false);
            btnSaveAccOpen.setEnabled(false);
            btnPrintSliplOpenAcc.setEnabled(false);

            loadLoan();

            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(2, true);
            jTabbedPane1.setEnabledAt(4, true);

            if (jTabbedPane8.isEnabledAt(1)) {
                jTabbedPane8.setSelectedIndex(1);
            }

            jTabbedPane1.setSelectedIndex(2);
            jTabbedPane8.setSelectedIndex(0);
            txtDepositBaht.requestFocus();
            txtDepositBaht.requestFocus();
        } else {
            CbLoanAccountBean loanBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
            if (loanBean != null) {
                enableComponents(jTabbedPane1, true);
                enableComponents(jTabbedPane7, true);

                jTabbedPane1.setSelectedIndex(5);
                jTabbedPane7.setSelectedIndex(0);
                loadDataPayment();
                findCustomer();
            } else {
                JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลเลขที่บัญชีที่ท่านระบุ");
                txtAccCode.setText("");
                txtAccCode.requestFocus();
            }
        }
    }

    private void depositMoney() throws Exception {

        //update balance account
        String dMoney = txtDepositBaht.getText();

        CbSaveAccountBean sBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());

        //update transactoin        
        CbTransactionSaveBean tSave = new CbTransactionSaveBean();
        tSave.setT_date(DateFormat.getLocal_ddMMyyyy(txtDepositDate.getText()));
        tSave.setT_acccode(txtAccCode.getText());
        tSave.setT_custcode(txtProfileCode.getText());
        tSave.setT_description(ThaiUtil.Unicode2ASCII("ฝากเงิน"));
        tSave.setT_status(AppConstants.CB_STATUS_SAVE);
        tSave.setT_amount(NumberUtil.toDouble(dMoney));
        tSave.setMoney_in(NumberUtil.toDouble(dMoney));
        tSave.setMoney_out(0.00);
        tSave.setT_empcode(Value.USER_CODE);
        tSave.setT_docno(txtDepCode.getText());
        tSave.setRemark(ThaiUtil.Unicode2ASCII(txtRemark1.getText()));

        ConfigBean cBean = getConfigControl().getConfigBean();

        tSave.setT_booktype(cBean.getSaveDocPrefix());
        tSave.setLineNo(getCbTransactionSaveControl().getLineByAccount(txtAccCode.getText()));
        tSave.setPrintChk("N");
        tSave.setT_index(getCbTransactionSaveControl().getMaxIndex(txtAccCode.getText()));
        tSave.setT_interest(0.00);
        tSave.setBranchCode(Value.BRANCH_CODE);
        tSave.setT_balance(sBean.getB_BALANCE() + tSave.getMoney_in());

        ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        tSave.setT_hoon(pBean.getHoon_Qty());
        tSave.setT_fee(0);

        if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
            String sql = "update cb_save_account set "
                    + "B_Balance = B_Balance+" + dMoney + " "
                    + "where account_code='" + txtAccCode.getText() + "'";
            getSaveAccountControl().update(sql);

            String sql2 = "update cb_profile set "
                    + "Save_Balance=Save_Balance+" + dMoney + " "
                    + "where P_CustCode='" + txtProfileCode.getText() + "'";
            getProfileControl().update(sql2);

            sql = "update cb_config set SaveDocRunning=SaveDocRunning+1";
            getConfigControl().update(sql);

            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลการฝากเงินเรียบร้อยแล้ว");
            TransactionAdvanceDialog dialog = new TransactionAdvanceDialog(new javax.swing.JFrame(), true,
                    txtProfileCode.getText(), txtAccCode.getText());
            dialog.saveTransaction();

            //load transaction
            loadTransactionPerson();

            loadSummary();

            PrintSlipBean psBean = new PrintSlipBean();
            psBean.setAccountName(txtProfileName.getText() + " ");
            psBean.setAccountCode(txtAccCode.getText());

            SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
            SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

            psBean.setTranDate(simpShort.format(new Date()));
            psBean.setTranTime(simpTime.format(new Date()));
            psBean.setEmpCode(Value.USER_CODE);
            psBean.setAmount(NumberFormat.showDouble2(tSave.getT_amount()));
            psBean.setDocNo(txtDepCode.getText());

            ListSaveConfirmDialog listD = new ListSaveConfirmDialog(this, true, psBean);
            listD.setVisible(true);

            clearOldDataSave();
            clearDeposit();
            showAccount();

            jTabbedPane8.setSelectedIndex(0);
            jTabbedPane8.setEnabledAt(1, true);
            jTabbedPane8.setEnabledAt(2, true);

            lbMoneyText.setText("(...)");
            txtDepositBaht.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "พบข้อมูลผิดพลาดไม่สามารถบันทึกข้อมูลการฝากเงินได้ !");
        }
    }

    private void resetDepositMoney() {
        txtDepositBaht.setText("0.00");
        lbMoneyText.setText("(...)");
        txtAccCodeLoad.setText("");

        txtDepositBaht.requestFocus();
    }

    private void enterAccount() {
        init1();

        ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        if (profileBean != null) {
            String status = profileBean.getStatus();
            if ("Cancel".equals(status)) {
                JOptionPane.showMessageDialog(this, "รหัสผู้ใช้งานนี้ได้ถูกยกเลิกออกจากระบบแล้ว !", "สถานะสมาชิก [ยกเลิก]", JOptionPane.WARNING_MESSAGE);
                txtProfileCode.setText("");
                LoanCustID.setText("");
                txtProfileCode.requestFocus();
            } else {
                if (Value.CUST_ACCOUNT_CODE != null) {
                    findCustomer();
                    txtAccCode.setText(Value.CUST_ACCOUNT_CODE);
                    showAccount();

                    //แสดง Dashboard ให้พนักงานเลือกทำรายการ
                    showListSelect(Value.CUST_ACCOUNT_CODE, "1");
                } else if (Value.CUST_LOAN_CODE != null) {
                    loadLoanDetail();

                    //แสดง Dashboard ให้พนักงานเลือกทำรายการ
                    showListSelect(Value.CUST_LOAN_CODE, "2");
                } else {
                    findCustomer();
                    //แสดง Dashboard ให้พนักงานเลือกทำรายการ
                    showListSelect("", "");
                }
            }
        }
    }

    private void clearOldDataSave() {
        txtBalance.setText("0.00");
        txtBalanceInterest.setText("0.00");
        txtAccTypeName.setText("");
    }

    private void printLoanFrontBook() {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        String accCode = txtLoanDocCode.getText();
        String barcode = accCode;
        String accName = txtProfileName.getText() + " ";
        String accType = cbLoanAcc.getSelectedItem().toString();//getNamCB(cbLoanAcc);
        CbLoanAccountBean loanBean = getLoanAccountControl().listLoanAccount(txtLoanDocCode.getText());
        String bookNo = "" + loanBean.getBook_no();
        view.printLoanFrontBook(accCode, accName, bookNo, barcode, accType);
    }

    private void printTransactionLoanBook(String accountCode) {
        //print รายการลงในสมุด
        PassBook_PSiPR9 v = new PassBook_PSiPR9();

        ArrayList<ReportOrangeBean> listBean = new ArrayList<>();
        ConfigBean cBean = getConfigControl().getConfigBean();

        String where = " and t_acccode='" + accountCode + "' "
                + "and printchk='N' and LineNo>0 and t_booktype "
                + "in ('" + cBean.getLoanDocPrefix() + "','" + cBean.getPaymentDocPrefix() + "') "
                + "order by t_index ";
        ArrayList<CbTransactionLoanBean> listLoan = getCbTransactionLoanControl().listTransactionLoan(where);
        SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yy");

        for (CbTransactionLoanBean loanBean : listLoan) {
            ReportOrangeBean bean1 = new ReportOrangeBean();
            bean1.setDate(sim.format(new Date()));
            bean1.setType(loanBean.getT_booktype());
            bean1.setStart(NumberFormat.showDouble2(loanBean.getT_amount()));//เงินต้น
            bean1.setPayStart("10");//10=ประเภทการกู้เงิน, 7=ประเภทการรับชำระ
            bean1.setPayInt("0.00");//ชำระดอก
            bean1.setBalance(NumberFormat.showDouble2(loanBean.getT_balance()));
            bean1.setLine("" + loanBean.getLineNo());

            listBean.add(bean1);

            //update book
            String sql = "update cb_transaction_loan "
                    + "set PrintChk='Y' "
                    + "where t_acccode='" + accountCode + "' "
                    + "and lineNO='" + bean1.getLine() + "' "
                    + "and printChk='N' and t_booktype in"
                    + "('" + cBean.getLoanDocPrefix() + "','" + cBean.getPaymentDocPrefix() + "')";
            getCbTransactionLoanControl().update(sql);
        }

        // print passbook
        v.printTransactionOrange2(listBean, true);
    }

    private void clearDeposit() {
        txtDepCode.setText("");
        txtBalance.setText("0.00");
        txtBalanceInterest.setText("0.00");
        txtDepositBaht.setText("0.00");
        txtRemark1.setText("");

        jTabbedPane8.setSelectedIndex(1);
        txtDepCode.requestFocus();
    }

    private void clearWithdraw() {
        txtWithdrawalBaht.setText("0.00");
        txtRemark2.setText("");
        lbMoneyText1.setText("(...)");
        txtWithdrawDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        txtWithdrawalCode.requestFocus();
    }

    private void withdraw() {
        double withdrawalBahtAmt = NumberUtil.toDouble(txtWithdrawalBaht.getText());
        if (withdrawalBahtAmt < 0) {
            txtWithdrawalBaht.requestFocus();
        }

        //update balance account
        String wMoney = txtWithdrawalBaht.getText();
        try {
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(DateFormat.getLocal_ddMMyyyy(txtWithdrawDate.getText()));
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("ถอนเงิน"));
            tSave.setT_status(AppConstants.CB_STATUS_WITHDRAW);
            tSave.setT_amount(-NumberUtil.toDouble(wMoney));
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(NumberUtil.toDouble(wMoney));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno(txtWithdrawalCode.getText());
            tSave.setRemark(ThaiUtil.Unicode2ASCII(txtRemark2.getText()));

            ConfigBean cBean = getConfigControl().getConfigBean();

            tSave.setT_booktype(cBean.getWithdrawDocPrefix());
            tSave.setT_interest(0.00);

            tSave.setLineNo(getCbTransactionSaveControl().getLineByAccount(txtAccCode.getText()));
            tSave.setPrintChk("N");
            tSave.setT_index(getCbTransactionSaveControl().getMaxIndex(txtAccCode.getText()));

            // get account Balance
            CbSaveAccountBean sBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
            tSave.setT_balance(sBean.getB_BALANCE() - tSave.getMoney_out());

            ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_hoon(pBean.getHoon_Qty());
            tSave.setBranchCode(Value.BRANCH_CODE);
            tSave.setT_fee(0);

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql = "update cb_save_account set "
                        + "B_Balance = B_Balance-" + wMoney + " "
                        + "where account_code='" + txtAccCode.getText() + "';";
                getSaveAccountControl().update(sql);

                String sql2 = "update cb_profile set "
                        + "Save_Balance=Save_Balance-" + wMoney + " "
                        + "where P_CustCode='" + txtProfileCode.getText() + "';";
                getProfileControl().update(sql2);

                sql = "update cb_config set WithdrawDocRunning=WithdrawDocRunning+1";
                getConfigControl().update(sql);

                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลการถอนเงินเรียบร้อยแล้ว");
                TransactionAdvanceDialog dialog = new TransactionAdvanceDialog(new javax.swing.JFrame(), true,
                        txtProfileCode.getText(), txtAccCode.getText());
                dialog.saveTransaction();

                loadSummary();

                PrintSlipBean psBean = new PrintSlipBean();
                psBean.setAccountName(txtProfileName.getText() + " ");
                psBean.setAccountCode(txtAccCode.getText());

                SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
                SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

                psBean.setTranDate(simpShort.format(new Date()));
                psBean.setTranTime(simpTime.format(new Date()));
                psBean.setEmpCode(Value.USER_CODE);
                psBean.setAmount(NumberFormat.showDouble2(tSave.getMoney_out()));
                psBean.setDocNo(txtWithdrawalCode.getText());

                ListWithdrawConfirmDialog listD = new ListWithdrawConfirmDialog(this, true, psBean);
                listD.setVisible(true);

                clearOldDataSave();
                clearWithdraw();
                showAccount();

                lbMoneyText1.setText("(...)");
                jTabbedPane8.setSelectedIndex(1);
                txtWithdrawalBaht.requestFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    private void showDocAuto2() {
        if ("".equals(txtAccCode.getText())) {
            return;
        }

        CbSaveAccountBean sBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
        if (sBean != null) {
            txtBalance.setText(NumberFormat.showDouble2(sBean.getB_BALANCE()));
            txtBalanceTotal.setText(NumberFormat.showDouble2(sBean.getB_BALANCE()));
            txtBalanceInterest.setText(NumberFormat.showDouble2(sBean.getB_INTEREST()));
            txtAccCodeLoad.setText(sBean.getAccount_type());

            jTabbedPane8.setEnabledAt(1, true);
            ConfigBean bean = getConfigControl().getConfigBean();
            if ("Y".equals(bean.getBranchPrefix())) {
                BranchBean bBean = getBranchControl().getData();
                txtDepCode.setText(bBean.getCode() + bean.getSaveDocPrefix() + getRunning(bean.getSaveDocRunning()));
            } else {
                txtDepCode.setText(bean.getSaveDocPrefix() + getRunning(bean.getSaveDocRunning()));
            }

            int page = getPage(getCbTransactionSaveControl().getMaxIndex(txtAccCode.getText()));

            BookPageAt.setText("" + page);
            txtBookPage.setText("" + getCbTransactionSaveControl().getLineByAccount(txtAccCode.getText()));

            txtWithdrawalCode.setText("");

            txtDepositBaht.requestFocus();
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

    private String getBookNo(int run) {
        if (run == 0) {
            run = 1;
        }
        if (run < 10) {
            return "00" + run;
        } else if (run < 100) {
            return "0" + run;
        } else {
            return "" + run;
        }
    }

    private void showDocAuto3() {
        ConfigBean bean = getConfigControl().getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = getBranchControl().getData();
            txtWithdrawalCode.setText(bBean.getCode() + bean.getWithdrawDocPrefix() + getRunning(bean.getWithdrawDocRunning()));
        } else {
            txtWithdrawalCode.setText(bean.getWithdrawDocPrefix() + getRunning(bean.getWithdrawDocRunning()));
        }

        txtDepCode.setText("");

        initWithdraw();

        txtWithdrawalBaht.requestFocus();

    }

    private void showTime() {
        final SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss");
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i == 10) {
                        i = 0;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }

                    btnTimeShow.setText(sTime.format(new Date()));
                }
            }
        }).start();
    }

    private void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }

    private void init1() {
        txtStartAcc.setText("");
        txtTotalSave.setText("0.00");
        txtTotalValue.setText("0.00");
        txtARProduct.setText("0.00");

        ArrayList<CbSaveConfigBean> listBean = getSaveConfigControl().listSaveConfig();
        cbAccType.removeAllItems();
        for (int i = 0; i < listBean.size(); i++) {
            CbSaveConfigBean bean = (CbSaveConfigBean) listBean.get(i);
            cbAccType.addItem(bean.getTypeCode() + " - " + bean.getTypeName());
        }

        ArrayList<CbHoonConfigBean> listHoon = getHoonConfigControl().listCbHoonConfig();
        cbHoonType.removeAllItems();
        for (int i = 0; i < listHoon.size(); i++) {
            CbHoonConfigBean bean = (CbHoonConfigBean) listHoon.get(i);
            cbHoonType.addItem(bean.getHoonCode() + " - " + bean.getHoonName());
        }

        cbLoanAcc.removeAllItems();
        ArrayList<CbLoanConfigBean> listLoanBean = getLoanConfigControl().listLoanConfig();
        for (int i = 0; i < listLoanBean.size(); i++) {
            CbLoanConfigBean loanBean = (CbLoanConfigBean) listLoanBean.get(i);
            cbLoanAcc.addItem(loanBean.getLoanCode() + " - " + loanBean.getLoanName());
        }

        ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        txtTotalValue.setText(NumberFormat.showDouble2(pBean.getHoon_Qty()));

        double hoonTotalAmt = NumberUtil.toDouble(txtTotalValue.getText());
        if (hoonTotalAmt > 0) {
            jTabbedPane5.setEnabledAt(1, true);
        } else {
            jTabbedPane5.setEnabledAt(1, false);
        }

        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }

    private void resetBuyHoon() {
        txtDocNo.setText("");
        txtHoonQTY.setText("0");
        txtCashPay.setText("0.00");
        txtHoonTon.setText("0.00");
        txtAmount.setText("0.00");

        txtHoonQTY.requestFocus();
    }

    private void saveBuyHoon() {
        //บันทึกข้อมูลการซื้อหุ้น
        try {
            //update transactoin
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(new Date());
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("ซื้อหุ้น"));
            tSave.setT_status(AppConstants.CB_STATUS_BUY_HOON);
            tSave.setT_amount(NumberUtil.toDouble(txtHoonQTY.getText()));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno(txtDocNo.getText());
            tSave.setRemark(ThaiUtil.Unicode2ASCII("ซื้อหุ้น"));
            tSave.setT_booktype("");
            tSave.setLineNo(0);
            tSave.setPrintChk("N");
            tSave.setT_index(0);
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(0.00);
            tSave.setT_hoon_rate(NumberUtil.toDouble(txtValueBaht.getText()));
            tSave.setBranchCode(Value.BRANCH_CODE);

            tSave.setT_hoon_amt(NumberUtil.toDouble(txtAmount.getText()));
            tSave.setT_hoon_cash(NumberUtil.toDouble(txtCashPay.getText()));
            tSave.setT_hoon_ton(NumberUtil.toDouble(txtHoonTon.getText()));

            // get account Balance
            ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_balance(pBean.getSave_Balance());
            tSave.setT_hoon(pBean.getHoon_Qty() + (int) tSave.getT_amount());

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty+" + tSave.getT_amount() + " "
                        + "where p_CustCode='" + txtProfileCode.getText() + "';";
                getProfileControl().update(sql2);

                String sql = "update cb_config set HoonDocRunning=HoonDocRunning+1";
                getConfigControl().update(sql);
            }
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลการซื้อหุ้นเรียบร้อยแล้ว");

            loadSummary();

            ViewReport vp = new ViewReport();
            vp.printReportBuyHoon(txtProfileCode.getText(), txtDocNo.getText());
            clearOldDataSave();

            pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            txtTotalValue.setText(NumberFormat.showDouble2(pBean.getHoon_Qty()));

            resetBuyHoon();
            jTabbedPane5.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void saveSaleHoon() {
        //บันทึกข้อมูลการขายหุ้น
        try {
            //update transactoin
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(new Date());
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("ขายหุ้น"));
            tSave.setT_amount(NumberUtil.toDouble(txtTotalSellHoonAmount.getText()));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno(txtDocNo1.getText());
            tSave.setRemark(ThaiUtil.Unicode2ASCII("ขายหุ้น"));
            tSave.setT_status(AppConstants.CB_STATUS_SALE_HOON);
            tSave.setT_booktype("");
            tSave.setLineNo(0);
            tSave.setPrintChk("N");
            tSave.setT_index(0);
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(0.00);
            tSave.setT_hoon_rate(NumberUtil.toDouble(txtPriceValue.getText()));
            tSave.setBranchCode(Value.BRANCH_CODE);

            double totalAmount = NumberUtil.toDouble(txtTotalAmount.getText());
            tSave.setT_hoon_amt(totalAmount);
            tSave.setT_hoon_cash(totalAmount);
            tSave.setT_hoon_ton(0);

            // get account Balance
            ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_balance(pBean.getSave_Balance());
            tSave.setT_hoon(pBean.getHoon_Qty() - (int) tSave.getT_amount());

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty-" + tSave.getT_amount() + " "
                        + "where p_CustCode='" + txtProfileCode.getText() + "';";
                getProfileControl().update(sql2);

                String sql = "update cb_config set HoonSaleDocRunning=HoonSaleDocRunning+1";
                getConfigControl().update(sql);
            }

            JOptionPane.showMessageDialog(this, "ทำรายการขายหุ้นเสร็จเรียบร้อย");
            loadSummary();

            ViewReport v = new ViewReport();
            v.printReportSellHoon(txtProfileCode.getText(), txtDocNo1.getText());
            clearOldDataSave();
            resetBuyHoon();
            showAccount();
            resetSaleHoon();
            jTabbedPane5.setSelectedIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void dumpDB() {
        DatabaseDumpDialog dd = new DatabaseDumpDialog(this, true);
        dd.setVisible(true);
    }

    private void resetSaleHoon() {
        txtTotalAmount.setText("0.00");
        txtTotalSellHoonAmount.setText("0");

        txtTotalSellHoonAmount.requestFocus();
    }

    private String getIDCombobox(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            String id = items[0].trim();
            return id;
        } else {
            return "";
        }
    }

    private String getNamCB(JComboBox cb) {
        if (cb.getItemCount() > 0) {
            String[] items = cb.getSelectedItem().toString().split("-");
            if (items.length > 1) {
                String name = items[1].trim();
                return name;
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    private void computeFinishPay() {
        if ("".equals(txtLoanDateStart.getText())) {
            txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        }
        Date d = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int perMonth = NumberUtil.toInt(txtLoanPerMonth.getText());
        c.add(Calendar.MONTH, perMonth - 1);
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(c.getTime()));

        txtLoanDateStart.requestFocus();
    }

    private void loadLoanDetail() {
        String tDocNo = txtLoanDocCode.getText();

        ArrayList<CbLoanTablePaymentBean> listTable = getCbLoanTablePaymentControl().listCbLoanTablePayment(tDocNo);

        DefaultTableModel md = (DefaultTableModel) tbArGroup1.getModel();
        JTableUtil.alignCenter(tbArGroup1, 0);
        JTableUtil.alignRight(tbArGroup1, 1);
        JTableUtil.alignCenter(tbArGroup1, 2);
        JTableUtil.alignRight(tbArGroup1, 3);
        JTableUtil.alignRight(tbArGroup1, 4);
        JTableUtil.alignRight(tbArGroup1, 5);
        JTableUtil.alignCenter(tbArGroup1, 6);
        int ssize = md.getRowCount();
        for (int i = 0; i < ssize; i++) {
            md.removeRow(0);
        }

        for (int i = 0; i < listTable.size(); i++) {
            CbLoanTablePaymentBean ltb = (CbLoanTablePaymentBean) listTable.get(i);
            md.addRow(new Object[]{
                i + 1,
                NumberFormat.showDouble2(ltb.getBase_total_amount()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_lost()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_mgr()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_int()),
                NumberFormat.showDouble2(ltb.getNet_total_pay()),
                NumberFormat.showDouble2(ltb.getTable_avg_compute()),
                DateFormat.getLocale_ddMMyyyy(ltb.getSys_date())
            });
        }

        loadBonsman(txtLoanDocCode.getText());

        DocumentGarunteeBean dBean = getDocumentGarunteeControl().getDocumentGaruntee(txtLoanDocCode.getText());
        if (dBean != null) {
            txtAssetGaruntee1.setText(dBean.getDOC_DESC());
            txtImg1.setText(dBean.getIMAGE1());
            txtImg2.setText(dBean.getIMGAE2());
            txtImg3.setText(dBean.getIMAGE3());
        }
    }

    private void loadLoanDetailPayment() {
        JTableHeader tHeader = tbArGroup2.getTableHeader();
        tHeader.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbArGroup2.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbArGroup2.setRowHeight(25);

        JTableHeader tHeader1 = tbHistoryPayment.getTableHeader();
        tHeader1.setFont(new Font(AppConstants.DEFAULT_FONT, Font.BOLD, AppConstants.DEFAULT_FONT_SIZE));

        tbHistoryPayment.setFont(new Font(AppConstants.DEFAULT_FONT, Font.PLAIN, AppConstants.DEFAULT_FONT_SIZE));
        tbHistoryPayment.setRowHeight(25);

        String tDocNo = txtAccCode.getText();

        ArrayList<CbLoanTablePaymentBean> listTable = getCbLoanTablePaymentControl().listCbLoanTablePayment(tDocNo);

        DefaultTableModel md = (DefaultTableModel) tbArGroup2.getModel();
        JTableUtil.alignCenter(tbArGroup2, 0);
        JTableUtil.alignRight(tbArGroup2, 1);
        JTableUtil.alignRight(tbArGroup2, 2);
        JTableUtil.alignRight(tbArGroup2, 3);
        JTableUtil.alignRight(tbArGroup2, 4);
        JTableUtil.alignRight(tbArGroup2, 5);
        JTableUtil.alignRight(tbArGroup2, 6);
        JTableUtil.alignRight(tbArGroup2, 7);
        int ssize = md.getRowCount();
        for (int i = 0; i < ssize; i++) {
            md.removeRow(0);
        }

        double balanceAmt = 0.00;
        String colorPay = "<html><span style=\"background-color: green; color:white;\">";
        String close = "</span></html>";
        for (int i = 0; i < listTable.size(); i++) {
            CbLoanTablePaymentBean ltb = (CbLoanTablePaymentBean) listTable.get(i);

            String c1 = colorPay;
            String c2 = close;
            if (ltb.getBalance_amount() > 0) {
                c1 = "";
                c2 = "";
            }

            md.addRow(new Object[]{
                DateFormat.getLocale_ddMMyyyy(ltb.getDue_date()),
                NumberFormat.showDouble2(ltb.getPayment_fee()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_lost()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_mgr()),
                NumberFormat.showDouble2(ltb.getLoan_int_ar_int()),
                NumberFormat.showDouble2(ltb.getBase_total_amount()),
                NumberFormat.showDouble2(ltb.getNet_total_pay()),//ชำระต่องวด
                c1 + NumberFormat.showDouble2(ltb.getPayment_balance()) + c2,
                NumberFormat.showDouble2(ltb.getBalance_amount())//ยอดคงเหลือ
            });

            balanceAmt += ltb.getBalance_amount();
        }

        txtArTotalBalance.setText(NumberFormat.showDouble2(balanceAmt));

        CbLoanAccountBean loanBean = getLoanAccountControl().listLoanAccount(tDocNo);
        double totalArAmt = (loanBean.getLoan_amount() * loanBean.getLoan_interest() / 100) * loanBean.getPeriod_pay();
        totalArAmt += loanBean.getLoan_amount();
        txtArNetAmt.setText(NumberFormat.showDouble2(totalArAmt));

        //กระบวนการคำนวณค่าปรับ
        Date d1 = new Date();
        Date d2 = DateFormat.getLocal_ddMMyyyy(txtPaymentDate.getText());
        if (d2 == null) {
            d2 = new Date();
        }
        try {
            String sql = "select due_date "
                    + "from cb_loan_table_payment "
                    + "where loan_doc_no='" + loanBean.getLoan_docno() + "' "
                    + "and balance_amount>0 "
                    + "order by loan_index;";
            ResultSet rs1 = getCbLoanTablePaymentControl().findData(sql);
            //ใช้ if เท่านั้นเพราะต้องการเอาวันที่ due_date แรก
            if (rs1.next()) {
                d1 = rs1.getDate("due_date");
            }

            rs1.close();
        } catch (Exception e) {
            System.err.println(e.getCause());
        }

        int dayOver = DateUtil.getDayDiff(d1, d2);
        CbLoanConfigBean configBean = getLoanConfigControl().listLoanConfig(loanBean.getLoan_type());

        if (dayOver > configBean.getLoanPenaltyDay()) {//เข้าเงื่อนไขการคิดค่าปรับ
            double feeAmtPer = configBean.getLoanPenaltyINT();//เปอร์เซ็นต์ในการคิดค่าปรับ

            try {
                String sql = "select sum(loan_int_ar_lost+loan_int_ar_mgr+loan_int_ar_int) totalInt,"
                        + "sum(base_total_amount) base_total_amount "
                        + "from cb_loan_table_payment "
                        + "where loan_doc_no='" + loanBean.getLoan_docno() + "' "
                        + "and balance_amount>0";
                ResultSet rs = getCbLoanTablePaymentControl().findData(sql);
                if (rs.next()) {
                    double totalInt = rs.getDouble("totalInt") * feeAmtPer / 100;
                    double baseTotalAmt = rs.getDouble("base_total_amount") * feeAmtPer / 100;

                    if ("1".equals(configBean.getChkPIntTable())) {//คิดดอกเบี้ยปรับจากดอกเบี้ยค้าง
                        txtPaymentFee.setText(NumberFormat.showDouble2(totalInt * (dayOver - configBean.getLoanPenaltyDay())));
                    } else if ("1".equals(configBean.getChkPIntCapital())) {//คิดดอกเบี้ยปรับจากเงินต้นคงเหลือ
                        txtPaymentFee.setText(NumberFormat.showDouble2(baseTotalAmt * (dayOver - configBean.getLoanPenaltyDay())));
                    }
                }

                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        CbLoanTablePaymentBean bean = getCbLoanTablePaymentControl().tablePayment(txtAccCode.getText());
        if (bean != null) {
            txtLoanStartDate.setText(DateFormat.getLocale_ddMMyyyy(loanBean.getLoan_start_date()));
            txtPaymentPerMonth.setText(NumberFormat.showDouble2(bean.getBalance_amount()));
            txtPaymentFee.setText(NumberFormat.showDouble2(0));
            txtIntLost.setText(NumberFormat.showDouble2(bean.getLoan_int_ar_lost()));
            txtArIntMgr.setText(NumberFormat.showDouble2(bean.getLoan_int_ar_mgr()));
            txtArLoanInt.setText(NumberFormat.showDouble2(bean.getLoan_int_ar_int()));

            if (AppConstants.INT_EFFITIVE_RATE.equals(configBean.getIntFixed())) {
                String sql = "select max(sys_date) sys_date "
                        + "from cb_loan_table_payment "
                        + "where loan_doc_no='" + txtAccCode.getText() + "' "
                        + "and payment_balance>0";
                Date lastPaymentDate = null;
                try {
                    ResultSet rs = getCbLoanTablePaymentControl().findData(sql);
                    if (rs.next()) {
                        lastPaymentDate = rs.getDate(1);
                    }
                    if (lastPaymentDate == null) {
                        lastPaymentDate = DateFormat.getLocal_ddMMyyyy(txtLoanStartDate.getText());
                    }
                    rs.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                    e.printStackTrace();
                }

                int dayCheckINT = DateUtil.getDayDiff(lastPaymentDate, new Date());
                computeEffectiveRate(configBean.getLoanINT(), dayCheckINT, txtAccCode.getText());
            }
        }
    }

    private void addBoundsman() {
        if ("".equals(txtLoanCustCode.getText())) {
            return;
        }

        if ("".equals(txtLoanDocCode.getText())) {
            JOptionPane.showMessageDialog(this, "กรุณากำหนดเลขที่บัญชีก่อน !");
            txtLoanDocCode.requestFocus();
            return;
        }

        CbBondsmanBean bean = new CbBondsmanBean();
        bean.setLoan_docno(txtLoanDocCode.getText());
        bean.setIdcard(txtLoanCustCode.getText());
        bean.setName(txtLoanCustName.getText());
        bean.setSurname(txtLoanCustSurname.getText());

        if (getCbBondsmanControl().saveCbBondsman(bean)) {
            loadBonsman(txtLoanDocCode.getText());
            clearBondman();
        }
    }

    private void loadBonsman(String loan_docno) {
        ArrayList<CbBondsmanBean> listBond = getCbBondsmanControl().listCbBondsman(loan_docno);
        DefaultTableModel model = (DefaultTableModel) tbGuarantor.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        for (int i = 0; i < listBond.size(); i++) {
            CbBondsmanBean bean = (CbBondsmanBean) listBond.get(i);
            model.addRow(new Object[]{
                (i + 1),
                bean.getIdcard(),
                bean.getName(),
                bean.getSurname()
            });
        }
    }

    private void clearBondman() {
        txtLoanCustCode.setText("");
        txtLoanCustCode.requestFocus();
        txtLoanCustName.setText("");
        txtLoanCustSurname.setText("");
    }

    private void clearFormLoan() {
        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
        txtLoanAmt.setText("0.00");
        txtPayPerMonth.setText("0.00");
        txtLoanDocCode.setText("");
        txtPayPerMonth.setText("0.00");
        if (cbLoanAcc.getSelectedIndex() != -1) {
            cbLoanAcc.setSelectedIndex(0);
        }
        cbLoanTypePayment.setSelectedIndex(1);

        DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
        int size = model.getRowCount();
        for (int j = 0; j < size; j++) {
            model.removeRow(0);
        }
        if (cbLoanAcc.getItemCount() > 0) {
            cbLoanAcc.setSelectedIndex(0);
        }
        cbLoanTypePayment.setSelectedIndex(1);
        txtLoanFee.setText("0.00");
        txtLoanPerMonth.setText("1");

        txtB1.setText("0.00");
        txtB2.setText("0.00");
        txtB3.setText("0.00");
        txtB4.setText("0.00");
        txtB5.setText("0.00");

        //tab3
        txtLoanCustCode.setText("");
        txtLoanCustName.setText("");
        txtLoanCustSurname.setText("");
        txtAssetGaruntee1.setText("");
        txtImg1.setText("");
        txtImg2.setText("");
        txtImg3.setText("");
        DefaultTableModel model2 = (DefaultTableModel) tbGuarantor.getModel();
        int size2 = model2.getRowCount();
        for (int j = 0; j < size2; j++) {
            model2.removeRow(0);
        }

        txtLoanAmt.requestFocus();
    }

    private void saveAccountAct() {
        if ("".equals(txtDepCode.getText())) {
            txtDepCode.requestFocus();
            return;
        }

        CbTransactionSaveBean bean = getCbTransactionSaveControl().checkTransactionSave(txtDepCode.getText());
        if (bean != null) {
            JOptionPane.showMessageDialog(this, "เลขที่เอกสารนี้ถูกบันทึกในระบบแล้ว กรุณาตรวจสอบ");
            resetDepositMoney();
            return;
        }

        double balance = NumberUtil.toDouble(txtDepositBaht.getText());
        if (balance <= 0) {
            txtDepositBaht.requestFocus();
            return;
        }

        CbSaveConfigBean saveBean = getSaveConfigControl().listSaveConfig(txtAccCode.getText());
        if (balance <= saveBean.getMinDeposit()) {
            JOptionPane.showMessageDialog(this, "ท่านต้องฝากเงินไม่ต่ำกว่า " + saveBean.getMinDeposit());
            txtDepositBaht.requestFocus();
            return;
        }

        try {
            depositMoney();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        jTabbedPane1.setSelectedIndex(0);
        //แสดง Dashboard ให้พนักงานเลือกทำรายการ
        showListSelect(Value.CUST_ACCOUNT_CODE, "1");
    }

    private void withdrawAccountAct() {
        if ("".equals(txtWithdrawalCode.getText())) {
            JOptionPane.showMessageDialog(this, "เลขที่เอกสารนี้ถูกบันทึกในระบบแล้ว กรุณาตรวจสอบ");
            clearWithdraw();
            return;
        }

        CbTransactionSaveBean bean = getCbTransactionSaveControl().checkTransactionSave(txtWithdrawalCode.getText());
        if (bean != null) {
            JOptionPane.showMessageDialog(this, "พบเลขที่เอกสารนี้ถูกบันทึกในระบบแล้ว กรุณาตรวจสอบ !");
            clearWithdraw();
            return;
        }

        double total = NumberUtil.toDouble(txtBalanceTotal.getText());
        double balance = NumberUtil.toDouble(txtWithdrawalBaht.getText());
        if (balance > 0 && balance <= total) {
            withdraw();

            //แสดง Dashboard ให้พนักงานเลือกทำรายการ
            jTabbedPane1.setSelectedIndex(0);
            showListSelect(Value.CUST_ACCOUNT_CODE, "1");
        } else {
            if (balance > total) {
                JOptionPane.showMessageDialog(this, "จำนวนเงินที่ท่านต้องการถอนมีมากกว่าจำนวนเงินคงเหลือในบัญชี !");
                txtWithdrawalBaht.requestFocus();
            } else {
                txtWithdrawalCode.requestFocus();
            }
        }
    }

    private void menuHide() {
        mnRptProfitCompany.setVisible(false);
    }

    private boolean checkAllowWithdraw() {
        String accCodeCheck = txtAccountCode.getText();
        ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
        if ("2".equals(profileBean.getP_member_type())) {//ประเภทกลุ่ม
            accCodeCheck = txtProfileCode.getText();

            ArrayList<CbWithdrawAllowBean> listBean = getCbWithdrawAllowControl().listCbWithdrawAllow(accCodeCheck);
            InputWithdrawDialog inputDialog = new InputWithdrawDialog(this, true, listBean);
            inputDialog.setVisible(true);

            return inputDialog.allowPerson();
        } else {
            ArrayList<CbWithdrawAllowBean> listBean = new ArrayList<>();
            CbWithdrawAllowBean bean = new CbWithdrawAllowBean();
            bean.setAccount_no(accCodeCheck);
            bean.setCust_code(txtProfileCode.getText());
            bean.setIndex(1);

            listBean.add(bean);

            InputWithdrawDialog inputDialog = new InputWithdrawDialog(this, true, listBean);
            inputDialog.setVisible(true);

            return inputDialog.allowPerson();
        }

    }

    private void loadSummary() {
        SaveSummaryBean bean = getSaveSummaryControl().getSaveData();

        jTextField2.setText("" + bean.getAccountAll());
        jTextField3.setText(NumberFormat.showDouble2(bean.getSaveAll()));
        jTextField4.setText(NumberFormat.showDouble2(bean.getInterestAll()));
        jTextField5.setText(NumberFormat.showDouble2(bean.getTotalBalanceAll()));

        jTextField7.setText("" + bean.getAccountToday());
        jTextField12.setText("" + bean.getCloseToday());
        jTextField8.setText(NumberFormat.showDouble2(bean.getSaveToday()));
        jTextField9.setText(NumberFormat.showDouble2(bean.getWithdrawToday()));
        jTextField10.setText(NumberFormat.showDouble2(bean.getTotalBalanceToday()));

        jTextField14.setText("" + bean.getHoon_balance_all());
        jTextField16.setText(NumberFormat.showDouble2(bean.getHoon_value_amount_all()));
        jTextField24.setText(NumberFormat.showDouble2(bean.getHoon_buy_today()));
        jTextField29.setText(NumberFormat.showDouble2(bean.getHoon_sale_today()));
        jTextField33.setText(NumberFormat.showDouble2(bean.getHoon_transfer_today()));
        jTextField25.setText(NumberFormat.showDouble2(bean.getHoon_value_amount_today()));
        jTextField13.setText(NumberFormat.showDouble2(bean.getFeeToday()));
    }

    private boolean validateDataLoan() {

        if (NumberUtil.toDouble(txtLoanAmt.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนเงินที่ต้องการกู้ !");
            txtLoanAmt.selectAll();
            txtLoanAmt.requestFocus();
            return false;
        }

        if (StringUtil.isEmpty(txtLoanDocCode.getText())) {
            JOptionPane.showMessageDialog(this, "ไม่พบเลขที่เอกสารเงินกู้/หรือไม่สามารถสร้างเลขที่เอกสารได้ !");
            return false;
        }

        if (NumberUtil.toDouble(txtPayPerMonth.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "จำนวนเงินผ่อนชำระต่องวด น้อยกว่า 0 บาท !");
            txtPayPerMonth.selectAll();
            txtPayPerMonth.requestFocus();
            return false;
        }

        if (StringUtil.isEmpty(txtStartLoanDate.getText())) {
            return false;
        }

        double loanAmt = NumberUtil.toDouble(txtLoanAmt.getText());
        double limitAmt = NumberUtil.toDouble(txtLimitLoanAmt.getText());
        int loanPerMonth = NumberUtil.toInt(txtLoanPerMonth.getText());

        if (loanPerMonth <= 0) {
            JOptionPane.showMessageDialog(this, "จำนวนงวดที่กำหนดไม่ถูกต้อง !");
            txtLoanPerMonth.selectAll();
            txtLoanPerMonth.requestFocus();
            return false;
        }

        String docType = getIDCombobox(cbLoanAcc);
        CbLoanConfigBean lBean = getLoanConfigControl().listLoanConfig(docType);
        if (loanPerMonth > lBean.getLoanPerMonth()) {
            JOptionPane.showMessageDialog(this, "ท่านกู้เกินจำนวนงวดตามที่สัญญากำหนดไว้ ต้องไม่เกิน " + lBean.getLoanPerMonth() + " งวด");
            return false;
        }

        Date dCurrent = DateFormat.getLocal_ddMMyyyy(DateFormat.getLocale_ddMMyyyy(new Date()));
        Date dStartLoan = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());

        int chkDateCompare = dCurrent.compareTo(dStartLoan);
        if (chkDateCompare == 1) {
            JOptionPane.showMessageDialog(this, "ท่านกำหนดวันที่เริ่มกู้เงินไม่ถูกต้อง !");
            txtLoanDateStart.requestFocus();
            return false;
        }

        if (loanAmt > limitAmt) {
            JOptionPane.showMessageDialog(this, "ท่านกู้เกินวงเงินที่กำหนด กรุณาตรวจสอบ !");
            txtLoanAmt.requestFocus();
            return false;
        }

        if (loanAmt <= 0) {
            JOptionPane.showMessageDialog(this, "จำนวนเงินในการกู้ไม่ถูกต้อง กรุณาตรวจสอบ !");
            txtLoanAmt.requestFocus();
            return false;
        }

        return true;
    }

    private void printFrontBook() {
        //print หน้าปกสมุด
        PassBook_PSiPR9 view = new PassBook_PSiPR9();
        String accCode = txtAccCode.getText();
        String accName = txtProfileName.getText() + " ";
        String accType = "";
        if (cbAccType.getItemCount() > 0) {
            accType = "" + cbAccType.getSelectedItem();
        }

        CbSaveAccountBean saveBean = getSaveAccountControl().getSaveAccountBean(txtAccCode.getText());
        String bookNo = saveBean.getBook_no();

        view.printFrontBook(accCode, accName, bookNo, accCode, accType);
    }

    private int getPage(int pageAt) {
        int page = 0;
        if (pageAt <= 24) {
            page = 1;
        } else if (pageAt <= 48) {
            page = 2;
        } else if (pageAt <= 72) {
            page = 3;
        } else if (pageAt <= 96) {
            page = 4;
        } else if (pageAt <= 120) {
            page = 5;
        } else if (pageAt <= 144) {
            page = 6;
        } else if (pageAt <= 168) {
            page = 7;
        } else if (pageAt <= 192) {
            page = 8;
        } else if (pageAt <= 216) {
            page = 9;
        } else if (pageAt <= 240) {
            page = 10;
        } else if (pageAt <= 264) {
            page = 11;
        } else if (pageAt <= 288) {
            page = 12;
        } else if (pageAt <= 312) {
            page = 13;
        } else if (pageAt <= 336) {
            page = 14;
        } else if (pageAt <= 360) {
            page = 15;
        } else if (pageAt <= 384) {
            page = 16;
        } else if (pageAt <= 408) {
            page = 17;
        } else if (pageAt <= 432) {
            page = 18;
        } else if (pageAt <= 456) {
            page = 19;
        } else if (pageAt <= 480) {
            page = 20;
        }

        return page;
    }

    private void computeBahtPerMonth() {
        String accCode = txtLoanDocCode.getText();//สำหรับหาค่า Config
        CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(accCode);
        if (lBean == null) {
            lBean = new CbLoanAccountBean();
            lBean.setLoan_docno(accCode);
            lBean.setBook_no("");
            double loanFee = NumberUtil.toDouble(txtLoanPenaltyINT.getText());
            lBean.setLoan_fee(loanFee);
            lBean.setBook_evidence1("");
            lBean.setBook_evidence2("");
            lBean.setBook_evidence3("");
            lBean.setBook_evidence4("");
            lBean.setCust_code(txtProfileCode.getText());

            BranchBean bBean = getBranchControl().getData();
            lBean.setBranch_code(bBean.getCode());

            String loanType = getIDCombobox(cbLoanAcc);

            lBean.setLoan_type(loanType);
            lBean.setLoan_person1("");
            lBean.setLoan_person2("");
            lBean.setPay_user("");
        }
        CbLoanConfigBean cBean2 = getLoanConfigControl().listLoanConfig(lBean.getLoan_type());
        double loanAmt;
        int loanPerAmt;
        double loanInt;
        double netTotal;
        int _netTotal;

        //ให้แสดงเป็นบรรทัดเดียว requirement ใหม่
        if (AppConstants.INT_EFFITIVE_RATE.equals(cBean2.getIntFixed())) {
            loanAmt = NumberUtil.toDouble(txtLoanAmt.getText());
            loanPerAmt = NumberUtil.toInt(txtLoanPerMonth.getText());
            loanInt = NumberUtil.toDouble(txtLoanIntPercent.getText());
            netTotal = (loanAmt + ((loanAmt * loanPerAmt * loanInt) / 100)) / loanPerAmt;
            _netTotal = (int) netTotal;
            double paymentAmt = loanAmt + ((loanAmt * loanInt * loanPerAmt) / 100);
            double divide = loanAmt / loanPerAmt;
            txtPayPerMonth.setText(NumberFormat.showDouble2(_netTotal));

            //load table
            DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
            int size = model.getRowCount();
            for (int j = 0; j < size; j++) {
                model.removeRow(0);
            }

            //สำรองหนี้สูญ
            double intBadDebt = NumberUtil.toDouble(txtIntBadDebt.getText());
            double intTurnover = NumberUtil.toDouble(txtIntTurnover.getText());
            double intNormal = NumberUtil.toDouble(txtIntNormal.getText());
            Calendar c = Calendar.getInstance();
            Date dd = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
            c.setTime(dd);

            double b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;
            for (int i = 0; i < loanPerAmt; i++) {
                double a2 = loanAmt * intBadDebt / 100;//สำรองหนี้สูญ
                double a3 = loanAmt * intTurnover / 100;//ค่าจัดการ
                double a4 = loanAmt * intNormal / 100;//ดอกเบี้ยกู้
                double a5 = divide + (a2 + a3 + a4);//รวมดอกเบี้ยยอดที่ต้องชำระ
                double a6 = loanAmt - divide;

                model.addRow(new Object[]{
                    i + 1,
                    NumberFormat.showDouble2(divide),
                    NumberFormat.showDouble2(a2),
                    NumberFormat.showDouble2(a3),
                    NumberFormat.showDouble2(a4),
                    NumberFormat.showDouble2(a5),
                    NumberFormat.showDouble2(a6),
                    DateFormat.getLocale_ddMMyyyy(c.getTime())
                });

                b1 += divide;
                b2 += a2;
                b3 += a3;
                b4 += a4;
                b5 += a5;

                paymentAmt -= a5;
                loanAmt -= divide;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 2:
                        c.add(Calendar.YEAR, 1);
                        break;
                    case 1:
                        c.add(Calendar.MONTH, 1);
                        break;
                    default:
                        c.add(Calendar.DATE, 1);
                        break;
                }
            }

            txtB1.setText(NumberFormat.showDouble2(b1));
            txtB2.setText(NumberFormat.showDouble2(b2));
            txtB3.setText(NumberFormat.showDouble2(b3));
            txtB4.setText(NumberFormat.showDouble2(b4));
            txtB5.setText(NumberFormat.showDouble2(b5));
            int _LoanAmt = (int) b5 / loanPerAmt;
            txtPayPerMonth.setText(NumberFormat.showDouble2(_LoanAmt));
        } else if (AppConstants.INT_FLAT_RATE.equals(cBean2.getIntFixed())) {
            loanAmt = NumberUtil.toDouble(txtLoanAmt.getText());
            loanPerAmt = NumberUtil.toInt(txtLoanPerMonth.getText());
            loanInt = NumberUtil.toDouble(txtLoanIntPercent.getText());
            netTotal = (loanAmt + ((loanAmt * loanPerAmt * loanInt) / 100)) / loanPerAmt;

            //load table
            DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
            int size = model.getRowCount();
            for (int j = 0; j < size; j++) {
                model.removeRow(0);
            }

            int divide = 12 / 30;//วัน
            switch (cbLoanTypePayment.getSelectedIndex()) {
                case 1:
                    divide = 12;//เดือน
                    break;
                case 2:
                    divide = 1;//ปี
                    break;
                case 0:
                    break;
                default:
                    break;
            }

            //สำรองหนี้สูญ
            double intBadDebt = NumberUtil.toDouble(txtIntBadDebt.getText());
            double intTurnover = NumberUtil.toDouble(txtIntTurnover.getText());
            double intNormal = NumberUtil.toDouble(txtIntNormal.getText());
            double totalInt = intBadDebt + intTurnover + intNormal;
            double dbBadDebt = ((loanAmt * loanPerAmt * intBadDebt) / 100) / loanPerAmt;
            double dbTurnover = ((loanAmt * loanPerAmt * intTurnover) / 100) / loanPerAmt;
            double dbNormal = ((loanAmt * loanPerAmt * intNormal) / 100) / loanPerAmt;
            int totalpayPerMonth = (int) ((loanAmt / loanPerAmt) + (dbBadDebt + dbTurnover + dbNormal));
            double paymentAmt = loanAmt + ((loanAmt * totalInt * loanPerAmt) / 100);
            txtPayPerMonth.setText(NumberFormat.showDouble2(totalpayPerMonth));

            Calendar c = Calendar.getInstance();
            Date dd = DateFormat.getLocal_ddMMyyyy(txtLoanDateStart.getText());
            c.setTime(dd);

            double b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;
            for (int i = 0; i < loanPerAmt; i++) {
                double a1 = loanAmt / loanPerAmt;
                double a2 = loanAmt * intBadDebt / 100;//สำรองหนี้สูญ
                double a3 = loanAmt * intTurnover / 100;//ค่าจัดการ
                double a4 = loanAmt * intNormal / 100;//ดอกเบี้ยกู้
                double a5 = (int) (a1 + a2 + a3 + a4);//รวมยอดที่ต้องชำระ
                double a6 = paymentAmt - a5;

                if (i == loanPerAmt - 1) {
                    a5 += a6;
                    a6 = 0;
                }
                model.addRow(new Object[]{
                    i + 1,
                    NumberFormat.showDouble2(a1),
                    NumberFormat.showDouble2(a2),
                    NumberFormat.showDouble2(a3),
                    NumberFormat.showDouble2(a4),
                    NumberFormat.showDouble2(a5),
                    NumberFormat.showDouble2(a6),
                    DateFormat.getLocale_ddMMyyyy(c.getTime())
                });

                b1 += a1;
                b2 += a2;
                b3 += a3;
                b4 += a4;
                b5 += a5;

                paymentAmt -= a5;
                switch (cbLoanTypePayment.getSelectedIndex()) {
                    case 2:
                        c.add(Calendar.YEAR, 1);
                        break;
                    case 1:
                        c.add(Calendar.MONTH, 1);
                        break;
                    default:
                        c.add(Calendar.DATE, 1);
                        break;
                }
            }

            txtB1.setText(NumberFormat.showDouble2(b1));
            txtB2.setText(NumberFormat.showDouble2(b2));
            txtB3.setText(NumberFormat.showDouble2(b3));
            txtB4.setText(NumberFormat.showDouble2(b4));
            txtB5.setText(NumberFormat.showDouble2(b5));

            int iModelSize = model.getRowCount();
            double total = 0;
            for (int i = 0; i < iModelSize; i++) {
                double data5 = NumberUtil.toDouble(model.getValueAt(i, 5).toString());
                total += data5;
                if (i == iModelSize - 1) {
                    double a = NumberUtil.toDouble(txtB5.getText());
                    double b = a - total;
                    data5 += b;
                    model.setValueAt(NumberFormat.showDouble2(data5), i, 5);
                }
            }
        }
    }

    private void loadDataPayment() {
        CbLoanAccountBean lBean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());
        if (lBean == null) {
            JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลเลขที่บัญชีนี้ในระบบ");
            txtAccCode.setText("");
            txtAccCode.requestFocus();
        } else {
            txtAccCode.setText(txtAccCode.getText());
            txtPaymentDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            txtPaymentPerMonth.setText(NumberFormat.showDouble2(lBean.getPayPerAmount()));
            txtPaymentFee.setText(NumberFormat.showDouble2(0));

            ProfileBean profileBean = getProfileControl().listCbProfile(lBean.getCust_code());
            txtProfileCode.setText(profileBean.getP_custCode());

            CbLoanConfigBean loanConfigBean = getLoanConfigControl().listLoanConfig(lBean.getLoan_type());
            txtIntLost.setText(NumberFormat.showDouble2((loanConfigBean.getIntBadDebt() / 1200) * lBean.getLoan_amount()));
            txtArIntMgr.setText(NumberFormat.showDouble2((loanConfigBean.getIntTurnover() / 1200) * lBean.getLoan_amount()));
            txtArLoanInt.setText(NumberFormat.showDouble2((loanConfigBean.getIntNormal() / 1200) * lBean.getLoan_amount()));

            txtPaymentAmountCash.requestFocus();
            txtPaymentAmountCash.selectAll();
        }
    }

    private void initHoonTransfer() {
        ConfigBean bean = getConfigControl().getConfigBean();
        if ("Y".equals(bean.getBranchPrefix())) {
            BranchBean bBean = getBranchControl().getData();
            txtDocnoTransfer.setText(bBean.getCode() + bean.getHoonTransferDocPrefix() + getRunning(bean.getHoonTransferDocRunning()));
        } else {
            txtDocnoTransfer.setText(bean.getHoonTransferDocPrefix() + getRunning(bean.getHoonTransferDocRunning()));
        }

        txtTotaTransferHoonAmt.requestFocus();

        txtDateTransfer.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
    }

    private void transferHoon() {
        //บันทึกข้อมูลการโอนหุ้น

        //update transactoin การโอนหุ้น
        try {
            String sHoonMoney = txtTotaTransferHoonAmt.getText();
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(new Date());
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("โอนหุ้น"));
            tSave.setT_amount(NumberUtil.toInt(sHoonMoney));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno(txtDocnoTransfer.getText());
            tSave.setRemark(ThaiUtil.Unicode2ASCII("โอนหุ้น"));
            tSave.setT_status(AppConstants.CB_STATUS_TRANS_HOON);
            tSave.setT_booktype("");

            tSave.setLineNo(0);
            tSave.setPrintChk("N");
            tSave.setT_index(0);
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(0.00);
            tSave.setT_hoon_rate(0);
            tSave.setBranchCode(Value.BRANCH_CODE);

            tSave.setT_hoon_amt(0);
            tSave.setT_hoon_cash(0);
            tSave.setT_hoon_ton(0);

            // get account Balance
            ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_balance(profileBean.getHoon_Qty());
            tSave.setT_hoon(NumberUtil.toInt(sHoonMoney));

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql2 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty-" + sHoonMoney + " "
                        + "where p_CustCode='" + txtProfileCode.getText() + "';";
                getProfileControl().update(sql2);

                JOptionPane.showMessageDialog(this, "ทำรายการโอนหุ้นเรียบร้อยแล้ว");
                loadSummary();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //update transactoin การรับหุ้นจากการโอน
        try {
            String sHoonMoney = txtTotaTransferHoonAmt.getText();
            //update transactoin การโอนหุ้น
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(new Date());
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("รับเข้าหุ้น"));
            tSave.setT_amount(NumberUtil.toInt(sHoonMoney));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno(txtDocnoTransfer.getText());
            tSave.setRemark(ThaiUtil.Unicode2ASCII("รับเข้าหุ้น"));
            tSave.setT_booktype("");

            tSave.setLineNo(0);
            tSave.setPrintChk("N");
            tSave.setT_index(0);
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(0.00);
            tSave.setT_hoon_rate(0);
            tSave.setBranchCode(Value.BRANCH_CODE);

            tSave.setT_hoon_amt(0);
            tSave.setT_hoon_cash(0);
            tSave.setT_hoon_ton(0);

            // get account Balance
            ProfileBean profileBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_balance(profileBean.getHoon_Qty());
            tSave.setT_hoon(NumberUtil.toInt(sHoonMoney));

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql3 = "update cb_profile set "
                        + "Hoon_Qty=Hoon_Qty+" + sHoonMoney + " "
                        + "where p_CustCode='" + txtTransferPerson.getText() + "';";
                getProfileControl().update(sql3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // อัพเดต Running
        String sql = "update cb_config set HoonTransferDocRunning=HoonTransferDocRunning+1";
        getConfigControl().update(sql);

        JOptionPane.showMessageDialog(this, "ทำรายการโอนหุ้นเสร็จเรียบร้อย");
        ViewReport v = new ViewReport();
        v.printReportTransferHoon(txtProfileCode.getText(), txtDocnoTransfer.getText());

        clearHoonTransfer();
    }

    private void clearHoonTransfer() {
        txtTotaTransferHoonAmt.setText("0");
        txtTransferAppCode.setText("");
        txtTransferPerson.setText("");
        txtDateTransfer.setText("");

        txtTotaTransferHoonAmt.requestFocus();
    }

    private void closeAccount() {
        //update balance account
        String cMoney = txTotalMoneyClose.getText();
        try {
            CbTransactionSaveBean tSave = new CbTransactionSaveBean();
            tSave.setT_date(new Date());
            tSave.setT_acccode(txtAccCode.getText());
            tSave.setT_custcode(txtProfileCode.getText());
            tSave.setT_description(ThaiUtil.Unicode2ASCII("ปิดบัญชี"));
            tSave.setT_status(AppConstants.CB_STATUS_CLOSE_SAVE);
            tSave.setT_amount(-NumberUtil.toDouble(cMoney));
            tSave.setMoney_in(0.00);
            tSave.setMoney_out(NumberUtil.toDouble(cMoney));
            tSave.setT_empcode(Value.USER_CODE);
            tSave.setT_docno("");
            tSave.setRemark(ThaiUtil.Unicode2ASCII(txtCloseRemark.getText()));

            ConfigBean cBean = getConfigControl().getConfigBean();
            tSave.setT_booktype(cBean.getWithdrawDocPrefix());
            tSave.setLineNo(getCbTransactionSaveControl().getLineByAccount(txtAccCode.getText()));
            tSave.setPrintChk("N");
            tSave.setT_index(getCbTransactionSaveControl().getMaxIndex(txtAccCode.getText()));
            tSave.setT_interest(0.00);

            // get account Balance
            ProfileBean pBean = getProfileControl().listCbProfile(txtProfileCode.getText());
            tSave.setT_hoon(pBean.getHoon_Qty());
            tSave.setBranchCode(Value.BRANCH_CODE);
            tSave.setT_fee(0);
            tSave.setT_balance(0);

            if (getCbTransactionSaveControl().saveCbTransactionSave(tSave)) {
                String sql = "update cb_save_account set "
                        + "B_Balance = '0.00',"
                        + "B_Update=curdate(),"
                        + "account_status='" + AppConstants.CB_STATUS_CLOSE_SAVE + "',"
                        + "remark='" + ThaiUtil.Unicode2ASCII(txtCloseRemark.getText()) + "' "
                        + "where account_code='" + txtAccCode.getText() + "'";
                getSaveAccountControl().update(sql);

                String sql2 = "update cb_profile set "
                        + "Save_Balance=Save_Balance-" + cMoney + " "
                        + "where P_CustCode='" + txtProfileCode.getText() + "'";
                getProfileControl().update(sql2);

                sql = "update cb_config set WithdrawDocRunning=WithdrawDocRunning+1";
                getConfigControl().update(sql);

                JOptionPane.showMessageDialog(this, "ดำเนินการปิดบัญชีเงินฝากเรียบร้อยแล้ว");
                loadSummary();

                PassBook_PSiPR9 v = new PassBook_PSiPR9();
                PrintSlipBean psBean = new PrintSlipBean();
                psBean.setAccountName(txtProfileName.getText() + " ");
                psBean.setAccountCode(txtAccCode.getText());

                SimpleDateFormat simpShort = new SimpleDateFormat("dd/MM/yy");
                SimpleDateFormat simpTime = new SimpleDateFormat("hh:mm:ss");

                psBean.setTranDate(simpShort.format(new Date()));
                psBean.setTranTime(simpTime.format(new Date()));
                psBean.setEmpCode(Value.USER_CODE);
                psBean.setAmount(NumberFormat.showDouble2(tSave.getMoney_out()));

                ListCloseSaveConfirmDialog listD = new ListCloseSaveConfirmDialog(this, true, psBean);
                listD.setVisible(true);

                btnRegister();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void loadTransactionPerson() {
        String where = " and t_acccode='" + txtAccCode.getText() + "' "
                + "and t_status in('2','3','8','11') "
                + "order by t_date,t_time ";
        ArrayList<CbTransactionSaveBean> listSave = getCbTransactionSaveControl().listTransactionSave(where);
        DefaultTableModel mm = (DefaultTableModel) tbTransSave.getModel();
        JTableUtil.alignRight(tbTransSave, 3);
        JTableUtil.alignRight(tbTransSave, 4);
        JTableUtil.alignRight(tbTransSave, 5);
        int size = mm.getRowCount();
        for (int i = 0; i < size; i++) {
            mm.removeRow(0);
        }
        String type = "";
        for (CbTransactionSaveBean sBean : listSave) {
            double deposit = 0;
            double withdraw = 0;
            if (AppConstants.CB_STATUS_SAVE.equals(sBean.getT_status()) || "11".equals(sBean.getT_status())) {
                type = "ฝากเงิน";
                deposit = sBean.getT_amount();
            } else if (AppConstants.CB_STATUS_WITHDRAW.equals(sBean.getT_status())) {
                type = "ถอนเงิน";
                withdraw = sBean.getT_amount();
            } else if (AppConstants.CB_STATUS_CLOSE_SAVE.equals(sBean.getT_status())) {
                type = "ปิดบัญชี";
                withdraw = sBean.getT_amount();
            }

            String desc;
            if ("INT".equals(sBean.getT_booktype())) {
                desc = "<html><font color=green>ดอกเบี้ยฝาก</font></html>";
            } else {
                desc = ThaiUtil.ASCII2Unicode(sBean.getT_description());
            }

            mm.addRow(new Object[]{
                sBean.getT_docno(),
                DateFormat.getLocale_ddMMyyyy(sBean.getT_date()),
                sBean.getT_time(),
                NumberFormat.showDouble2(deposit),
                NumberFormat.showDouble2(withdraw),
                NumberFormat.showDouble2(sBean.getT_balance()),
                desc
            });
        }
    }

    private void loadAddressLoan() {
        AddressBean aBean;
        switch (cbAddrType.getSelectedIndex()) {
            case 0:
                //ที่อยู่ปัจจุบัน
                aBean = getAddressControl().listProfileAddress(LoanCustID.getText(), "1");
                break;
            case 1:
                //ที่อยู่ตามบัตรประชาชน
                aBean = getAddressControl().listProfileAddress(LoanCustID.getText(), "2");
                break;
            case 2:
                //ที่อยู่ที่ทำงาน
                aBean = getAddressControl().listProfileAddress(LoanCustID.getText(), "3");
                break;
            default:
                aBean = new AddressBean();
                break;
        }

        txtAddNo1.setText(aBean.getAddr_No());
        txtAddrMoo1.setText(aBean.getAddr_Moo());
        txtAddrMooName1.setText(aBean.getAddr_MooName());
        txtAddrRoad1.setText(aBean.getAddr_Road());
        txtAddrSoi1.setText(aBean.getAddr_Soi());
        txtAddrTambon1.setText(aBean.getAddr_Tambon());
        txtAddrAmphur1.setText(aBean.getAddr_Aumphur());
        txtAddrProvince1.setText(aBean.getAddr_Province());
        txtAddrPost1.setText(aBean.getAddr_Post());
        txtAddrMobile1.setText(aBean.getAddr_Mobile());
        txtAddrTel1.setText(aBean.getAddr_Tel());
    }

    private void loadLoanAccount() {
        CbLoanAccountBean bean = getLoanAccountControl().listLoanAccount(txtAccCode.getText());

        txtLoanAmt.setText(NumberFormat.showDouble2(bean.getLoan_amount()));
        txtStartLoanDate.setText(DateFormat.getLocale_ddMMyyyy(bean.getLoan_docdate()));
        txtLoanDocCode.setText(bean.getLoan_docno());
        txtLoanFee.setText(NumberFormat.showDouble2(bean.getLoan_fee()));
        txtLoanPerMonth.setText("" + bean.getPeriod_pay());
        txtLoanDateStart.setText(DateFormat.getLocale_ddMMyyyy(bean.getLoan_start_date()));
        txtLoanDateEnd.setText(DateFormat.getLocale_ddMMyyyy(bean.getLoan_end_date()));
        txtPayPerMonth.setText(NumberFormat.showDouble2(bean.getPayPerAmount()));

        //load table
        ArrayList<CbLoanTablePaymentBean> listPayment = getCbLoanTablePaymentControl().listCbLoanTablePayment(txtAccCode.getText());
        DefaultTableModel model = (DefaultTableModel) tbArGroup1.getModel();
        for (int i = 0; i < listPayment.size(); i++) {
            CbLoanTablePaymentBean pBean = (CbLoanTablePaymentBean) listPayment.get(i);
            model.addRow(new Object[]{
                pBean.getLoan_index(),
                pBean.getBase_total_amount(),
                pBean.getLoan_int_ar_lost(),
                pBean.getLoan_int_ar_mgr(),
                pBean.getLoan_int_ar_int(),
                pBean.getNet_total_pay(),
                pBean.getTable_avg_compute(),
                ""
            });
        }
    }

    private void confirmPayment2() {
        //จำนวนเงินที่รับชำระ
        double PaymentAmountCash = NumberUtil.toDouble(txtPaymentAmountCash.getText());

        if (PaymentAmountCash <= 0) {
            return;
        }

        double Temp_PaymentAmountCash = PaymentAmountCash;
        double returnLoanAmt = 0.00;
        double tempOver = 0.00;

        double PaymentFee = NumberUtil.toDouble(txtPaymentFee.getText());
        double Temp_PaymentFee = PaymentFee;

        ArrayList<CbLoanTablePaymentBean> listTable = getCbLoanTablePaymentControl().listCbLoanTablePayment(txtAccCode.getText());
        boolean isNext = true;
        for (int i = 0; i < listTable.size(); i++) {
            CbLoanTablePaymentBean bean = (CbLoanTablePaymentBean) listTable.get(i);

            //ทำให้ยอดเงินต้นเป็น int
            double a = bean.getBase_total_amount();
            double b = (int) bean.getBase_total_amount();
            bean.setBase_total_amount((int) bean.getBase_total_amount());

            if (bean.getBalance_amount() <= 0) {
                continue;
            }

            if (PaymentAmountCash <= bean.getBalance_amount()) {
                bean.setPayment_balance(PaymentAmountCash);
                bean.setPayment_money(PaymentAmountCash);
            } else {
                //กรณีเงินเกินงวดนั้น
                bean.setPayment_balance(bean.getBalance_amount());
                bean.setPayment_money(bean.getBalance_amount());
            }

            double total;
            if (PaymentAmountCash > PaymentFee) {//ค่าปรับ
                bean.setPayment_fee(0);
                PaymentFee = 0;
                total = PaymentAmountCash - PaymentFee;

                if (total > bean.getLoan_int_ar_lost()) {//หนี้สูญ
                    total = total - bean.getLoan_int_ar_lost();
                    bean.setLoan_int_ar_lost(0);

                    if (total > bean.getLoan_int_ar_mgr()) {//จัดการ
                        total = total - bean.getLoan_int_ar_mgr();
                        bean.setLoan_int_ar_mgr(0);

                        if (total > bean.getLoan_int_ar_int()) {//ดอกเบี้ย
                            total = total - bean.getLoan_int_ar_int();
                            bean.setLoan_int_ar_int(0);

                            if (total >= bean.getBase_total_amount()) {//เงินต้น
                                returnLoanAmt += bean.getBase_total_amount();

                                tempOver += (a - b);

                                total = total - bean.getBase_total_amount();
                                bean.setBalance_amount(0);
                                bean.setBase_total_amount(0);

                                if (total > 0) {
                                    PaymentAmountCash = total;
                                    isNext = false;
                                }

                            } else {//เงินต้น
                                returnLoanAmt += total;
                                total = bean.getBase_total_amount() - total;
                                bean.setBase_total_amount(total);

                                double totalB = bean.getLoan_int_ar_lost() + bean.getLoan_int_ar_mgr() + bean.getLoan_int_ar_int() + total;
                                bean.setBalance_amount(totalB);

                                isNext = true;
                            }
                        } else {//ดอกเบี้ย                                
                            total = bean.getLoan_int_ar_int() - total;
                            bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_int() + total);
                            bean.setLoan_int_ar_int(total);
                        }
                    } else {//จัดการ                            
                        total = bean.getLoan_int_ar_mgr() - total;
                        bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_mgr() + total);
                        bean.setLoan_int_ar_mgr(total);
                    }
                } else {//หนี้สูญ                        
                    total = bean.getLoan_int_ar_lost() - total;
                    bean.setBalance_amount(bean.getBalance_amount() - bean.getLoan_int_ar_lost() + total);
                    bean.setLoan_int_ar_lost(total);
                }
            } else {//ค่าปรับ                    
                total = PaymentFee - PaymentAmountCash;
                bean.setBalance_amount(bean.getBalance_amount() - PaymentFee + total);
                bean.setPayment_fee(total);
                PaymentFee = total;
                txtPaymentFee.setText(NumberFormat.showDouble2(total));//แสดงจำนวนค่าปรับคงเหลือ
            }

            String sql = "update cb_loan_table_payment set "
                    + "loan_int_ar_lost='" + bean.getLoan_int_ar_lost() + "',"
                    + "loan_int_ar_mgr='" + bean.getLoan_int_ar_mgr() + "',"
                    + "loan_int_ar_int='" + bean.getLoan_int_ar_int() + "',"
                    + "base_total_amount='" + bean.getBase_total_amount() + "',"
                    + "balance_amount='" + bean.getBalance_amount() + "', "
                    + "payment_balance=payment_balance+" + bean.getPayment_balance() + ", "
                    + "payment_money=payment_money+" + bean.getPayment_money() + ", "
                    + "payment_fee='" + bean.getPayment_fee() + "' "
                    + "where loan_doc_no='" + bean.getLoan_doc_no() + "' "
                    + "and loan_index='" + bean.getLoan_index() + "' "
                    + "and balance_amount>0";
            getCbLoanTablePaymentControl().update(sql);

            if (isNext) {
                break;
            }
        }

        try {
            //update loan account
            String sql = "update cb_loan_account set "
                    + "pay_amount='" + Temp_PaymentAmountCash + "',"
                    + "pay_date=curdate(),"
                    + "loan_datepay=curdate(),"
                    + "pay_time=curtime(),"
                    + "pay_user='" + Value.USER_CODE + "' "
                    + "where loan_docno='" + txtAccCode.getText() + "' "
                    + "and cust_code='" + txtProfileCode.getText() + "'";
            getLoanAccountControl().update(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        String sql = "update cb_profile set "
                + "Loan_Credit_Balance=Loan_Credit_Balance+" + (returnLoanAmt + tempOver) + ","
                + "Loan_Balance=Loan_Balance-" + (returnLoanAmt + tempOver) + " "
                + "where p_CustCode='" + txtProfileCode.getText() + "'";
        getProfileControl().update(sql);

        //ต้อง Save ลง history ของการรับชำระเงินด้วย
        CbTransactionLoanBean loanBean = new CbTransactionLoanBean();
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtPaymentDate.getText());
        loanBean.setT_date(d1);
        loanBean.setT_acccode(txtAccCode.getText());
        loanBean.setT_custcode(txtProfileCode.getText());
        loanBean.setT_description(ThaiUtil.Unicode2ASCII("รับชำระเงินกู้"));
        loanBean.setT_amount(Temp_PaymentAmountCash);
        loanBean.setT_empcode(Value.USER_CODE);
        loanBean.setT_docno(txtAccCode.getText());
        loanBean.setT_booktype(AppConstants.BOOKTYPE_PAYMENT);
        loanBean.setBranch_code(Value.BRANCH_CODE);
        loanBean.setT_status(AppConstants.CB_STATUS_PAYMENT);
        loanBean.setRemark("");
        loanBean.setT_hoon(0);
        loanBean.setLineNo(getCbTransactionLoanControl().getLineByAccount(txtAccCode.getText()));
        double ArLoanIntLost = NumberUtil.toDouble(txtIntLost.getText());
        double ArLoanIntMgr = NumberUtil.toDouble(txtArIntMgr.getText());
        double ArLoanIntInt = NumberUtil.toDouble(txtArLoanInt.getText());
        loanBean.setT_interest(ArLoanIntLost + ArLoanIntMgr + ArLoanIntInt);
        loanBean.setT_loan_int_ar_lost(ArLoanIntLost);
        loanBean.setT_loan_int_ar_mgr(ArLoanIntMgr);
        loanBean.setT_loan_int_ar_int(ArLoanIntInt);

        double balance = 0.00;
        try {
            sql = "select sum(balance_amount) balance_amount "
                    + "from cb_loan_table_payment "
                    + "where loan_doc_no='" + txtAccCode.getText() + "'";
            ResultSet rs = getCbLoanTablePaymentControl().findData(sql);
            if (rs.next()) {
                balance = rs.getDouble("balance_amount");
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        loanBean.setT_balance(balance);
        loanBean.setT_fee(Temp_PaymentFee);

        getCbTransactionLoanControl().saveCbTransactionLoan(loanBean);

        //printer out to printer
        try {
            PrintCOM pc = new PrintCOM();
            pc.printPaymentLoan(loanBean);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");
        txtPaymentDate.setText("");
        txtPaymentFee.setText("0.00");
        txtIntLost.setText("0.00");
        txtArIntMgr.setText("0.00");
        txtArLoanInt.setText("0.00");
        txtPaymentPerMonth.setText("0.00");
        txtPaymentAmountCash.setText("0.00");

        jTabbedPane7.setSelectedIndex(1);

        loadPaymentHistory();
        loadLoanDetailPayment();
    }

    private void loadPaymentHistory() {
        ArrayList<CbTransactionLoanBean> listLoan = getCbTransactionLoanControl().listCbTransactionLoanPayment(txtAccCode.getText());
        DefaultTableModel model = (DefaultTableModel) tbHistoryPayment.getModel();
        int size = model.getRowCount();
        for (int i = 0; i < size; i++) {
            model.removeRow(0);
        }

        JTableUtil.alignRight(tbHistoryPayment, 2);
        JTableUtil.alignRight(tbHistoryPayment, 3);
        JTableUtil.alignRight(tbHistoryPayment, 4);
        JTableUtil.alignRight(tbHistoryPayment, 5);
        JTableUtil.alignRight(tbHistoryPayment, 6);
        JTableUtil.alignRight(tbHistoryPayment, 7);

        for (int i = 0; i < listLoan.size(); i++) {
            CbTransactionLoanBean bean = (CbTransactionLoanBean) listLoan.get(i);
            model.addRow(new Object[]{
                DateFormat.getLocale_ddMMyyyy(bean.getT_date()),
                bean.getT_acccode(),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_lost()),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_mgr()),
                NumberFormat.showDouble2(bean.getT_loan_int_ar_int()),
                NumberFormat.showDouble2(bean.getT_fee()),
                NumberFormat.showDouble2(bean.getT_amount()),
                NumberFormat.showDouble2(bean.getT_balance()),
                bean.getT_empcode(),
                bean.getBranch_code()
            });
        }

        loadLoanDetailPayment();
    }

    private void showListSelect(String accCode, String accType) {
        Value.SELECT_CHOICE = 0;
        ListMenuDialog list = new ListMenuDialog(this, true, accCode, accType);
        list.setVisible(true);

        if (Value.SELECT_CHOICE == 1) {
            enableComponents(jTabbedPane1, true);
            jTabbedPane1.setSelectedIndex(1);

            init1();

            //disable tab
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);
            txtSaveFee.selectAll();
            txtSaveFee.requestFocus();
        } else if (Value.SELECT_CHOICE == 2 || Value.SELECT_CHOICE == 3 || Value.SELECT_CHOICE == 4) {///ฝากเงิน
            //find customer again
            txtProfileCode.setText(Value.CUST_CODE);
            findCustomer();
            showAccount();

            enableComponents(jTabbedPane1, true);
            enableComponents(jTabbedPane8, true);
            jTabbedPane8.setEnabledAt(0, true);
            jTabbedPane8.setEnabledAt(1, true);
            jTabbedPane8.setEnabledAt(2, true);

            jTabbedPane1.setSelectedIndex(2);
            txtAccCode.setText(Value.CUST_ACCOUNT_CODE);
            showAccountQty();

            switch (Value.SELECT_CHOICE) {
                case 2:
                    jTabbedPane8.setSelectedIndex(0);
                    txtDepositBaht.requestFocus();
                    break;
                case 3:
                    jTabbedPane8.setSelectedIndex(1);
                    txtWithdrawalBaht.requestFocus();
                    break;
                case 4:
                    jTabbedPane8.setSelectedIndex(2);
                    txtCloseRemark.requestFocus();
                    break;
                default:
                    break;
            }

            //disable tab
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);
        } else if (Value.SELECT_CHOICE == 5 || Value.SELECT_CHOICE == 6 || Value.SELECT_CHOICE == 7) {//ซื้อหุ้น
            txtProfileCode.setText(Value.CUST_CODE);
            findCustomer();

            init1();
            enableComponents(jTabbedPane1, true);
            enableComponents(jTabbedPane5, true);
            jTabbedPane1.setSelectedIndex(3);

            jTabbedPane5.setEnabledAt(0, true);
            jTabbedPane5.setEnabledAt(1, true);
            jTabbedPane5.setEnabledAt(2, true);
            switch (Value.SELECT_CHOICE) {
                case 5:
                    jTabbedPane5.setSelectedIndex(0);
                    break;
                case 6:
                    initHoonWithdraw();
                    jTabbedPane5.setSelectedIndex(1);
                    break;
                case 7:
                    initHoonTransfer();
                    jTabbedPane5.setSelectedIndex(2);
                    break;
                default:
                    break;
            }

            //disable tab
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);
        } else if (Value.SELECT_CHOICE == 8) {//เปิดบัญชีเงินกู้                    
            init1();
            enableComponents(jTabbedPane1, true);
            jTabbedPane1.setSelectedIndex(4);
            jTabbedPane3.setSelectedIndex(1);
            btnPrintLoanPaper.setEnabled(false);

            jButton18.setEnabled(false);
            txtPayPerMonth.setEditable(false);
            txtLoanPerMonth.setEditable(false);
            jButton17.setEnabled(false);

            //disable tab
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(5, false);
        } else if (Value.SELECT_CHOICE == 9) {//รับชำระเงินกู้
            enableComponents(jTabbedPane1, true);
            jTabbedPane1.setSelectedIndex(5);
            txtProfileCode.setText(Value.CUST_CODE);
            txtAccCode.setText(Value.CUST_LOAN_CODE);
            showAccountQty();

            //disable tab
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);

            loadPaymentHistory();
            loadLoanDetailPayment();
            txtPaymentAmountCash.setEditable(true);
            txtPaymentAmountCash.selectAll();
            txtPaymentAmountCash.requestFocus();
        } else {
            //lock panel
            jTabbedPane1.setSelectedIndex(0);
            btnRegister();
        }
    }

    private void paymentConfirm() {
        int confirm1 = JOptionPane.showConfirmDialog(this, "กรุณายืนยันการบันทึกข้อมูลรับชำระ ?");
        if (confirm1 == JOptionPane.YES_OPTION) {
            double arTotalBalance = NumberUtil.toDouble(txtArTotalBalance.getText());

            if (arTotalBalance <= 0) {
                JOptionPane.showMessageDialog(this, "ไม่มียอดค้างชำระในระบบ :)");
                txtPaymentAmountCash.setText("0.00");
                txtPaymentAmountCash.selectAll();
                txtPaymentAmountCash.requestFocus();
                return;
            }

            double PaymentAmountCash = NumberUtil.toDouble(txtPaymentAmountCash.getText());
            if (PaymentAmountCash <= 0) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนเงินรับฃำระด้วย !");
                txtPaymentAmountCash.setText("0.00");
                txtPaymentAmountCash.selectAll();
                txtPaymentAmountCash.requestFocus();
                return;
            }

            if (PaymentAmountCash > arTotalBalance) {
                JOptionPane.showMessageDialog(this, "กรุณาระบุจำนวนเงินที่ท่านต้องการปิดบัญชี ให้ตรงตามยอดหนี้คงเหลือ !");
                txtPaymentAmountCash.setText("0.00");
                txtPaymentAmountCash.selectAll();
                txtPaymentAmountCash.requestFocus();
                return;
            }

            if (PaymentAmountCash == arTotalBalance) {
                int confirm = JOptionPane.showConfirmDialog(this, "ท่านต้องการชำระยอดเต็มจำนวน เพื่อปิดบัญชีใช่หรือไม่ ?");
                if (confirm == JOptionPane.YES_OPTION) {
                    if (isEffitiveRate) {
                        try {
                            confirmPaymentEff();
                        } catch (Exception e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }

                    } else {
                        confirmPayment2();
                    }
                } else {
                    txtPaymentAmountCash.setText("0.00");
                    txtPaymentAmountCash.selectAll();
                    txtPaymentAmountCash.requestFocus();
                }
            } else {
                if (isEffitiveRate) {
                    try {
                        confirmPaymentEff();
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }

                } else {
                    confirmPayment2();
                }
            }
        }
    }

    private void enterLoan() {
        double loanAmt = NumberUtil.toDouble(txtLoanAmt.getText());
        double limitLoanAmt = NumberUtil.toDouble(txtLimitLoanAmt.getText());
        if (loanAmt > limitLoanAmt) {
            JOptionPane.showMessageDialog(this, "จำนวนเงินกู้เกินกำหนด กรุณาเพิ่มวงเงิน !");
            txtLoanAmt.selectAll();
            txtLoanAmt.requestFocus();
        } else {
            jButton18.setEnabled(true);
            jButton17.setEnabled(true);

            String strTxtLoanAmtPerPerson = txtLoanAmt.getText();
            double txtLoanAmtPerPerson = NumberUtil.toDouble(strTxtLoanAmtPerPerson);
            String docType = getIDCombobox(cbLoanAcc);
            CbLoanConfigBean lBean = getLoanConfigControl().listLoanConfig(docType);
            double txtLoanFeeAmt = lBean.getLoanFee() * txtLoanAmtPerPerson / 100;
            txtLoanFee.setText(NumberFormat.showDouble2(txtLoanFeeAmt));

            ConfigBean bean = getConfigControl().getConfigBean();
            if (bean.getBranchPrefix().equals("Y")) {
                BranchBean bBean = getBranchControl().getData();
                txtLoanDocCode.setText(bBean.getCode() + lBean.getLoanCode() + getRunning(lBean.getLoanRunning()));
            } else {
                txtLoanDocCode.setText(lBean.getLoanCode() + getRunning(lBean.getLoanRunning()));
            }

            txtStartLoanDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));
            txtStartLoanDate.setEditable(true);
            txtLoanFee.setEditable(true);
            txtLoanPerMonth.setEditable(true);
            txtLoanDateStart.setEditable(true);
            txtPayPerMonth.setEditable(true);

            txtStartLoanDate.requestFocus();
        }
    }

    private void saveLoanFromExcel() {
        LoadExcelAccountLoanDialog excel = new LoadExcelAccountLoanDialog(this, true);
        excel.setVisible(true);

        checkMenuLoadFile();
    }

    private void checkMenuLoadFile() {
        if (new File("D:/idCard.txt").exists()) {
            mnLoadExcel.setVisible(true);
        } else {
            mnLoadExcel.setVisible(false);
        }
    }

    private void computeEffectiveRate(double intPerYear, int dayPeriod, String loanDocNo) {
        double principle = NumberUtil.toDouble(txtPaymentPerMonth.getText());//เงินต้นคงเหลือ
        int dayMaxOfYear = 365;//จำนวนวันใน 1 ปี
        int monthMaxOfYear = 12;
        int dayMaxOfMonth = 30;

        double intPerDay = (principle * (intPerYear / monthMaxOfYear / dayMaxOfMonth) * dayPeriod) / dayMaxOfYear;
        txtArLoanInt.setText(NumberFormat.showDouble2("" + intPerDay));
        principle += intPerDay;

        txtPaymentPerMonth.setText(NumberFormat.showDouble2("" + principle));
    }

    private void computeLoanInterest() {
        txtPaymentDate.setText(DateFormat.getLocale_ddMMyyyy(new Date()));

        //compute interest  
        CbLoanAccountBean loanAccBean = getLoanAccountControl().getLoanAccount(txtAccCode.getText());

        CbLoanConfigBean loanConfigBean = getLoanConfigControl().listLoanConfig(loanAccBean.getLoan_type());

        if (loanConfigBean.getIntFixed().equals("E")) {
            isEffitiveRate = true;

            txtPaymentDate.setEditable(false);
            jButton20.setEnabled(false);

            txtLoanStartDate.setText(DateFormat.getLocale_ddMMyyyy(loanAccBean.getLoan_docdate()));

            int diff = th.co.cbank.util.DateUtil.diff(loanAccBean.getLoan_datePay(), new Date());

            BigDecimal balanceAmount = new BigDecimal("" + loanAccBean.getLoan_amount());
            BigDecimal intPerYear = new BigDecimal("" + (loanConfigBean.getLoanINT() / 100));
            BigDecimal diffDayFrom = new BigDecimal("" + diff);
            BigDecimal yearFixDay = new BigDecimal("365");

            BigDecimal totalInt = balanceAmount.multiply(intPerYear).multiply(diffDayFrom);
            BigDecimal intNetTotal = totalInt.divide(yearFixDay, 0, BigDecimal.ROUND_UP);

            DecimalFormat dec = new DecimalFormat("#,##0.00");
            txtArLoanInt.setText(dec.format(intNetTotal.doubleValue()));

            BigDecimal netTotal = balanceAmount.add(intNetTotal);
            txtPaymentPerMonth.setText(dec.format(netTotal.doubleValue()));

            txtArNetAmt.setText(dec.format(netTotal.doubleValue()));
            txtArTotalBalance.setText(dec.format(netTotal.doubleValue()));

            //set table new data
            if (tbArGroup2.getRowCount() > 0) {
                tbArGroup2.setValueAt(txtPaymentDate.getText(), 0, 0);
                tbArGroup2.setValueAt(intNetTotal.doubleValue(), 0, 4);
                tbArGroup2.setValueAt(balanceAmount.doubleValue(), 0, 5);
                tbArGroup2.setValueAt(netTotal.doubleValue(), 0, 6);
                tbArGroup2.setValueAt(0, 0, 7);
                tbArGroup2.setValueAt(netTotal.doubleValue(), 0, 8);
            }
        }

        txtPaymentAmountCash.selectAll();
    }

    private void confirmPaymentEff() throws Exception {
        double paymentAmountCash = NumberUtil.toDouble(txtPaymentAmountCash.getText());//จำนวนเงินที่ลูกค้าจ่าย
        double arLoanInt = NumberUtil.toDouble(txtArLoanInt.getText());//ดอกเบี้ยที่คำนวณได้
        double arPaymentFee = NumberUtil.toDouble(txtPaymentFee.getText());//ค่าปรับชำระเกินจำนวน
        double oldBalance = NumberUtil.toDouble(txtPaymentPerMonth.getText());//เงินต้นคงเหลือครั้งที่แล้ว
        double totalBalance = oldBalance - (arLoanInt + arPaymentFee);//เงินต้นจริง ๆ ที่ถูกตัดหลังจากรับชำระ

        CbLoanAccountBean loanAccBean = getLoanAccountControl().getLoanAccount(txtAccCode.getText());//ยอดคงเหลือจริงจากฐานข้อมูล
        double loanAmount = loanAccBean.getLoan_amount();

        if (paymentAmountCash <= 0) {
            return;
        }

        if (totalBalance > loanAmount) {
            paymentAmountCash = loanAmount;
        }

        //update profile
        double netTotalDis = paymentAmountCash - arLoanInt;
        String sql = "update cb_profile set "
                + "Loan_Credit_Balance=Loan_Credit_Balance+" + netTotalDis + ","
                + "Loan_Balance=Loan_Balance-" + netTotalDis + " "
                + "where p_CustCode='" + txtProfileCode.getText() + "'";
        getProfileControl().update(sql);

        //update loan account
        double balanceAmount = totalBalance - netTotalDis;
        if (netTotalDis <= 0) {
            netTotalDis = 0;
        }

        //update loan account
        sql = "update cb_loan_account set "
                + "pay_amount='" + paymentAmountCash + "',"
                + "loan_amount='" + balanceAmount + "',"
                + "pay_date=curdate(),"
                + "loan_datepay=curdate(),"
                + "pay_time=curtime(),"
                + "pay_user='" + Value.USER_CODE + "' "
                + "where loan_docno='" + txtAccCode.getText() + "' "
                + "and cust_code='" + txtProfileCode.getText() + "'";
        getLoanAccountControl().update(sql);

        //ต้อง Save ลง history ของการรับชำระเงินด้วย
        CbTransactionLoanBean loanBean = new CbTransactionLoanBean();
        Date d1 = DateFormat.getLocal_ddMMyyyy(txtPaymentDate.getText());
        loanBean.setT_date(d1);
        loanBean.setT_acccode(txtAccCode.getText());
        loanBean.setT_custcode(txtProfileCode.getText());
        loanBean.setT_description(ThaiUtil.Unicode2ASCII("รับชำระเงินกู้"));
        loanBean.setT_amount(paymentAmountCash);
        loanBean.setT_empcode(Value.USER_CODE);
        loanBean.setT_docno(txtAccCode.getText());
        loanBean.setT_booktype(AppConstants.BOOKTYPE_PAYMENT);
        loanBean.setBranch_code(Value.BRANCH_CODE);
        loanBean.setT_status(AppConstants.CB_STATUS_PAYMENT);
        loanBean.setRemark("");
        loanBean.setT_hoon(0);
        loanBean.setLineNo(getCbTransactionLoanControl().getLineByAccount(txtAccCode.getText()));
        loanBean.setT_interest(arLoanInt);
        loanBean.setT_loan_int_ar_lost(0);
        loanBean.setT_loan_int_ar_mgr(0);
        loanBean.setT_loan_int_ar_int(arLoanInt);
        loanBean.setT_balance(balanceAmount);
        loanBean.setT_fee(arPaymentFee);
        loanBean.setT_index(getCbTransactionLoanControl().getMaxIndex(txtAccCode.getText()));

        getCbTransactionLoanControl().saveCbTransactionLoan(loanBean);

        JOptionPane.showMessageDialog(this, "บันทึกข้อมูลเรียบร้อยแล้ว");

        try {
            //printer out to printer
            PrintCOM pc = new PrintCOM();
            pc.printPaymentLoan(loanBean);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "พบปัญหาในการพิมพ์ข้อมูล !!!\n" + e.getMessage());
            e.printStackTrace();
        }

        txtPaymentDate.setText("");
        txtPaymentFee.setText("0.00");
        txtIntLost.setText("0.00");
        txtArIntMgr.setText("0.00");
        txtArLoanInt.setText("0.00");
        txtPaymentPerMonth.setText("0.00");
        txtPaymentAmountCash.setText("0.00");

        jTabbedPane7.setSelectedIndex(1);

        loadPaymentHistory();
        loadLoanDetailPayment();

        jTabbedPane7.setEnabledAt(0, false);

        PrintLoanBookDialog printLoanBook = new PrintLoanBookDialog(this, true, loanBean.getT_acccode());
        printLoanBook.setVisible(true);
    }

    private void btnWithdrawMoney() {
        double t = NumberUtil.toDouble(txtWithdrawalBaht.getText());
        if (t <= 0) {
            return;
        }

        CbSaveConfigBean saveBean = getSaveConfigControl().listSaveConfig(txtAccCode.getText());
        if (t < saveBean.getMinWitdraw()) {
            JOptionPane.showMessageDialog(this, "ท่านต้องถอนเงินไม่ต่ำกว่า " + saveBean.getMinWitdraw());
            return;
        }

        if (!checkAllowWithdraw()) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์ถอนเงิน หรือระบุจำนวนสมาชิกที่สามารถถอนได้ไม่ครบถ้วน !");
            return;
        }

        withdrawAccountAct();
    }

    private void btnRegister() {
        if ("N".equals(Value.ACCESS[0])) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }

        if (btnRegister.getText().equals("เริ่มใหม่")) {
            Value.CUST_CODE = null;
            Value.CUST_ACCOUNT_CODE = null;
            Value.CUST_LOAN_CODE = null;
            Value.SELECT_CHOICE = -1;
            clearFormLoan();
            clearFormAll();
            loadSummary();
            btnRegister.setText("ลงทะเบียน");
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            jTabbedPane1.setEnabledAt(4, false);
            jTabbedPane1.setEnabledAt(5, false);

            jPanel31.setEnabled(true);
        } else {
            SavingDialog reg = new SavingDialog(this, true, true);
            reg.setVisible(true);

            if (Value.CUST_CODE != null) {
                txtProfileCode.setText(Value.CUST_CODE);
                LoanCustID.setText(Value.CUST_CODE);
                jTabbedPane1.setEnabledAt(1, true);
                jTabbedPane1.setEnabledAt(2, true);
                jTabbedPane1.setEnabledAt(4, true);

                enterAccount();

                txtMemQty.setText(getProfileControl().getPMax());
            }

            txtAccCode.requestFocus();
        }
    }

    private void btnEdit() {
        if (Value.ACCESS[1].equals("N")) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }
        if (profileIsActive) {
            SavingDialog reg = new SavingDialog(this, true, false);
            reg.setVisible(true);

            if (Value.CUST_CODE != null) {
                jTabbedPane8.setSelectedIndex(0);
                txtProfileCode.setText(Value.CUST_CODE);
                LoanCustID.setText(Value.CUST_CODE);
                enterAccount();
            } else {
                txtAccCode.requestFocus();
            }
        } else {
            EditProfileDialog ed = new EditProfileDialog(this, true);
            ed.setVisible(true);
            if (Value.CUST_CODE != null) {
                profileIsActive = true;
                btnEdit();
            }
        }
    }

    private void btnFind() {
        if (Value.ACCESS[2].equals("N")) {
            JOptionPane.showMessageDialog(this, "ท่านไม่มีสิทธิ์เข้าใช้งานฟังก์ชั่นการทำงานนี้");
            return;
        }

        clearFormLoan();
        clearProfile();
        clearOpenAccount();
        btnRegister.setText("ลงทะเบียน");

        txtAccCode.setText("");

        CustomerDialog custShow = new CustomerDialog(this, true);
        custShow.setVisible(true);

        if (Value.CUST_CODE != null) {
            txtProfileCode.setText(Value.CUST_CODE);
            findCustomer();

            if (Value.CUST_ACCOUNT_CODE != null) {
                jTabbedPane8.setSelectedIndex(0);
                txtProfileCode.setText(Value.CUST_CODE);
                LoanCustID.setText(Value.CUST_CODE);

                showAccountQty();
                enterAccount();
            } else if (Value.CUST_LOAN_CODE != null) {
                jTabbedPane1.setSelectedIndex(5);
                txtProfileCode.setText(Value.CUST_CODE);
                LoanCustID.setText(Value.CUST_CODE);
                txtAccCode.setText(Value.CUST_LOAN_CODE);

                showAccountQty();
                init1();

                loadLoanAccount();

                showListSelect(Value.CUST_LOAN_CODE, "2");
                txtPaymentAmountCash.requestFocus();
            } else {
                //แสดง Dashboard ให้พนักงานเลือกทำรายการ
                showListSelect("", "");
            }
        } else {
            txtAccCode.requestFocus();
        }
    }

    private void btnSaveHoon() {
        if (txtDocNo.getText().equals("")) {
            txtDocNo.requestFocus();
            return;
        }

        btnSaveByHoon.setEnabled(false);
        CbTransactionSaveBean bean = getCbTransactionSaveControl().checkTransactionSave(txtDocNo.getText());

        if (bean != null) {
            JOptionPane.showMessageDialog(this, "เลขที่เอกสารนี้ถูกบันทึกในระบบแล้ว กรุณาตรวจสอบ");
            resetDepositMoney();
            return;
        }

        double qty = NumberUtil.toDouble(txtHoonQTY.getText());
        double totalAmt = NumberUtil.toDouble(txtAmount.getText());
        double cashPay = NumberUtil.toDouble(txtCashPay.getText());
        double total = cashPay - totalAmt;

        if (qty <= 0) {
            txtDocNo.requestFocus();
            return;
        }

        if (cashPay < totalAmt) {
            JOptionPane.showMessageDialog(this, "ท่านระบุจำนวนเงินไม่ครบถ้วน กรุณาเพิ่มอีก " + total + " บาท");
            return;
        }

        txtHoonTon.setText(NumberFormat.showDouble2(total));
        saveBuyHoon();

        //แสดง Dashboard ให้พนักงานเลือกทำรายการ
        jTabbedPane1.setSelectedIndex(0);
        showListSelect(Value.CUST_ACCOUNT_CODE, "1");

        btnSaveByHoon.setEnabled(true);
        initHoon();
    }

    private void btnSellHoon() {
        if (txtDocNo1.getText().equals("")) {
            txtDocNo1.requestFocus();
            return;
        }

        CbTransactionSaveBean bean = getCbTransactionSaveControl().checkTransactionSave(txtDocNo1.getText());

        if (bean != null) {
            JOptionPane.showMessageDialog(this, "เลขที่เอกสารนี้ถูกบันทึกในระบบแล้ว กรุณาตรวจสอบ");
            resetDepositMoney();
            return;
        }

        double qty = NumberUtil.toDouble(txtTotalSellHoonAmount.getText());
        double balance = NumberUtil.toDouble(txtTotalValue.getText());

        if (qty <= 0) {
            txtDocNo1.requestFocus();
            return;
        }

        if (qty == balance) {
            JOptionPane.showMessageDialog(this, "จำนวนที่ท่านขายหุ้นคือจำนวนหุ้นทั้งหมดที่ท่านถือครอง !");
        }

        if (qty > balance) {
            JOptionPane.showMessageDialog(this, "จำนวนหุ้นที่ท่านถือครองมีไม่เพียงพอต่อการขาย !");
            txtDocNo1.requestFocus();
        } else {
            saveSaleHoon();

            //แสดง Dashboard ให้พนักงานเลือกทำรายการ
            jTabbedPane1.setSelectedIndex(0);
            showListSelect(Value.CUST_ACCOUNT_CODE, "1");
        }
    }

    private void btnSaveLoanAccountRegister() {
        if (validateDataLoan()) {
            //ตรวจสอบผู้ค้ำประกัน
            if (tbGuarantor.getRowCount() == 0) {
                int confirm = JOptionPane.showConfirmDialog(this, "ไม่พบข้อมูลผู้ค้ำประกัน ท่านต้องการเปิดบัญชีเงินกู้หรือไม่ ?");
                if (confirm == JOptionPane.YES_OPTION) {
                    saveLoanForm();
                }
            } else {
                saveLoanForm();
            }

        }
    }

    private void btnTransferHoon() {
        if (!txtTransferAppCode.getText().equals("000000")) {
            JOptionPane.showMessageDialog(this, "อนุมัติในการโอนหุ้นไม่ถูกต้อง !");
            txtTransferAppCode.requestFocus();
            return;
        }

        if (txtProfileCode.getText().equals(txtTransferPerson.getText())) {
            JOptionPane.showMessageDialog(this, "ไม่สามารถโอนหุ้นให้กับบุคคลเดียวกันได้ !!!");
            txtTransferPerson.setText("");
            txtTransferPerson.requestFocus();
            return;
        }

        if (!txtTransferPerson.getText().equals("")) {
            transferHoon();

            //แสดง Dashboard ให้พนักงานเลือกทำรายการ
            jTabbedPane1.setSelectedIndex(0);
            showListSelect(Value.CUST_ACCOUNT_CODE, "1");
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาระบุรหัสลูกค้าที่ท่านต้องการโอนหุ้นให้ !");
            txtTransferPerson.requestFocus();
        }
    }

    private void btnPrintLoanPaper() {
        double loanPerMonthAmt = NumberUtil.toDouble(txtPayPerMonth.getText());
        if (loanPerMonthAmt > 0) {
            String accCode = txtLoanDocCode.getText();
            PaperLoanJDialog pld = new PaperLoanJDialog(this, true, accCode);
            pld.setVisible(true);
        }
    }

    private void btnAssetGaruntee() {
        if (txtLoanDocCode.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "กรุณากำหนดเลขที่บัญชีก่อน !");
            txtLoanDocCode.requestFocus();
            return;
        }

        DocumentGarunteeBean dBean = new DocumentGarunteeBean();
        dBean.setDOC_NO(txtLoanDocCode.getText());
        dBean.setDOC_DESC(ThaiUtil.Unicode2ASCII(txtAssetGaruntee1.getText()));
        dBean.setIMAGE1(txtImg1.getText().replace("\\", "/"));

        dBean.setIMGAE2(txtImg2.getText().replace("\\", "/"));
        dBean.setIMAGE3(txtImg3.getText().replace("\\", "/"));

        if (getDocumentGarunteeControl().saveDocumentGaruntee(dBean)) {
            JOptionPane.showMessageDialog(this, "บันทึกข้อมูลโฉนดเรียบร้อยแล้ว");
        }
    }

    private void btnDelSaveGuarantor() {
        int rowSel = tbGuarantor.getSelectedRow();
        if (rowSel != -1) {
            try {
                String sql = "delete from cb_bondsman "
                        + "where loan_docno='" + txtLoanDocCode.getText() + "' "
                        + "and idcard='" + tbGuarantor.getValueAt(rowSel, 1) + "'";
                getCbBondsmanControl().update(sql);

                sql = "update cb_profile set approvelimit=approvelimit+1 "
                        + "where p_custcode='" + tbGuarantor.getValueAt(rowSel, 1) + "'";
                getProfileControl().update(sql);

                loadBonsman(txtLoanDocCode.getText());
                clearBondman();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "กรุณาเลือกรายการผู้ค้ำประกันที่ท่านต้องการลบ ?");
        }
    }

    private void showDocAuto1() {
        if (cbAccType.getItemCount() > 0) {
            String docType = getIDCombobox(cbAccType);
            CbSaveConfigBean sBean = getSaveConfigControl().listSaveConfig1(docType);
            ConfigBean bean = getConfigControl().getConfigBean();
            if (bean.getBranchPrefix().equals("Y")) {
                BranchBean bBean = getBranchControl().getData();
                txtAccountCode.setText(bBean.getCode() + sBean.getTypeCode() + getRunning(sBean.getSaveRunning()));
            } else {
                txtAccountCode.setText(sBean.getTypeCode() + getRunning(sBean.getSaveRunning()));
            }
            txtBookNo.setText(getBookNo(getSaveConfigControl().getMaxInt(docType)));
            txtSaveFee.setText(NumberFormat.showDouble2(sBean.getSaveFee()));
            txtSaveFee.requestFocus();
        }
    }

    public void updateInterest() {
        WaitDialog wait = new WaitDialog(this, true);
        wait.setVisible(true);
    }

    private void showAccountQty() {
        ArrayList<CbSaveAccountBean> listSc = getSaveAccountControl().listCbSaveAccount(txtProfileCode.getText());
        txtTotalAccount.setText("" + listSc.size());
    }
}
