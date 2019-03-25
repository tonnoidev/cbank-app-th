package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbBondsmanBean {
    private final Logger logger = Logger.getLogger(CbBondsmanBean.class);
    private String loan_docno;//
    private String idcard;//
    private String name;//
    private String surname;//

    public String getLoan_docno() {
        return loan_docno;
    }

    public void setLoan_docno(String loan_docno) {
        this.loan_docno = loan_docno;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
