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

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return null;
    }


    @Override
    public boolean hasGarentee() {
        return false;
    }


}
