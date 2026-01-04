package org.example;

import java.util.HashMap;
import java.util.Map;

public class BankingService {
    private int userID;
    private String name;
    private String number;
    private String email;
    private String address;

    private Map<String, BankAccount> accounts = new HashMap<>();


    //get userby id
    //deposit (amount, bankaccount)
    // withdraw (amount, bankaccount)
    //remove account

    public BankAccount createAccount(double initialBalance, Customer customer){
        BankAccount account = new SavingsAccount(initialBalance, customer);
        accounts.put(account.getId(), account);
        return account;
    }

}
