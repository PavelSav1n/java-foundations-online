package ru.itsjava.homeWork.oop.homeWork4.rooms;

public class Room {
    // Fields
    private final int width;
    private final int length;
    private final int height;
    private final boolean isLiving;
    private int wattLimit;

    // Constructor
    public Room(int width, int length, int height, boolean isLiving, int wattLimit) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.isLiving = isLiving;
        this.wattLimit = wattLimit;
    }

    // Methods
    public void info() {
        System.out.println("Dimensions (W/L/H):" + width + "x" + length + "x" + height + "  |  Is living:" + isLiving + "  |  Watt Limit:" + wattLimit + "W");
    }

    public void lightSwitch() {
        System.out.println("*This is default room light switch*");
    }

    public void setWattLimit(int wattLimit) {
        this.wattLimit = wattLimit;
    }

}
