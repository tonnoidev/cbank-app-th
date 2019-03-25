package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.AddressBean;

public class AddressControl extends BaseControl {
    private final Logger logger = Logger.getLogger(AddressControl.class);
    
    public ArrayList<AddressBean> mappingBean(ResultSet rs) throws Exception{
        ArrayList<AddressBean> listBean = new ArrayList<>();
        while (rs.next()) {
            AddressBean bean = new AddressBean();
            bean.setCust_Code(rs.getString("Cust_Code"));
            bean.setCust_Type(rs.getString("Cust_Type"));
            bean.setCompany_Name(ThaiUtil.ASCII2Unicode(rs.getString("Company_Name")));
            bean.setAddr_No(rs.getString("Addr_No"));
            bean.setAddr_Moo(rs.getString("Addr_Moo"));
            bean.setAddr_MooName(ThaiUtil.ASCII2Unicode(rs.getString("Addr_MooName")));
            bean.setAddr_Road(ThaiUtil.ASCII2Unicode(rs.getString("Addr_Road")));
            bean.setAddr_Soi(ThaiUtil.ASCII2Unicode(rs.getString("Addr_Soi")));
            bean.setAddr_Tambon(ThaiUtil.ASCII2Unicode(rs.getString("Addr_Tambon")));
            bean.setAddr_Aumphur(ThaiUtil.ASCII2Unicode(rs.getString("Addr_Aumphur")));
            bean.setAddr_Province(ThaiUtil.ASCII2Unicode(rs.getString("Addr_Province")));
            bean.setAddr_Post(rs.getString("Addr_Post"));
            bean.setAddr_Mobile(rs.getString("Addr_Mobile"));
            bean.setAddr_Tel(rs.getString("Addr_Tel"));
            bean.setAddr_type(rs.getString("Addr_type"));
            bean.setDown_rai(rs.getInt("down_rai"));
            bean.setDown_deed_1(rs.getString("down_deed_1"));
            bean.setDown_deed_2(rs.getString("down_deed_2"));
            bean.setDown_deed_3(rs.getString("down_deed_3"));
            bean.setDown_deed_4(rs.getString("down_deed_4"));

            listBean.add(bean);
        }
        rs.close();
        
        return listBean;
    }

    public ArrayList<AddressBean> listProfileAddress(String Cust_Code) {
        try {
            String sql = "select * from cb_profile_address where Cust_Code='" + Cust_Code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public AddressBean listProfileAddress(String Cust_Code, String addrType) {
        try {
            String sql = "select * from cb_profile_address where Cust_Code='" + Cust_Code + "' "
                    + "and addr_type='" + addrType + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<AddressBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }else{
                return listBean.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveProfileAddress(AddressBean bean) {
        try {
            String sql = "insert into cb_profile_address "
                    + "(Cust_Code,cust_Type,Company_Name,addr_No,addr_Moo,addr_Road,addr_Soi,addr_Tambon,"
                    + "addr_Aumphur,addr_Province,addr_Post,addr_Mobile,addr_Tel,addr_type,"
                    + "down_rai, down_deed_1, down_deed_2, down_deed_3, down_deed_4,addr_MooName)  "
                    + "values('" + bean.getCust_Code() + "','" + bean.getCust_Type() + "',"
                    + "'" + bean.getCompany_Name() + "','" + bean.getAddr_No() + "','" + bean.getAddr_Moo() + "',"
                    + "'" + bean.getAddr_Road() + "','" + bean.getAddr_Soi() + "','" + bean.getAddr_Tambon() + "',"
                    + "'" + bean.getAddr_Aumphur() + "','" + bean.getAddr_Province() + "',"
                    + "'" + bean.getAddr_Post() + "','" + bean.getAddr_Mobile() + "','" + bean.getAddr_Tel() + "',"
                    + "'" + bean.getAddr_type() + "', '"+bean.getDown_rai()+"',"
                    + "'"+bean.getDown_deed_1()+"','"+bean.getDown_deed_2()+"','"+bean.getDown_deed_3()+"','"+bean.getDown_deed_4()+"',"
                    + "'"+bean.getAddr_MooName()+"')";
            String sqlChk = "select * from cb_profile_address "
                    + "where Cust_Code='" + bean.getCust_Code() + "' and addr_type='" + bean.getAddr_type() + "'";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateProfileAddress(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProfileAddress(AddressBean bean) {
        try {
            String sql = "update cb_profile_address set "
                    + "cust_Type='" + bean.getCust_Type() + "', "
                    + "Company_Name='" + bean.getCompany_Name() + "', "
                    + "addr_No='" + bean.getAddr_No() + "', "
                    + "addr_Moo='" + bean.getAddr_Moo() + "', "
                    + "addr_Road='" + bean.getAddr_Road() + "', "
                    + "addr_Soi='" + bean.getAddr_Soi() + "', "
                    + "addr_Tambon='" + bean.getAddr_Tambon() + "', "
                    + "addr_Aumphur='" + bean.getAddr_Aumphur() + "', "
                    + "addr_Province='" + bean.getAddr_Province() + "', "
                    + "addr_Post='" + bean.getAddr_Post() + "', "
                    + "addr_Mobile='" + bean.getAddr_Mobile() + "', "
                    + "addr_Tel='" + bean.getAddr_Tel() + "',"
                    + "down_rai='"+bean.getDown_rai()+"',"
                    + "down_deed_1='"+bean.getDown_deed_1()+"',"
                    + "down_deed_2='"+bean.getDown_deed_2()+"',"
                    + "down_deed_3='"+bean.getDown_deed_3()+"',"
                    + "down_deed_4='"+bean.getDown_deed_4()+"',"
                    + "addr_MooName='"+bean.getAddr_MooName()+"' "
                    + "where Cust_Code='" + bean.getCust_Code() + "' "
                    + "and addr_type='" + bean.getAddr_type() + "'";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
