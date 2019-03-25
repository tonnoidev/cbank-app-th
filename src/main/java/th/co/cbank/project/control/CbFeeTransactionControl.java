package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbFeeTransactionBean;

public class CbFeeTransactionControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbFeeTransactionControl.class);

    public ArrayList<CbFeeTransactionBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbFeeTransactionBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbFeeTransactionBean bean = new CbFeeTransactionBean();
            bean.setFee_code(rs.getString("Fee_code"));
            bean.setFee_desc(ThaiUtil.ASCII2Unicode(rs.getString("Fee_desc")));
            bean.setFee_amount(rs.getDouble("Fee_amount"));
            bean.setFee_branch(rs.getString("Fee_branch"));
            bean.setFee_emp_code(rs.getString("Fee_emp_code"));
            bean.setFee_cust_code(rs.getString("Fee_cust_code"));
            bean.setFee_date(rs.getDate("fee_date"));
            bean.setFee_time(rs.getString("fee_time"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbFeeTransactionBean> listCbFeeTransaction() {
        try {
            String sql = "select * from cb_fee_transaction "
                    + "order by fee_date, fee_time";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbFeeTransactionBean> listCbFeeTransaction(String fee_code) {
        try {
            String sql = "select * from cb_fee_transaction "
                    + "where fee_code='" + fee_code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbFeeTransactionBean getCbFeeTransaction(String fee_code) {
        try {
            String sql = "select * from cb_fee_transaction where fee_code='" + fee_code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbFeeTransactionBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveCbFeeTransaction(CbFeeTransactionBean bean) {
        try {
            String sql = "insert into cb_fee_transaction "
                    + "(fee_code,fee_desc,fee_amount,fee_branch,fee_emp_code, fee_cust_code, fee_date, fee_time)  "
                    + "values('" + bean.getFee_code() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getFee_desc()) + "',"
                    + "'" + bean.getFee_amount() + "',"
                    + "'" + bean.getFee_branch() + "',"
                    + "'" + bean.getFee_emp_code() + "',"
                    + "'" + bean.getFee_cust_code() + "', curdate(), curtime())";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCbFeeTransaction(CbFeeTransactionBean bean) {
        try {
            String sql = "update cb_fee_transaction set "
                    + "fee_code='" + bean.getFee_code() + "', "
                    + "fee_desc='" + ThaiUtil.Unicode2ASCII(bean.getFee_desc()) + "', "
                    + "fee_amount='" + bean.getFee_amount() + "', "
                    + "fee_branch='" + bean.getFee_branch() + "', "
                    + "fee_emp_code='" + bean.getFee_emp_code() + "',"
                    + "fee_cust_code='" + bean.getFee_cust_code() + "',"
                    + "fee_date=curdate(),"
                    + "fee_time=curtime() "
                    + "where fee_code='" + bean.getFee_code() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
