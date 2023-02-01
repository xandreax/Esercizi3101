package it.euris.academy2023.portfolio;

import it.euris.academy2023.portfolio.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class PortfolioSimulator {
    private List<Customer> customers;

    public PortfolioSimulator() {
        this.customers = new ArrayList<>();
    }

    public void add(Customer c){
        customers.add(c);
    }

    public void printXml(){
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
