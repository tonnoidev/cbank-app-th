package th.co.cbank.project.model;

import java.util.Date;
import org.apache.log4j.Logger;

public class CbHoonSummaryBean {
    private final Logger logger = Logger.getLogger(CbHoonSummaryBean.class);
    private String year_at;
    private Date action_time;
    private String user_action;
    private double profit_total = 0.00;
    private int reduce_value_second = 0;
    private int reduce_benefit = 0;
    private double reduce_v_baht = 0.00;
    private double reduce_b_baht = 0.00;
    private double balance_total = 0.00;
    private double dividend_buy = 0.00;
    private double dividend_money = 0.00;
    private double dividend_by = 0.00;
    private double dividend_baht = 0.00;
    private double dividend_value_baht = 0.00;

    public String getYear_at() {
        return year_at;
    }

    public void setYear_at(String year_at) {
        this.year_at = year_at;
    }

    public Date getAction_time() {
        return action_time;
    }

    public void setAction_time(Date action_time) {
        this.action_time = action_time;
    }

    public String getUser_action() {
        return user_action;
    }

    public void setUser_action(String user_action) {
        this.user_action = user_action;
    }

    public double getProfit_total() {
        return profit_total;
    }

    public void setProfit_total(double profit_total) {
        this.profit_total = profit_total;
    }

    public int getReduce_value_second() {
        return reduce_value_second;
    }

    public void setReduce_value_second(int reduce_value_second) {
        this.reduce_value_second = reduce_value_second;
    }

    public int getReduce_benefit() {
        return reduce_benefit;
    }

    public void setReduce_benefit(int reduce_benefit) {
        this.reduce_benefit = reduce_benefit;
    }

    public double getReduce_v_baht() {
        return reduce_v_baht;
    }

    public void setReduce_v_baht(double reduce_v_baht) {
        this.reduce_v_baht = reduce_v_baht;
    }

    public double getReduce_b_baht() {
        return reduce_b_baht;
    }

    public void setReduce_b_baht(double reduce_b_baht) {
        this.reduce_b_baht = reduce_b_baht;
    }

    public double getBalance_total() {
        return balance_total;
    }

    public void setBalance_total(double balance_total) {
        this.balance_total = balance_total;
    }

    public double getDividend_buy() {
        return dividend_buy;
    }

    public void setDividend_buy(double dividend_buy) {
        this.dividend_buy = dividend_buy;
    }

    public double getDividend_money() {
        return dividend_money;
    }

    public void setDividend_money(double dividend_money) {
        this.dividend_money = dividend_money;
    }

    public double getDividend_by() {
        return dividend_by;
    }

    public void setDividend_by(double dividend_by) {
        this.dividend_by = dividend_by;
    }

    public double getDividend_baht() {
        return dividend_baht;
    }

    public void setDividend_baht(double dividend_baht) {
        this.dividend_baht = dividend_baht;
    }

    public double getDividend_value_baht() {
        return dividend_value_baht;
    }

    public void setDividend_value_baht(double dividend_value_baht) {
        this.dividend_value_baht = dividend_value_baht;
    }

}
