package th.co.cbank.project.view;

import javax.swing.JDialog;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.AddressControl;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbBondsmanControl;
import th.co.cbank.project.control.CbCancelAccountControl;
import th.co.cbank.project.control.CbExpTransactionControl;
import th.co.cbank.project.control.CbFeeControl;
import th.co.cbank.project.control.CbFeeTransactionControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.CbWithdrawAllowControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.EnableControl;
import th.co.cbank.project.control.CbExpenseControl;
import th.co.cbank.project.control.CbHoonConfigControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.LoginControl;
import th.co.cbank.project.control.CbMemberTypeControl;
import th.co.cbank.project.control.CbPrefixControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.CbProjectControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.SaveSummaryControl;
import th.co.cbank.project.control.SettingControl;
import th.co.cbank.project.control.CbStatusControl;
import th.co.cbank.project.control.CbHoonSummaryControl;
import th.co.cbank.project.control.CbUserControl;

public class BaseDialogSwing extends JDialog {

    private final Logger logger = Logger.getLogger(BaseDialogSwing.class);
    private final CbSaveAccountControl saveAccountControl = new CbSaveAccountControl();
    private final CbLoanAccountControl loanAccountControl = new CbLoanAccountControl();
    private final BranchControl branchControl = new BranchControl();
    private final ProfileControl profileControl = new ProfileControl();
    private final CbLoanConfigControl loanConfigControl = new CbLoanConfigControl();
    private final CbSaveConfigControl saveConfigControl = new CbSaveConfigControl();
    private final ConfigControl configControl = new ConfigControl();
    private final AddressControl addressControl = new AddressControl();
    private final CbBondsmanControl cbBondsmanControl = new CbBondsmanControl();
    private final CbFeeControl cbFeeControl = new CbFeeControl();
    private final CbFeeTransactionControl cbFeeTransactionControl = new CbFeeTransactionControl();
    private final CbLoanTablePaymentControl cbLoanTablePaymentControl = new CbLoanTablePaymentControl();
    private final CbTransactionLoanControl cbTransactionLoanControl = new CbTransactionLoanControl();
    private final CbWithdrawAllowControl cbWithdrawAllowControl = new CbWithdrawAllowControl();
    private final CbHoonConfigControl hoonConfigControl = new CbHoonConfigControl();
    private final SaveSummaryControl saveSummaryControl = new SaveSummaryControl();
    private final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();
    private final CbMemberTypeControl memberTypeControl = new CbMemberTypeControl();
    private final CbExpenseControl expenseControl = new CbExpenseControl();
    private final CbProjectControl projectControl = new CbProjectControl();
    private final CbPrefixControl prefixControl = new CbPrefixControl();
    private final CbStatusControl statusControl = new CbStatusControl();
    private final SettingControl settingControl = new SettingControl();
    private final CbUserControl userControl = new CbUserControl();
    private final CbExpTransactionControl cbExpTransactionControl = new CbExpTransactionControl();
    private final CbCancelAccountControl cbCancelAccountControl = new CbCancelAccountControl();
    private final CbHoonSummaryControl summaryControl = new CbHoonSummaryControl();
    private final LoginControl loginControl = new LoginControl();
    private final EnableControl enableControl = new EnableControl();

    public BaseDialogSwing(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public ProfileControl getProfileControl() {
        return profileControl;
    }

    public BranchControl getBranchControl() {
        return branchControl;
    }

    public ConfigControl getConfigControl() {
        return configControl;
    }

    public CbHoonConfigControl getHoonConfigControl() {
        return hoonConfigControl;
    }

    public CbSaveConfigControl getSaveConfigControl() {
        return saveConfigControl;
    }

    public CbLoanConfigControl getLoanConfigControl() {
        return loanConfigControl;
    }

    public SettingControl getSettingControl() {
        return settingControl;
    }

    public CbUserControl getUserControl() {
        return userControl;
    }

    public CbFeeControl getCbFeeControl() {
        return cbFeeControl;
    }

    public CbExpenseControl getExpenseControl() {
        return expenseControl;
    }

    public CbSaveAccountControl getSaveAccountControl() {
        return saveAccountControl;
    }

    public CbLoanAccountControl getLoanAccountControl() {
        return loanAccountControl;
    }

    public CbBondsmanControl getCbBondsmanControl() {
        return cbBondsmanControl;
    }

    public CbFeeTransactionControl getCbFeeTransactionControl() {
        return cbFeeTransactionControl;
    }

    public CbLoanTablePaymentControl getCbLoanTablePaymentControl() {
        return cbLoanTablePaymentControl;
    }

    public CbTransactionLoanControl getCbTransactionLoanControl() {
        return cbTransactionLoanControl;
    }

    public CbWithdrawAllowControl getCbWithdrawAllowControl() {
        return cbWithdrawAllowControl;
    }

    public SaveSummaryControl getSaveSummaryControl() {
        return saveSummaryControl;
    }

    public CbTransactionSaveControl getCbTransactionSaveControl() {
        return cbTransactionSaveControl;
    }

    public CbProjectControl getProjectControl() {
        return projectControl;
    }

    public CbPrefixControl getPrefixControl() {
        return prefixControl;
    }

    public CbStatusControl getStatusControl() {
        return statusControl;
    }

    public CbExpTransactionControl getCbExpTransactionControl() {
        return cbExpTransactionControl;
    }

    public CbCancelAccountControl getCbCancelAccountControl() {
        return cbCancelAccountControl;
    }

    public LoginControl getLoginControl() {
        return loginControl;
    }

    public CbHoonSummaryControl getSummaryControl() {
        return summaryControl;
    }

    public AddressControl getAddressControl() {
        return addressControl;
    }

    public CbMemberTypeControl getMemberTypeControl() {
        return memberTypeControl;
    }

    public EnableControl getEnableControl() {
        return enableControl;
    }

}
