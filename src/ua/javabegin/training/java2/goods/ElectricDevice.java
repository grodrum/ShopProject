package ua.javabegin.training.java2.goods;

public class ElectricDevice extends BaseGoods {
    private String company;

    private boolean hasSwitch;
    @Override
    public String getCompany() {
        return this.company;
    }

}
