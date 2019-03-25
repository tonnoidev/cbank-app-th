package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbMemberTypeBean;

public class CbMemberTypeControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbMemberTypeControl.class);

    public ArrayList<CbMemberTypeBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbMemberTypeBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbMemberTypeBean bean = new CbMemberTypeBean();
            bean.setTypeCode(rs.getString("type_code"));
            bean.setTypeName(ThaiUtil.ASCII2Unicode(rs.getString("type_name")));
            bean.setMemberCount(rs.getInt("member_count"));
            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public ArrayList<CbMemberTypeBean> listMemberType() {
        try {
            String sql = "select * from cb_member_type";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbMemberTypeBean listMemberType(String pj_id) {
        try {
            String sql = "select * from cb_member_type where type_code='" + pj_id + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbMemberTypeBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean saveMemberType(CbMemberTypeBean bean) {
        try {
            String sql = "insert into cb_member_type (type_code,type_name,member_count)  "
                    + "values('" + bean.getTypeCode() + "','" + bean.getTypeName() + "','" + bean.getMemberCount() + "')";
            String sqlChk = "select * from cb_member_type where type_code='" + bean.getTypeCode() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                return updateMemberType(bean);
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

    public boolean updateMemberType(CbMemberTypeBean bean) {
        try {
            String sql = "update cb_member_type set "
                    + "type_name='" + bean.getTypeName() + "',"
                    + "member_count='" + bean.getMemberCount() + "' "
                    + "where type_code='" + bean.getTypeCode() + "'";
            update(sql);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

}
