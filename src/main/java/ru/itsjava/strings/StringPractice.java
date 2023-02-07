package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {

        // Создаём один объект в String Pool и указываем на него двумя ссылками:
        String name = "Pavel";
        String copyName = "Pavel";

        // Ссылаются на один и тот же объект в куче:
        System.out.println("(name == copyName) = " + (name == copyName));

        // Создаём новый объект в куче за пределами String Pool:
        String constructorName = new String("Pavel");

        // И видим, что переменные ссылаются на разные объекты:
        System.out.println("(constructorName == name) = " + (constructorName == name));

        // Перемещаем эту строку в String Pool
        // На самом деле тут происходит не перемещение, а перезапись ссылки. В String Pool уже есть объект "Pavel"
        String internConstructorName = constructorName.intern();
        // "Pavel" вне String Pool по-прежнему существует:
        System.out.println("(internConstructorName == name) = " + (internConstructorName == name));

        /* ----------------------- */

        String str = "Я строка";

        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.equals(\"Я строкА\") = " + str.equals("Я строкА"));
        System.out.println("str.equalsIgnoreCase(\"Я строкА\") = " + str.equalsIgnoreCase("Я строкА"));

        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);

//        Будет выполняться очень долго, потому что создаём миллион объектов
//        for (int i = 0; i < 1_000_000; i++) {
//            str = str + "!";
//
//        }

        StringBuilder builderStr = new StringBuilder(str);
        for (int i = 0; i < 1_000_000; i++) {
            builderStr.append('!');
        }

    }
}
