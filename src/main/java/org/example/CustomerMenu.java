package org.example;

import java.util.Scanner;

public class CustomerMenu {

    private final CustomerService customerService;
    private final Scanner scanner;

    public CustomerMenu(CustomerService customerService, Scanner scanner) {
        this.customerService = customerService;
        this.scanner = scanner;
    }

    public void createCustomer() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        try {
            Customer customer = new Customer(name, phone, email);
            customerService.addCustomer(customer);
            System.out.println("Customer created successfully.");
            System.out.println("Customer ID: " + customer.getId());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeCustomer() {
        System.out.print("Enter customer ID to remove: ");
        String id = scanner.nextLine();

        try {
            Customer removed = customerService.removeCustomer(id);
            System.out.println("Customer removed: " + removed.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
