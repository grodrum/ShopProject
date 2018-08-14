package ua.javabegin.training.java2.building;

public class SellingRoom extends BaseRoom {
    public SellingRoom(String roomType, double height, double width, double length, double radius, double square) {
        super(roomType, height, width, length, radius, square);

    }

    public String sellingRoomSpecs(String name, boolean automaticDoors, boolean guarded, boolean stands) {
        return "The " + name + " room is " + automaticDoors + ", " + guarded + ", " + stands + ".";
    }
}
