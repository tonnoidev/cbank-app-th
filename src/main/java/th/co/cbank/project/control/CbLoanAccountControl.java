package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;
import th.co.cbank.util.DateFormat;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.CbLoanAccountBean;

public class CbLoanAccountControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbLoanAccountControl.class);

    public ArrayList<CbLoanAccountBean> listLoanAccountCust(String custCode) {
        ArrayList<CbLoanAccountBean> listBean = new ArrayList<>();
        try {
            String sql = "select a.*,c.loanName "
                    + "from cb_loan_account a, cb_loan_config c "
                    + "where a.loan_type=c.loanCode "
                    + "and cust_code='" + custCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbLoanAccountBean bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("Loan_docno"));
                bean.setCust_code(rs.getString("Cust_code"));
                bean.setLoan_docdate(rs.getDate("Loan_docdate"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setLoan_amount(rs.getDouble("Loan_amount"));
                bean.setLoan_interest(rs.getDouble("Loan_interest"));
                bean.setLoan_datePay(rs.getDate("Loan_datePay"));
                bean.setLoan_fee(rs.getDouble("Loan_fee"));
                bean.setSysdate(rs.getTimestamp("Sysdate"));
                bean.setID(rs.getInt("ID"));
                bean.setPay_amount(rs.getDouble("Pay_amount"));
                bean.setPay_date(rs.getString("Pay_date"));
                bean.setPay_time(rs.getString("Pay_time"));
                bean.setPay_user(rs.getString("Pay_user"));
                bean.setPay_ton(rs.getDouble("Pay_ton"));
                bean.setLoan_person1(rs.getString("Loan_person1"));
                bean.setLoan_person2(rs.getString("Loan_person2"));
                bean.setPay_interest(rs.getDouble("Pay_interest"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setBook_no(rs.getString("Book_No"));
                bean.setLoan_type(rs.getString("Loan_Type"));
                bean.setLoan_start_date(rs.getDate("loan_start_date"));
                bean.setLoan_end_date(rs.getDate("loan_end_date"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setChkPersonApprove(rs.getString("chkPersonApprove"));
                bean.setLoanCustomerPay(rs.getDouble("LoanCustomerPay"));
                bean.setLoanDayQty(rs.getInt("loanDayQty"));
                bean.setLoanPayMin(rs.getDouble("loanPayMin"));
                bean.setLoan_name(ThaiUtil.ASCII2Unicode(rs.getString("LoanName")));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBean;
    }

    public ArrayList<CbLoanAccountBean> listLoanAccount() {
        ArrayList<CbLoanAccountBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_loan_account";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbLoanAccountBean bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("Loan_docno"));
                bean.setCust_code(rs.getString("Cust_code"));
                bean.setLoan_docdate(rs.getDate("Loan_docdate"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setLoan_amount(rs.getDouble("Loan_amount"));
                bean.setLoan_interest(rs.getDouble("Loan_interest"));
                bean.setLoan_datePay(rs.getDate("Loan_datePay"));
                bean.setLoan_fee(rs.getDouble("Loan_fee"));
                bean.setSysdate(rs.getTimestamp("Sysdate"));
                bean.setID(rs.getInt("ID"));
                bean.setPay_amount(rs.getDouble("Pay_amount"));
                bean.setPay_date(rs.getString("Pay_date"));
                bean.setPay_time(rs.getString("Pay_time"));
                bean.setPay_user(rs.getString("Pay_user"));
                bean.setPay_ton(rs.getDouble("Pay_ton"));
                bean.setLoan_person1(rs.getString("Loan_person1"));
                bean.setLoan_person2(rs.getString("Loan_person2"));
                bean.setPay_interest(rs.getDouble("Pay_interest"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setBook_no(rs.getString("Book_No"));
                bean.setLoan_type(rs.getString("Loan_Type"));
                bean.setLoan_start_date(rs.getDate("loan_start_date"));
                bean.setLoan_end_date(rs.getDate("loan_end_date"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setChkPersonApprove(rs.getString("chkPersonApprove"));
                bean.setLoanCustomerPay(rs.getDouble("LoanCustomerPay"));
                bean.setLoanDayQty(rs.getInt("loanDayQty"));
                bean.setLoanPayMin(rs.getDouble("loanPayMin"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBean;
    }

    public ArrayList<CbLoanAccountBean> searchLoanAccount(String custName) {
        ArrayList<CbLoanAccountBean> listBean = new ArrayList<>();
        try {
            String sql = "select loan_docno, loanName, cust_code, p_custCode ,p_custName, p_custSurname, loan_amount "
                    + "from cb_loan_account ln,cb_profile p,cb_loan_config c "
                    + "where ln.cust_code=p.p_custCode "
                    + "and ln.loan_type=c.loanCode "
                    + "and p_custName like '%"+custName+"%'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbLoanAccountBean bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("loan_docno"));
                bean.setLoan_name(rs.getString("loanName"));
                bean.setCust_code(rs.getString("cust_code"));
                bean.setCustName(ThaiUtil.ASCII2Unicode(rs.getString("p_custName"))+" "+ThaiUtil.ASCII2Unicode(rs.getString("p_custSurname")));
                bean.setLoan_amount(rs.getDouble("loan_amount"));

                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBean;
    }

    public CbLoanAccountBean findLoanByIdCard(String idCard) {
        CbLoanAccountBean bean = null;
        try {
            String sql = "select * from cb_loan_account where cust_code='" + idCard + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("Loan_docno"));
                bean.setCust_code(rs.getString("Cust_code"));
                bean.setLoan_docdate(rs.getDate("Loan_docdate"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setLoan_amount(rs.getDouble("Loan_amount"));
                bean.setLoan_interest(rs.getDouble("Loan_interest"));
                bean.setLoan_datePay(rs.getDate("Loan_datePay"));
                bean.setLoan_fee(rs.getDouble("Loan_fee"));
                bean.setSysdate(rs.getTimestamp("Sysdate"));
                bean.setID(rs.getInt("ID"));
                bean.setPay_amount(rs.getDouble("Pay_amount"));
                bean.setPay_date(rs.getString("Pay_date"));
                bean.setPay_time(rs.getString("Pay_time"));
                bean.setPay_user(rs.getString("Pay_user"));
                bean.setPay_ton(rs.getDouble("Pay_ton"));
                bean.setLoan_person1(rs.getString("Loan_person1"));
                bean.setLoan_person2(rs.getString("Loan_person2"));
                bean.setPay_interest(rs.getDouble("Pay_interest"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setBook_no(rs.getString("Book_No"));
                bean.setLoan_type(rs.getString("Loan_Type"));
                bean.setLoan_start_date(rs.getDate("loan_start_date"));
                bean.setLoan_end_date(rs.getDate("loan_end_date"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setChkPersonApprove(rs.getString("chkPersonApprove"));
                bean.setLoanCustomerPay(rs.getDouble("LoanCustomerPay"));
                bean.setLoanDayQty(rs.getInt("loanDayQty"));
                bean.setLoanPayMin(rs.getDouble("loanPayMin"));
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bean;
    }

    public CbLoanAccountBean listLoanAccount(String Loan_docno) {
        CbLoanAccountBean bean = null;
        try {
            String sql = "select a.*,c.LoanName "
                    + "from cb_loan_account a, cb_loan_config c "
                    + "where a.Loan_Type=c.LoanCode "
                    + "and Loan_docno='" + Loan_docno + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("Loan_docno"));
                bean.setCust_code(rs.getString("Cust_code"));
                bean.setLoan_docdate(rs.getDate("Loan_docdate"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setLoan_amount(rs.getDouble("Loan_amount"));
                bean.setLoan_interest(rs.getDouble("Loan_interest"));
                bean.setLoan_datePay(rs.getDate("Loan_datePay"));
                bean.setLoan_fee(rs.getDouble("Loan_fee"));
                bean.setSysdate(rs.getTimestamp("Sysdate"));
                bean.setID(rs.getInt("ID"));
                bean.setPay_amount(rs.getDouble("Pay_amount"));
                bean.setPay_date(rs.getString("Pay_date"));
                bean.setPay_time(rs.getString("Pay_time"));
                bean.setPay_user(rs.getString("Pay_user"));
                bean.setPay_ton(rs.getDouble("Pay_ton"));
                bean.setLoan_person1(rs.getString("Loan_person1"));
                bean.setLoan_person2(rs.getString("Loan_person2"));
                bean.setPay_interest(rs.getDouble("Pay_interest"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setBook_no(rs.getString("Book_No"));
                bean.setLoan_type(rs.getString("Loan_Type"));
                bean.setLoan_start_date(rs.getDate("loan_start_date"));
                bean.setLoan_end_date(rs.getDate("loan_end_date"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setChkPersonApprove(rs.getString("chkPersonApprove"));
                bean.setLoanCustomerPay(rs.getDouble("LoanCustomerPay"));
                bean.setLoanDayQty(rs.getInt("loanDayQty"));
                bean.setLoanPayMin(rs.getDouble("loanPayMin"));
                bean.setLoan_name(ThaiUtil.ASCII2Unicode(rs.getString("LoanName")));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            bean = null;
        }

        return bean;
    }

    public boolean saveLoanAccount(CbLoanAccountBean bean) {
        boolean isSave = false;
        try {
            String sql = "insert into cb_loan_account "
                    + "(loan_docno,cust_code,loan_docdate,branch_code,loan_amount,"
                    + "loan_interest,loan_datePay,loan_fee,"
                    + "sysdate,ID,pay_amount,pay_date,"
                    + "pay_time,pay_user,pay_ton,loan_person,pay_interest,"
                    + "book_evidence1,book_evidence2,book_evidence3,book_evidence4,"
                    + "book_no,loan_type,loan_start_date,loan_end_date,loan_person1,loan_person2,payPerAmount,period_pay,"
                    + "chkPersonApprove,loanCustomerPay,loanPayMin,loanDayQty) "
                    + "values('" + bean.getLoan_docno() + "','" + bean.getCust_code() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getLoan_docdate()) + "',"
                    + "'" + bean.getBranch_code() + "',"
                    + "'" + bean.getLoan_amount() + "',"
                    + "'" + bean.getLoan_interest() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getLoan_datePay()) + "',"
                    + "'" + bean.getLoan_fee() + "',"
                    + "'2015-01-01','" + bean.getID() + "','" + bean.getPay_amount() + "',"
                    + "'2015-01-01','00:00:00','" + bean.getPay_user() + "',"
                    + "'" + bean.getPay_ton() + "','" + bean.getLoan_person1() + "','" + bean.getPay_interest() + "',"
                    + "'" + bean.getBook_evidence1() + "','" + bean.getBook_evidence2() + "','" + bean.getBook_evidence3() + "','" + bean.getBook_evidence4() + "',"
                    + "'" + bean.getBook_no() + "','" + bean.getLoan_type() + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getLoan_start_date()) + "',"
                    + "'" + DateFormat.getMySQL_Date(bean.getLoan_end_date()) + "',"
                    + "'" + bean.getLoan_person1() + "','" + bean.getLoan_person2() + "','" + bean.getPayPerAmount() + "',"
                    + "'" + bean.getPeriod_pay() + "','" + bean.getChkPersonApprove() + "','" + bean.getLoanCustomerPay() + "',"
                    + "'" + bean.getLoanPayMin() + "','" + bean.getLoanDayQty() + "')";
            String sqlChk = "select * from cb_loan_account "
                    + "where loan_docno='" + bean.getLoan_docno() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                isSave = updateLoanAccount2(bean);
            } else {
                update(sql);

                //update running
                try {
                    String sql2 = "update cb_loan_config set "
                            + "LoanRunning=LoanRunning+1,"
                            + "BookNo=BookNo+1 "
                            + "where LoanCode='" + bean.getLoan_type() + "'";
                    update(sql2);
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }

                isSave = true;
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSave;
    }

    public boolean saveLoanAccountOpen(CbLoanAccountBean bean) {
        boolean isSave;
        try {
            String sql = "insert into cb_loan_account "
                    + "(loan_docno,cust_code,loan_docdate,branch_code,loan_amount,loan_interest,loan_datePay,"
                    + "loan_fee,sysdate,ID,pay_amount,pay_date,pay_time,pay_user,pay_ton,loan_person1,"
                    + "pay_interest,book_evidence1,book_evidence2,book_evidence3,book_evidence4,book_no,"
                    + "loan_type,loan_start_date,loan_end_date,loan_person2,payPerAmount,period_pay,loan_person) "
                    + "values('" + bean.getLoan_docno() + "','" + bean.getCust_code() + "',curdate(),"
                    + "'" + bean.getBranch_code() + "','" + bean.getLoan_amount() + "','" + bean.getLoan_interest() + "',"
                    + "curdate(),'" + bean.getLoan_fee() + "',now(),"
                    + "'" + bean.getID() + "','" + bean.getPay_amount() + "',curdate(),"
                    + "'" + bean.getPay_time() + "','" + bean.getPay_user() + "','" + bean.getPay_ton() + "',"
                    + "'" + bean.getLoan_person1() + "','" + bean.getPay_interest() + "','" + bean.getBook_evidence1() + "',"
                    + "'" + bean.getBook_evidence2() + "','" + bean.getBook_evidence3() + "',"
                    + "'" + bean.getBook_evidence4() + "','" + bean.getBook_no() + "','" + bean.getLoan_type() + "',"
                    + "curdate(),curdate(),'" + bean.getLoan_person2() + "','" + bean.getPayPerAmount() + "',"
                    + "'" + bean.getPeriod_pay() + "','')";
            String sqlChk = "select * from cb_loan_account where loan_docno='" + bean.getLoan_docno() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateLoanAccount(bean);
            } else {
                Log.write.info(sql);
                update(sql);
            }
            isSave = true;
        } catch (Exception e) {
            e.printStackTrace();
            isSave = false;
        }

        return isSave;
    }

    public void updateLoanAccount1(CbLoanAccountBean bean) {
        try {
            String sql = "update cb_loan_account set "
                    + "loan_docno='" + bean.getLoan_docno() + "', "
                    + "cust_code='" + bean.getCust_code() + "', "
                    + "loan_docdate='" + bean.getLoan_docdate() + "', "
                    + "branch_code='" + bean.getBranch_code() + "', "
                    + "loan_amount='" + bean.getLoan_amount() + "', "
                    + "loan_interest='" + bean.getLoan_interest() + "', "
                    + "loan_datePay='" + bean.getLoan_datePay() + "', "
                    + "loan_fee='" + bean.getLoan_fee() + "', "
                    + "sysdate=now(), "
                    + "ID='" + bean.getID() + "', "
                    + "pay_amount='" + bean.getPay_amount() + "', "
                    + "pay_date='" + bean.getPay_date() + "', "
                    + "pay_time='" + bean.getPay_time() + "', "
                    + "pay_user='" + bean.getPay_user() + "', "
                    + "pay_ton='" + bean.getPay_ton() + "', "
                    + "loan_person1='" + bean.getLoan_person1() + "', "
                    + "loan_person2='" + bean.getLoan_person2() + "', "
                    + "pay_interest='" + bean.getPay_interest() + "', "
                    + "book_evidence1='" + bean.getBook_evidence1() + "', "
                    + "book_evidence2='" + bean.getBook_evidence2() + "', "
                    + "book_evidence3='" + bean.getBook_evidence3() + "', "
                    + "book_evidence4='" + bean.getBook_evidence4() + "',"
                    + "book_no='" + bean.getBook_no() + "',"
                    + "payPerAmount='" + bean.getPayPerAmount() + "', "
                    + "loan_type='" + bean.getLoan_type() + "',"
                    + "chkPersonApprove='" + bean.getChkPersonApprove() + "',"
                    + "loanCustomerPay='" + bean.getLoanCustomerPay() + "',"
                    + "loanDayQty='" + bean.getLoanDayQty() + "',"
                    + "loanPayMin='" + bean.getLoanPayMin() + "',"
                    + "period_pay='" + bean.getPeriod_pay() + "' "
                    + "where loan_docno='" + bean.getLoan_docno() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean updateLoanAccount2(CbLoanAccountBean bean) {
        boolean isSaveReady;
        try {
            String sql = "update cb_loan_account set "
                    + "loan_docdate=curdate(), "
                    + "loan_amount=loan_amount+" + bean.getLoan_amount() + ", "
                    + "loan_interest='" + bean.getLoan_interest() + "', "
                    + "sysdate=now(), "
                    + "loan_person1='" + bean.getLoan_person1() + "',"
                    + "loan_person2='" + bean.getLoan_person2() + "',"
                    + "loan_start_date='" + DateFormat.getMySQL_Date(bean.getLoan_start_date()) + "',"
                    + "loan_end_date='" + DateFormat.getMySQL_Date(bean.getLoan_end_date()) + "',"
                    + "payPerAmount='" + bean.getPayPerAmount() + "',"
                    + "chkPersonApprove='" + bean.getChkPersonApprove() + "',"
                    + "loanCustomerPay='" + bean.getLoanCustomerPay() + "',"
                    + "loanDayQty='" + bean.getLoanDayQty() + "',"
                    + "loanPayMin='" + bean.getLoanPayMin() + "',"
                    + "period_pay='" + bean.getPeriod_pay() + "' "
                    + "where loan_docno='" + bean.getLoan_docno() + "' "
                    + "and cust_code='" + bean.getCust_code() + "'";
            update(sql);
            isSaveReady = true;
        } catch (Exception e) {
            e.printStackTrace();
            isSaveReady = false;
        }

        return isSaveReady;
    }

    private void updateLoanAccount(CbLoanAccountBean bean) {
        try {
            String sql = "update cb_loan_account set "
                    + "loan_docno='" + bean.getLoan_docno() + "', "
                    + "cust_code='" + bean.getCust_code() + "', "
                    + "loan_docdate=curdate(), "
                    + "branch_code='" + bean.getBranch_code() + "', "
                    + "loan_amount='" + bean.getLoan_amount() + "', "
                    + "loan_interest='" + bean.getLoan_interest() + "', "
                    + "loan_datePay=curdate(), "
                    + "loan_fee='" + bean.getLoan_fee() + "', "
                    + "sysdate=now(), "
                    + "ID='" + bean.getID() + "', "
                    + "pay_amount='" + bean.getPay_amount() + "', "
                    + "pay_date=curdate(), "
                    + "pay_time='" + bean.getPay_time() + "', "
                    + "pay_user='" + bean.getPay_user() + "', "
                    + "pay_ton='" + bean.getPay_ton() + "', "
                    + "loan_person1='" + bean.getLoan_person1() + "', "
                    + "loan_person2='" + bean.getLoan_person2() + "', "
                    + "pay_interest='" + bean.getPay_interest() + "', "
                    + "book_evidence1='" + bean.getBook_evidence1() + "', "
                    + "book_evidence2='" + bean.getBook_evidence2() + "', "
                    + "book_evidence3='" + bean.getBook_evidence3() + "', "
                    + "book_evidence4='" + bean.getBook_evidence4() + "', "
                    + "book_no='" + bean.getBook_no() + "', "
                    + "loan_type='" + bean.getLoan_type() + "', "
                    + "chkPersonApprove='" + bean.getChkPersonApprove() + "',"
                    + "loanCustomerPay='" + bean.getLoanCustomerPay() + "',"
                    + "loanDayQty='" + bean.getLoanDayQty() + "',"
                    + "loanPayMin='" + bean.getLoanPayMin() + "',"
                    + "loan_start_date=curdate(), "
                    + "payPerAmount='" + bean.getPayPerAmount() + "', "
                    + "loan_end_date=curdate(),"
                    + "period_pay='" + bean.getPeriod_pay() + "' "
                    + "where loan_docno='" + bean.getLoan_docno() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public CbLoanAccountBean initBean(){
        CbLoanAccountBean lb = new CbLoanAccountBean();
        lb.setLoan_datePay(DateFormat.getEnglish_ddMMyyyy("01/01/2015"));
        lb.setSysdate(new Date());
        lb.setPay_user("");
        lb.setLoan_person1("");
        lb.setLoan_person2("");
        lb.setBook_evidence1("");
        lb.setBook_evidence2("");
        lb.setBook_evidence3("");
        lb.setBook_evidence4("");
        lb.setBook_no("001");
        lb.setLoan_start_date(new Date());
        lb.setLoan_end_date(new Date());
        
        return lb;
    }

    public CbLoanAccountBean getLoanAccount(String Loan_docno) {
        CbLoanAccountBean bean = null;
        try {
            String sql = "select * from cb_loan_account where Loan_docno='" + Loan_docno + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean = new CbLoanAccountBean();
                bean.setLoan_docno(rs.getString("Loan_docno"));
                bean.setCust_code(rs.getString("Cust_code"));
                bean.setLoan_docdate(rs.getDate("Loan_docdate"));
                bean.setBranch_code(rs.getString("branch_code"));
                bean.setLoan_amount(rs.getDouble("Loan_amount"));
                bean.setLoan_interest(rs.getDouble("Loan_interest"));
                bean.setLoan_datePay(rs.getDate("Loan_datePay"));
                bean.setLoan_fee(rs.getDouble("Loan_fee"));
                bean.setSysdate(rs.getTimestamp("Sysdate"));
                bean.setID(rs.getInt("ID"));
                bean.setPay_amount(rs.getDouble("Pay_amount"));
                bean.setPay_date(rs.getString("Pay_date"));
                bean.setPay_time(rs.getString("Pay_time"));
                bean.setPay_user(rs.getString("Pay_user"));
                bean.setPay_ton(rs.getDouble("Pay_ton"));
                bean.setLoan_person1(rs.getString("Loan_person1"));
                bean.setLoan_person2(rs.getString("Loan_person2"));
                bean.setPay_interest(rs.getDouble("Pay_interest"));
                bean.setBook_evidence1(rs.getString("Book_evidence1"));
                bean.setBook_evidence2(rs.getString("Book_evidence2"));
                bean.setBook_evidence3(rs.getString("Book_evidence3"));
                bean.setBook_evidence4(rs.getString("Book_evidence4"));
                bean.setBook_no(rs.getString("Book_No"));
                bean.setLoan_type(rs.getString("Loan_Type"));
                bean.setLoan_start_date(rs.getDate("loan_start_date"));
                bean.setLoan_end_date(rs.getDate("loan_end_date"));
                bean.setPayPerAmount(rs.getDouble("payPerAmount"));
                bean.setPeriod_pay(rs.getInt("period_pay"));
                bean.setChkPersonApprove(rs.getString("chkPersonApprove"));
                bean.setLoanCustomerPay(rs.getDouble("LoanCustomerPay"));
                bean.setLoanDayQty(rs.getInt("loanDayQty"));
                bean.setLoanPayMin(rs.getDouble("loanPayMin"));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bean;
    }
}
