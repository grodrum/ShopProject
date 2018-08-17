package ua.javabegin.training.java2.goods;

import ua.javabegin.training.java2.department.BaseDepartment;
import ua.javabegin.training.java2.interfaces.DepartmentInterface;
import ua.javabegin.training.java2.interfaces.GoodsInterface;

public abstract class BaseGoods implements GoodsInterface {

    private double price;
    private boolean hasGarantee;
    private String name;
    private BaseDepartment department;
    private String company;

    public BaseGoods() {
    }

    public BaseGoods(double price, boolean hasGarantee, String name, BaseDepartment department, String company) {
        this.price = price;
        this.hasGarantee = hasGarantee;
        this.name = name;
        this.department = department;
        this.company = company;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }


    @Override
    public boolean hasGarentee() {
        return hasGarantee;
    }


}
