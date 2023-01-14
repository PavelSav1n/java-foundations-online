package ru.itsjava.homeWork.oop.homeWork4.rooms;

public class OOPRoom {
    public static void main(String[] args) {

        // Для того, чтобы использовать методы, определённые только в подклассе нужно использовать "тип ссылки" этого подкласса
        // Ванная имеет тип ссылки Bathroom, чтобы вызвать метод подогрев полов, который реализован только в ванной.
        Bathroom bathroom = new Bathroom(5, 5, 3, 2000);
        Room bedRoom = new BedRoom(3, 15, 3, 3000);
        // Кухня имеет тип ссылки Kitchen, чтобы вызвать метод переключателя вытяжки, который реализован только в кухне.
        Kitchen kitchen = new Kitchen(4, 15, 3, 10000);
        Room livingRoom = new LivingRoom(5, 15, 3, 5000);

        bathroom.info();
        bedRoom.info();
        kitchen.info();
        livingRoom.info();

        System.out.println();
        System.out.print("Метод bathroom.floorWarmingSwitch() определён только в подклассе Bathroom: ");
        bathroom.floorWarmingSwitch();
        System.out.print("Метод bathroom.lightSwitch() определён в суперклассе Room: ");
        bathroom.lightSwitch();
        System.out.print("Метод bedRoom.lightSwitch() переопределён в подклассе BedRoom: ");
        bedRoom.lightSwitch();
        System.out.print("Метод kitchen.hoodSwitch() определён только в подклассе Kitchen: ");
        kitchen.hoodSwitch();

        System.out.println();
        System.out.println("Изменяем максимальное потребление электричества в Кухне");
        kitchen.setWattLimit(11000);
        kitchen.info();

    }
}
