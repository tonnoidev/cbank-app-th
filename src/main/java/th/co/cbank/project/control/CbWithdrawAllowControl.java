package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbWithdrawAllowBean;

public class CbWithdrawAllowControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbWithdrawAllowControl.class);

    public ArrayList<CbWithdrawAllowBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbWithdrawAllowBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbWithdrawAllowBean bean = new CbWithdrawAllowBean();
            bean.setAccount_no(rs.getString("Account_no"));
            bean.setAllow_person_qty(rs.getInt("Allow_person_qty"));
            bean.setIndex(rs.getInt("_index"));
            bean.setCust_code(rs.getString("Cust_code"));
            bean.setCust_name(ThaiUtil.ASCII2Unicode(rs.getString("Cust_name")));
            bean.setCust_surname(ThaiUtil.ASCII2Unicode(rs.getString("Cust_surname")));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbWithdrawAllowBean> listCbWithdrawAllow() {
        try {
            String sql = "select * from cb_withdraw_allow";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbWithdrawAllowBean> listCbWithdrawAllow(String account_no) {
        try {
            String sql = "select * from cb_withdraw_allow where account_no='" + account_no + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbWithdrawAllowBean getCbWithdrawAllow(String account_no) {
        try {
            String sql = "select * from cb_withdraw_allow where account_no='" + account_no + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbWithdrawAllowBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveCbWithdrawAllow(CbWithdrawAllowBean bean) {
        try {
            String sql = "insert into cb_withdraw_allow "
                    + "(account_no,allow_person_qty,_index,cust_code,cust_name,cust_surname)  "
                    + "values('" + bean.getAccount_no() + "',"
                    + "'" + bean.getAllow_person_qty() + "',"
                    + "'" + bean.getIndex() + "',"
                    + "'" + bean.getCust_code() + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getCust_name()) + "',"
                    + "'" + ThaiUtil.Unicode2ASCII(bean.getCust_surname()) + "')";
            String sqlChk = "select * from cb_withdraw_allow "
                    + "where account_no='" + bean.getAccount_no() + "' "
                    + "and cust_code='" + bean.getCust_code() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbWithdrawAllow(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCbWithdrawAllow(CbWithdrawAllowBean bean) {
        try {
            String sql = "update cb_withdraw_allow set "
                    + "account_no='" + bean.getAccount_no() + "', "
                    + "allow_person_qty='" + bean.getAllow_person_qty() + "', "
                    + "_index='" + bean.getIndex() + "', "
                    + "cust_code='" + bean.getCust_code() + "', "
                    + "cust_name='" + ThaiUtil.Unicode2ASCII(bean.getCust_name()) + "', "
                    + "cust_surname='" + ThaiUtil.Unicode2ASCII(bean.getCust_surname()) + "' "
                    + "where account_no='" + bean.getAccount_no() + "' and "
                    + "cust_code='" + bean.getCust_code() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getMaxIndex(String accCode) {
        int maxIndex = 0;
        try {
            String sql = "select max(_index) _index from cb_withdraw_allow "
                    + "where account_no='" + accCode + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                maxIndex = rs.getInt("_index");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (maxIndex < 1) {
            return 1;
        }

        return maxIndex;
    }
}
