package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class ProfileMapping {
    private final Logger logger = Logger.getLogger(ProfileMapping.class);

    private ProfileBean profileBean;    
    private String listAcc;
    private String listLoan;

    public ProfileMapping() {
        profileBean = new ProfileBean();
    }

    public ProfileBean getProfileBean() {
        return profileBean;
    }

    public void setProfileBean(ProfileBean profileBean) {
        this.profileBean = profileBean;
    }

    public String getListAcc() {
        return listAcc;
    }

    public void setListAcc(String listAcc) {
        this.listAcc = listAcc;
    }

    public String getListLoan() {
        return listLoan;
    }

    public void setListLoan(String listLoan) {
        this.listLoan = listLoan;
    }
    
}
