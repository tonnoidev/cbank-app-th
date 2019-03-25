package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbMemberTypeBean {
    private final Logger logger = Logger.getLogger(CbMemberTypeBean.class);
    private String typeCode;
    private String typeName;
    private int memberCount;

    public int getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
    
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
