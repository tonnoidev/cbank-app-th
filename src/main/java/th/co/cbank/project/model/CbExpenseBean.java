package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbExpenseBean {
    private final Logger logger = Logger.getLogger(CbExpenseBean.class);
    private String exp_id;//
    private String exp_desc;//

    public String getExp_id() {
        return exp_id;
    }

    public void setExp_id(String exp_id) {
        this.exp_id = exp_id;
    }

    public String getExp_desc() {
        return exp_desc;
    }

    public void setExp_desc(String exp_desc) {
        this.exp_desc = exp_desc;
    }

}
