package ua.javabegin.training.java2.employees;

import ua.javabegin.training.java2.interfaces.DepartmentInterface;
import ua.javabegin.training.java2.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {

    @Override
    public boolean isAtWork() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return null;
    }
}
