package org.example;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    //add customer
    // remove customer
    private final Map<String, Customer> customers = new HashMap<>();

    public Customer addCustomer(Customer customer) {
        if (customers.containsKey(customer.getId())) {
            System.out.println("Customer already exists: " + customer.getId());
        }
        customers.put(customer.getId(), customer);
        return customer;
    }

    public Customer removeCustomer(String customerId) {
        Customer removed = customers.remove(customerId);
        if (removed == null) {
            System.out.println("Customer not found: " + customerId);
        }
        return removed;
    }

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerById(String customerId) {
        Customer customer = customers.get(customerId);
        if (customer == null) {
            throw new IllegalArgumentException("Customer not found.");
        }
        return customer;
    }

}
