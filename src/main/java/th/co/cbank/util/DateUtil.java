package th.co.cbank.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

public class DateUtil {

    private final Logger logger = Logger.getLogger(DateUtil.class);

    public static int diff(Date date1, Date date2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.setTime(date1);
        c2.setTime(date2);
        int diffDay;

        if (c1.before(c2)) {
            diffDay = countDiffDay(c1, c2);
        } else {
            diffDay = countDiffDay(c2, c1);
        }

        return diffDay;
    }

    public static void DateDiff(Date date1, Date date2) {
        int diffDay = diff(date1, date2);
        //System.out.println("Different Day : " + diffDay);
    }

    public static int countDiffDay(Calendar c1, Calendar c2) {
        int returnInt = 0;
        while (!c1.after(c2)) {
            c1.add(Calendar.DAY_OF_MONTH, 1);
            returnInt++;
        }

        if (returnInt > 0) {
            returnInt = returnInt - 1;
        }

        return (returnInt);
    }

    public static Date makeDate(String dateString) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(dateString);
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

    //method สำหรับนับช่วงวัน ว่าจากวันนี้ ถึงวันนี้เป็นระยะเวลากี่วัน
    public static int getDayQty(Calendar cTarget) {
        Calendar cc1 = Calendar.getInstance(Locale.ENGLISH);
        for (int i = 0; i < 36600; i++) {
            if (cc1.getTime().compareTo(cTarget.getTime()) == 0) {
                //System.out.println(i);
                return i;
            }
            cc1.add(Calendar.DATE, 1);
        }

        return 0;
    }

    public static int getDayQty(Calendar cc1, Calendar cc2) {
        for (int i = 0; i < 36600; i++) {
            if (cc1.getTime().compareTo(cc2.getTime()) == 0) {
                return i;
            }
            cc1.add(Calendar.DATE, 1);
        }

        return 0;
    }

    public static int getDayQty(Date cTarget) {
        Calendar cc1 = Calendar.getInstance(Locale.ENGLISH);
        Calendar cc2 = Calendar.getInstance(Locale.ENGLISH);
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String[] date = simp.format(cTarget).split("-");
        cc2.set(
                Integer.parseInt(date[0]),
                Integer.parseInt(date[1]) - 1,
                Integer.parseInt(date[2])
        );

        for (int i = 0; i < 36600; i++) {
            if (cc1.getTime().compareTo(cc2.getTime()) == 0) {
                //System.out.println(i);
                return i;
            }
            cc1.add(Calendar.DATE, 1);
        }

        return 0;
    }

    public static int getDayQty(int year, int month, int day) {
        Calendar cc1 = Calendar.getInstance(Locale.ENGLISH);
        Calendar cc2 = Calendar.getInstance(Locale.ENGLISH);
        cc2.set(year, month, day);

        for (int i = 0; i < 36600; i++) {
            if (cc1.getTime().compareTo(cc2.getTime()) == 0) {
                //System.out.println(i);
                return i;
            }
            cc1.add(Calendar.DATE, 1);
        }

        return 0;
    }

    public static String getCurrentDateStr() {
        return new SimpleDateFormat("dd MMMM yyyy").format(new Date());
    }

    public static Date toDate(java.sql.Date date) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(date);

            return c.getTime();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getDayDiff(Date d1, Date d2) {
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        String dateStart = s1.format(d1);
        String dateEnd = s1.format(d2);

        return getDayDiff(dateStart, dateEnd);
    }

    public static int getDayDiff(String dateStart, String dateStop) {
        long diffDays = 0;
        try {
            //HH converts hour in 24 hours format (0-23), day calculation
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            Date d1 = format.parse(dateStart);
            Date d2 = format.parse(dateStop);

            //in milliseconds
            long diff = d2.getTime() - d1.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
        }

        return (int) diffDays;
    }
}
