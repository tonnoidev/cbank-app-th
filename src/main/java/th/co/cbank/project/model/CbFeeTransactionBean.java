package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbFeeTransactionBean {
    private final Logger logger = Logger.getLogger(CbFeeTransactionBean.class);
    private String fee_code="";//
    private String fee_desc="";//
    private double fee_amount = 0.00;//
    private String fee_branch="";//
    private String fee_emp_code="";//
    private String fee_cust_code="";
    private Date fee_date=null;
    private String fee_time="";

    public Date getFee_date() {
        return fee_date;
    }

    public void setFee_date(Date fee_date) {
        this.fee_date = fee_date;
    }

    public String getFee_time() {
        return fee_time;
    }

    public void setFee_time(String fee_time) {
        this.fee_time = fee_time;
    }

    public String getFee_cust_code() {
        return fee_cust_code;
    }

    public void setFee_cust_code(String fee_cust_code) {
        this.fee_cust_code = fee_cust_code;
    }

    public String getFee_code() {
        return fee_code;
    }

    public void setFee_code(String fee_code) {
        this.fee_code = fee_code;
    }

    public String getFee_desc() {
        return fee_desc;
    }

    public void setFee_desc(String fee_desc) {
        this.fee_desc = fee_desc;
    }

    public double getFee_amount() {
        return fee_amount;
    }

    public void setFee_amount(double fee_amount) {
        this.fee_amount = fee_amount;
    }

    public String getFee_branch() {
        return fee_branch;
    }

    public void setFee_branch(String fee_branch) {
        this.fee_branch = fee_branch;
    }

    public String getFee_emp_code() {
        return fee_emp_code;
    }

    public void setFee_emp_code(String fee_emp_code) {
        this.fee_emp_code = fee_emp_code;
    }

}
