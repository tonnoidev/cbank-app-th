package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbProjectBean {
    private final Logger logger = Logger.getLogger(CbProjectBean.class);
    private String productCode;
    private String productName;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
