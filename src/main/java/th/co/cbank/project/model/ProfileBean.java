package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class ProfileBean {
    private final Logger logger = Logger.getLogger(ProfileBean.class);

    private int p_index = 0;//
    private String p_custCode;//
    private String p_custType = "M";//
    private String p_custName;//
    private String p_custSurname;//
    private Date p_custBirthDay;//
    private int p_custAge = 1;//
    private String p_custSex;//
    private String p_custOccupation;//
    private String p_custNation;//
    private String p_cust_status;//
    private String p_cust_religion;//
    private Date p_member_start;//
    private Date p_member_end;//
    private String p_spouse_name;//
    private String p_spouse_surname;//
    private String p_spouse_sex;//
    private String p_cust_pic_url;//
    private double p_fee = 0.00;//    
    private String Status;
    private int Hoon_Qty;
    private int Member_Point;
    private double AR_Balance;
    private double Save_Balance;
    private double Loan_Balance;
    private double Loan_Credit_Amt;
    private double Loan_Credit_Balance;
    private String p_prefix;
    private String p_member_type;

    //สำหรับข้อมูลดาวอินคา
    private int DowInCar_Target_Rai;
    private Date DowInCar_Target_Date;
    private int DowInCar_Target_Tree;
    private double p_down_fee = 0.00;
    
    private Date Card_Expire;
    
    private int ApproveLimit;

    public Date getCard_Expire() {
        return Card_Expire;
    }

    public void setCard_Expire(Date Card_Expire) {
        this.Card_Expire = Card_Expire;
    }

    public int getApproveLimit() {
        return ApproveLimit;
    }

    public void setApproveLimit(int ApproveLimit) {
        this.ApproveLimit = ApproveLimit;
    }

    public String getP_member_type() {
        return p_member_type;
    }

    public void setP_member_type(String p_member_type) {
        this.p_member_type = p_member_type;
    }

    public String getP_prefix() {
        return p_prefix;
    }

    public void setP_prefix(String p_prefix) {
        this.p_prefix = p_prefix;
    }

    public double getP_down_fee() {
        return p_down_fee;
    }

    public void setP_down_fee(double p_down_fee) {
        this.p_down_fee = p_down_fee;
    }

    public int getDowInCar_Target_Rai() {
        return DowInCar_Target_Rai;
    }

    public void setDowInCar_Target_Rai(int DowInCar_Target_Rai) {
        this.DowInCar_Target_Rai = DowInCar_Target_Rai;
    }

    public Date getDowInCar_Target_Date() {
        return DowInCar_Target_Date;
    }

    public void setDowInCar_Target_Date(Date DowInCar_Target_Date) {
        this.DowInCar_Target_Date = DowInCar_Target_Date;
    }

    public int getDowInCar_Target_Tree() {
        return DowInCar_Target_Tree;
    }

    public void setDowInCar_Target_Tree(int DowInCar_Target_Tree) {
        this.DowInCar_Target_Tree = DowInCar_Target_Tree;
    }

    public int getP_index() {
        return p_index;
    }

    public void setP_index(int p_index) {
        this.p_index = p_index;
    }

    public String getP_custCode() {
        return p_custCode;
    }

    public void setP_custCode(String p_custCode) {
        this.p_custCode = p_custCode;
    }

    public String getP_custType() {
        return p_custType;
    }

    public void setP_custType(String p_custType) {
        this.p_custType = p_custType;
    }

    public String getP_custName() {
        return p_custName;
    }

    public void setP_custName(String p_custName) {
        this.p_custName = p_custName;
    }

    public String getP_custSurname() {
        return p_custSurname;
    }

    public void setP_custSurname(String p_custSurname) {
        this.p_custSurname = p_custSurname;
    }

    public Date getP_custBirthDay() {
        return p_custBirthDay;
    }

    public void setP_custBirthDay(Date p_custBirthDay) {
        this.p_custBirthDay = p_custBirthDay;
    }

    public int getP_custAge() {
        return p_custAge;
    }

    public void setP_custAge(int p_custAge) {
        this.p_custAge = p_custAge;
    }

    public String getP_custSex() {
        return p_custSex;
    }

    public void setP_custSex(String p_custSex) {
        this.p_custSex = p_custSex;
    }

    public String getP_custOccupation() {
        return p_custOccupation;
    }

    public void setP_custOccupation(String p_custOccupation) {
        this.p_custOccupation = p_custOccupation;
    }

    public String getP_custNation() {
        return p_custNation;
    }

    public void setP_custNation(String p_custNation) {
        this.p_custNation = p_custNation;
    }

    public String getP_cust_status() {
        return p_cust_status;
    }

    public void setP_cust_status(String p_cust_status) {
        this.p_cust_status = p_cust_status;
    }

    public String getP_cust_religion() {
        return p_cust_religion;
    }

    public void setP_cust_religion(String p_cust_religion) {
        this.p_cust_religion = p_cust_religion;
    }

    public Date getP_member_start() {
        return p_member_start;
    }

    public void setP_member_start(Date p_member_start) {
        this.p_member_start = p_member_start;
    }

    public Date getP_member_end() {
        return p_member_end;
    }

    public void setP_member_end(Date p_member_end) {
        this.p_member_end = p_member_end;
    }

    public String getP_spouse_name() {
        return p_spouse_name;
    }

    public void setP_spouse_name(String p_spouse_name) {
        this.p_spouse_name = p_spouse_name;
    }

    public String getP_spouse_surname() {
        return p_spouse_surname;
    }

    public void setP_spouse_surname(String p_spouse_surname) {
        this.p_spouse_surname = p_spouse_surname;
    }

    public String getP_spouse_sex() {
        return p_spouse_sex;
    }

    public void setP_spouse_sex(String p_spouse_sex) {
        this.p_spouse_sex = p_spouse_sex;
    }

    public String getP_cust_pic_url() {
        return p_cust_pic_url;
    }

    public void setP_cust_pic_url(String p_cust_pic_url) {
        this.p_cust_pic_url = p_cust_pic_url;
    }

    public double getP_fee() {
        return p_fee;
    }

    public void setP_fee(double p_fee) {
        this.p_fee = p_fee;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getHoon_Qty() {
        return Hoon_Qty;
    }

    public void setHoon_Qty(int Hoon_Qty) {
        this.Hoon_Qty = Hoon_Qty;
    }

    public int getMember_Point() {
        return Member_Point;
    }

    public void setMember_Point(int Member_Point) {
        this.Member_Point = Member_Point;
    }

    public double getAR_Balance() {
        return AR_Balance;
    }

    public void setAR_Balance(double AR_Balance) {
        this.AR_Balance = AR_Balance;
    }

    public double getSave_Balance() {
        return Save_Balance;
    }

    public void setSave_Balance(double Save_Balance) {
        this.Save_Balance = Save_Balance;
    }

    public double getLoan_Balance() {
        return Loan_Balance;
    }

    public void setLoan_Balance(double Loan_Balance) {
        this.Loan_Balance = Loan_Balance;
    }

    public double getLoan_Credit_Amt() {
        return Loan_Credit_Amt;
    }

    public void setLoan_Credit_Amt(double Loan_Credit_Amt) {
        this.Loan_Credit_Amt = Loan_Credit_Amt;
    }

    public double getLoan_Credit_Balance() {
        return Loan_Credit_Balance;
    }

    public void setLoan_Credit_Balance(double Loan_Credit_Balance) {
        this.Loan_Credit_Balance = Loan_Credit_Balance;
    }

}
