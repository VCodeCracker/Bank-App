package org.example;

public class User {
    String firstName;
    String secondName;
    String password;
    double money;
    String currency;

    User(String firstName,String secondName, String password, double money, String currency) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.money = money;
        this.currency = currency;
    }
}
