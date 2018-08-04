package ua.javabegin.training.java2.goods;

public class TV extends ElectronicDevice {
    private int chanals;

    public void selectChannel(boolean turn) {
        if (turn) {
            System.out.println("The channels could be changed");
        }
    }

    public int selectChannel(int chanals) {
        this.chanals = chanals;
        return chanals;
    }
}
