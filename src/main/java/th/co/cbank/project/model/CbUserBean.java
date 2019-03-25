package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class CbUserBean {
    private final Logger logger = Logger.getLogger(CbUserBean.class);
    private String username;//
    private String password;//
    private String name;//
    private String lastname;//
    private String usergroup;//
    private String IDCard;//
    private String addr_no;//
    private String addr_moo;//
    private String addr_road;//
    private String addr_soi;//
    private String addr_tambon;//
    private String addr_amphur;//
    private String addr_province;//
    private String addr_post;//
    private String addr_tel;//
    private String addr_tel_home;//

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getAddr_no() {
        return addr_no;
    }

    public void setAddr_no(String addr_no) {
        this.addr_no = addr_no;
    }

    public String getAddr_moo() {
        return addr_moo;
    }

    public void setAddr_moo(String addr_moo) {
        this.addr_moo = addr_moo;
    }

    public String getAddr_road() {
        return addr_road;
    }

    public void setAddr_road(String addr_road) {
        this.addr_road = addr_road;
    }

    public String getAddr_soi() {
        return addr_soi;
    }

    public void setAddr_soi(String addr_soi) {
        this.addr_soi = addr_soi;
    }

    public String getAddr_tambon() {
        return addr_tambon;
    }

    public void setAddr_tambon(String addr_tambon) {
        this.addr_tambon = addr_tambon;
    }

    public String getAddr_amphur() {
        return addr_amphur;
    }

    public void setAddr_amphur(String addr_amphur) {
        this.addr_amphur = addr_amphur;
    }

    public String getAddr_province() {
        return addr_province;
    }

    public void setAddr_province(String addr_province) {
        this.addr_province = addr_province;
    }

    public String getAddr_post() {
        return addr_post;
    }

    public void setAddr_post(String addr_post) {
        this.addr_post = addr_post;
    }

    public String getAddr_tel() {
        return addr_tel;
    }

    public void setAddr_tel(String addr_tel) {
        this.addr_tel = addr_tel;
    }

    public String getAddr_tel_home() {
        return addr_tel_home;
    }

    public void setAddr_tel_home(String addr_tel_home) {
        this.addr_tel_home = addr_tel_home;
    }

}
