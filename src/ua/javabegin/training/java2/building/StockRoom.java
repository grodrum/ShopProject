package ua.javabegin.training.java2.building;

public class StockRoom extends BaseRoom {
    public StockRoom(String roomType, double height, double width, double length, double radius, double square, String myName, boolean hasBackDoor) {
        super(roomType, height, width, length, radius, square);
        this.myName = myName;
        this.hasBackDoor = hasBackDoor;
    }

    private String myName;
    private boolean hasBackDoor;

    public String backDoorUsing(boolean backDoor) {
        return "Loads can be transported through back door";
    }
}
