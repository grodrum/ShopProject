package ua.javabegin.training.java2.employees;

public class Seller extends BaseEmployee {
    public Seller(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String sellingGoods() {
        return "Seller sells goods";
    }
}
