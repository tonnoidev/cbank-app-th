package th.co.cbank.project.control;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;
import th.co.cbank.project.model.CbLoanAccountBean;
import th.co.cbank.project.model.CbLoanConfigBean;
import th.co.cbank.util.DateUtil;

public class InterestControl {
    private final Logger logger = Logger.getLogger(InterestControl.class);

    public static double defaultINT(double money1, double intPerYear, int dayAll) {
        double perMonth = intPerYear / 12;
        double perDay = perMonth / 30;
        double total = (money1 * intPerYear * dayAll) / (365 * 100);
//        double total = (money1 * perDay * dayAll) / 100;

        return total;
    }

    public static long getLengthToCurrent(int year, int month, int day) {
        Calendar startDate = Calendar.getInstance(Locale.ENGLISH);
        startDate.set(year, month, day);
        Calendar endDate = Calendar.getInstance(Locale.ENGLISH);
        Calendar date = (Calendar) startDate.clone();
        long daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }

        return daysBetween;
    }

    public static long getLengthToCurrent(Date d) {
        SimpleDateFormat simD = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String[] data = simD.format(d).split("-");

        return getLengthToCurrent(Integer.parseInt(data[0]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[2]));
    }

    public static int getMaxDayPerThisYear() {
        if (Calendar.getInstance(Locale.ENGLISH).getActualMaximum(Calendar.DAY_OF_MONTH) == 28) {
            return 365;
        } else {
            return 366;
        }
    }

    public static int getMaxDayPerThisMonth(int year, int month, int day) {
        Calendar c = Calendar.getInstance(Locale.ENGLISH);
        c.set(year, month - 1, day);
        int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        return maxDayOfMonth;
    }

    //เปรียบเทียบเท่ากับสิ้นเดือน
    public static boolean isEndOfMonth(int day) {
        return Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH) == day;
    }

    //คำนวณแบบ Flat Rate
    public double totalBalanceIntRate(String AccCode) {
        CbLoanAccountControl la = new CbLoanAccountControl();
        CbLoanAccountBean lBean = la.listLoanAccount(AccCode);
        CbLoanConfigControl loanConfig = new CbLoanConfigControl();
        CbLoanConfigBean cBean = loanConfig.listLoanConfig(lBean.getLoan_type());
        double balance;
        if (cBean.getIntFixed().equals("F")) {
            int period = cBean.getLoanPerMonth();
            double capital = lBean.getLoan_amount();//เงินต้น
            double interest = cBean.getLoanINT();
            balance = (capital + (capital * period * interest) / (100 * 12)) / period;
        } else {
            balance = totalBalanceEffecRate(AccCode);
        }

        return balance;
    }

    private double totalBalanceEffecRate(String AccCode) {
        CbLoanAccountControl la = new CbLoanAccountControl();
        CbLoanAccountBean lBean = la.listLoanAccount(AccCode);
        double INTEREST = lBean.getLoan_interest();
        double BALANCE = lBean.getLoan_amount();

        int dateDiff = DateUtil.diff(new Date(), lBean.getLoan_docdate());

        return computeInterest(BALANCE, INTEREST, dateDiff);
    }

    private double computeInterest(double PRINCIPLE_BALANCE, double INTEREST, int DAYS_PERIOD) {
        double INTEREST_PAYMENT;
        int DAYS_OF_YEAR = (int) CbSaveAccountControl.getYYYYcountDay();

        INTEREST_PAYMENT = (PRINCIPLE_BALANCE * INTEREST * DAYS_PERIOD) / (DAYS_OF_YEAR * 100);

        return INTEREST_PAYMENT;
    }

}
