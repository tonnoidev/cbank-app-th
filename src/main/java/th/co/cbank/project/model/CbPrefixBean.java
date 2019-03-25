package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbPrefixBean {
    private final Logger logger = Logger.getLogger(CbPrefixBean.class);
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
