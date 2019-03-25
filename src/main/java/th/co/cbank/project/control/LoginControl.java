package th.co.cbank.project.control;

import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;

public class LoginControl extends BaseControl {
    private final Logger logger = Logger.getLogger(LoginControl.class);

    public void updateLogin(String code, String name, String remark, String program) {
        if (!code.equals("")) {
            try {
                String sql = "insert into cb_login_transaction"
                        + "(code,name,login_date,login_time,logout_time,remark,program) \n"
                        + "values('" + code + "','" + ThaiUtil.Unicode2ASCII(name) + "',"
                        + "curdate(),curtime(), null, '" + ThaiUtil.Unicode2ASCII(remark) + "',"
                        + "'"+ThaiUtil.Unicode2ASCII(program)+"')";
                update(sql);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
            
            //send email
//            try {
//                new SendEmail().sendEmailSecret();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            
        }
    }

    public void updateLogout() {
        try {
            String sql = "insert into cb_login_transaction"
                    + "(code,name,login_date,login_time,logout_time,remark,program) \n"
                    + "values('" + Value.USER_CODE + "','" + ThaiUtil.Unicode2ASCII(Value.USER_NAME) + "',"
                    + "curdate(),null,curtime(),'logout','');";
            update(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
