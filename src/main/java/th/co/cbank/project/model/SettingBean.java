package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class SettingBean {
    private final Logger logger = Logger.getLogger(SettingBean.class);

    private double INTEREST = 0.00;
    private double VAT = 0.00;
    private double BASE_DEPOSIT = 0.00;
    private double BASE_WITHDRAWAL = 0.00;
    
    private double INTEREST2 = 0.00;
    private double VAT2 = 0.00;
    private double BASE_DEPOSIT2 = 0.00;
    private double BASE_WITHDRAWAL2 = 0.00;
    
    private String UPDATE_DATE = "";
    private String PWD;
    private int DayCI = 0;

    public double getINTEREST2() {
        return INTEREST2;
    }

    public void setINTEREST2(double INTEREST2) {
        this.INTEREST2 = INTEREST2;
    }

    public double getVAT2() {
        return VAT2;
    }

    public void setVAT2(double VAT2) {
        this.VAT2 = VAT2;
    }

    public double getBASE_DEPOSIT2() {
        return BASE_DEPOSIT2;
    }

    public void setBASE_DEPOSIT2(double BASE_DEPOSIT2) {
        this.BASE_DEPOSIT2 = BASE_DEPOSIT2;
    }

    public double getBASE_WITHDRAWAL2() {
        return BASE_WITHDRAWAL2;
    }

    public void setBASE_WITHDRAWAL2(double BASE_WITHDRAWAL2) {
        this.BASE_WITHDRAWAL2 = BASE_WITHDRAWAL2;
    }
    
    public int getDayCI() {
        return DayCI;
    }

    public void setDayCI(int DayCI) {
        this.DayCI = DayCI;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(String UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public double getINTEREST() {
        return INTEREST;
    }

    public void setINTEREST(double INTEREST) {
        this.INTEREST = INTEREST;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getBASE_DEPOSIT() {
        return BASE_DEPOSIT;
    }

    public void setBASE_DEPOSIT(double BASE_DEPOSIT) {
        this.BASE_DEPOSIT = BASE_DEPOSIT;
    }

    public double getBASE_WITHDRAWAL() {
        return BASE_WITHDRAWAL;
    }

    public void setBASE_WITHDRAWAL(double BASE_WITHDRAWAL) {
        this.BASE_WITHDRAWAL = BASE_WITHDRAWAL;
    }

}
