package org.example;

import java.util.Scanner;

public class BankingMenu {

    private final BankingService bankingService;
    private final Scanner scanner;

    public BankingMenu(BankingService bankingService, Scanner scanner) {
        this.bankingService = bankingService;
        this.scanner = scanner;
    }

    public void createAccount() {
        System.out.print("Enter customer ID: ");
        double customerId = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter initial deposit: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine();

        try {
            BankAccount account =
                    bankingService.createAccount();

            System.out.println("Account created successfully.");
            System.out.println("Account ID: " + account.getId());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public void removeAccount() {
        System.out.print("Enter account ID to remove: ");
        String accountId = scanner.nextLine();

        try {
            bankingService.removeAccount(accountId);
            System.out.println("Account removed successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
