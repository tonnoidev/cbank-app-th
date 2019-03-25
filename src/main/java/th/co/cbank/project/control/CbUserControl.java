package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CbUserBean;

public class CbUserControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CbUserControl.class);

    public ArrayList<CbUserBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CbUserBean> listBean = new ArrayList<>();
        while (rs.next()) {
            CbUserBean bean = new CbUserBean();
            bean.setUsername(rs.getString("Username"));
            bean.setPassword(rs.getString("Password"));
            bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("Name")));
            bean.setLastname(ThaiUtil.ASCII2Unicode(rs.getString("Lastname")));
            bean.setUsergroup(rs.getString("Usergroup"));
            bean.setIDCard(rs.getString("IDCard"));
            bean.setAddr_no(rs.getString("Addr_no"));
            bean.setAddr_moo(rs.getString("Addr_moo"));
            bean.setAddr_road(ThaiUtil.ASCII2Unicode(rs.getString("Addr_road")));
            bean.setAddr_soi(ThaiUtil.ASCII2Unicode(rs.getString("Addr_soi")));
            bean.setAddr_tambon(ThaiUtil.ASCII2Unicode(rs.getString("Addr_tambon")));
            bean.setAddr_amphur(ThaiUtil.ASCII2Unicode(rs.getString("Addr_amphur")));
            bean.setAddr_province(ThaiUtil.ASCII2Unicode(rs.getString("Addr_province")));
            bean.setAddr_post(rs.getString("Addr_post"));
            bean.setAddr_tel(rs.getString("Addr_tel"));
            bean.setAddr_tel_home(rs.getString("Addr_tel_home"));

            listBean.add(bean);
        }
        rs.close();
        return listBean;
    }

    public ArrayList<CbUserBean> listUser() {
        try {
            String sql = "select * from cb_user";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public CbUserBean listUser(String username) {
        try {
            String sql = "select * from cb_user where username='" + username + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CbUserBean> listBean = mappingBean(rs);
            if (listBean.isEmpty()) {
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public void saveUser(CbUserBean bean) {
        try {
            String sql = "insert into cb_user "
                    + "(username,password,name,lastname,usergroup,IDCard,"
                    + "addr_no,addr_moo,addr_road,addr_soi,addr_tambon,addr_amphur,addr_province,addr_post,"
                    + "addr_tel,addr_tel_home)  "
                    + "values('" + bean.getUsername() + "',md5('" + bean.getPassword() + "'),"
                    + "'" + bean.getName() + "','" + bean.getLastname() + "','" + bean.getUsergroup() + "',"
                    + "'" + bean.getIDCard() + "','" + bean.getAddr_no() + "','" + bean.getAddr_moo() + "',"
                    + "'" + bean.getAddr_road() + "','" + bean.getAddr_soi() + "',"
                    + "'" + bean.getAddr_tambon() + "','" + bean.getAddr_amphur() + "',"
                    + "'" + bean.getAddr_province() + "','" + bean.getAddr_post() + "',"
                    + "'" + bean.getAddr_tel() + "','" + bean.getAddr_tel_home() + "')";
            String sqlChk = "select * from cb_user where username='" + bean.getUsername() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateUser(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateUser(CbUserBean bean) {
        try {
            String sql = "update cb_user set "
                    + "username='" + bean.getUsername() + "', "
                    + "password=md5('" + bean.getPassword() + "'), "
                    + "name='" + bean.getName() + "', "
                    + "lastname='" + bean.getLastname() + "', "
                    + "usergroup='" + bean.getUsergroup() + "', "
                    + "IDCard='" + bean.getIDCard() + "', "
                    + "addr_no='" + bean.getAddr_no() + "', "
                    + "addr_moo='" + bean.getAddr_moo() + "', "
                    + "addr_road='" + bean.getAddr_road() + "', "
                    + "addr_soi='" + bean.getAddr_soi() + "', "
                    + "addr_tambon='" + bean.getAddr_tambon() + "', "
                    + "addr_amphur='" + bean.getAddr_amphur() + "', "
                    + "addr_province='" + bean.getAddr_province() + "', "
                    + "addr_post='" + bean.getAddr_post() + "', "
                    + "addr_tel='" + bean.getAddr_tel() + "', "
                    + "addr_tel_home='" + bean.getAddr_tel_home() + "' "
                    + "where username='" + bean.getUsername() + "'";
            update(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
