package ua.javabegin.training.java2.employees;

public class Director extends BaseEmployee {
    public Director(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String manageStore() {
        return "Director manages the whole store";
    }
}
