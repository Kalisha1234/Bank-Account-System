package org.example;

public class CheckingAccount extends BankAccount {
    private final double OVERDRAFTLIMIT = 1000;

    public CheckingAccount(double balance, Customer customer) {
        super(balance, customer);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);

    }

    @Override
    public void withdraw(double amount) {
       double balanceAfter = getBalance() - amount;

       if(balanceAfter < -OVERDRAFTLIMIT){
           System.out.println("Over draft limit will be exceeded after withdrawal");
           return;
       }
       setBalance(balanceAfter);
    }


}
