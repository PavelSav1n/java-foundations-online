package ru.itsjava.homeWork.oop.homeWork5;

public class Main {
    public static void main(String[] args) {

        // Допустим тут у нас оригинальные уличные коты:
        Cat murka = new Cat("Мурка", 2, "white", false);
        Cat gleb = new Cat("Глеб", 1, "grey", true);

        // Допустим, что на другой улице их называют по другому:
        Cat luna = new Cat("Луна", 2, "white", false);
        Cat martin = new Cat("Мартин", 1, "grey", true);

        // С точки зрения Java это будут два разных объекта с двумя разными ссылками на данные в куче:
        System.out.println("Объекты murka и luna: \n" + murka + " -- murka\n" + luna + " -- luna");
        System.out.println("murka и luna не равны, так же как и gleb и martin:");
        System.out.println("murka.equals(luna) = " + murka.equals(luna)); // false
        System.out.println("gleb.equals(martin) = " + gleb.equals(martin)); // false
        System.out.println("------------");

        // Если мы создадим ещё один объект с другим именем переменной в стеке, но теми же данными в куче, это будет по-прежнему отдельный объект
        // Если я правильно понял, поскольку метод System.out.println() использует метод toString(), который в свою очередь использует метод hashCode(),
        // который мы переопредилили в классе Cat, то наши объекты будут отображаться в консоле одинаково:
        Cat murka2 = new Cat("Мурка", 2, "white", false);
        System.out.println(murka + " -- murka original");
        System.out.println(murka2 + " -- murka2 with data equal to murka");
        System.out.println("murka.equals(murka2) = " + murka.equals(murka2)); // данные одинаковы -- true
        // Но как только мы поменяем имя нашего питомца murka2, мы увидим разницу:
        murka2.setNickname("Мурка2");
        System.out.println(murka2 + " -- murka2 with changed nickname to Мурка2");
        System.out.println("murka.equals(murka2) = " + murka.equals(murka2)); // данные разные -- false

        // Если мы присваиваем murka2 новый объект с теми же данными в куче, что и у murka, то прежние данные murka2 потеряют свой указатель и сборщик мусора удалит эти данные
        // А murka2 будет абсолютно новым объектом:
        murka2 = new Cat("Мурка", 2, "white", false);
        System.out.println(murka2 + " -- new murka2 with data equal to previous murka2");
        System.out.println("murka.equals(murka2) = " + murka.equals(murka2)); // данные одинаковы -- true
        System.out.println("------------");
        murka2.setNickname("МуркаДва");
        System.out.println(murka2 + " -- murka2 with changed nickname to МуркаДва");
        System.out.println("murka.equals(murka2) = " + murka.equals(murka2)); // данные разные -- false
        System.out.println("------------");

        // Однако можно создать копию ссылки на объект:
        Cat murka3 = murka;
        murka.setNickname("Murka");
        System.out.println(murka + " -- murka");
        System.out.println(murka3 + " -- murka3");
        // и тут при вызове метода equals объект будет сравнивать сам себя:
        System.out.println("murka.equals(murka3) = " + murka.equals(murka3));
        System.out.println("------------");

        Object obj = new Object();
        System.out.println("obj = " + obj);

        Object obj2 = new Object();
        System.out.println("obj2 = " + obj2);
    }
}
