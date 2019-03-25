package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CustInfoBean {
    private final Logger logger = Logger.getLogger(CustInfoBean.class);
    private String SP_Code;
    private int SP_Index = 0;
    private String SP_Name;
    private String SP_Pid;

    public String getSP_Code() {
        return SP_Code;
    }

    public void setSP_Code(String SP_Code) {
        this.SP_Code = SP_Code;
    }

    public int getSP_Index() {
        return SP_Index;
    }

    public void setSP_Index(int SP_Index) {
        this.SP_Index = SP_Index;
    }

    public String getSP_Name() {
        return SP_Name;
    }

    public void setSP_Name(String SP_Name) {
        this.SP_Name = SP_Name;
    }

    public String getSP_Pid() {
        return SP_Pid;
    }

    public void setSP_Pid(String SP_Pid) {
        this.SP_Pid = SP_Pid;
    }
}
