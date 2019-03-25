package th.co.cbank.project.control;

import th.co.cbank.project.model.SettingBean;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class SettingFingerControl extends BaseControl {
    private final Logger logger = Logger.getLogger(SettingFingerControl.class);
    
    public boolean save(SettingBean bean){
        try {
            String sql = "insert into cb_setting "
                    + "(INTEREST,VAT,BASE_DEPOSIT,BASE_WITHDRAWAL,UPDATE_DATE,PWD,DAY_CI,INTEREST2,VAT2,BASE_DEPOSIT2,BASE_WITHDRAWAL2) "
                    + "values('"+bean.getINTEREST()+"','"+bean.getVAT()+"','"+bean.getBASE_DEPOSIT()+"',"
                    + "'"+bean.getBASE_WITHDRAWAL()+"',now(),'"+bean.getPWD()+"','"+bean.getDayCI()+"',"
                    + "'"+bean.getINTEREST2()+"','"+bean.getVAT2()+"','"+bean.getBASE_DEPOSIT2()+"','"+bean.getBASE_WITHDRAWAL2()+"')";
            if(!existData()){
                update(sql);
            }else{
                sql = "update cb_setting "
                        + "set "
                        + "INTEREST='"+bean.getINTEREST()+"', "
                        + "VAT='"+bean.getVAT()+"', "
                        + "BASE_DEPOSIT='"+bean.getBASE_DEPOSIT()+"', "
                        + "BASE_WITHDRAWAL='"+bean.getBASE_WITHDRAWAL()+"',"
                        + "PWD='"+bean.getPWD()+"',"
                        + "DAY_CI='"+bean.getDayCI()+"',"
                        + "INTEREST2='"+bean.getINTEREST2()+"', "
                        + "VAT2='"+bean.getVAT2()+"', "
                        + "BASE_DEPOSIT2='"+bean.getBASE_DEPOSIT2()+"', "
                        + "BASE_WITHDRAWAL2='"+bean.getBASE_WITHDRAWAL2()+"'";
                update(sql);
            }
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public boolean existData(){
        boolean isExist = false;
        try {
            String sql = "select * from cb_setting";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if(rs.next()){
                isExist = true;
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isExist;
    }
    
    public SettingBean getData(){
        SettingBean bean = null;
        try {
            String sql = "select * from cb_setting";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if(rs.next()){
                bean = new SettingBean();
                bean.setINTEREST(rs.getDouble("INTEREST"));
                bean.setVAT(rs.getDouble("VAT"));
                bean.setBASE_DEPOSIT(rs.getDouble("BASE_DEPOSIT"));
                bean.setBASE_WITHDRAWAL(rs.getDouble("BASE_WITHDRAWAL"));
                bean.setUPDATE_DATE(rs.getString("UPDATE_DATE"));
                bean.setPWD(rs.getString("PWD"));
                bean.setDayCI(rs.getInt("Day_CI"));
                
                bean.setINTEREST2(rs.getDouble("INTEREST2"));
                bean.setVAT2(rs.getDouble("VAT2"));
                bean.setBASE_DEPOSIT2(rs.getDouble("BASE_DEPOSIT2"));
                bean.setBASE_WITHDRAWAL2(rs.getDouble("BASE_WITHDRAWAL2"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return bean;
    }
    
    public SettingBean getData6(){
        SettingBean bean = null;
        try {
            String sql = "select * from cb_setting";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if(rs.next()){
                bean = new SettingBean();
                bean.setINTEREST(rs.getDouble("INTEREST2"));
                bean.setVAT(rs.getDouble("VAT2"));
                bean.setBASE_DEPOSIT(rs.getDouble("BASE_DEPOSIT2"));
                bean.setBASE_WITHDRAWAL(rs.getDouble("BASE_WITHDRAWAL2"));
                bean.setUPDATE_DATE(rs.getString("UPDATE_DATE"));
                bean.setPWD(rs.getString("PWD"));
                bean.setDayCI(rs.getInt("Day_CI"));
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return bean;
    }
}
