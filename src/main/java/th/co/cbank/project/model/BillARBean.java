package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class BillARBean {
    private final Logger logger = Logger.getLogger(BillARBean.class);
    private String Ref_No;
    private Date Ondate;
    private String ArCode;
    private double Stotal = 0.00;
    private double Cash = 0.00;
    private double Cupon = 0.00;
    private double Credit = 0.00;
    private String Terminal;
    private String Cashier;
    private String Fat;
    private String UserVoid;
    private String arName;

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public String getRef_No() {
        return Ref_No;
    }

    public void setRef_No(String Ref_No) {
        this.Ref_No = Ref_No;
    }

    public Date getOndate() {
        return Ondate;
    }

    public void setOndate(Date Ondate) {
        this.Ondate = Ondate;
    }

    public String getArCode() {
        return ArCode;
    }

    public void setArCode(String ArCode) {
        this.ArCode = ArCode;
    }

    public double getStotal() {
        return Stotal;
    }

    public void setStotal(double Stotal) {
        this.Stotal = Stotal;
    }

    public double getCash() {
        return Cash;
    }

    public void setCash(double Cash) {
        this.Cash = Cash;
    }

    public double getCupon() {
        return Cupon;
    }

    public void setCupon(double Cupon) {
        this.Cupon = Cupon;
    }

    public double getCredit() {
        return Credit;
    }

    public void setCredit(double Credit) {
        this.Credit = Credit;
    }

    public String getTerminal() {
        return Terminal;
    }

    public void setTerminal(String Terminal) {
        this.Terminal = Terminal;
    }

    public String getCashier() {
        return Cashier;
    }

    public void setCashier(String Cashier) {
        this.Cashier = Cashier;
    }

    public String getFat() {
        return Fat;
    }

    public void setFat(String Fat) {
        this.Fat = Fat;
    }

    public String getUserVoid() {
        return UserVoid;
    }

    public void setUserVoid(String UserVoid) {
        this.UserVoid = UserVoid;
    }

}
