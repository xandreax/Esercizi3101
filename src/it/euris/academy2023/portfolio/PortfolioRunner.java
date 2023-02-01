package it.euris.academy2023.portfolio;

import it.euris.academy2023.portfolio.entities.Account;
import it.euris.academy2023.portfolio.entities.Balance;
import it.euris.academy2023.portfolio.entities.Customer;
import it.euris.academy2023.portfolio.entities.FinancialInstrument;

public class PortfolioRunner {

    public static void main(String[] args) {

        FinancialInstrument f1 = new FinancialInstrument("1234", "strumento1", 45.6f, "Italy", "Euro", FinancialInstrument.FinancialInstrumentType.POL);
        FinancialInstrument f2 = new FinancialInstrument("1235", "strumento2", 345.6f, "Italy", "Euro", FinancialInstrument.FinancialInstrumentType.CC);
        Balance b1 = new Balance(f1, 10);
        Balance b2 = new Balance(f2, 20);
        Account ac = new Account("123", Account.BalanceType.DR );
        ac.addBalance(b1);
        ac.addBalance(b2);
        Customer c = new Customer("Mario", "Rossi", 1967, "MRORSS67E4GYT654");
        c.addAccount(ac);

        PortfolioSimulator portfolioSimulator = new PortfolioSimulator();
        portfolioSimulator.add(c);

        portfolioSimulator.printXml();
    }
}
