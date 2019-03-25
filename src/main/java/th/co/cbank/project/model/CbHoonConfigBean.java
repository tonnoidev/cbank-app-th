package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbHoonConfigBean {
    private final Logger logger = Logger.getLogger(CbHoonConfigBean.class);
    private String hoonCode;//
    private String hoonName;//
    private double hoonRate = 0.00;//
    private int hoonVolumnMax = 9999999;//
    private double hoonDeviden = 0.00;//
    private int hoonBuyMin = 0;//

    public String getHoonCode() {
        return hoonCode;
    }

    public void setHoonCode(String hoonCode) {
        this.hoonCode = hoonCode;
    }

    public String getHoonName() {
        return hoonName;
    }

    public void setHoonName(String hoonName) {
        this.hoonName = hoonName;
    }

    public double getHoonRate() {
        return hoonRate;
    }

    public void setHoonRate(double hoonRate) {
        this.hoonRate = hoonRate;
    }

    public int getHoonVolumnMax() {
        return hoonVolumnMax;
    }

    public void setHoonVolumnMax(int hoonVolumnMax) {
        this.hoonVolumnMax = hoonVolumnMax;
    }

    public double getHoonDeviden() {
        return hoonDeviden;
    }

    public void setHoonDeviden(double hoonDeviden) {
        this.hoonDeviden = hoonDeviden;
    }

    public int getHoonBuyMin() {
        return hoonBuyMin;
    }

    public void setHoonBuyMin(int hoonBuyMin) {
        this.hoonBuyMin = hoonBuyMin;
    }

}
