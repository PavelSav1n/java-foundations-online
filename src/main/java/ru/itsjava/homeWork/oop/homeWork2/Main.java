package ru.itsjava.homeWork.oop.homeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Объект:
        //тип ссылки   имя   присвоить   выделяем память   и вызываем конструктор
        //    Lion    simba   =                 new               Lion();

        Lion simba = new Lion();

        String name = "Нала";
        String surname = "Симбовна";

        Lion nala = new Lion(name, surname);

        Lion mufasa = new Lion("Муфаса", "Грозный Рык");
        Lion scar = new Lion("Шрам", "Трусливая Шкура");


        simba.sayR();
        nala.sayR();
        mufasa.sayR();
        scar.sayR();
        System.out.println();


        Scanner console = new Scanner(System.in);

        String inputName = "Pavel";
        int inputAge = 34;
        System.out.println();

        Man pavel = new Man(inputName, inputAge);

        pavel.sayHello();
        System.out.println();

        // set & get methods of Man's class
        System.out.println();
        System.out.println("***********************************************");
        System.out.println("Practice # 1 -- get & set methods for Man class");
        System.out.println("***********************************************");
        System.out.print("setName() method -- Введите имя: ");
        inputName = console.next();
        pavel.setName(inputName);
        System.out.print("setAge() method -- Введите возраст: ");
        inputAge = console.nextInt();
        pavel.setAge(inputAge);
        System.out.println();
        System.out.println("pavel.getName() = " + pavel.getName());
        pavel.sayHello();



        // Iron Class
        System.out.println();
        System.out.println("************************************");
        System.out.println("Practice # 2 -- Iron Class Practice:");
        System.out.println("************************************");

        // Конструктор с без аргументов
        Iron iron0 = new Iron();
        // Конструктор с 1 аргументом
        Iron iron1 = new Iron("Rowenta DW2459");
        //Конструктор с 2 аргументами
        Iron iron2 = new Iron(600, 1500.00);
        //Конструктор с 3 аргументами
        Iron iron3 = new Iron("Panasonic NI-WL600", 600, 1500.00);


        System.out.println("Конструктор с без аргументов - iron0 = " + iron0.getName() + " Power: " + iron0.getWatt() + "W with a price only $" + iron0.getPrice());
        System.out.println("Конструктор с 1 аргументом - iron1 = " + iron1.getName() + " Power: " + iron1.getWatt() + " W with a price only $" + iron1.getPrice());
        System.out.println("Конструктор с 2 аргументами - iron2 = " + iron2.getName() + " Power: " + iron2.getWatt() + " W with a price only $" + iron2.getPrice());
        System.out.println("Конструктор с 3 аргументами - iron3 = " + iron3.getName() + " Power: " + iron3.getWatt() + " W with a price only $" + iron3.getPrice());


        iron0.setName("BLACK+DECKER D3030");
        iron0.setWatt(2000);
        iron0.setPrice(3599.99);

        System.out.println("After setParams:");
        System.out.println("iron0 = " + iron0.getName() + " Power: " + iron0.getWatt() + "W with a price only " + iron0.getPrice() + "$");

        // Custom Class -- Computer
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Practice # 3 -- Custom Class Computer");
        System.out.println("*************************************");
        // Конструктор с тремя аргументами
        Computer officeComputer = new Computer("DELL", "Desktop", 10000);
        // Конструктор с двумя аргументами
        Computer designerLaptop = new Computer("Apple Mac", 2399);
        // Конструктор без аргументов
        Computer homeComputer = new Computer();

        System.out.println("Конструктор с тремя аргументами officeComputer:");
        officeComputer.about();
        System.out.println("Конструктор с двумя аргументами designerLaptop:");
        designerLaptop.about();
        System.out.println("Конструктор без аргументов homeComputer:");
        homeComputer.about();

        homeComputer.setName("Sony");
        homeComputer.setType("Desktop");
        homeComputer.setPrice(5000);

        System.out.println("After set method:");
        System.out.println("homeComputer name: " + homeComputer.getName() + "\nType: " + homeComputer.getType() + "\nPrice: $" + homeComputer.getPrice());

        // Задание из следующего урока, не обращайте внимание
//        simba.sayMeow();
//
//        Cat bagira = new Panther();
//
//        bagira.sayMeow();
    }


}
