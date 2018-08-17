package ua.javabegin.training.java2.goods;

public class Computer extends ElectronicDevice {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
