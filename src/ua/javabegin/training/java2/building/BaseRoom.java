package ua.javabegin.training.java2.building;

import ua.javabegin.training.java2.interfaces.RoomInterface;

public abstract class BaseRoom implements RoomInterface {
    private double volume;
    private String roomType;
    private double height;
    private double width;
    private double length;
    private double radius;
    private double square;

    @Override
    public double getVolume() {
        switch (roomType) {
            case "rectangular":
                volume = height * width * length;
                break;
            case "squared":
                volume = width * width * height;
                break;
            case "cylindrical":
                volume = 3.14 * radius * radius;
                break;
            case "complex":
                volume = square * height;
                break;
            default:
                System.out.println("Unknown parameters for volume calculation");
                break;
        }
        return volume;
    }

}
