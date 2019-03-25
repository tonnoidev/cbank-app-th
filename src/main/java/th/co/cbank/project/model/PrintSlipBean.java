package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class PrintSlipBean {
    
    // ชื่อบัญชี เลขที่บัญชี วันที่ เวลา รหัสผู้รับฝาก ยอดเงิน
    //
    private final Logger logger = Logger.getLogger(PrintSlipBean.class);
    private String AccountName;
    private String AccountCode;
    private String TranDate;
    private String TranTime;
    private String EmpCode;
    private String Amount;
    private String DocNo;

    public String getDocNo() {
        return DocNo;
    }

    public void setDocNo(String DocNo) {
        this.DocNo = DocNo;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public String getAccountCode() {
        return AccountCode;
    }

    public void setAccountCode(String AccountCode) {
        this.AccountCode = AccountCode;
    }

    public String getTranDate() {
        return TranDate;
    }

    public void setTranDate(String TranDate) {
        this.TranDate = TranDate;
    }

    public String getTranTime() {
        return TranTime;
    }

    public void setTranTime(String TranTime) {
        this.TranTime = TranTime;
    }

    public String getEmpCode() {
        return EmpCode;
    }

    public void setEmpCode(String EmpCode) {
        this.EmpCode = EmpCode;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }
    
    
}
