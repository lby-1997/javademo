package com.lemon.java.day09.aiguigu2;

public class Customer {
    private String firstName;
    private String lastName;
    private Acount account;
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Acount getAccount() {
        return account;
    }

    public void setAccount(Acount account) {
        this.account = account;
    }
}
