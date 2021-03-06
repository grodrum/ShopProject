package ua.javabegin.training.java2.customer;

import ua.javabegin.training.java2.goods.BaseGoods;
import ua.javabegin.training.java2.interfaces.GoodsInterface;

public class CommonCustomer extends BaseCustomer {

    public CommonCustomer(String name, double moneyAmount) {
        super(name, moneyAmount);
    }

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println(super.getName() + " buys " + ((BaseGoods) goods).getName());

    }

    @Override
    public void returnGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return super.getName();
    }
}
