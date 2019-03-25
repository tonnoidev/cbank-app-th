package th.co.cbank.util;

import java.text.DecimalFormat;
import org.apache.log4j.Logger;

public class NumberUtil {
    private final Logger logger = Logger.getLogger(NumberUtil.class);
    
    public static Double toDouble(String str){
        if(StringUtil.isEmpty(str)){
            return 0.00;
        }
        try {
            double data = Double.parseDouble(str.replace(",", ""));
            return data;
        } catch (NumberFormatException e) {
            return 0.00;
        }
    }
    
    public static Integer toInt(String str){
        if(StringUtil.isEmpty(str)){
            return 0;
        }
        try {
            int data = Integer.parseInt(str.replace(",", ""));
            return data;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    
    public static String toNumberFormat(Object obj){
        DecimalFormat dec = new DecimalFormat("#,#00.00");
        return dec.format(obj);
    }
}
