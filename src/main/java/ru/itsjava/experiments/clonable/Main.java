package ru.itsjava.experiments.clonable;

/*
    Cloneable -- интерфейс маркер. При имплементации этого интерфейса необходимо
    переопределить метод clone() класса Object. Если в классе поля состоят только
    из примитивных данных или типа string (синглтоны), то достаточно вернуть приведённый
    к данному класс результат (КопируемыйКласс) super.clone()
*/

public class Main {
    public static void main(String args[])
            throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t2 = (Test2) t1.clone();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);

        t2.a = 100;
        // Change in primitive type of t2 will not
        // be reflected in t1 field

        t2.c.x = 300;
        // Change in object type field of t2 will not
        // be reflected in t1(deep copy)

        System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);

        t2.c.string = "changedString"; // will not be reflected if DEEP COPY

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
    }
}