package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CusttypeBean {
    private final Logger logger = Logger.getLogger(CusttypeBean.class);
    private String SP_Type;
    private String SP_TypeName;
    private double SP_CrAmount = 0.00;
    private int SP_CreditDays = 0;
    private double SP_Interest = 0.00;

    public String getSP_Type() {
        return SP_Type;
    }

    public void setSP_Type(String SP_Type) {
        this.SP_Type = SP_Type;
    }

    public String getSP_TypeName() {
        return SP_TypeName;
    }

    public void setSP_TypeName(String SP_TypeName) {
        this.SP_TypeName = SP_TypeName;
    }

    public double getSP_CrAmount() {
        return SP_CrAmount;
    }

    public void setSP_CrAmount(double SP_CrAmount) {
        this.SP_CrAmount = SP_CrAmount;
    }

    public int getSP_CreditDays() {
        return SP_CreditDays;
    }

    public void setSP_CreditDays(int SP_CreditDays) {
        this.SP_CreditDays = SP_CreditDays;
    }

    public double getSP_Interest() {
        return SP_Interest;
    }

    public void setSP_Interest(double SP_Interest) {
        this.SP_Interest = SP_Interest;
    }

}
