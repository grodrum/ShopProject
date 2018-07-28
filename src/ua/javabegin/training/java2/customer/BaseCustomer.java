package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.interfaces.CustomerInterface;

public abstract class BaseCustomer implements CustomerInterface {
    private String name;
    private double moneyAmount;

    @Override
    public void giveMoney() {

    }

    @Override
    public void getGoods() {

    }

    @Override
    public Double getMoneyAmount() {
        return moneyAmount;
    }
}
