package org.example;

import java.util.UUID;

public abstract class BankAccount {
    private String id;
    private double balance;
    private Customer customer;


    public BankAccount (double balance, Customer customer){
        this.id = UUID.randomUUID().toString();
        this.balance = balance;
        this.customer = customer;

    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);


    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

}
