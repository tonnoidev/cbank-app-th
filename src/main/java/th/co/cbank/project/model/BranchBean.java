package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class BranchBean {
    private final Logger logger = Logger.getLogger(BranchBean.class);
    private String Code = "";//
    private String Name = "";//
    private String AddressNo;//
    private String Locality;//
    private String SubProvince;//
    private String Province;//
    private String Post;//
    private String Tel_No;//
    private String Fax_No;//
    private String E_Mail;//
    private String Manager;//
    private String Location_Area;//
    private double Ser_Area = 0.00;//
    private double Cou_Area = 0.00;//
    private double Kic_Area = 0.00;//
    private double Tot_Area = 0.00;//
    private double Cost = 0.00;//
    private double Charge = 0.00;//
    private String FlageCost = "N";//
    private double Gp = 0.00;//
    private String FlageGp = "N";//
    private String Remark;//
    private double ArBillNo = 1;//
    private double EarneatBillNo = 1;//
    private double ReturnBillNo = 1;//
    private Date PrintAutoSumDate;//
    private String SaveOrder = "N";//
    private String SaveOrderCopy = "N";//
    private String SaveOrderChk = "N";//
    private String KIC1 = "N";//
    private String KIC2 = "N";//
    private String KIC3 = "N";//
    private String KIC4 = "N";//
    private String KIC5 = "N";//
    private String KIC6 = "N";//
    private String KIC7 = "N";//
    private String KIC8 = "N";//
    private String KIC9 = "N";//
    private String SmartCard = "N";//
    private String GetFile;//
    private String RetFile;//
    private String PointFile;//
    private int CntLoop = 1;//
    private double InvNo = 1;//
    private double InvCashNo = 1;//
    private double InvCash = 1;//
    private String InvActive = "Y";//
    private String CreditAct;//
    private String PromotionGP;//
    private int LockTime = 0;//
    private int KicItemNo = 0;//
    private String PT1;//
    private String PT2;//
    private String PT3;//
    private String PT4;//
    private String PT5;//
    private int PONO = 1;//
    private String PrintKicForm = "1";//
    private String PrintInvForm = "1";//
    private String PSelectStk = "P";//
    private String PStkChk = "N";//
    private String PMinStkChk = "N";//
    private double RoundUpTime = 0;//
    private String GiftStatusChk = "N";//
    private String KICCopy1 = "1";//
    private String KICCopy2 = "1";//
    private String KICCopy3 = "1";//
    private String KICCopy4 = "1";//
    private String KICCopy5 = "1";//
    private String KICCopy6 = "1";//
    private String KICCopy7 = "1";//
    private String KICCopy8 = "1";//
    private String KICCopy9 = "1";//
    private String KICChk1 = "N";//
    private String KICChk2 = "N";//
    private String KICChk3 = "N";//
    private String KICChk4 = "N";//
    private String KICChk5 = "N";//
    private String KICChk6 = "N";//
    private String KICChk7 = "N";//
    private String KICChk8 = "N";//
    private String KICChk9 = "N";//
    private String UpdateBranchPoint = "Y";//

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddressNo() {
        return AddressNo;
    }

    public void setAddressNo(String AddressNo) {
        this.AddressNo = AddressNo;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String Locality) {
        this.Locality = Locality;
    }

    public String getSubProvince() {
        return SubProvince;
    }

    public void setSubProvince(String SubProvince) {
        this.SubProvince = SubProvince;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String Post) {
        this.Post = Post;
    }

    public String getTel_No() {
        return Tel_No;
    }

    public void setTel_No(String Tel_No) {
        this.Tel_No = Tel_No;
    }

    public String getFax_No() {
        return Fax_No;
    }

    public void setFax_No(String Fax_No) {
        this.Fax_No = Fax_No;
    }

    public String getE_Mail() {
        return E_Mail;
    }

    public void setE_Mail(String E_Mail) {
        this.E_Mail = E_Mail;
    }

    public String getManager() {
        return Manager;
    }

    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    public String getLocation_Area() {
        return Location_Area;
    }

    public void setLocation_Area(String Location_Area) {
        this.Location_Area = Location_Area;
    }

    public double getSer_Area() {
        return Ser_Area;
    }

    public void setSer_Area(double Ser_Area) {
        this.Ser_Area = Ser_Area;
    }

    public double getCou_Area() {
        return Cou_Area;
    }

    public void setCou_Area(double Cou_Area) {
        this.Cou_Area = Cou_Area;
    }

    public double getKic_Area() {
        return Kic_Area;
    }

    public void setKic_Area(double Kic_Area) {
        this.Kic_Area = Kic_Area;
    }

    public double getTot_Area() {
        return Tot_Area;
    }

    public void setTot_Area(double Tot_Area) {
        this.Tot_Area = Tot_Area;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public double getCharge() {
        return Charge;
    }

    public void setCharge(double Charge) {
        this.Charge = Charge;
    }

    public String getFlageCost() {
        return FlageCost;
    }

    public void setFlageCost(String FlageCost) {
        this.FlageCost = FlageCost;
    }

    public double getGp() {
        return Gp;
    }

    public void setGp(double Gp) {
        this.Gp = Gp;
    }

    public String getFlageGp() {
        return FlageGp;
    }

    public void setFlageGp(String FlageGp) {
        this.FlageGp = FlageGp;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public double getArBillNo() {
        return ArBillNo;
    }

    public void setArBillNo(double ArBillNo) {
        this.ArBillNo = ArBillNo;
    }

    public double getEarneatBillNo() {
        return EarneatBillNo;
    }

    public void setEarneatBillNo(double EarneatBillNo) {
        this.EarneatBillNo = EarneatBillNo;
    }

    public double getReturnBillNo() {
        return ReturnBillNo;
    }

    public void setReturnBillNo(double ReturnBillNo) {
        this.ReturnBillNo = ReturnBillNo;
    }

    public Date getPrintAutoSumDate() {
        return PrintAutoSumDate;
    }

    public void setPrintAutoSumDate(Date PrintAutoSumDate) {
        this.PrintAutoSumDate = PrintAutoSumDate;
    }

    public String getSaveOrder() {
        return SaveOrder;
    }

    public void setSaveOrder(String SaveOrder) {
        this.SaveOrder = SaveOrder;
    }

    public String getSaveOrderCopy() {
        return SaveOrderCopy;
    }

    public void setSaveOrderCopy(String SaveOrderCopy) {
        this.SaveOrderCopy = SaveOrderCopy;
    }

    public String getSaveOrderChk() {
        return SaveOrderChk;
    }

    public void setSaveOrderChk(String SaveOrderChk) {
        this.SaveOrderChk = SaveOrderChk;
    }

    public String getKIC1() {
        return KIC1;
    }

    public void setKIC1(String KIC1) {
        this.KIC1 = KIC1;
    }

    public String getKIC2() {
        return KIC2;
    }

    public void setKIC2(String KIC2) {
        this.KIC2 = KIC2;
    }

    public String getKIC3() {
        return KIC3;
    }

    public void setKIC3(String KIC3) {
        this.KIC3 = KIC3;
    }

    public String getKIC4() {
        return KIC4;
    }

    public void setKIC4(String KIC4) {
        this.KIC4 = KIC4;
    }

    public String getKIC5() {
        return KIC5;
    }

    public void setKIC5(String KIC5) {
        this.KIC5 = KIC5;
    }

    public String getKIC6() {
        return KIC6;
    }

    public void setKIC6(String KIC6) {
        this.KIC6 = KIC6;
    }

    public String getKIC7() {
        return KIC7;
    }

    public void setKIC7(String KIC7) {
        this.KIC7 = KIC7;
    }

    public String getKIC8() {
        return KIC8;
    }

    public void setKIC8(String KIC8) {
        this.KIC8 = KIC8;
    }

    public String getKIC9() {
        return KIC9;
    }

    public void setKIC9(String KIC9) {
        this.KIC9 = KIC9;
    }

    public String getSmartCard() {
        return SmartCard;
    }

    public void setSmartCard(String SmartCard) {
        this.SmartCard = SmartCard;
    }

    public String getGetFile() {
        return GetFile;
    }

    public void setGetFile(String GetFile) {
        this.GetFile = GetFile;
    }

    public String getRetFile() {
        return RetFile;
    }

    public void setRetFile(String RetFile) {
        this.RetFile = RetFile;
    }

    public String getPointFile() {
        return PointFile;
    }

    public void setPointFile(String PointFile) {
        this.PointFile = PointFile;
    }

    public int getCntLoop() {
        return CntLoop;
    }

    public void setCntLoop(int CntLoop) {
        this.CntLoop = CntLoop;
    }

    public double getInvNo() {
        return InvNo;
    }

    public void setInvNo(double InvNo) {
        this.InvNo = InvNo;
    }

    public double getInvCashNo() {
        return InvCashNo;
    }

    public void setInvCashNo(double InvCashNo) {
        this.InvCashNo = InvCashNo;
    }

    public double getInvCash() {
        return InvCash;
    }

    public void setInvCash(double InvCash) {
        this.InvCash = InvCash;
    }

    public String getInvActive() {
        return InvActive;
    }

    public void setInvActive(String InvActive) {
        this.InvActive = InvActive;
    }

    public String getCreditAct() {
        return CreditAct;
    }

    public void setCreditAct(String CreditAct) {
        this.CreditAct = CreditAct;
    }

    public String getPromotionGP() {
        return PromotionGP;
    }

    public void setPromotionGP(String PromotionGP) {
        this.PromotionGP = PromotionGP;
    }

    public int getLockTime() {
        return LockTime;
    }

    public void setLockTime(int LockTime) {
        this.LockTime = LockTime;
    }

    public int getKicItemNo() {
        return KicItemNo;
    }

    public void setKicItemNo(int KicItemNo) {
        this.KicItemNo = KicItemNo;
    }

    public String getPT1() {
        return PT1;
    }

    public void setPT1(String PT1) {
        this.PT1 = PT1;
    }

    public String getPT2() {
        return PT2;
    }

    public void setPT2(String PT2) {
        this.PT2 = PT2;
    }

    public String getPT3() {
        return PT3;
    }

    public void setPT3(String PT3) {
        this.PT3 = PT3;
    }

    public String getPT4() {
        return PT4;
    }

    public void setPT4(String PT4) {
        this.PT4 = PT4;
    }

    public String getPT5() {
        return PT5;
    }

    public void setPT5(String PT5) {
        this.PT5 = PT5;
    }

    public int getPONO() {
        return PONO;
    }

    public void setPONO(int PONO) {
        this.PONO = PONO;
    }

    public String getPrintKicForm() {
        return PrintKicForm;
    }

    public void setPrintKicForm(String PrintKicForm) {
        this.PrintKicForm = PrintKicForm;
    }

    public String getPrintInvForm() {
        return PrintInvForm;
    }

    public void setPrintInvForm(String PrintInvForm) {
        this.PrintInvForm = PrintInvForm;
    }

    public String getPSelectStk() {
        return PSelectStk;
    }

    public void setPSelectStk(String PSelectStk) {
        this.PSelectStk = PSelectStk;
    }

    public String getPStkChk() {
        return PStkChk;
    }

    public void setPStkChk(String PStkChk) {
        this.PStkChk = PStkChk;
    }

    public String getPMinStkChk() {
        return PMinStkChk;
    }

    public void setPMinStkChk(String PMinStkChk) {
        this.PMinStkChk = PMinStkChk;
    }

    public double getRoundUpTime() {
        return RoundUpTime;
    }

    public void setRoundUpTime(double RoundUpTime) {
        this.RoundUpTime = RoundUpTime;
    }

    public String getGiftStatusChk() {
        return GiftStatusChk;
    }

    public void setGiftStatusChk(String GiftStatusChk) {
        this.GiftStatusChk = GiftStatusChk;
    }

    public String getKICCopy1() {
        return KICCopy1;
    }

    public void setKICCopy1(String KICCopy1) {
        this.KICCopy1 = KICCopy1;
    }

    public String getKICCopy2() {
        return KICCopy2;
    }

    public void setKICCopy2(String KICCopy2) {
        this.KICCopy2 = KICCopy2;
    }

    public String getKICCopy3() {
        return KICCopy3;
    }

    public void setKICCopy3(String KICCopy3) {
        this.KICCopy3 = KICCopy3;
    }

    public String getKICCopy4() {
        return KICCopy4;
    }

    public void setKICCopy4(String KICCopy4) {
        this.KICCopy4 = KICCopy4;
    }

    public String getKICCopy5() {
        return KICCopy5;
    }

    public void setKICCopy5(String KICCopy5) {
        this.KICCopy5 = KICCopy5;
    }

    public String getKICCopy6() {
        return KICCopy6;
    }

    public void setKICCopy6(String KICCopy6) {
        this.KICCopy6 = KICCopy6;
    }

    public String getKICCopy7() {
        return KICCopy7;
    }

    public void setKICCopy7(String KICCopy7) {
        this.KICCopy7 = KICCopy7;
    }

    public String getKICCopy8() {
        return KICCopy8;
    }

    public void setKICCopy8(String KICCopy8) {
        this.KICCopy8 = KICCopy8;
    }

    public String getKICCopy9() {
        return KICCopy9;
    }

    public void setKICCopy9(String KICCopy9) {
        this.KICCopy9 = KICCopy9;
    }

    public String getKICChk1() {
        return KICChk1;
    }

    public void setKICChk1(String KICChk1) {
        this.KICChk1 = KICChk1;
    }

    public String getKICChk2() {
        return KICChk2;
    }

    public void setKICChk2(String KICChk2) {
        this.KICChk2 = KICChk2;
    }

    public String getKICChk3() {
        return KICChk3;
    }

    public void setKICChk3(String KICChk3) {
        this.KICChk3 = KICChk3;
    }

    public String getKICChk4() {
        return KICChk4;
    }

    public void setKICChk4(String KICChk4) {
        this.KICChk4 = KICChk4;
    }

    public String getKICChk5() {
        return KICChk5;
    }

    public void setKICChk5(String KICChk5) {
        this.KICChk5 = KICChk5;
    }

    public String getKICChk6() {
        return KICChk6;
    }

    public void setKICChk6(String KICChk6) {
        this.KICChk6 = KICChk6;
    }

    public String getKICChk7() {
        return KICChk7;
    }

    public void setKICChk7(String KICChk7) {
        this.KICChk7 = KICChk7;
    }

    public String getKICChk8() {
        return KICChk8;
    }

    public void setKICChk8(String KICChk8) {
        this.KICChk8 = KICChk8;
    }

    public String getKICChk9() {
        return KICChk9;
    }

    public void setKICChk9(String KICChk9) {
        this.KICChk9 = KICChk9;
    }

    public String getUpdateBranchPoint() {
        return UpdateBranchPoint;
    }

    public void setUpdateBranchPoint(String UpdateBranchPoint) {
        this.UpdateBranchPoint = UpdateBranchPoint;
    }

}
