package ua.javabegin.training.java2.employees;

import ua.javabegin.training.java2.interfaces.DepartmentInterface;
import ua.javabegin.training.java2.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {
    private String name;
    private int age;
    private String sex;
    private boolean workStatus;

    public BaseEmployee(String name, int age, String sex, boolean workStatus) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.workStatus = workStatus;
    }

    @Override
    public boolean isAtWork() {
        return this.workStatus;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return null;
    }
}
