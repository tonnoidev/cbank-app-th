package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbSaveAccountBean {
    private final Logger logger = Logger.getLogger(CbSaveAccountBean.class);
    private String B_CUST_CODE;//
    private String B_CUST_NAME;//
    private String B_CUST_LASTNAME;//
    private double B_BALANCE = 0.00;//
    private double B_INTEREST = 0.000;//
    private Date B_START;//
    private String MEMBER_TYPE = "";//
    private Date B_UPDATE;//
    private String account_code;//
    private String account_status = "";//
    private String book_no = "";//
    private String book_evidence1;//
    private String book_evidence2;//
    private String book_evidence3;//
    private String book_evidence4;//
    private String remark;
    private int hoon_balance;
    private String account_type;
    private String account_name;
    private String B_TIME;
    private double B_FEE;
    private String Branch_Code;
    private String Emp_Code;

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getBranch_Code() {
        return Branch_Code;
    }

    public void setBranch_Code(String Branch_Code) {
        this.Branch_Code = Branch_Code;
    }

    public String getEmp_Code() {
        return Emp_Code;
    }

    public void setEmp_Code(String Emp_Code) {
        this.Emp_Code = Emp_Code;
    }

    public String getB_TIME() {
        return B_TIME;
    }

    public void setB_TIME(String B_TIME) {
        this.B_TIME = B_TIME;
    }

    public double getB_FEE() {
        return B_FEE;
    }

    public void setB_FEE(double B_FEE) {
        this.B_FEE = B_FEE;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public int getHoon_balance() {
        return hoon_balance;
    }

    public void setHoon_balance(int hoon_balance) {
        this.hoon_balance = hoon_balance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getB_CUST_CODE() {
        return B_CUST_CODE;
    }

    public void setB_CUST_CODE(String B_CUST_CODE) {
        this.B_CUST_CODE = B_CUST_CODE;
    }

    public String getB_CUST_NAME() {
        return B_CUST_NAME;
    }

    public void setB_CUST_NAME(String B_CUST_NAME) {
        this.B_CUST_NAME = B_CUST_NAME;
    }

    public String getB_CUST_LASTNAME() {
        return B_CUST_LASTNAME;
    }

    public void setB_CUST_LASTNAME(String B_CUST_LASTNAME) {
        this.B_CUST_LASTNAME = B_CUST_LASTNAME;
    }

    public double getB_BALANCE() {
        return B_BALANCE;
    }

    public void setB_BALANCE(double B_BALANCE) {
        this.B_BALANCE = B_BALANCE;
    }

    public double getB_INTEREST() {
        return B_INTEREST;
    }

    public void setB_INTEREST(double B_INTEREST) {
        this.B_INTEREST = B_INTEREST;
    }

    public Date getB_START() {
        return B_START;
    }

    public void setB_START(Date B_START) {
        this.B_START = B_START;
    }

    public String getMEMBER_TYPE() {
        return MEMBER_TYPE;
    }

    public void setMEMBER_TYPE(String MEMBER_TYPE) {
        this.MEMBER_TYPE = MEMBER_TYPE;
    }

    public Date getB_UPDATE() {
        return B_UPDATE;
    }

    public void setB_UPDATE(Date B_UPDATE) {
        this.B_UPDATE = B_UPDATE;
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
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

    @Override
    public String toString() {
        return "SaveAccountBean{" + "B_CUST_CODE=" + B_CUST_CODE + ", B_CUST_NAME=" + B_CUST_NAME + ", B_CUST_LASTNAME=" + B_CUST_LASTNAME + ", B_BALANCE=" + B_BALANCE + ", B_INTEREST=" + B_INTEREST + ", B_START=" + B_START + ", MEMBER_TYPE=" + MEMBER_TYPE + ", B_UPDATE=" + B_UPDATE + ", account_code=" + account_code + ", account_status=" + account_status + ", book_no=" + book_no + ", book_evidence1=" + book_evidence1 + ", book_evidence2=" + book_evidence2 + ", book_evidence3=" + book_evidence3 + ", book_evidence4=" + book_evidence4 + ", remark=" + remark + ", hoon_balance=" + hoon_balance + ", account_type=" + account_type + ", account_name=" + account_name + ", B_TIME=" + B_TIME + ", B_FEE=" + B_FEE + ", Branch_Code=" + Branch_Code + ", Emp_Code=" + Emp_Code + '}';
    }

}
