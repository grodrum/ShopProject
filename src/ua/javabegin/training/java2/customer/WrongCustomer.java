package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.interfaces.GoodsInterface;

public class WrongCustomer extends BaseCustomer {

    public WrongCustomer(String name, double moneyAmount) {
        super(name, moneyAmount);
    }

    @Override
    public void buy(GoodsInterface goods) {

    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return null;
    }
}
