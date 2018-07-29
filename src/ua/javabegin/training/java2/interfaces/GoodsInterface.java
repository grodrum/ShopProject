package ua.javabegin.training.java2.interfaces;

public interface GoodsInterface {
    String getName();

    double getPrice();

    DepartmentInterface getDepartment();

    String getCompany();

    boolean hasGarentee();
}