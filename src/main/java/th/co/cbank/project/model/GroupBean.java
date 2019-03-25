package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class GroupBean {
    private final Logger logger = Logger.getLogger(GroupBean.class);
    private String groupCode;
    private String groupName;
    private String permission;

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

}
