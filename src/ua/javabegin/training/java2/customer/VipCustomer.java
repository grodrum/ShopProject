package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.interfaces.GoodsInterface;

public class VipCustomer extends BaseCustomer {

    public VipCustomer(String name) {
        super(name);
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
