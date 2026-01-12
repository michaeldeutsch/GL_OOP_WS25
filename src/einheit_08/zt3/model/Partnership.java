package einheit_08.zt3.model;

/**
 * Personengesellschaft.
 */
public final class Partnership extends Company {
    private final int generalPartners;   // Komplementäre
    private final int limitedPartners;   // Kommanditisten

    public Partnership(String name,
                       Industry industry,
                       String expenseAccountNo,
                       String revenueAccountNo,
                       int generalPartners,
                       int limitedPartners) {
        super(CompanyForm.P, name, industry, expenseAccountNo, revenueAccountNo);

        if (generalPartners < 0) throw new IllegalArgumentException("Komplementäre darf nicht negativ sein.");
        if (limitedPartners < 0) throw new IllegalArgumentException("Kommanditisten darf nicht negativ sein.");
        if (generalPartners == 0 && limitedPartners == 0)
            throw new IllegalArgumentException("Mindestens eine Gruppe (Komplementäre oder Kommanditisten) muss vorhanden sein.");

        this.generalPartners = generalPartners;
        this.limitedPartners = limitedPartners;
    }

    public int getGeneralPartners() { return generalPartners; }
    public int getLimitedPartners() { return limitedPartners; }
}
