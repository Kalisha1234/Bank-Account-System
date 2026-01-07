//package org.example;
//
//import java.util.Scanner;
//public class Main {
//    private static Customer customer;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int choice;
//
//        CustomerService customerService = new CustomerService();
//        CustomerMenu customerMenu = new CustomerMenu(customerService, sc);
//        BankingService bankingService = new BankingService(customerService);
//        BankingMenu bankingMenu = new BankingMenu(bankingService, sc);
//
//
//        do {
//            System.out.println("Bank Account System");
//            System.out.println("1. Create Customer");
//            System.out.println("2. Remove Customer");
//            System.out.println("3. Create Account");
//            System.out.println("4. Remove Account");
//            System.out.println("5. Deposit");
//            System.out.println("6. Withdraw");
//
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch (choice) {
//
//                case 1 -> customerMenu.createCustomer();
//                case 2 -> customerMenu.removeCustomer();
//                case 3 -> bankingService.createAccount();
//                //case 4 -> removeAccount();
//                //case 5 -> deposit();
//                //case 6 -> withdraw();
//                default -> System.out.println("Invalid choice. Try again.");
//            }
//        }
//        while (choice != 0);
//
//        sc.close();
//
//    }
//
//}

package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerService customerService = new CustomerService();
        BankingService bankingService = new BankingService(customerService);

        CustomerMenu customerMenu = new CustomerMenu(customerService, sc);
        BankingMenu bankingMenu = new BankingMenu(bankingService, sc);

        int choice;

        do {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. Create Account");
            System.out.println("4. Remove account");
            System.out.println("0. Exit");
            System.out.print("Select an option and press ENTER: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    customerMenu.createCustomer();
                    waitForEnter(sc);
                }
                case 2 -> {
                    customerMenu.removeCustomer();
                    waitForEnter(sc);
                }
                case 3 -> {bankingMenu.createAccount();
                    waitForEnter(sc);
                }
                case 4 -> {
                    bankingMenu.removeAccount();
                    waitForEnter(sc);
                }

                case 0 -> System.out.println("Goodbye!");
                default -> {
                    System.out.println("Invalid option.");
                    waitForEnter(sc);
                }
            }

        } while (choice != 0);

        sc.close();
    }

    private static void waitForEnter(Scanner sc) {
        System.out.println("\nPress ENTER to continue...");
        sc.nextLine();
    }
}
