package ua.javabegin.training.java2.building;

import ua.javabegin.training.java2.interfaces.RoomInterface;

public abstract class BaseRoom implements RoomInterface {
    private double volume;
    private String[] roomType;
    private double height;
    private double width;
    private double length;
    private double radius;
    private double square;

    @Override
    public double getVolume(double height, double width, double length) {
        return height * width * length;
    }

    @Override
    public double getVolume(double height, double square) {
        return square * height;
    }

    @Override
    public double getVolume(double radius) {
        return 3.14 * radius * radius;
    }
}
