package th.co.cbank.project.control;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;
import th.co.cbank.project.model.CustfileBean;

public class CustFileControl extends BaseControl {
    private final Logger logger = Logger.getLogger(CustFileControl.class);

    public boolean deleteCustFile(String SP_Code) {
        try {
            update("delete from custinfo where sp_code='" + SP_Code + "'");
            update("delete from custfile where sp_code='" + SP_Code + "'");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveCustFile(CustfileBean bean) {
        try {
            String sql = "insert into custfile "
                    + "(SP_Code,SP_Desc,Sp_Desc2,SP_Type,"
                    + "SP_Addr1,SP_Addr2,SP_Zip,SP_Contact,SP_Tel,SP_Fax,"
                    + "SP_Remark,SP_UpdateDate,SP_Tax,SP_CreditDays,"
                    + "SP_CrAmount) "
                    + "values('" + bean.getSP_Code() + "','" + ThaiUtil.Unicode2ASCII(bean.getSP_Desc()) + "','" + ThaiUtil.Unicode2ASCII(bean.getSp_Desc2()) + "',"
                    + "'" + bean.getSP_Type() + "','" + ThaiUtil.Unicode2ASCII(bean.getSP_Addr1()) + "','" + ThaiUtil.Unicode2ASCII(bean.getSP_Addr2()) + "',"
                    + "'" + bean.getSP_Zip() + "','" + ThaiUtil.Unicode2ASCII(bean.getSP_Contact()) + "','" + bean.getSP_Tel() + "',"
                    + "'" + bean.getSP_Fax() + "','" + ThaiUtil.Unicode2ASCII(bean.getSP_Remark()) + "',curdate(),"
                    + "'" + bean.getSP_Tax() + "','" + bean.getSP_CreditDays() + "','" + bean.getSP_CrAmount() + "')";
            String upd = "update custfile set "
                    + "SP_Code='" + bean.getSP_Code() + "', SP_Desc='" + ThaiUtil.Unicode2ASCII(bean.getSP_Desc()) + "', "
                    + "Sp_Desc2='" + ThaiUtil.Unicode2ASCII(bean.getSp_Desc2()) + "', SP_Type='" + bean.getSP_Type() + "', "
                    + "SP_Addr1='" + ThaiUtil.Unicode2ASCII(bean.getSP_Addr1()) + "', SP_Addr2='" + ThaiUtil.Unicode2ASCII(bean.getSP_Addr2()) + "', "
                    + "SP_Zip='" + bean.getSP_Zip() + "', SP_Contact='" + ThaiUtil.Unicode2ASCII(bean.getSP_Contact()) + "', "
                    + "SP_Tel='" + bean.getSP_Tel() + "', SP_Fax='" + bean.getSP_Fax() + "', "
                    + "SP_Remark='" + ThaiUtil.Unicode2ASCII(bean.getSP_Remark()) + "', SP_UpdateDate=curdate(), "
                    + "SP_Tax='" + bean.getSP_Tax() + "', SP_CreditDays='" + bean.getSP_CreditDays() + "', "
                    + "SP_CrAmount='" + bean.getSP_CrAmount() + "' "
                    + "where sp_code='" + bean.getSP_Code() + "'";
            String chk = "select * from custfile where sp_code='" + bean.getSP_Code() + "'";
            ResultSet rs = MySQLConnect.getResultSet(chk);
            if (rs.next()) {
                update(upd);
            } else {
                update(sql);
            }

            rs.close();

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public ArrayList<CustfileBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<CustfileBean> listBean = new ArrayList<CustfileBean>();
        while (rs.next()) {
            CustfileBean bean = new CustfileBean();
            bean.setSP_Code(rs.getString("SP_Code"));
            bean.setSP_Desc(ThaiUtil.ASCII2Unicode(rs.getString("SP_Desc")));
            bean.setSp_Desc2(ThaiUtil.ASCII2Unicode(rs.getString("Sp_Desc2")));
            bean.setSP_Type(rs.getString("SP_Type"));
            bean.setSP_Addr1(ThaiUtil.ASCII2Unicode(rs.getString("SP_Addr1")));
            bean.setSP_Addr2(ThaiUtil.ASCII2Unicode(rs.getString("SP_Addr2")));
            bean.setSP_Zip(rs.getString("SP_Zip"));
            bean.setSP_Contact(ThaiUtil.ASCII2Unicode(rs.getString("SP_Contact")));
            bean.setSP_Tel(rs.getString("SP_Tel"));
            bean.setSP_Fax(rs.getString("SP_Fax"));
            bean.setSP_Remark(ThaiUtil.ASCII2Unicode(rs.getString("SP_Remark")));
            bean.setSP_UpdateDate(rs.getDate("SP_UpdateDate"));
            bean.setSP_Tax(rs.getString("SP_Tax"));
            bean.setSP_CreditDays(rs.getInt("SP_CreditDays"));
            bean.setSP_CrAmount(rs.getFloat("SP_CrAmount"));

            listBean.add(bean);
        }

        rs.close();
        return listBean;
    }

    public ArrayList<CustfileBean> getListBean() {        
        try {
            String sql = "select * from custfile order by sp_code";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "พบปัญหาในการเชื่อมต่อฐานข้อมูล \nMSG(" + e.getMessage() + ")");
            System.exit(0);
        }
        
        return new ArrayList();
    }

    public ArrayList<CustfileBean> getListCustFile(String orderBy, String tel) {
        try {
            String sql = "select * from custfile where SP_Tel like '%" + tel + "%' order by " + orderBy;
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "พบปัญหาในการเชื่อมต่อฐานข้อมูล \nMSG(" + e.getMessage() + ")");
            System.exit(0);
        }

        return new ArrayList();
    }

    public CustfileBean load(String SP_Code) {
        try {
            String sql = "select * from custfile where sp_code='" + SP_Code + "'";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            ArrayList<CustfileBean> listBean = mappingBean(rs);
            if(listBean.isEmpty()){
                return null;
            }
            return listBean.get(0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "พบปัญหาในการเชื่อมต่อฐานข้อมูล \nMSG(" + e.getMessage() + ")");
            System.exit(0);
        }
        
        return null;
    }

}
