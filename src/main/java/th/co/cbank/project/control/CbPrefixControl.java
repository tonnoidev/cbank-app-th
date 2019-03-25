package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbPrefixBean;

public class CbPrefixControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbPrefixControl.class);

    public ArrayList<CbPrefixBean> listPrefix() {
        ArrayList<CbPrefixBean> listBean = new ArrayList<>();
        try {
            String sql = "select * from cb_prefix";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            while (rs.next()) {
                CbPrefixBean bean = new CbPrefixBean();
                bean.setCode(rs.getString("code"));
                bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
                listBean.add(bean);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }

        return listBean;
    }

    public CbPrefixBean listPrefix(String pj_id) {
        CbPrefixBean bean = new CbPrefixBean();
        try {
            String sql = "select * from cb_prefix "
                    + "where code='" + pj_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setCode(rs.getString("code"));
                bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("name")));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }

        return bean;
    }

    public boolean savePrefix(CbPrefixBean bean) {
        try {
            String sql = "insert into cb_prefix (code,name)  "
                    + "values('" + bean.getCode() + "','" + bean.getName() + "')";
            String sqlChk = "select * from cb_prefix where code='" + bean.getCode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updatePrefix(bean);
            } else {
                update(sql);
            }

            rs.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePrefix(CbPrefixBean bean) {
        try {
            String sql = "update cb_prefix set "
                    + "code='" + bean.getCode() + "', "
                    + "name='" + bean.getName() + "' "
                    + "where code='" + bean.getCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

}
