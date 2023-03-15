package ru.itsjava.enums;

public class EnumPractice {

    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));


        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.print(season + " ");
        }
        System.out.println();

        Season season = Season.AUTUMN;
        switch (season){
            case AUTUMN:
                System.out.println("У нас осень");
                break;
            case SPRING:
                System.out.println("У нас весна");
                break;
            default:
                System.out.println("У нас не весна и не осень");
        }

        System.out.println(Coffee.AMERICANO);
        System.out.println(Coffee.AMERICANO.getCharacteristic());

    }
}