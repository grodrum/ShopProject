package ua.javabegin.training.java2.goods;

public class PC extends Computer {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
