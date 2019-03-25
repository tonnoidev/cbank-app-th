package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.mapping.LoadLoanMapping;

public class ModelControl extends BaseControl {
    private final Logger logger = Logger.getLogger(ModelControl.class);

    public List<LoadLoanMapping> getDataLoan(String profileCode) {
        List list = new ArrayList<LoadLoanMapping>();
        try {
            String sql = "select loan_docno,loan_Credit_Balance,loan_fee, loan_type, LoanName, book_no "
                    + "from cb_loan_account a, cb_loan_config w, cb_profile p "
                    + "where a.loan_type=w.loanCode "
                    + "and a.cust_code=p.p_custcode "
                    + "and cust_code='" + profileCode + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                LoadLoanMapping bean = new LoadLoanMapping();
                bean.setLoan_docno(rs.getString("loan_docno"));
                bean.setLoan_Credit_Balance(rs.getDouble("Loan_Credit_Balance"));

                list.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
