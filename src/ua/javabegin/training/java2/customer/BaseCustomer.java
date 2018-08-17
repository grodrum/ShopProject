package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.interfaces.CustomerInterface;
import ua.javabegin.training.java2.interfaces.GoodsInterface;

public abstract class BaseCustomer implements CustomerInterface {
    private String name;
    private double moneyAmount;

    BaseCustomer(String name, double moneyAmount) {
        this.name = name;
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println("Customer buys " + goods.getName());
    }

    @Override
    public void returnGoods(GoodsInterface goods) {
        System.out.println("Customer returns " + goods);
    }

    @Override
    public String getName() {
        return name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }
}
