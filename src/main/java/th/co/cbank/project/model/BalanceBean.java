package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class BalanceBean {
    private final Logger logger = Logger.getLogger(BalanceBean.class);
    private String B_CUST_CODE;
    private String B_CUST_NAME;
    private String B_CUST_LASTNAME;
    private double B_BALANCE = 0.00;
    private double B_INTEREST = 0.000;
    private Date B_START;
    private String B_TYPE;

    public String getB_TYPE() {
        return B_TYPE;
    }

    public void setB_TYPE(String B_TYPE) {
        this.B_TYPE = B_TYPE;
    }

    public Date getB_START() {
        return B_START;
    }

    public void setB_START(Date B_START) {
        this.B_START = B_START;
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

}
