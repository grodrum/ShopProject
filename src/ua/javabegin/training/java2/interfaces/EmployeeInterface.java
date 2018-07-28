package ua.javabegin.training.java2.interfaces;

public interface EmployeeInterface {
    boolean isAtWork();

    String getName();

    int getAge();

    String getSex();

    DepartmentInterface getDepartment();
}
