package ua.javabegin.training.java2.interfaces;

public interface CustomerInterface {
    void buy(GoodsInterface goods);

    void returnGoods(GoodsInterface goods);

    String getName();
}
