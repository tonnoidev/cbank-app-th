package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbCancelAccountBean {
    private final Logger logger = Logger.getLogger(CbCancelAccountBean.class);
     private Date date_cancel;//
     private String time_cancel = "00:00:00";//
     private String account_no;//
     private String account_type;//
     private String user_code;//

    public Date getDate_cancel() {
        return date_cancel;
    }

    public void setDate_cancel(Date date_cancel) {
        this.date_cancel = date_cancel;
    }

    public String getTime_cancel() {
        return time_cancel;
    }

    public void setTime_cancel(String time_cancel) {
        this.time_cancel = time_cancel;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }
     
}
