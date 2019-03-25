package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class ConfigBean {
    private final Logger logger = Logger.getLogger(ConfigBean.class);
    private String SaveDocType;//
    private String SaveDocPrefix;//
    private int SaveDocRunning = 1;//
    private String HoonDocType;//
    private String HoonDocPrefix;//
    private int HoonDocRunning = 1;//
    private String LoanDocType;//
    private String LoanDocPrefix;//
    private int LoanDocRunning = 1;//
    private String PrinterPassBook;//
    private String PrintSlipType = "DR";//
    private String PrintSlipDriverName;//
    private String PrintSlipPort;//
    private String AccountDocType;
    private String AccountPrefix;//
    private int AccountRunning = 1;//
    private Date ProgramStartDate;
    private int NoteNo;
    private String BranchPrefix = "N";
    private String WithdrawDocPrefix;//
    private int WithdrawDocRunning = 0;//
    private String IntDocPrefix;//
    private int IntDocRunning = 0;//
    private String HoonSaleDocPrefix;//
    private int HoonSaleDocRunning = 0;//
    private String CompoundDocPrefix;//
    private int CompoundDocRunning = 0;//
    private String PaymentDocPrefix;
    private int PaymentDocRunning;
    private String FeePrefix;
    private double FeeAmt;
    private int FeeRunning;
    private String HoonTransferDocPrefix;//
    private int HoonTransferDocRunning = 0;//
    private int BookSpec = 0;//

    public int getBookSpec() {
        return BookSpec;
    }

    public void setBookSpec(int BookSpec) {
        this.BookSpec = BookSpec;
    }

    public String getHoonTransferDocPrefix() {
        return HoonTransferDocPrefix;
    }

    public void setHoonTransferDocPrefix(String HoonTransferDocPrefix) {
        this.HoonTransferDocPrefix = HoonTransferDocPrefix;
    }

    public int getHoonTransferDocRunning() {
        return HoonTransferDocRunning;
    }

    public void setHoonTransferDocRunning(int HoonTransferDocRunning) {
        this.HoonTransferDocRunning = HoonTransferDocRunning;
    }

    public double getFeeAmt() {
        return FeeAmt;
    }

    public void setFeeAmt(double FeeAmt) {
        this.FeeAmt = FeeAmt;
    }    

    public String getFeePrefix() {
        return FeePrefix;
    }

    public void setFeePrefix(String FeePrefix) {
        this.FeePrefix = FeePrefix;
    }

    public int getFeeRunning() {
        return FeeRunning;
    }

    public void setFeeRunning(int FeeRunning) {
        this.FeeRunning = FeeRunning;
    }

    public String getPaymentDocPrefix() {
        return PaymentDocPrefix;
    }

    public void setPaymentDocPrefix(String PaymentDocPrefix) {
        this.PaymentDocPrefix = PaymentDocPrefix;
    }

    public int getPaymentDocRunning() {
        return PaymentDocRunning;
    }

    public void setPaymentDocRunning(int PaymentDocRunning) {
        this.PaymentDocRunning = PaymentDocRunning;
    }

    public String getWithdrawDocPrefix() {
        return WithdrawDocPrefix;
    }

    public void setWithdrawDocPrefix(String WithdrawDocPrefix) {
        this.WithdrawDocPrefix = WithdrawDocPrefix;
    }

    public int getWithdrawDocRunning() {
        return WithdrawDocRunning;
    }

    public void setWithdrawDocRunning(int WithdrawDocRunning) {
        this.WithdrawDocRunning = WithdrawDocRunning;
    }

    public String getIntDocPrefix() {
        return IntDocPrefix;
    }

    public void setIntDocPrefix(String IntDocPrefix) {
        this.IntDocPrefix = IntDocPrefix;
    }

    public int getIntDocRunning() {
        return IntDocRunning;
    }

    public void setIntDocRunning(int IntDocRunning) {
        this.IntDocRunning = IntDocRunning;
    }

    public String getHoonSaleDocPrefix() {
        return HoonSaleDocPrefix;
    }

    public void setHoonSaleDocPrefix(String HoonSaleDocPrefix) {
        this.HoonSaleDocPrefix = HoonSaleDocPrefix;
    }

    public int getHoonSaleDocRunning() {
        return HoonSaleDocRunning;
    }

    public void setHoonSaleDocRunning(int HoonSaleDocRunning) {
        this.HoonSaleDocRunning = HoonSaleDocRunning;
    }

    public String getCompoundDocPrefix() {
        return CompoundDocPrefix;
    }

    public void setCompoundDocPrefix(String CompoundDocPrefix) {
        this.CompoundDocPrefix = CompoundDocPrefix;
    }

    public int getCompoundDocRunning() {
        return CompoundDocRunning;
    }

    public void setCompoundDocRunning(int CompoundDocRunning) {
        this.CompoundDocRunning = CompoundDocRunning;
    }

    public String getBranchPrefix() {
        return BranchPrefix;
    }

    public void setBranchPrefix(String BranchPrefix) {
        this.BranchPrefix = BranchPrefix;
    }

    public int getNoteNo() {
        return NoteNo;
    }

    public void setNoteNo(int NoteNo) {
        this.NoteNo = NoteNo;
    }

    public Date getProgramStartDate() {
        return ProgramStartDate;
    }

    public void setProgramStartDate(Date ProgramStartDate) {
        this.ProgramStartDate = ProgramStartDate;
    }

    public String getAccountDocType() {
        return AccountDocType;
    }

    public void setAccountDocType(String AccountDocType) {
        this.AccountDocType = AccountDocType;
    }

    public String getSaveDocType() {
        return SaveDocType;
    }

    public void setSaveDocType(String SaveDocType) {
        this.SaveDocType = SaveDocType;
    }

    public String getSaveDocPrefix() {
        return SaveDocPrefix;
    }

    public void setSaveDocPrefix(String SaveDocPrefix) {
        this.SaveDocPrefix = SaveDocPrefix;
    }

    public int getSaveDocRunning() {
        return SaveDocRunning;
    }

    public void setSaveDocRunning(int SaveDocRunning) {
        this.SaveDocRunning = SaveDocRunning;
    }

    public String getHoonDocType() {
        return HoonDocType;
    }

    public void setHoonDocType(String HoonDocType) {
        this.HoonDocType = HoonDocType;
    }

    public String getHoonDocPrefix() {
        return HoonDocPrefix;
    }

    public void setHoonDocPrefix(String HoonDocPrefix) {
        this.HoonDocPrefix = HoonDocPrefix;
    }

    public int getHoonDocRunning() {
        return HoonDocRunning;
    }

    public void setHoonDocRunning(int HoonDocRunning) {
        this.HoonDocRunning = HoonDocRunning;
    }

    public String getLoanDocType() {
        return LoanDocType;
    }

    public void setLoanDocType(String LoanDocType) {
        this.LoanDocType = LoanDocType;
    }

    public String getLoanDocPrefix() {
        return LoanDocPrefix;
    }

    public void setLoanDocPrefix(String LoanDocPrefix) {
        this.LoanDocPrefix = LoanDocPrefix;
    }

    public int getLoanDocRunning() {
        return LoanDocRunning;
    }

    public void setLoanDocRunning(int LoanDocRunning) {
        this.LoanDocRunning = LoanDocRunning;
    }

    public String getPrinterPassBook() {
        return PrinterPassBook;
    }

    public void setPrinterPassBook(String PrinterPassBook) {
        this.PrinterPassBook = PrinterPassBook;
    }

    public String getPrintSlipType() {
        return PrintSlipType;
    }

    public void setPrintSlipType(String PrintSlipType) {
        this.PrintSlipType = PrintSlipType;
    }

    public String getPrintSlipDriverName() {
        return PrintSlipDriverName;
    }

    public void setPrintSlipDriverName(String PrintSlipDriverName) {
        this.PrintSlipDriverName = PrintSlipDriverName;
    }

    public String getPrintSlipPort() {
        return PrintSlipPort;
    }

    public void setPrintSlipPort(String PrintSlipPort) {
        this.PrintSlipPort = PrintSlipPort;
    }

    public String getAccountPrefix() {
        return AccountPrefix;
    }

    public void setAccountPrefix(String AccountPrefix) {
        this.AccountPrefix = AccountPrefix;
    }

    public int getAccountRunning() {
        return AccountRunning;
    }

    public void setAccountRunning(int AccountRunning) {
        this.AccountRunning = AccountRunning;
    }

}
