package th.co.cbank.project.model;

import org.apache.log4j.Logger;

public class SaveSummaryBean {
    private final Logger logger = Logger.getLogger(SaveSummaryBean.class);

    private int accountAll;//บัญชีทั้งหมด
    private int closeAll;//ปิดบัญชีทั้งหมด
    private double saveAll;//จำนวนเงินฝาก
    private double interestAll;//จำนวนดอกเบี้ยสะสม
    private double totalBalanceAll;//จำนวนคงเหลือ
    private int accountToday;//เปิดบัญชีวันนี้
    private int closeToday;//ปิดบัญชีวันนี้
    private double saveToday;//ฝากเงินวันนี้
    private double withdrawToday;//ถอนเงินวันนี้
    private double totalBalanceToday;//ยอดคงเหลือต่อวัน
    private double feeToday;//จำนวนค่าธรรมเนียม

    private int account_hoon_all = 0;//จำนวนผู้ถือหุ้นทั้งหมด
    private int hoon_balance_all = 0;//จำนวนหุ้นทั้งหมดในระบบ
    private double hoon_value_amount_all = 0.00;//มูลค่าหุ้นทั้งหมด
    private int account_hoon_today = 0;//ผู้ถือหุ้นใหม่วันนี้
    private int hoon_buy_today = 0;//จำนวนหุ้นที่ซื้อวันนี้
    private int hoon_sale_today = 0;//จำนวนหุ้นที่ขายวันนี้
    private int hoon_transfer_today = 0;//จำนวนหุ้นที่โอนวันนี้
    private int hoon_qty_today = 0;//จำนวนหุ้นคงเหลือวันนี้
    private double hoon_value_amount_today = 0.00;//มูลค่าหุ้นวันนี้       

    private int account_loan_all = 0;//จำนวนผู้กู้เงินทั้งหมด
    private double loan_balance_all = 0.00;//จำนวนเงินกู้ทั้งหมด
    private double loan_fee_all = 0.00;//จำนวนค่าปรับทั้งหมด
    private int account_loan_today = 0;//จำนวนผู้กู้เงินใหม่วันนี้
    private double loan_balance_today = 0.00;//จำนวนเงินกู้วันนี้
    private int people_payment_today = 0;//จำนวนผู้มาชำระเงิน
    private double payment_loan_amont = 0.00;//รวมยอดชำระวันนี้
    private double loan_fee_today = 0.00;//รับค่าปรับวันนี้

    public int getAccount_loan_all() {
        return account_loan_all;
    }

    public void setAccount_loan_all(int account_loan_all) {
        this.account_loan_all = account_loan_all;
    }

    public double getLoan_balance_all() {
        return loan_balance_all;
    }

    public void setLoan_balance_all(double loan_balance_all) {
        this.loan_balance_all = loan_balance_all;
    }

    public double getLoan_fee_all() {
        return loan_fee_all;
    }

    public void setLoan_fee_all(double loan_fee_all) {
        this.loan_fee_all = loan_fee_all;
    }

    public int getAccount_loan_today() {
        return account_loan_today;
    }

    public void setAccount_loan_today(int account_loan_today) {
        this.account_loan_today = account_loan_today;
    }

    public double getLoan_balance_today() {
        return loan_balance_today;
    }

    public void setLoan_balance_today(double loan_balance_today) {
        this.loan_balance_today = loan_balance_today;
    }

    public int getPeople_payment_today() {
        return people_payment_today;
    }

    public void setPeople_payment_today(int people_payment_today) {
        this.people_payment_today = people_payment_today;
    }

    public double getPayment_loan_amont() {
        return payment_loan_amont;
    }

    public void setPayment_loan_amont(double payment_loan_amont) {
        this.payment_loan_amont = payment_loan_amont;
    }

    public double getLoan_fee_today() {
        return loan_fee_today;
    }

    public void setLoan_fee_today(double loan_fee_today) {
        this.loan_fee_today = loan_fee_today;
    }

    public int getAccount_hoon_all() {
        return account_hoon_all;
    }

    public void setAccount_hoon_all(int account_hoon_all) {
        this.account_hoon_all = account_hoon_all;
    }

    public int getHoon_balance_all() {
        return hoon_balance_all;
    }

    public void setHoon_balance_all(int hoon_balance_all) {
        this.hoon_balance_all = hoon_balance_all;
    }

    public double getHoon_value_amount_all() {
        return hoon_value_amount_all;
    }

    public void setHoon_value_amount_all(double hoon_value_amount_all) {
        this.hoon_value_amount_all = hoon_value_amount_all;
    }

    public int getAccount_hoon_today() {
        return account_hoon_today;
    }

    public void setAccount_hoon_today(int account_hoon_today) {
        this.account_hoon_today = account_hoon_today;
    }

    public int getHoon_buy_today() {
        return hoon_buy_today;
    }

    public void setHoon_buy_today(int hoon_buy_today) {
        this.hoon_buy_today = hoon_buy_today;
    }

    public int getHoon_sale_today() {
        return hoon_sale_today;
    }

    public void setHoon_sale_today(int hoon_sale_today) {
        this.hoon_sale_today = hoon_sale_today;
    }

    public int getHoon_transfer_today() {
        return hoon_transfer_today;
    }

    public void setHoon_transfer_today(int hoon_transfer_today) {
        this.hoon_transfer_today = hoon_transfer_today;
    }

    public int getHoon_qty_today() {
        return hoon_qty_today;
    }

    public void setHoon_qty_today(int hoon_qty_today) {
        this.hoon_qty_today = hoon_qty_today;
    }

    public double getHoon_value_amount_today() {
        return hoon_value_amount_today;
    }

    public void setHoon_value_amount_today(double hoon_value_amount_today) {
        this.hoon_value_amount_today = hoon_value_amount_today;
    }

    public int getAccountAll() {
        return accountAll;
    }

    public void setAccountAll(int accountAll) {
        this.accountAll = accountAll;
    }

    public int getCloseAll() {
        return closeAll;
    }

    public void setCloseAll(int closeAll) {
        this.closeAll = closeAll;
    }

    public double getSaveAll() {
        return saveAll;
    }

    public void setSaveAll(double saveAll) {
        this.saveAll = saveAll;
    }

    public double getInterestAll() {
        return interestAll;
    }

    public void setInterestAll(double interestAll) {
        this.interestAll = interestAll;
    }

    public double getTotalBalanceAll() {
        return totalBalanceAll;
    }

    public void setTotalBalanceAll(double totalBalanceAll) {
        this.totalBalanceAll = totalBalanceAll;
    }

    public int getAccountToday() {
        return accountToday;
    }

    public void setAccountToday(int accountToday) {
        this.accountToday = accountToday;
    }

    public int getCloseToday() {
        return closeToday;
    }

    public void setCloseToday(int closeToday) {
        this.closeToday = closeToday;
    }

    public double getSaveToday() {
        return saveToday;
    }

    public void setSaveToday(double saveToday) {
        this.saveToday = saveToday;
    }

    public double getWithdrawToday() {
        return withdrawToday;
    }

    public void setWithdrawToday(double withdrawToday) {
        this.withdrawToday = withdrawToday;
    }

    public double getTotalBalanceToday() {
        return totalBalanceToday;
    }

    public void setTotalBalanceToday(double totalBalanceToday) {
        this.totalBalanceToday = totalBalanceToday;
    }

    public double getFeeToday() {
        return feeToday;
    }

    public void setFeeToday(double feeToday) {
        this.feeToday = feeToday;
    }

}
