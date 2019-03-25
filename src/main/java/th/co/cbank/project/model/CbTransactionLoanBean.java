package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbTransactionLoanBean {
    private final Logger logger = Logger.getLogger(CbTransactionLoanBean.class);
    private Date t_date;
    private String t_time = "00:00:00";
    private String t_acccode;
    private String t_custcode;
    private String t_description;
    private double t_amount = 0.00;
    private String t_empcode;
    private String t_docno;
    private String remark;
    private String t_booktype;
    private int t_hoon = 1;
    private int LineNo = 1;
    private String PrintChk = "N";
    private double t_balance = 0.00;
    private int t_index = 1;
    private double money_in = 0.00;
    private double money_out = 0.00;
    private Date update_interest;
    private double t_hoon_amt = 0.00;
    private double t_hoon_cash = 0.00;
    private double t_hoon_ton = 0.00;
    private double t_hoon_rate = 0.00;
    private String branch_code;
    private double t_interest;
    private double t_fee = 0.00;
    private String t_status;

    //เพิ่มใหม่
    private double t_loan_int_ar_lost;
    private double t_loan_int_ar_mgr;
    private double t_loan_int_ar_int;

    public double getT_loan_int_ar_lost() {
        return t_loan_int_ar_lost;
    }

    public void setT_loan_int_ar_lost(double t_loan_int_ar_lost) {
        this.t_loan_int_ar_lost = t_loan_int_ar_lost;
    }

    public double getT_loan_int_ar_mgr() {
        return t_loan_int_ar_mgr;
    }

    public void setT_loan_int_ar_mgr(double t_loan_int_ar_mgr) {
        this.t_loan_int_ar_mgr = t_loan_int_ar_mgr;
    }

    public double getT_loan_int_ar_int() {
        return t_loan_int_ar_int;
    }

    public void setT_loan_int_ar_int(double t_loan_int_ar_int) {
        this.t_loan_int_ar_int = t_loan_int_ar_int;
    }

    public Date getT_date() {
        return t_date;
    }

    public void setT_date(Date t_date) {
        this.t_date = t_date;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }

    public String getT_acccode() {
        return t_acccode;
    }

    public void setT_acccode(String t_acccode) {
        this.t_acccode = t_acccode;
    }

    public String getT_custcode() {
        return t_custcode;
    }

    public void setT_custcode(String t_custcode) {
        this.t_custcode = t_custcode;
    }

    public String getT_description() {
        return t_description;
    }

    public void setT_description(String t_description) {
        this.t_description = t_description;
    }

    public double getT_amount() {
        return t_amount;
    }

    public void setT_amount(double t_amount) {
        this.t_amount = t_amount;
    }

    public String getT_empcode() {
        return t_empcode;
    }

    public void setT_empcode(String t_empcode) {
        this.t_empcode = t_empcode;
    }

    public String getT_docno() {
        return t_docno;
    }

    public void setT_docno(String t_docno) {
        this.t_docno = t_docno;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getT_booktype() {
        return t_booktype;
    }

    public void setT_booktype(String t_booktype) {
        this.t_booktype = t_booktype;
    }

    public int getT_hoon() {
        return t_hoon;
    }

    public void setT_hoon(int t_hoon) {
        this.t_hoon = t_hoon;
    }

    public int getLineNo() {
        return LineNo;
    }

    public void setLineNo(int LineNo) {
        this.LineNo = LineNo;
    }

    public String getPrintChk() {
        return PrintChk;
    }

    public void setPrintChk(String PrintChk) {
        this.PrintChk = PrintChk;
    }

    public double getT_balance() {
        return t_balance;
    }

    public void setT_balance(double t_balance) {
        this.t_balance = t_balance;
    }

    public int getT_index() {
        return t_index;
    }

    public void setT_index(int t_index) {
        this.t_index = t_index;
    }

    public double getMoney_in() {
        return money_in;
    }

    public void setMoney_in(double money_in) {
        this.money_in = money_in;
    }

    public double getMoney_out() {
        return money_out;
    }

    public void setMoney_out(double money_out) {
        this.money_out = money_out;
    }

    public Date getUpdate_interest() {
        return update_interest;
    }

    public void setUpdate_interest(Date update_interest) {
        this.update_interest = update_interest;
    }

    public double getT_hoon_amt() {
        return t_hoon_amt;
    }

    public void setT_hoon_amt(double t_hoon_amt) {
        this.t_hoon_amt = t_hoon_amt;
    }

    public double getT_hoon_cash() {
        return t_hoon_cash;
    }

    public void setT_hoon_cash(double t_hoon_cash) {
        this.t_hoon_cash = t_hoon_cash;
    }

    public double getT_hoon_ton() {
        return t_hoon_ton;
    }

    public void setT_hoon_ton(double t_hoon_ton) {
        this.t_hoon_ton = t_hoon_ton;
    }

    public double getT_hoon_rate() {
        return t_hoon_rate;
    }

    public void setT_hoon_rate(double t_hoon_rate) {
        this.t_hoon_rate = t_hoon_rate;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public double getT_interest() {
        return t_interest;
    }

    public void setT_interest(double t_interest) {
        this.t_interest = t_interest;
    }

    public double getT_fee() {
        return t_fee;
    }

    public void setT_fee(double t_fee) {
        this.t_fee = t_fee;
    }

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

}
