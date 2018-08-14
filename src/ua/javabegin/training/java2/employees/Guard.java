package ua.javabegin.training.java2.employees;

public class Guard extends BaseEmployee {
    public Guard(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String guardStore() {
        return "Guard guards store of robbers";
    }
}
