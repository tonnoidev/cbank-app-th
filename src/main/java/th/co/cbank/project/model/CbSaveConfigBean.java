package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbSaveConfigBean {
    private final Logger logger = Logger.getLogger(CbSaveConfigBean.class);
    private String TypeCode;//
    private String TypeName;//
    private double TypeINT = 0.00;//
    private String TypeCondition = "1";//
    private double RDType2 = 0.00;//
    private int cbRDType2 = 0;//
    private String rdTypeDialy = "D";//
    private String payType = "1";//
    private int cbPayType1 = 0;//
    private int cbPayType2 = 0;//
    private int cbPayType3 = 0;//
    private int cbPayType4 = 0;//
    private int cbPayType5 = 0;//
    private int cbPayType6 = 0;//
    private int cbPayType7 = 0;//
    private double PayINT = 0.00;//
    private String accCode;
    private double FundINT = 0.00;
    private double MaxDeposit = 999999999.00;
    private double TAX = 0.00;
    private int saveRunning;
    private int noRunning;
    private double SaveFee = 0.00;
    private double minDeposit = 0.00;
    private double minWitdraw = 0.00;

    public double getMinDeposit() {
        return minDeposit;
    }

    public void setMinDeposit(double minDeposit) {
        this.minDeposit = minDeposit;
    }

    public double getMinWitdraw() {
        return minWitdraw;
    }

    public void setMinWitdraw(double minWitdraw) {
        this.minWitdraw = minWitdraw;
    }

    public double getSaveFee() {
        return SaveFee;
    }

    public void setSaveFee(double SaveFee) {
        this.SaveFee = SaveFee;
    }

    public int getNoRunning() {
        return noRunning;
    }

    public void setNoRunning(int noRunning) {
        this.noRunning = noRunning;
    }

    public int getSaveRunning() {
        return saveRunning;
    }

    public void setSaveRunning(int saveRunning) {
        this.saveRunning = saveRunning;
    }

    public double getTAX() {
        return TAX;
    }

    public void setTAX(double TAX) {
        this.TAX = TAX;
    }

    public double getMaxDeposit() {
        return MaxDeposit;
    }

    public void setMaxDeposit(double MaxDeposit) {
        this.MaxDeposit = MaxDeposit;
    }

    public double getFundINT() {
        return FundINT;
    }

    public void setFundINT(double FundINT) {
        this.FundINT = FundINT;
    }

    public String getAccCode() {
        return accCode;
    }

    public void setAccCode(String accCode) {
        this.accCode = accCode;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String TypeCode) {
        this.TypeCode = TypeCode;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    public double getTypeINT() {
        return TypeINT;
    }

    public void setTypeINT(double TypeINT) {
        this.TypeINT = TypeINT;
    }

    public String getTypeCondition() {
        return TypeCondition;
    }

    public void setTypeCondition(String TypeCondition) {
        this.TypeCondition = TypeCondition;
    }

    public double getRDType2() {
        return RDType2;
    }

    public void setRDType2(double RDType2) {
        this.RDType2 = RDType2;
    }

    public int getCbRDType2() {
        return cbRDType2;
    }

    public void setCbRDType2(int cbRDType2) {
        this.cbRDType2 = cbRDType2;
    }

    public String getRdTypeDialy() {
        return rdTypeDialy;
    }

    public void setRdTypeDialy(String rdTypeDialy) {
        this.rdTypeDialy = rdTypeDialy;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public int getCbPayType1() {
        return cbPayType1;
    }

    public void setCbPayType1(int cbPayType1) {
        this.cbPayType1 = cbPayType1;
    }

    public int getCbPayType2() {
        return cbPayType2;
    }

    public void setCbPayType2(int cbPayType2) {
        this.cbPayType2 = cbPayType2;
    }

    public int getCbPayType3() {
        return cbPayType3;
    }

    public void setCbPayType3(int cbPayType3) {
        this.cbPayType3 = cbPayType3;
    }

    public int getCbPayType4() {
        return cbPayType4;
    }

    public void setCbPayType4(int cbPayType4) {
        this.cbPayType4 = cbPayType4;
    }

    public int getCbPayType5() {
        return cbPayType5;
    }

    public void setCbPayType5(int cbPayType5) {
        this.cbPayType5 = cbPayType5;
    }

    public int getCbPayType6() {
        return cbPayType6;
    }

    public void setCbPayType6(int cbPayType6) {
        this.cbPayType6 = cbPayType6;
    }

    public int getCbPayType7() {
        return cbPayType7;
    }

    public void setCbPayType7(int cbPayType7) {
        this.cbPayType7 = cbPayType7;
    }

    public double getPayINT() {
        return PayINT;
    }

    public void setPayINT(double PayINT) {
        this.PayINT = PayINT;
    }

}
