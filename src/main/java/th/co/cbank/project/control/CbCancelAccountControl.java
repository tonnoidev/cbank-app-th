package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbCancelAccountBean;

public class CbCancelAccountControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbCancelAccountControl.class);

    public ArrayList<CbCancelAccountBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbCancelAccountBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbCancelAccountBean bean = new CbCancelAccountBean();
            bean.setDate_cancel(rs.getDate("Date_cancel"));
            bean.setTime_cancel(rs.getString("Time_cancel"));
            bean.setAccount_no(rs.getString("Account_no"));
            bean.setAccount_type(rs.getString("Account_type"));
            bean.setUser_code(rs.getString("User_code"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public ArrayList<CbCancelAccountBean> listCbCancelAccount() {
        try {
            String sql = "select * from cb_cancel_account";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbCancelAccountBean> listCbCancelAccount(String date_cancel) {
        try {
            String sql = "select * from cb_cancel_account "
                    + "where date_cancel='" + date_cancel + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbCancelAccountBean getCbCancelAccount(String date_cancel) {
        try {
            String sql = "select * from cb_cancel_account where date_cancel='" + date_cancel + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbCancelAccountBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveCbCancelAccount(CbCancelAccountBean bean) {
        try {
            String sql = "insert into cb_cancel_account "
                    + "(date_cancel,time_cancel,account_no,account_type,user_code)  "
                    + "values(curdate(),curtime(),"
                    + "'" + bean.getAccount_no() + "','" + bean.getAccount_type() + "',"
                    + "'" + bean.getUser_code() + "')";
            String sqlChk = "select * from cb_cancel_account "
                    + "where date_cancel='" + bean.getDate_cancel() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbCancelAccount(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCbCancelAccount(CbCancelAccountBean bean) {
        try {
            String sql = "update cb_cancel_account set "
                    + "date_cancel=curdate(), "
                    + "time_cancel=curtime(), "
                    + "account_no='" + bean.getAccount_no() + "', "
                    + "account_type='" + bean.getAccount_type() + "', "
                    + "user_code='" + bean.getUser_code() + "' "
                    + "where date_cancel='" + bean.getDate_cancel() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
