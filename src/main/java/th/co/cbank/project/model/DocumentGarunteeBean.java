package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class DocumentGarunteeBean {
    private final Logger logger = Logger.getLogger(DocumentGarunteeBean.class);
    private String DOC_NO = "";//
    private String DOC_DESC = "";//
    private String IMAGE1 = "";//
    private String IMGAE2 = "";//
    private String IMAGE3 = "";//

    public String getDOC_NO() {
        return DOC_NO;
    }

    public void setDOC_NO(String DOC_NO) {
        this.DOC_NO = DOC_NO;
    }

    public String getDOC_DESC() {
        return DOC_DESC;
    }

    public void setDOC_DESC(String DOC_DESC) {
        this.DOC_DESC = DOC_DESC;
    }

    public String getIMAGE1() {
        return IMAGE1;
    }

    public void setIMAGE1(String IMAGE1) {
        this.IMAGE1 = IMAGE1;
    }

    public String getIMGAE2() {
        return IMGAE2;
    }

    public void setIMGAE2(String IMGAE2) {
        this.IMGAE2 = IMGAE2;
    }

    public String getIMAGE3() {
        return IMAGE3;
    }

    public void setIMAGE3(String IMAGE3) {
        this.IMAGE3 = IMAGE3;
    }

}
