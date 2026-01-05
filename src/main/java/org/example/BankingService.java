package org.example;

import java.util.HashMap;
import java.util.Map;

public class BankingService {

    private Map<String, BankAccount> accounts = new HashMap<>();

    //get userby id
    //deposit (amount, bankaccount)
    // withdraw (amount, bankaccount)
    //remove account

    public BankAccount createAccount(double initialDeposit, Customer customer){
        BankAccount account = new SavingsAccount(initialDeposit, customer);
        accounts.put(account.getId(), account);
        return account;
    }

    public void removeAccount(String id){

    }

}
