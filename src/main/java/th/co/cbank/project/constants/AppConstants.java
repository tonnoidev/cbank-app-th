package th.co.cbank.project.constants;

public class AppConstants {

    public static final String BOOKTYPE_PAYMENT = "PM";

    /* status from database */
    public static final String CB_STATUS_OPEN_SAVE = "1";
    public static final String CB_STATUS_SAVE = "2";
    public static final String CB_STATUS_WITHDRAW = "3";
    public static final String CB_STATUS_BUY_HOON = "4";
    public static final String CB_STATUS_SALE_HOON = "5";
    public static final String CB_STATUS_OPEN_LOAN = "6";
    public static final String CB_STATUS_PAYMENT = "7";
    public static final String CB_STATUS_CLOSE_SAVE = "8";
    public static final String CB_STATUS_TRANS_HOON = "9";
    public static final String CB_STATUS_LOAN = "10";

    /* save status */
    public static final String INT_FLAT_RATE = "F";
    public static final String INT_EFFITIVE_RATE = "E";

    /* interfaces */
    public static final String DEFAULT_FONT = "Tahoma";
    public static final int DEFAULT_FONT_SIZE = 14;

    /* reports */
    public static final String JASPER_ROOT_PATH = "/reports/";
    public static final String JASPER_FILE = ".jasper";

    public static final String JASPER_BUY_HOON_REPORT = JASPER_ROOT_PATH + "BuyHoonReport" + JASPER_FILE;
    public static final String JASPER_SELL_HOON_REPORT = JASPER_ROOT_PATH + "SellHoonReport" + JASPER_FILE;
    public static final String JASPER_TRANSFER_HOON_REPORT = JASPER_ROOT_PATH + "TransferHoonReport" + JASPER_FILE;
    public static final String JASPER_LOAN_SLIP_REPORT = JASPER_ROOT_PATH + "LoanSlip" + JASPER_FILE;
    public static final String JASPER_CLOSE_DAY_REPORT = JASPER_ROOT_PATH + "CloseDayReport" + JASPER_FILE;
    public static final String JASPER_SAVE_TRAN_REPORT = JASPER_ROOT_PATH + "ReportSaveTran" + JASPER_FILE;
    public static final String JASPER_SAVING_ACCOUNT_ALL_REPORT = JASPER_ROOT_PATH + "ReportSavingAccountAll" + JASPER_FILE;
    public static final String JASPER_LOAN_ACCOUNT_ALL_REPORT = JASPER_ROOT_PATH + "ReportLoanAccountAll" + JASPER_FILE;
    public static final String JASPER_HOON_ALL_REPORT = JASPER_ROOT_PATH + "ReportHoonAll" + JASPER_FILE;
    public static final String JASPER_PERSON_BALANCE_REPORT = JASPER_ROOT_PATH + "PersonBalance" + JASPER_FILE;

    public static final String JASPER_TRAN_ORG_1_REPORT = JASPER_ROOT_PATH + "Transaction_Orange_1" + JASPER_FILE;
    public static final String JASPER_TRAN_GREEN_1_REPORT = JASPER_ROOT_PATH + "Transaction_Green_1" + JASPER_FILE;
    public static final String JASPER_PRINT_BOOK_ACCOUNT = JASPER_ROOT_PATH + "Print_Book_Account" + JASPER_FILE;
    public static final String JASPER_PRINT_BOOK_LOAN_ACCOUNT = JASPER_ROOT_PATH + "Print_Book_Loan_Account" + JASPER_FILE;
    public static final String JASPER_SLIP_SHORT = JASPER_ROOT_PATH + "SlipShort" + JASPER_FILE;
    public static final String JASPER_TRAN_ORG_2 = JASPER_ROOT_PATH + "Transaction_Orange_2" + JASPER_FILE;
    public static final String JASPER_TRAN_GREEN_2_0 = JASPER_ROOT_PATH + "Transaction_Green_2(0)" + JASPER_FILE;
    public static final String JASPER_TRAN_GREEN_2 = JASPER_ROOT_PATH + "Transaction_Green_2" + JASPER_FILE;
    public static final String JASPER_INVOICE_HOON_REPORT = JASPER_ROOT_PATH + "ReportInvoiceHoon" + JASPER_FILE;
    public static final String JASPER_CLOSE_ACCOUNT_REPORT = JASPER_ROOT_PATH + "CloseAccount" + JASPER_FILE;
    public static final String JASPER_FEE_TRAN_REPORT = JASPER_ROOT_PATH + "FeeTransaction" + JASPER_FILE;
    public static final String JASPER_OPEN_ACCOUNT_REPORT = JASPER_ROOT_PATH + "OpenAccount" + JASPER_FILE;
    public static final String JASPER_LOAN_PAPER_REPORT = JASPER_ROOT_PATH + "LoanPaperReport" + JASPER_FILE;
    public static final String JASPER_LOAN_PAPER_GARUNTEE_REPORT = JASPER_ROOT_PATH + "LoanPaperGaruntee" + JASPER_FILE;
    public static final String JASPER_LOAN_PAPER_GARUNTEE_REPORT_2 = JASPER_ROOT_PATH + "LoanPaperGaruntee2" + JASPER_FILE;

}
