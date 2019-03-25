package th.co.cbank.project.model.mapping;

import org.apache.log4j.Logger;

public class LoadLoanMapping {
    private final Logger logger = Logger.getLogger(LoadLoanMapping.class);

    private String loan_docno;
    private double loan_credit_balance;
    private double loan_fee;
    private String loan_type;
    private String loanName;
    private String book_no;

    public String getLoan_docno() {
        return loan_docno;
    }

    public void setLoan_docno(String loan_docno) {
        this.loan_docno = loan_docno;
    }

    public double getLoan_Credit_Balance() {
        return loan_credit_balance;
    }

    public void setLoan_Credit_Balance(double loan_credit_balance) {
        this.loan_credit_balance = loan_credit_balance;
    }

    public double getLoan_fee() {
        return loan_fee;
    }

    public void setLoan_fee(double loan_fee) {
        this.loan_fee = loan_fee;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public String getBook_no() {
        return book_no;
    }

    public void setBook_no(String book_no) {
        this.book_no = book_no;
    }

}
