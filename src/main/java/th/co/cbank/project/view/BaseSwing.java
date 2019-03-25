package th.co.cbank.project.view;

import javax.swing.JFrame;
import org.apache.log4j.Logger;
import th.co.cbank.project.control.AddressControl;
import th.co.cbank.project.control.BranchControl;
import th.co.cbank.project.control.CbBondsmanControl;
import th.co.cbank.project.control.CbFeeControl;
import th.co.cbank.project.control.CbFeeTransactionControl;
import th.co.cbank.project.control.CbLoanTablePaymentControl;
import th.co.cbank.project.control.CbTransactionLoanControl;
import th.co.cbank.project.control.CbTransactionSaveControl;
import th.co.cbank.project.control.CbWithdrawAllowControl;
import th.co.cbank.project.control.ConfigControl;
import th.co.cbank.project.control.DocumentGarunteeControl;
import th.co.cbank.project.control.CbHoonConfigControl;
import th.co.cbank.project.control.CbLoanAccountControl;
import th.co.cbank.project.control.CbLoanConfigControl;
import th.co.cbank.project.control.ModelControl;
import th.co.cbank.project.control.ProfileControl;
import th.co.cbank.project.control.CbSaveAccountControl;
import th.co.cbank.project.control.CbSaveConfigControl;
import th.co.cbank.project.control.SaveSummaryControl;

public class BaseSwing extends JFrame {

    private final Logger logger = Logger.getLogger(BaseSwing.class);
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
    private final DocumentGarunteeControl documentGarunteeControl = new DocumentGarunteeControl();
    private final CbHoonConfigControl hoonConfigControl = new CbHoonConfigControl();
    private final SaveSummaryControl saveSummaryControl = new SaveSummaryControl();
    private final CbTransactionSaveControl cbTransactionSaveControl = new CbTransactionSaveControl();
    private final ModelControl modelControl = new ModelControl();

    public CbSaveAccountControl getSaveAccountControl() {
        return saveAccountControl;
    }

    public CbLoanAccountControl getLoanAccountControl() {
        return loanAccountControl;
    }

    public BranchControl getBranchControl() {
        return branchControl;
    }

    public ProfileControl getProfileControl() {
        return profileControl;
    }

    public CbLoanConfigControl getLoanConfigControl() {
        return loanConfigControl;
    }

    public CbSaveConfigControl getSaveConfigControl() {
        return saveConfigControl;
    }

    public ConfigControl getConfigControl() {
        return configControl;
    }

    public AddressControl getAddressControl() {
        return addressControl;
    }

    public CbBondsmanControl getCbBondsmanControl() {
        return cbBondsmanControl;
    }

    public CbFeeControl getCbFeeControl() {
        return cbFeeControl;
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

    public DocumentGarunteeControl getDocumentGarunteeControl() {
        return documentGarunteeControl;
    }

    public CbHoonConfigControl getHoonConfigControl() {
        return hoonConfigControl;
    }

    public SaveSummaryControl getSaveSummaryControl() {
        return saveSummaryControl;
    }

    public CbTransactionSaveControl getCbTransactionSaveControl() {
        return cbTransactionSaveControl;
    }

    public ModelControl getModelControl() {
        return modelControl;
    }

}
