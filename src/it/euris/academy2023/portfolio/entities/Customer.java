package it.euris.academy2023.portfolio.entities;

import it.euris.academy2023.portfolio.XmlRow;
import it.euris.academy2023.portfolio.XmlTag;

import java.util.*;

public class Customer {
    private final static String TAG_CUSTOMER = "customer";
    private final static String TAG_ACCOUNTS = "accounts";
    private final String name;
    private final String surname;
    private final int yearBirth;
    private final String taxCode;
    private final List<Account> accounts;

    public Customer(String name, String surname, int yearBirth, String taxCode) {
        this.name = name;
        this.surname = surname;
        this.yearBirth = yearBirth;
        this.taxCode = taxCode;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        String s = "";
        s += new XmlRow(TAG_CUSTOMER, mapCustomerValues()).render();
        s += new XmlTag(TAG_ACCOUNTS, false);
        for (Account ac : accounts) {
            s += ac;
        }
        s += new XmlTag(TAG_ACCOUNTS, true);
        s += new XmlTag(TAG_CUSTOMER, true);
        return s;
    }

    private Map<String, Object> mapCustomerValues() {
        Map<String, Object> parametersMap = new LinkedHashMap<>();
        parametersMap.put("name", name);
        parametersMap.put("surname", surname);
        parametersMap.put("year_birth", yearBirth);
        parametersMap.put("tax_code", taxCode);
        return parametersMap;
    }
}
