package ua.javabegin.training.java2.employees;

public class Loader extends BaseEmployee {
    public Loader(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String movingGoods() {
        return "Worker moves goods";
    }
}
