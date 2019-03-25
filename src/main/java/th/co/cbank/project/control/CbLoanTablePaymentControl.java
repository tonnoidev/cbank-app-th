package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.project.model.CbLoanTablePaymentBean;

public class CbLoanTablePaymentControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbLoanTablePaymentControl.class);

    public ArrayList<CbLoanTablePaymentBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbLoanTablePaymentBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbLoanTablePaymentBean bean = new CbLoanTablePaymentBean();
            bean.setLoan_doc_no(rs.getString("Loan_doc_no"));
            bean.setLoan_index(rs.getInt("Loan_index"));
            bean.setLoan_int_ar_lost(rs.getDouble("Loan_int_ar_lost"));
            bean.setLoan_int_ar_mgr(rs.getDouble("Loan_int_ar_mgr"));
            bean.setLoan_int_ar_int(rs.getDouble("Loan_int_ar_int"));
            bean.setNet_total_pay(rs.getDouble("Net_total_pay"));
            bean.setPayment_money(rs.getDouble("Payment_money"));
            bean.setPayment_balance(rs.getDouble("Payment_balance"));
            bean.setPayment_fee(rs.getDouble("Payment_fee"));
            bean.setSys_date(rs.getDate("Sys_date"));
            bean.setSys_time(rs.getString("Sys_time"));
            bean.setEmp_code(rs.getString("Emp_code"));
            bean.setBranch_code(rs.getString("Branch_code"));

            bean.setBase_total_amount(rs.getDouble("base_total_amount"));
            bean.setTable_avg_compute(rs.getDouble("table_avg_compute"));
            bean.setBalance_amount(rs.getDouble("balance_amount"));
            bean.setDue_date(rs.getDate("due_date"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbLoanTablePaymentBean> listCbLoanTablePayment() {
        try {
            String sql = "select * from cb_loan_table_payment";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbLoanTablePaymentBean> listCbLoanTablePayment(String loan_doc_no) {
        try {
            String sql = "select * from cb_loan_table_payment "
                    + "where loan_doc_no='" + loan_doc_no + "' "
                    + "order by loan_index";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbLoanTablePaymentBean tablePayment(String loan_doc_no) {
        try {
            String sql = "select * from cb_loan_table_payment "
                    + "where loan_doc_no='" + loan_doc_no + "' "
                    + "and balance_amount>0";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbLoanTablePaymentBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CbLoanTablePaymentBean getCbLoanTablePayment(String loan_doc_no) {
        try {
            String sql = "select * from cb_loan_table_payment where loan_doc_no='" + loan_doc_no + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbLoanTablePaymentBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveCbLoanTablePayment(CbLoanTablePaymentBean bean) {
        try {
            String sql = "insert into cb_loan_table_payment "
                    + "(loan_doc_no,loan_index,loan_int_ar_lost,loan_int_ar_mgr,loan_int_ar_int,"
                    + "net_total_pay,payment_money,payment_balance,payment_fee,"
                    + "sys_date,sys_time,emp_code,branch_code,"
                    + "base_total_amount,table_avg_compute,due_date,balance_amount)  "
                    + "values('" + bean.getLoan_doc_no() + "',"
                    + "'" + bean.getLoan_index() + "',"
                    + "'" + bean.getLoan_int_ar_lost() + "',"
                    + "'" + bean.getLoan_int_ar_mgr() + "',"
                    + "'" + bean.getLoan_int_ar_int() + "',"
                    + "'" + bean.getNet_total_pay() + "',"
                    + "'" + bean.getPayment_money() + "',"
                    + "'" + bean.getPayment_balance() + "',"
                    + "'" + bean.getPayment_fee() + "',"
                    + "curdate(),curtime(),"
                    + "'" + bean.getEmp_code() + "',"
                    + "'" + bean.getBranch_code() + "',"
                    + "'" + bean.getBase_total_amount() + "',"
                    + "'" + bean.getTable_avg_compute() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getDue_date()) + "',"
                    + "'" + bean.getBalance_amount() + "')";
            String sqlChk = "select * from cb_loan_table_payment "
                    + "where loan_doc_no='" + bean.getLoan_doc_no() + "' "
                    + "and loan_index='" + bean.getLoan_index() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbLoanTablePayment(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCbLoanTablePayment(CbLoanTablePaymentBean bean) {
        try {
            String sql = "update cb_loan_table_payment set "
                    + "loan_doc_no='" + bean.getLoan_doc_no() + "', "
                    + "loan_index='" + bean.getLoan_index() + "', "
                    + "loan_int_ar_lost='" + bean.getLoan_int_ar_lost() + "', "
                    + "loan_int_ar_mgr='" + bean.getLoan_int_ar_mgr() + "', "
                    + "loan_int_ar_int='" + bean.getLoan_int_ar_int() + "', "
                    + "net_total_pay='" + bean.getNet_total_pay() + "', "
                    + "payment_money='" + bean.getPayment_money() + "', "
                    + "payment_balance='" + bean.getPayment_balance() + "', "
                    + "payment_fee='" + bean.getPayment_fee() + "', "
                    + "due_date='" + DateFormat.getMySQL_Date(bean.getDue_date()) + "', "
                    + "sys_date=curdate(), "
                    + "sys_time=curtime(), "
                    + "emp_code='" + bean.getEmp_code() + "', "
                    + "base_total_amount='" + bean.getBase_total_amount() + "', "
                    + "table_avg_compute='" + bean.getTable_avg_compute() + "', "
                    + "branch_code='" + bean.getBranch_code() + "', "
                    + "balance_amount='" + bean.getBalance_amount() + "' "
                    + "where loan_doc_no='" + bean.getLoan_doc_no() + "' "
                    + "and loan_index='" + bean.getLoan_index() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CbLoanTablePaymentBean initBean() {
        CbLoanTablePaymentBean lb = new CbLoanTablePaymentBean();
        lb.setLoan_index(1);
        lb.setSys_date(new Date());
        lb.setSys_time(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        lb.setEmp_code(Value.USER_CODE);
        lb.setDue_date(DateFormat.getEnglish_ddMMyyyy("19/11/2018"));

        return lb;
    }

    public ResultSet findData(String sql) {
        try {
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
