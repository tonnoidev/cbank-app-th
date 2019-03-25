package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbLoanAccountBean {
    private final Logger logger = Logger.getLogger(CbLoanAccountBean.class);
    private String loan_docno;//
    private String loan_name;//
    private String cust_code;//
    private Date loan_docdate;//
    private String branch_code;//
    private double loan_amount = 0.00;//
    private double loan_interest = 0.00;//
    private Date loan_datePay;//
    private double loan_fee = 0.00;//
    private Date sysdate;//
    private int ID = 1;//
    private double pay_amount = 0.00;//
    private String pay_date;//
    private String pay_time = "00:00:00";//
    private String pay_user;//
    private double pay_ton = 0.00;//
    private String loan_person1;//
    private String loan_person2;//
    private double pay_interest = 0.00;//
    private String book_evidence1;//
    private String book_evidence2;//
    private String book_evidence3;//
    private String book_evidence4;//
    private String book_no;
    private String loan_type;
    private Date loan_start_date;
    private Date loan_end_date;
    private double payPerAmount = 0.00;
    private int period_pay = 0;
    private String chkPersonApprove = "N";
    private double LoanCustomerPay = 0.00;
    private int LoanDayQty=0;
    private double LoanPayMin = 0.00;
    //not in db
    private String custName;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    public String getLoan_name() {
        return loan_name;
    }

    public void setLoan_name(String loan_name) {
        this.loan_name = loan_name;
    }

    public String getChkPersonApprove() {
        return chkPersonApprove;
    }

    public void setChkPersonApprove(String chkPersonApprove) {
        this.chkPersonApprove = chkPersonApprove;
    }

    public double getLoanCustomerPay() {
        return LoanCustomerPay;
    }

    public void setLoanCustomerPay(double LoanCustomerPay) {
        this.LoanCustomerPay = LoanCustomerPay;
    }

    public int getLoanDayQty() {
        return LoanDayQty;
    }

    public void setLoanDayQty(int LoanDayQty) {
        this.LoanDayQty = LoanDayQty;
    }

    public double getLoanPayMin() {
        return LoanPayMin;
    }

    public void setLoanPayMin(double LoanPayMin) {
        this.LoanPayMin = LoanPayMin;
    }

    public int getPeriod_pay() {
        return period_pay;
    }

    public void setPeriod_pay(int period_pay) {
        this.period_pay = period_pay;
    }

    public double getPayPerAmount() {
        return payPerAmount;
    }

    public void setPayPerAmount(double payPerAmount) {
        this.payPerAmount = payPerAmount;
    }

    public String getLoan_person1() {
        return loan_person1;
    }

    public void setLoan_person1(String loan_person1) {
        this.loan_person1 = loan_person1;
    }

    public String getLoan_person2() {
        return loan_person2;
    }

    public void setLoan_person2(String loan_person2) {
        this.loan_person2 = loan_person2;
    }

    public Date getLoan_start_date() {
        return loan_start_date;
    }

    public void setLoan_start_date(Date loan_start_date) {
        this.loan_start_date = loan_start_date;
    }

    public Date getLoan_end_date() {
        return loan_end_date;
    }

    public void setLoan_end_date(Date loan_end_date) {
        this.loan_end_date = loan_end_date;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

    public String getLoan_docno() {
        return loan_docno;
    }

    public void setLoan_docno(String loan_docno) {
        this.loan_docno = loan_docno;
    }

    public String getCust_code() {
        return cust_code;
    }

    public void setCust_code(String cust_code) {
        this.cust_code = cust_code;
    }

    public Date getLoan_docdate() {
        return loan_docdate;
    }

    public void setLoan_docdate(Date loan_docdate) {
        this.loan_docdate = loan_docdate;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String loan_branch) {
        this.branch_code = loan_branch;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }

    public double getLoan_interest() {
        return loan_interest;
    }

    public void setLoan_interest(double loan_interest) {
        this.loan_interest = loan_interest;
    }

    public Date getLoan_datePay() {
        return loan_datePay;
    }

    public void setLoan_datePay(Date loan_datePay) {
        this.loan_datePay = loan_datePay;
    }

    public double getLoan_fee() {
        return loan_fee;
    }

    public void setLoan_fee(double loan_fee) {
        this.loan_fee = loan_fee;
    }

    public Date getSysdate() {
        return sysdate;
    }

    public void setSysdate(Date sysdate) {
        this.sysdate = sysdate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(double pay_amount) {
        this.pay_amount = pay_amount;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getPay_user() {
        return pay_user;
    }

    public void setPay_user(String pay_user) {
        this.pay_user = pay_user;
    }

    public double getPay_ton() {
        return pay_ton;
    }

    public void setPay_ton(double pay_ton) {
        this.pay_ton = pay_ton;
    }

    public double getPay_interest() {
        return pay_interest;
    }

    public void setPay_interest(double pay_interest) {
        this.pay_interest = pay_interest;
    }

    public String getBook_evidence1() {
        return book_evidence1;
    }

    public void setBook_evidence1(String book_evidence1) {
        this.book_evidence1 = book_evidence1;
    }

    public String getBook_evidence2() {
        return book_evidence2;
    }

    public void setBook_evidence2(String book_evidence2) {
        this.book_evidence2 = book_evidence2;
    }

    public String getBook_evidence3() {
        return book_evidence3;
    }

    public void setBook_evidence3(String book_evidence3) {
        this.book_evidence3 = book_evidence3;
    }

    public String getBook_evidence4() {
        return book_evidence4;
    }

    public void setBook_evidence4(String book_evidence4) {
        this.book_evidence4 = book_evidence4;
    }

}
