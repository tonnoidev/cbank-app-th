package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbFeeBean;

public class CbFeeControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbFeeControl.class);

    public ArrayList<CbFeeBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbFeeBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbFeeBean bean = new CbFeeBean();
            bean.setExp_id(rs.getString("Exp_id"));
            bean.setExp_desc(rs.getString("Exp_desc"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbFeeBean> listCbFee() {        
        try {
            String sql = "select * from cb_fee";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public ArrayList<CbFeeBean> listCbFee(String exp_id) {
        try {
            String sql = "select * from cb_fee where exp_id='" + exp_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbFeeBean getCbFee(String exp_id) {
        try {
            String sql = "select * from cb_fee where exp_id='" + exp_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbFeeBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveCbFee(CbFeeBean bean) {
        try {
            String sql = "insert into cb_fee (exp_id,exp_desc)  "
                    + "values('" + bean.getExp_id() + "','" + bean.getExp_desc() + "')";
            String sqlChk = "select * from cb_fee "
                    + "where exp_id='" + bean.getExp_id() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateCbFee(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCbFee(CbFeeBean bean) {
        try {
            String sql = "update cb_fee set "
                    + "exp_id='" + bean.getExp_id() + "', "
                    + "exp_desc='" + bean.getExp_desc() + "' "
                    + "where exp_id='" + bean.getExp_id() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<CbFeeBean> listExpense() {
        try {
            String sql = "select * from cb_fee";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbFeeBean listExpense(String exp_id) {
        try {
            String sql = "select * from cb_fee where exp_id='" + exp_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbFeeBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveExpense(CbFeeBean bean) {
        try {
            String sql = "insert into cb_fee (exp_id,exp_desc)  "
                    + "values('" + bean.getExp_id() + "','" + bean.getExp_desc() + "')";
            String sqlChk = "select * from cb_fee where exp_id='" + bean.getExp_id() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updateExpense(bean);
            } else {
                update(sql);
            }

            rs.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateExpense(CbFeeBean bean) {
        try {
            String sql = "update cb_fee set "
                    + "exp_id='" + bean.getExp_id() + "', "
                    + "exp_desc='" + bean.getExp_desc() + "' "
                    + "where exp_id='" + bean.getExp_id() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
