package ua.javabegin.training.java2.building;

public class Bathroom extends BaseRoom {
    public Bathroom(String roomType, double height, double width, double length, double radius, double square, String myName, boolean hasAutomaticDrain) {
        super(roomType, height, width, length, radius, square);
        this.myName = myName;
        this.hasAutomaticDrain = hasAutomaticDrain;
    }

    private String myName;
    private boolean hasAutomaticDrain;

    public String automaticDrainUsing(boolean automaticDrain) {
        return "The bathroom uses automatic drain system";
    }

}
