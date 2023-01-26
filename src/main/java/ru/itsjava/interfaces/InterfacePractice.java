package ru.itsjava.interfaces;

public class InterfacePractice {
    public static void main(String[] args) {
        Creatable khottabych = new Gin();
        khottabych.createWish();
        Creatable badGin = new BadGin();
        badGin.createWish();
    }
}
