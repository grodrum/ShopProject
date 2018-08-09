package ua.javabegin.training.java2.building;

public class StockRoom extends BaseRoom {
    private String myName;
    private boolean hasBackDoor;

    public String backDoorUsing(boolean backDoor) {
        return "Loads can be transported through back door";
    }
}
