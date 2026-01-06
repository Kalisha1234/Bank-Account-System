package org.example;

import java.util.Scanner;
public class Main {
    private static Customer customer;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        CustomerService customerService = new CustomerService();
        BankingService bankingService = new BankingService();
        do {
            System.out.println("Bank Account System");
            System.out.println("1. Create Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Create Account");
            System.out.println("4. Remove Account");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                //case 1 -> createCustomer();
                //case 2 -> removeCustomer();
                //case 3 -> bankingService.createAccount(700, customer);
                //case 4 -> removeAccount();
                //case 5 -> deposit();
                //case 6 -> withdraw();
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        while (choice != 0);

        sc.close();

    }

}