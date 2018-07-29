package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.interfaces.CustomerInterface;

abstract class BaseCustomer implements CustomerInterface {
    private String name;
    private double moneyAmount;

    BaseCustomer(String name) {
        this.name = name;
    }
}
