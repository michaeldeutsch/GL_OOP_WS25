package einheit_08.zt3;

import einheit_08.zt3.*;
import einheit_08.zt3.model.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FinanceOffice faWien = new FinanceOffice("Finanzamt Wien", "FA-UST-001");

        // Mitarbeiter + Niederlassung
        Employee e1 = faWien.hireEmployee("1001", "Anna Berger");
        Employee e2 = faWien.hireEmployee("1002", "Markus Huber");

        Branch branch1 = faWien.createBranch("Wien-Innere Stadt", e1);
        faWien.assignEmployeeToBranch(e2, branch1);

        // Unternehmen
        Company u1 = new SoleProprietorship("Deutsch Consulting", Industry.GEWERBE, "4000", "8000", true);
        Company u2 = new Partnership("Huber & Partner OG", Industry.HANDEL, "4010", "8010", 1, 2);
        Company u3 = new JuristicPerson("Industrie AG", Industry.INDUSTRIE, "4020", "8020", List.of("Eva König", "Paul Winter"));

        // Anmeldung beim Finanzamt
        faWien.addCompany(u1);
        faWien.addCompany(u2);
        faWien.addCompany(u3);

        System.out.println("Unternehmen beim " + faWien.getName() + ": " + faWien.getCompanies());

        // Umsatzsteuer-Voranmeldung Beispiele
        u1.submitVatPrepayment(new BigDecimal("10000"), new BigDecimal("2000")); // Zahllast
        u2.submitVatPrepayment(new BigDecimal("5000"), new BigDecimal("7000"));  // Gutschrift
        u3.submitVatPrepayment(new BigDecimal("0"), new BigDecimal("0"));        // 0

        System.out.println("Steuertopf (" + faWien.getTaxRevenueAccount().getNumber() + "): " + faWien.getTaxRevenueAccount().getBalance() + " EUR");

        // Entfernen
        boolean removed = faWien.removeCompany(u2);
        System.out.println("u2 entfernt? " + removed);
        System.out.println("Aktuelle Unternehmen: " + faWien.getCompanies());
    }
}
