package ua.javabegin.training.java2.employees;

import ua.javabegin.training.java2.customer.BaseCustomer;

public class Consultant extends BaseEmployee {
    public Consultant(String name, int age, String sex, boolean workStatus) {
        super(name, age, sex, workStatus);
    }

    public void consulting(BaseCustomer person) {
        System.out.println(super.getName() + " is consulting " + person.getName());
    }
}
