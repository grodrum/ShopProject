package ua.javabegin.training.java2.building;

public class SellingRoom extends BaseRoom {
    public String sellingRoomSpecs(String name, boolean automaticDoors, boolean guarded, boolean stands) {
        return "The " + name + " room is " + automaticDoors + ", " + guarded + ", " + stands + ".";
    }
}
