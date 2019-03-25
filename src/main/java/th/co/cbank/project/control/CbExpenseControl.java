package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbExpenseBean;

public class CbExpenseControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbExpenseControl.class);

    public ArrayList<CbExpenseBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbExpenseBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbExpenseBean bean = new CbExpenseBean();
            bean.setExp_id(rs.getString("Exp_id"));
            bean.setExp_desc(ThaiUtil.ASCII2Unicode(rs.getString("Exp_desc")));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbExpenseBean> listExpense() {
        try {
            String sql = "select * from cb_expense";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbExpenseBean listExpense(String exp_id) {
        try {
            String sql = "select * from cb_expense where exp_id='" + exp_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbExpenseBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveExpense(CbExpenseBean bean) {
        try {
            String sql = "insert into cb_expense (exp_id,exp_desc)  "
                    + "values('" + bean.getExp_id() + "','" + bean.getExp_desc() + "')";
            String sqlChk = "select * from cb_expense where exp_id='" + bean.getExp_id() + "'";
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

    public boolean updateExpense(CbExpenseBean bean) {
        try {
            String sql = "update cb_expense set "
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
