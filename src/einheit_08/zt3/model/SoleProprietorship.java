package einheit_08.zt3.model;

import java.util.Objects;

/**
 * Einzelunternehmen. Darf nicht weiter vererbt werden.
 */
public final class SoleProprietorship extends Company {
    private final boolean inputTaxDeductible;

    public SoleProprietorship(String name,
                              Industry industry,
                              String expenseAccountNo,
                              String revenueAccountNo,
                              boolean inputTaxDeductible) {
        super(CompanyForm.E, name, industry, expenseAccountNo, revenueAccountNo);
        this.inputTaxDeductible = inputTaxDeductible;
    }

    public boolean isInputTaxDeductible() {
        return inputTaxDeductible;
    }
}
