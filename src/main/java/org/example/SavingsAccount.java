package org.example;

public class SavingsAccount extends BankAccount{
    private final double MINIMUMBALANCE = 500;

    public SavingsAccount(double balance, Customer customer) {
        super(balance, customer);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        double balanceAfter = getBalance() - amount;

        if (balanceAfter < MINIMUMBALANCE){
            System.out.println("Balance after withdrawal will be less than minimum balance");
            return;
        }
        setBalance(balanceAfter);
    }
}
