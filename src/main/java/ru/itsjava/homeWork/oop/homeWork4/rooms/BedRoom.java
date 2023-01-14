package ru.itsjava.homeWork.oop.homeWork4.rooms;

public class BedRoom extends Room {
    // Fields


    // Constructor
    public BedRoom(int width, int length, int height, int wattLimit) {
        super(width, length, height, true, wattLimit);
    }

    // Methods
    @Override
    public void lightSwitch() {
        System.out.println("*This is smooth Bedroom light switch*");
    }
}
