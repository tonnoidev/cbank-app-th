package th.co.cbank.project.model.mapping;

import org.apache.log4j.Logger;

public class PayInterestAmtMapping {
    private final Logger logger = Logger.getLogger(PayInterestAmtMapping.class);

    private int index;
    private String accountNo;
    private String accountName;
    private double balanceAmt;
    private double intAmt;
    private String custCode;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(double balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public double getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(double intAmt) {
        this.intAmt = intAmt;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

}
