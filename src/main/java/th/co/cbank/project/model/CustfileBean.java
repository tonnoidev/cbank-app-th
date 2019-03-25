package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CustfileBean {
    private final Logger logger = Logger.getLogger(CustfileBean.class);
    private String SP_Code;
    private String SP_Desc;
    private String Sp_Desc2;
    private String SP_Type;
    private String SP_Addr1;
    private String SP_Addr2;
    private String SP_Zip;
    private String SP_Contact;
    private String SP_Tel;
    private String SP_Fax;
    private String SP_Remark;
    private Date SP_UpdateDate;
    private String SP_Tax;
    private int SP_CreditDays = 0;
    private double SP_CrAmount = 0.00;
    private Date lastdate;
    private double chqpay;
    private Date lastpay;
    private double sumamt;

    public String getSP_Code() {
        return SP_Code;
    }

    public void setSP_Code(String SP_Code) {
        this.SP_Code = SP_Code;
    }

    public String getSP_Desc() {
        return SP_Desc;
    }

    public void setSP_Desc(String SP_Desc) {
        this.SP_Desc = SP_Desc;
    }

    public String getSp_Desc2() {
        return Sp_Desc2;
    }

    public void setSp_Desc2(String Sp_Desc2) {
        this.Sp_Desc2 = Sp_Desc2;
    }

    public String getSP_Type() {
        return SP_Type;
    }

    public void setSP_Type(String SP_Type) {
        this.SP_Type = SP_Type;
    }

    public String getSP_Addr1() {
        return SP_Addr1;
    }

    public void setSP_Addr1(String SP_Addr1) {
        this.SP_Addr1 = SP_Addr1;
    }

    public String getSP_Addr2() {
        return SP_Addr2;
    }

    public void setSP_Addr2(String SP_Addr2) {
        this.SP_Addr2 = SP_Addr2;
    }

    public String getSP_Zip() {
        return SP_Zip;
    }

    public void setSP_Zip(String SP_Zip) {
        this.SP_Zip = SP_Zip;
    }

    public String getSP_Contact() {
        return SP_Contact;
    }

    public void setSP_Contact(String SP_Contact) {
        this.SP_Contact = SP_Contact;
    }

    public String getSP_Tel() {
        return SP_Tel;
    }

    public void setSP_Tel(String SP_Tel) {
        this.SP_Tel = SP_Tel;
    }

    public String getSP_Fax() {
        return SP_Fax;
    }

    public void setSP_Fax(String SP_Fax) {
        this.SP_Fax = SP_Fax;
    }

    public String getSP_Remark() {
        return SP_Remark;
    }

    public void setSP_Remark(String SP_Remark) {
        this.SP_Remark = SP_Remark;
    }

    public Date getSP_UpdateDate() {
        return SP_UpdateDate;
    }

    public void setSP_UpdateDate(Date SP_UpdateDate) {
        this.SP_UpdateDate = SP_UpdateDate;
    }

    public String getSP_Tax() {
        return SP_Tax;
    }

    public void setSP_Tax(String SP_Tax) {
        this.SP_Tax = SP_Tax;
    }

    public int getSP_CreditDays() {
        return SP_CreditDays;
    }

    public void setSP_CreditDays(int SP_CreditDays) {
        this.SP_CreditDays = SP_CreditDays;
    }

    public double getSP_CrAmount() {
        return SP_CrAmount;
    }

    public void setSP_CrAmount(double SP_CrAmount) {
        this.SP_CrAmount = SP_CrAmount;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public double getChqpay() {
        return chqpay;
    }

    public void setChqpay(double chqpay) {
        this.chqpay = chqpay;
    }

    public Date getLastpay() {
        return lastpay;
    }

    public void setLastpay(Date lastpay) {
        this.lastpay = lastpay;
    }

    public double getSumamt() {
        return sumamt;
    }

    public void setSumamt(double sumamt) {
        this.sumamt = sumamt;
    }

}
