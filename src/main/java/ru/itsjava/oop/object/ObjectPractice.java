package ru.itsjava.oop.object;

public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2); // False
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2)); // False

        obj2 = obj1; //Уравниваем ссылки
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2)); // True

        Dog gurka = new Dog("Журка", 4);
        Dog gurka2 = new Dog("Журка", 4);
        Dog murka = new Dog("Мурка", 4);
        Dog gurka3 = new Dog(null,0);

        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
        System.out.println("gurka.equals(gurka) = " + gurka.equals(gurka));
        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka3));
        System.out.println("gurka.equals(gurka2) = " + gurka.equals(murka));

        System.out.println("gurka.toString() = " + gurka);


    }
}
