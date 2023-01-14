package ru.itsjava.homeWork.oop.homeWork4.rooms;


public class Bathroom extends Room {
    // Fields

    // Constructor
    public Bathroom(int width, int length, int height, int wattLimit) {
        super(width, length, height, false, wattLimit);
    }

    // Methods
    public void floorWarmingSwitch() {
        System.out.println("*This is Bathroom floor warming switch*");
    }

}
