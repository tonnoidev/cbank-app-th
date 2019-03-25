package th.co.cbank.project.control;

import java.sql.ResultSet;
import org.apache.log4j.Logger;
import th.co.cbank.project.constants.AppConstants;
import th.co.cbank.project.log.Log;
import th.co.cbank.project.model.SaveSummaryBean;

public class SaveSummaryControl extends BaseControl {
    private final Logger logger = Logger.getLogger(SaveSummaryControl.class);

    public SaveSummaryBean getSaveData() {
        SaveSummaryBean bean = new SaveSummaryBean();
        try {
            String sql = "select count(b_cust_code) total, "
                    + "sum(b_balance) b_balance,"
                    + "sum(b_interest) b_interest,"
                    + "sum(b_balance+b_interest) balance "
                    + "from cb_save_account ";
            ResultSet rs = MySQLConnect.getResultSet(sql);
            if (rs.next()) {
                bean.setAccountAll(rs.getInt("total"));
                bean.setSaveAll(rs.getDouble("b_balance"));
                bean.setInterestAll(rs.getDouble("b_interest"));
                bean.setTotalBalanceAll(rs.getDouble("balance"));
            }

            String sql1 = "select count(*) from cb_save_account where b_start=curdate();";
            rs = MySQLConnect.getResultSet(sql1);
            if (rs.next()) {
                bean.setAccountToday(rs.getInt(1));
            }
            String sql2 = "select count(*) from cb_transaction_save "
                    + "where t_status='8' and t_date=curdate();";
            rs = MySQLConnect.getResultSet(sql2);
            if (rs.next()) {
                bean.setCloseToday(rs.getInt(1));
            }

            String sql3 = "select sum(money_in) money_in, sum(money_out) money_out, sum(money_in-money_out) balance "
                    + "from cb_transaction_save "
                    + "where t_status in('2','3','8') and t_date=curdate() "
                    + "group by t_status;";
            rs = MySQLConnect.getResultSet(sql3);
            double save1 = 0;
            double with1 = 0;
            double balance1 = 0;
            while (rs.next()) {
                save1 += rs.getDouble(1);
                with1 += rs.getDouble(2);
                balance1 += rs.getDouble(3);
            }

            bean.setSaveToday(save1);
            bean.setWithdrawToday(with1);
            bean.setTotalBalanceToday(balance1);

            String sql4 = "select sum(fee_amount) fee_amount from cb_fee_transaction "
                    + "where fee_date=curdate();";
            rs = MySQLConnect.getResultSet(sql4);
            if (rs.next()) {
                bean.setFeeToday(rs.getDouble(1));
            }

            String h1 = "select count(*),sum(Hoon_Qty) from cb_profile where hoon_qty>0;";
            rs = MySQLConnect.getResultSet(h1);
            if (rs.next()) {
                bean.setHoon_balance_all(rs.getInt(1));
                bean.setHoon_value_amount_all(rs.getDouble(2));
            }
            String h2 = "select t_status, sum(t_amount) from cb_transaction_save "
                    + "where t_status in('4','5','9') and t_date=curdate() "
                    + "group by t_status;";
            rs = MySQLConnect.getResultSet(h2);
            int h4 = 0;
            int h5 = 0;
            int h9 = 0;
            while (rs.next()) {
                int status = rs.getInt("t_status");
                if (status == 4) {//ซื้อหุ้น
                    h4 += rs.getDouble(2);
                } else if (status == 5) {//ขายหุ้น
                    h5 += rs.getDouble(2);
                } else if (status == 6) {//โอนหุ้น
                    h9 += rs.getDouble(2);
                }
            }

            bean.setHoon_buy_today(h4);
            bean.setHoon_sale_today(h5);
            bean.setHoon_transfer_today(h9);
            bean.setHoon_value_amount_today(h4 - h5);

            String l1 = "select count(*),sum(loan_amount),sum(loan_fee) "
                    + "from cb_loan_account;";
            rs = MySQLConnect.getResultSet(l1);
            if (rs.next()) {
                bean.setAccount_loan_all(rs.getInt(1));
                bean.setLoan_balance_all(rs.getDouble(2));
                bean.setLoan_fee_all(rs.getDouble(3));
            }

            String l2 = "select t_status,count(*),sum(t_amount),sum(t_fee) "
                    + "from cb_transaction_save "
                    + "where t_date=curdate() "
                    + "and t_status in('10','7') "
                    + "group by t_status;";
            rs = MySQLConnect.getResultSet(l2);
            double l10 = 0.00;
            double l7 = 0.00;
            double lFee = 0.00;
            while (rs.next()) {
                String t_status = rs.getString(1);
                switch (t_status) {
                    case AppConstants.CB_STATUS_LOAN:
                        //กู้เงิน
                        l10 += rs.getDouble(3);
                        lFee+=rs.getDouble(4);
                        bean.setAccount_loan_today(rs.getInt(2));
                        break;
                    case AppConstants.CB_STATUS_PAYMENT:
                        l7 += rs.getDouble(3);
                        break;
                }
            }
            
            bean.setLoan_balance_today(l10);
            bean.setPayment_loan_amont(l7);
            bean.setLoan_fee_today(lFee);

            rs.close();
        } catch (Exception e) {
            Log.write.error(e.getMessage());
        }

        return bean;
    }
}
