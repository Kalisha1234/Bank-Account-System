package org.example;

import java.util.HashMap;
import java.util.Map;


public class BankingService {

    private Map<String, BankAccount> accounts = new HashMap<>();
    private final CustomerService customerService;

    //get userby id
    //deposit (amount, bankaccount)
    // withdraw (amount, bankaccount)
    //remove account
    //instead of initializing the constructor
    public BankingService(CustomerService customerService) {
        this.customerService = customerService;
    }

//    public BankAccount createAccount(double initialDeposit, double customer){
//        BankAccount account = new SavingsAccount(initialDeposit, customer);
//        accounts.put(account.getId(), account);
//        return account;


//    }

    public void removeAccount(String accountId) {
        if (accounts.remove(accountId) == null) {
            throw new IllegalArgumentException("Account not found.");
        }
    }

    public BankAccount createAccount() {
        return null;
    }


}
