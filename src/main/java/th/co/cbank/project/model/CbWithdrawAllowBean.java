package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbWithdrawAllowBean {
    private final Logger logger = Logger.getLogger(CbWithdrawAllowBean.class);
    private String account_no;//
    private int allow_person_qty = 0;//
    private int _index = 0;//
    private String cust_code;//
    private String cust_name;//
    private String cust_surname;//

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public int getAllow_person_qty() {
        return allow_person_qty;
    }

    public void setAllow_person_qty(int allow_person_qty) {
        this.allow_person_qty = allow_person_qty;
    }

    public int getIndex() {
        return _index;
    }

    public void setIndex(int _index) {
        this._index = _index;
    }

    public String getCust_code() {
        return cust_code;
    }

    public void setCust_code(String cust_code) {
        this.cust_code = cust_code;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_surname() {
        return cust_surname;
    }

    public void setCust_surname(String cust_surname) {
        this.cust_surname = cust_surname;
    }

}
