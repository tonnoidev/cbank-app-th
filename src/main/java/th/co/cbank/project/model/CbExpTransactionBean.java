package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbExpTransactionBean {
    private final Logger logger = Logger.getLogger(CbExpTransactionBean.class);
    private String EXP_DOC;//
    private Date EXP_DATE;//
    private String BRANCH_CODE;//
    private String EMP_CODE;//
    private String EXP_TYPE;//
    private double EMP_AMOUNT = 0.00;//

    public String getEXP_DOC() {
        return EXP_DOC;
    }

    public void setEXP_DOC(String EXP_DOC) {
        this.EXP_DOC = EXP_DOC;
    }

    public Date getEXP_DATE() {
        return EXP_DATE;
    }

    public void setEXP_DATE(Date EXP_DATE) {
        this.EXP_DATE = EXP_DATE;
    }

    public String getBRANCH_CODE() {
        return BRANCH_CODE;
    }

    public void setBRANCH_CODE(String BRANCH_CODE) {
        this.BRANCH_CODE = BRANCH_CODE;
    }

    public String getEMP_CODE() {
        return EMP_CODE;
    }

    public void setEMP_CODE(String EMP_CODE) {
        this.EMP_CODE = EMP_CODE;
    }

    public String getEXP_TYPE() {
        return EXP_TYPE;
    }

    public void setEXP_TYPE(String EXP_TYPE) {
        this.EXP_TYPE = EXP_TYPE;
    }

    public double getEMP_AMOUNT() {
        return EMP_AMOUNT;
    }

    public void setEMP_AMOUNT(double EMP_AMOUNT) {
        this.EMP_AMOUNT = EMP_AMOUNT;
    }

}
