package th.co.cbank.project.control;

public class Value {

    public static String USER_CODE = "";
    public static String USER_PASS = "";
    public static String USER_NAME = "";
    public static String USER_TIME = "";
    public static int PERMISSION = 0;

    public static String CUST_CODE;
    public static String CUST_NAME;
    public static String CUST_LASTNAME;
    public static String CUST_ACC;
    public static String PATH_SCAN;
    public static String PATH_EXE;
    public static String START_DATE;
    public static String START_DATE6;

    public static String TYPE1;
    public static String TYPE2;
    public static String TYPE;
    public static String MACNO;

    public static boolean isConfig = false;
    public static String CUST_ACCOUNT_CODE;
    public static String CUST_LOAN_CODE;
    public static String USER_LAST_NAME;
    public static String[] ACCESS = new String[23];
    public static String BRANCH_CODE;

    public static int SELECT_CHOICE = 0;
    
    public static void clear() {
        USER_CODE = "";
        USER_NAME = "";
        USER_TIME = "";
        PERMISSION = 0;

        CUST_CODE = "";
        CUST_NAME = "";
        CUST_LASTNAME = "";
        CUST_ACC = "";
        PATH_SCAN = "";
        PATH_EXE = "";
        START_DATE = "";
        START_DATE6 = "";

        TYPE1 = "";
        TYPE2 = "";
        TYPE = "";
        MACNO = "";

        isConfig = false;
        CUST_ACCOUNT_CODE = "";
        USER_LAST_NAME = "";
        ACCESS = new String[23];
    }
}
