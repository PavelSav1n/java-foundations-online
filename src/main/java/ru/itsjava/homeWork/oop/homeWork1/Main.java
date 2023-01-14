package ru.itsjava.homeWork.oop.homeWork1;

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
        Lion scar = new Lion("Шрам", "Трусливая шкура");


        simba.sayR();
        nala.sayR();
        mufasa.sayR();
        scar.sayR();
        System.out.println();


        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = console.next();
        System.out.print("Введите возраст: ");
        int inputAge = console.nextInt();
        System.out.println();

        Man pavel = new Man(inputName, inputAge);

        pavel.sayHello();
        System.out.println();

        // set & get methods of Man's class
        System.out.print("setName() method -- Введите имя: ");
        inputName = console.next();
        pavel.setName(inputName);
        System.out.print("setAge() method -- Введите возраст: ");
        inputAge = console.nextInt();
        pavel.setAge(inputAge);
        System.out.println();
        System.out.println("pavel.getName() = " + pavel.getName());
        pavel.sayHello();



    }


}
