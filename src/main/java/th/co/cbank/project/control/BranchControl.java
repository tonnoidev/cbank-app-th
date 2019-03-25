package th.co.cbank.project.control;

import th.co.cbank.project.model.BranchBean;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import th.co.cbank.util.ThaiUtil;

public class BranchControl extends BaseControl {
    private final Logger logger = Logger.getLogger(BranchControl.class);

    public ArrayList<BranchBean> mappingBean(ResultSet rs) throws Exception {
        ArrayList<BranchBean> listBean = new ArrayList<>();
        while (rs.next()) {
            BranchBean bean = new BranchBean();
            bean.setCode(rs.getString("Code"));
            bean.setName(ThaiUtil.ASCII2Unicode(rs.getString("Name")));
            bean.setAddressNo(ThaiUtil.ASCII2Unicode(rs.getString("AddressNo")));
            bean.setLocality(ThaiUtil.ASCII2Unicode(rs.getString("Locality")));
            bean.setSubProvince(ThaiUtil.ASCII2Unicode(rs.getString("SubProvince")));
            bean.setProvince(ThaiUtil.ASCII2Unicode(rs.getString("Province")));
            bean.setPost(rs.getString("Post"));
            bean.setTel_No(rs.getString("Tel_No"));
            bean.setFax_No(rs.getString("Fax_No"));
            bean.setE_Mail(rs.getString("E_Mail"));
            bean.setManager(ThaiUtil.ASCII2Unicode(rs.getString("Manager")));
            bean.setLocation_Area(rs.getString("Location_Area"));
            bean.setSer_Area(rs.getFloat("Ser_Area"));
            bean.setCou_Area(rs.getFloat("Cou_Area"));
            bean.setKic_Area(rs.getFloat("Kic_Area"));
            bean.setTot_Area(rs.getFloat("Tot_Area"));
            bean.setCost(rs.getFloat("Cost"));
            bean.setCharge(rs.getFloat("Charge"));
            bean.setFlageCost(rs.getString("FlageCost"));
            bean.setGp(rs.getFloat("Gp"));
            bean.setFlageGp(rs.getString("FlageGp"));
            bean.setRemark(rs.getString("Remark"));
            bean.setArBillNo(rs.getFloat("ArBillNo"));
            bean.setEarneatBillNo(rs.getFloat("EarneatBillNo"));
            bean.setReturnBillNo(rs.getFloat("ReturnBillNo"));
            bean.setPrintAutoSumDate(rs.getDate("PrintAutoSumDate"));
            bean.setSaveOrder(rs.getString("SaveOrder"));
            bean.setSaveOrderCopy(rs.getString("SaveOrderCopy"));
            bean.setSaveOrderChk(rs.getString("SaveOrderChk"));
            bean.setKIC1(rs.getString("KIC1"));
            bean.setKIC2(rs.getString("KIC2"));
            bean.setKIC3(rs.getString("KIC3"));
            bean.setKIC4(rs.getString("KIC4"));
            bean.setKIC5(rs.getString("KIC5"));
            bean.setKIC6(rs.getString("KIC6"));
            bean.setKIC7(rs.getString("KIC7"));
            bean.setKIC8(rs.getString("KIC8"));
            bean.setKIC9(rs.getString("KIC9"));
            bean.setSmartCard(rs.getString("SmartCard"));
            bean.setGetFile(rs.getString("GetFile"));
            bean.setRetFile(rs.getString("RetFile"));
            bean.setPointFile(rs.getString("PointFile"));
            bean.setCntLoop(rs.getInt("CntLoop"));
            bean.setInvNo(rs.getFloat("InvNo"));
            bean.setInvCashNo(rs.getFloat("InvCashNo"));
            bean.setInvCash(rs.getFloat("InvCash"));
            bean.setInvActive(rs.getString("InvActive"));
            bean.setCreditAct(rs.getString("CreditAct"));
            bean.setPromotionGP(rs.getString("PromotionGP"));
            bean.setLockTime(rs.getInt("LockTime"));
            bean.setKicItemNo(rs.getInt("KicItemNo"));
            bean.setPT1(rs.getString("PT1"));
            bean.setPT2(rs.getString("PT2"));
            bean.setPT3(rs.getString("PT3"));
            bean.setPT4(rs.getString("PT4"));
            bean.setPT5(rs.getString("PT5"));
            bean.setPONO(rs.getInt("PONO"));
            bean.setPrintKicForm(rs.getString("PrintKicForm"));
            bean.setPrintInvForm(rs.getString("PrintInvForm"));
            bean.setPSelectStk(rs.getString("PSelectStk"));
            bean.setPStkChk(rs.getString("PStkChk"));
            bean.setPMinStkChk(rs.getString("PMinStkChk"));
            bean.setRoundUpTime(rs.getFloat("RoundUpTime"));
            bean.setGiftStatusChk(rs.getString("GiftStatusChk"));
            bean.setKICCopy1(rs.getString("KICCopy1"));
            bean.setKICCopy2(rs.getString("KICCopy2"));
            bean.setKICCopy3(rs.getString("KICCopy3"));
            bean.setKICCopy4(rs.getString("KICCopy4"));
            bean.setKICCopy5(rs.getString("KICCopy5"));
            bean.setKICCopy6(rs.getString("KICCopy6"));
            bean.setKICCopy7(rs.getString("KICCopy7"));
            bean.setKICCopy8(rs.getString("KICCopy8"));
            bean.setKICCopy9(rs.getString("KICCopy9"));
            bean.setKICChk1(rs.getString("KICChk1"));
            bean.setKICChk2(rs.getString("KICChk2"));
            bean.setKICChk3(rs.getString("KICChk3"));
            bean.setKICChk4(rs.getString("KICChk4"));
            bean.setKICChk5(rs.getString("KICChk5"));
            bean.setKICChk6(rs.getString("KICChk6"));
            bean.setKICChk7(rs.getString("KICChk7"));
            bean.setKICChk8(rs.getString("KICChk8"));
            bean.setKICChk9(rs.getString("KICChk9"));
            bean.setUpdateBranchPoint(rs.getString("UpdateBranchPoint"));

            listBean.add(bean);
        }
        rs.close();

        return listBean;
    }

    public ArrayList<BranchBean> listBranch() {
        try {
            String sql = "select * from cb_branch";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            return mappingBean(rs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public BranchBean getData() {
        ArrayList<BranchBean> listBean = listBranch();
        if (listBean.isEmpty()) {
            return null;
        }

        return listBean.get(0);
    }

    public void saveBranch(BranchBean bean) {
        try {
            String sql = "insert into branch"
                    + "(Code,Name,AddressNo,Locality,SubProvince,Province,Post,Tel_No,Fax_No,E_Mail,"
                    + "Manager,Location_Area,Ser_Area,Cou_Area,Kic_Area,Tot_Area,Cost,Charge,FlageCost,"
                    + "Gp,FlageGp,Remark,ArBillNo,EarneatBillNo,ReturnBillNo,PrintAutoSumDate,"
                    + "SaveOrder,SaveOrderCopy,SaveOrderChk,KIC1,KIC2,KIC3,KIC4,KIC5,KIC6,KIC7,KIC8,KIC9,"
                    + "SmartCard,GetFile,RetFile,PointFile,CntLoop,InvNo,InvCashNo,InvCash,InvActive,"
                    + "CreditAct,PromotionGP,LockTime,KicItemNo,PT1,PT2,PT3,PT4,PT5,PONO,PrintKicForm,"
                    + "PrintInvForm,PSelectStk,PStkChk,PMinStkChk,RoundUpTime,GiftStatusChk,"
                    + "KICCopy1,KICCopy2,KICCopy3,KICCopy4,KICCopy5,KICCopy6,KICCopy7,KICCopy8,KICCopy9,"
                    + "KICChk1,KICChk2,KICChk3,KICChk4,KICChk5,KICChk6,KICChk7,KICChk8,KICChk9,UpdateBranchPoint)  "
                    + "values('" + bean.getCode() + "','" + bean.getName() + "','" + bean.getAddressNo() + "',"
                    + "'" + bean.getLocality() + "','" + bean.getSubProvince() + "','" + bean.getProvince() + "',"
                    + "'" + bean.getPost() + "','" + bean.getTel_No() + "','" + bean.getFax_No() + "',"
                    + "'" + bean.getE_Mail() + "','" + bean.getManager() + "','" + bean.getLocation_Area() + "',"
                    + "'" + bean.getSer_Area() + "','" + bean.getCou_Area() + "','" + bean.getKic_Area() + "',"
                    + "'" + bean.getTot_Area() + "','" + bean.getCost() + "','" + bean.getCharge() + "',"
                    + "'" + bean.getFlageCost() + "','" + bean.getGp() + "','" + bean.getFlageGp() + "',"
                    + "'" + bean.getRemark() + "','" + bean.getArBillNo() + "','" + bean.getEarneatBillNo() + "',"
                    + "'" + bean.getReturnBillNo() + "','" + bean.getPrintAutoSumDate() + "',"
                    + "'" + bean.getSaveOrder() + "','" + bean.getSaveOrderCopy() + "','" + bean.getSaveOrderChk() + "',"
                    + "'" + bean.getKIC1() + "','" + bean.getKIC2() + "','" + bean.getKIC3() + "',"
                    + "'" + bean.getKIC4() + "','" + bean.getKIC5() + "','" + bean.getKIC6() + "',"
                    + "'" + bean.getKIC7() + "','" + bean.getKIC8() + "','" + bean.getKIC9() + "',"
                    + "'" + bean.getSmartCard() + "','" + bean.getGetFile() + "','" + bean.getRetFile() + "',"
                    + "'" + bean.getPointFile() + "','" + bean.getCntLoop() + "','" + bean.getInvNo() + "',"
                    + "'" + bean.getInvCashNo() + "','" + bean.getInvCash() + "','" + bean.getInvActive() + "',"
                    + "'" + bean.getCreditAct() + "','" + bean.getPromotionGP() + "','" + bean.getLockTime() + "',"
                    + "'" + bean.getKicItemNo() + "','" + bean.getPT1() + "','" + bean.getPT2() + "',"
                    + "'" + bean.getPT3() + "','" + bean.getPT4() + "','" + bean.getPT5() + "','" + bean.getPONO() + "',"
                    + "'" + bean.getPrintKicForm() + "','" + bean.getPrintInvForm() + "','" + bean.getPSelectStk() + "',"
                    + "'" + bean.getPStkChk() + "','" + bean.getPMinStkChk() + "','" + bean.getRoundUpTime() + "',"
                    + "'" + bean.getGiftStatusChk() + "','" + bean.getKICCopy1() + "','" + bean.getKICCopy2() + "',"
                    + "'" + bean.getKICCopy3() + "','" + bean.getKICCopy4() + "','" + bean.getKICCopy5() + "',"
                    + "'" + bean.getKICCopy6() + "','" + bean.getKICCopy7() + "','" + bean.getKICCopy8() + "',"
                    + "'" + bean.getKICCopy9() + "','" + bean.getKICChk1() + "','" + bean.getKICChk2() + "',"
                    + "'" + bean.getKICChk3() + "','" + bean.getKICChk4() + "','" + bean.getKICChk5() + "',"
                    + "'" + bean.getKICChk6() + "','" + bean.getKICChk7() + "','" + bean.getKICChk8() + "',"
                    + "'" + bean.getKICChk9() + "','" + bean.getUpdateBranchPoint() + "')";
            String sqlChk = "select * from branch where Code='" + bean.getCode() + "' ";
            ResultSet rs = MySQLConnect.getResultSet(sqlChk);
            if (rs.next()) {
                updateBranch(bean);
            } else {
                update(sql);
            }

            rs.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateBranch(BranchBean bean) {
        try {
            String sql = "update branch set Code='" + bean.getCode() + "', Name='" + bean.getName() + "', "
                    + "AddressNo='" + bean.getAddressNo() + "', Locality='" + bean.getLocality() + "', "
                    + "SubProvince='" + bean.getSubProvince() + "', Province='" + bean.getProvince() + "', "
                    + "Post='" + bean.getPost() + "', Tel_No='" + bean.getTel_No() + "', "
                    + "Fax_No='" + bean.getFax_No() + "', E_Mail='" + bean.getE_Mail() + "', "
                    + "Manager='" + bean.getManager() + "', Location_Area='" + bean.getLocation_Area() + "', "
                    + "Ser_Area='" + bean.getSer_Area() + "', Cou_Area='" + bean.getCou_Area() + "', "
                    + "Kic_Area='" + bean.getKic_Area() + "', Tot_Area='" + bean.getTot_Area() + "', "
                    + "Cost='" + bean.getCost() + "', Charge='" + bean.getCharge() + "', "
                    + "FlageCost='" + bean.getFlageCost() + "', Gp='" + bean.getGp() + "', "
                    + "FlageGp='" + bean.getFlageGp() + "', Remark='" + bean.getRemark() + "', "
                    + "ArBillNo='" + bean.getArBillNo() + "', EarneatBillNo='" + bean.getEarneatBillNo() + "', "
                    + "ReturnBillNo='" + bean.getReturnBillNo() + "', "
                    + "PrintAutoSumDate='" + bean.getPrintAutoSumDate() + "', SaveOrder='" + bean.getSaveOrder() + "', "
                    + "SaveOrderCopy='" + bean.getSaveOrderCopy() + "', SaveOrderChk='" + bean.getSaveOrderChk() + "', "
                    + "KIC1='" + bean.getKIC1() + "', KIC2='" + bean.getKIC2() + "', KIC3='" + bean.getKIC3() + "', "
                    + "KIC4='" + bean.getKIC4() + "', KIC5='" + bean.getKIC5() + "', KIC6='" + bean.getKIC6() + "', "
                    + "KIC7='" + bean.getKIC7() + "', KIC8='" + bean.getKIC8() + "', KIC9='" + bean.getKIC9() + "', "
                    + "SmartCard='" + bean.getSmartCard() + "', GetFile='" + bean.getGetFile() + "', "
                    + "RetFile='" + bean.getRetFile() + "', PointFile='" + bean.getPointFile() + "', "
                    + "CntLoop='" + bean.getCntLoop() + "', InvNo='" + bean.getInvNo() + "', "
                    + "InvCashNo='" + bean.getInvCashNo() + "', InvCash='" + bean.getInvCash() + "', "
                    + "InvActive='" + bean.getInvActive() + "', CreditAct='" + bean.getCreditAct() + "', "
                    + "PromotionGP='" + bean.getPromotionGP() + "', LockTime='" + bean.getLockTime() + "', "
                    + "KicItemNo='" + bean.getKicItemNo() + "', PT1='" + bean.getPT1() + "', "
                    + "PT2='" + bean.getPT2() + "', PT3='" + bean.getPT3() + "', PT4='" + bean.getPT4() + "', "
                    + "PT5='" + bean.getPT5() + "', PONO='" + bean.getPONO() + "', "
                    + "PrintKicForm='" + bean.getPrintKicForm() + "', PrintInvForm='" + bean.getPrintInvForm() + "', "
                    + "PSelectStk='" + bean.getPSelectStk() + "', PStkChk='" + bean.getPStkChk() + "', "
                    + "PMinStkChk='" + bean.getPMinStkChk() + "', RoundUpTime='" + bean.getRoundUpTime() + "', "
                    + "GiftStatusChk='" + bean.getGiftStatusChk() + "', KICCopy1='" + bean.getKICCopy1() + "', "
                    + "KICCopy2='" + bean.getKICCopy2() + "', KICCopy3='" + bean.getKICCopy3() + "', "
                    + "KICCopy4='" + bean.getKICCopy4() + "', KICCopy5='" + bean.getKICCopy5() + "', "
                    + "KICCopy6='" + bean.getKICCopy6() + "', KICCopy7='" + bean.getKICCopy7() + "', "
                    + "KICCopy8='" + bean.getKICCopy8() + "', KICCopy9='" + bean.getKICCopy9() + "', "
                    + "KICChk1='" + bean.getKICChk1() + "', KICChk2='" + bean.getKICChk2() + "', "
                    + "KICChk3='" + bean.getKICChk3() + "', KICChk4='" + bean.getKICChk4() + "', "
                    + "KICChk5='" + bean.getKICChk5() + "', KICChk6='" + bean.getKICChk6() + "', "
                    + "KICChk7='" + bean.getKICChk7() + "', KICChk8='" + bean.getKICChk8() + "', "
                    + "KICChk9='" + bean.getKICChk9() + "', UpdateBranchPoint='" + bean.getUpdateBranchPoint() + "' "
                    + "where code='" + bean.getCode() + "'";
            update(sql);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
