package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbLoanTablePaymentBean {
    private final Logger logger = Logger.getLogger(CbLoanTablePaymentBean.class);
    private String loan_doc_no;//
    private int loan_index = 0;//
    private double loan_int_ar_lost = 0.00;//
    private double loan_int_ar_mgr = 0.00;//
    private double loan_int_ar_int = 0.00;//
    private double net_total_pay = 0.00;//
    private double payment_money = 0.00;//
    private double payment_balance = 0.00;//
    private double payment_fee = 0.00;//
    private double base_total_amount = 0.00;//
    private double table_avg_compute = 0.00;//
    private double balance_amount = 0.00;//
    private Date due_date;//
    private Date sys_date;//
    private String sys_time;//
    private String emp_code;//
    private String branch_code;//

    public double getBalance_amount() {
        return balance_amount;
    }

    public void setBalance_amount(double balance_amount) {
        this.balance_amount = balance_amount;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public double getBase_total_amount() {
        return base_total_amount;
    }

    public void setBase_total_amount(double base_total_amount) {
        this.base_total_amount = base_total_amount;
    }

    public double getTable_avg_compute() {
        return table_avg_compute;
    }

    public void setTable_avg_compute(double table_avg_compute) {
        this.table_avg_compute = table_avg_compute;
    }

    public String getLoan_doc_no() {
        return loan_doc_no;
    }

    public void setLoan_doc_no(String loan_doc_no) {
        this.loan_doc_no = loan_doc_no;
    }

    public int getLoan_index() {
        return loan_index;
    }

    public void setLoan_index(int loan_index) {
        this.loan_index = loan_index;
    }

    public double getLoan_int_ar_lost() {
        return loan_int_ar_lost;
    }

    public void setLoan_int_ar_lost(double loan_int_ar_lost) {
        this.loan_int_ar_lost = loan_int_ar_lost;
    }

    public double getLoan_int_ar_mgr() {
        return loan_int_ar_mgr;
    }

    public void setLoan_int_ar_mgr(double loan_int_ar_mgr) {
        this.loan_int_ar_mgr = loan_int_ar_mgr;
    }

    public double getLoan_int_ar_int() {
        return loan_int_ar_int;
    }

    public void setLoan_int_ar_int(double loan_int_ar_int) {
        this.loan_int_ar_int = loan_int_ar_int;
    }

    public double getNet_total_pay() {
        return net_total_pay;
    }

    public void setNet_total_pay(double net_total_pay) {
        this.net_total_pay = net_total_pay;
    }

    public double getPayment_money() {
        return payment_money;
    }

    public void setPayment_money(double payment_money) {
        this.payment_money = payment_money;
    }

    public double getPayment_balance() {
        return payment_balance;
    }

    public void setPayment_balance(double payment_balance) {
        this.payment_balance = payment_balance;
    }

    public double getPayment_fee() {
        return payment_fee;
    }

    public void setPayment_fee(double payment_fee) {
        this.payment_fee = payment_fee;
    }

    public Date getSys_date() {
        return sys_date;
    }

    public void setSys_date(Date sys_date) {
        this.sys_date = sys_date;
    }

    public String getSys_time() {
        return sys_time;
    }

    public void setSys_time(String sys_time) {
        this.sys_time = sys_time;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

}
