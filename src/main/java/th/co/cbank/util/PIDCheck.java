package th.co.cbank.util;

import org.apache.log4j.Logger;

public class PIDCheck {
    private final Logger logger = Logger.getLogger(PIDCheck.class);

    public static boolean checkPID(String id) {
        if (id.length() != 13) {
            return false;
        }
        
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            try {
                sum += Integer.parseInt(String.valueOf(id.charAt(i))) * (13 - i);
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return id.charAt(12) - '0' == ((11 - (sum % 11)) % 10);
    }
}
