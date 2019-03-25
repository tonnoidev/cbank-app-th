package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbLoanConfigBean {
    private final Logger logger = Logger.getLogger(CbLoanConfigBean.class);
    private String LoanCode;//
    private String LoanName;//
    private double LoanINT = 0.00;//
    private double LoanFee = 0.00;//
    private double LoanPenaltyINT = 0.00;//
    private int LoanPenaltyDay = 7;//
    private double LoanMinAmount = 0.00;//
    private String IntFixed = "1";//
    private double IntBadDebt = 0.00;//
    private double IntTurnover = 0.00;//
    private double IntNormal = 0.00;//
    private String chkPIntCapital = "1";//
    private String chkPIntTable = "1";//
    private int loanPerMonth = 0;
    private int LoanRunning;
    private int BookNo;
    private String checkMinPayment = "N";
    private double minPaymentPercent = 0;
    private double minPaymentBaht = 0.00;

    public String getCheckMinPayment() {
        return checkMinPayment;
    }

    public void setCheckMinPayment(String checkMinPayment) {
        this.checkMinPayment = checkMinPayment;
    }

    public double getMinPaymentPercent() {
        return minPaymentPercent;
    }

    public void setMinPaymentPercent(double minPaymentPercent) {
        this.minPaymentPercent = minPaymentPercent;
    }

    public double getMinPaymentBaht() {
        return minPaymentBaht;
    }

    public void setMinPaymentBaht(double minPaymentBaht) {
        this.minPaymentBaht = minPaymentBaht;
    }

    public int getBookNo() {
        return BookNo;
    }

    public void setBookNo(int BookNo) {
        this.BookNo = BookNo;
    }    

    public int getLoanRunning() {
        return LoanRunning;
    }

    public void setLoanRunning(int LoanRunning) {
        this.LoanRunning = LoanRunning;
    }

    public int getLoanPerMonth() {
        return loanPerMonth;
    }

    public void setLoanPerMonth(int loanPerMonth) {
        this.loanPerMonth = loanPerMonth;
    }

    public String getLoanCode() {
        return LoanCode;
    }

    public void setLoanCode(String LoanCode) {
        this.LoanCode = LoanCode;
    }

    public String getLoanName() {
        return LoanName;
    }

    public void setLoanName(String LoanName) {
        this.LoanName = LoanName;
    }

    public double getLoanINT() {
        return LoanINT;
    }

    public void setLoanINT(double LoanINT) {
        this.LoanINT = LoanINT;
    }

    public double getLoanFee() {
        return LoanFee;
    }

    public void setLoanFee(double LoanFee) {
        this.LoanFee = LoanFee;
    }

    public double getLoanPenaltyINT() {
        return LoanPenaltyINT;
    }

    public void setLoanPenaltyINT(double LoanPenaltyINT) {
        this.LoanPenaltyINT = LoanPenaltyINT;
    }

    public int getLoanPenaltyDay() {
        return LoanPenaltyDay;
    }

    public void setLoanPenaltyDay(int LoanPenaltyDay) {
        this.LoanPenaltyDay = LoanPenaltyDay;
    }

    public double getLoanMinAmount() {
        return LoanMinAmount;
    }

    public void setLoanMinAmount(double LoanMinAmount) {
        this.LoanMinAmount = LoanMinAmount;
    }

    public String getIntFixed() {
        return IntFixed;
    }

    public void setIntFixed(String IntFixed) {
        this.IntFixed = IntFixed;
    }

    public double getIntBadDebt() {
        return IntBadDebt;
    }

    public void setIntBadDebt(double IntBadDebt) {
        this.IntBadDebt = IntBadDebt;
    }

    public double getIntTurnover() {
        return IntTurnover;
    }

    public void setIntTurnover(double IntTurnover) {
        this.IntTurnover = IntTurnover;
    }

    public double getIntNormal() {
        return IntNormal;
    }

    public void setIntNormal(double IntNormal) {
        this.IntNormal = IntNormal;
    }

    public String getChkPIntCapital() {
        return chkPIntCapital;
    }

    public void setChkPIntCapital(String chkPIntCapital) {
        this.chkPIntCapital = chkPIntCapital;
    }

    public String getChkPIntTable() {
        return chkPIntTable;
    }

    public void setChkPIntTable(String chkPIntTable) {
        this.chkPIntTable = chkPIntTable;
    }

}
