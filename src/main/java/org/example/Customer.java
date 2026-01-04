package org.example;

import java.util.UUID;

public class Customer {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

        public Customer(String name, String phoneNumber, String email) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.email = email;
        }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
