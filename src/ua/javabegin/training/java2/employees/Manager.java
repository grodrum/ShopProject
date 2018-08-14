package ua.javabegin.training.java2.employees;

public class Manager extends BaseEmployee {
    public Manager(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public String managePeople() {
        return "Manager manages people";
    }
}
