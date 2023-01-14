package ru.itsjava.homeWork.oop.homeWork3;

public class HomeWork3 {

    public static void main(String[] args) {

        System.out.println("******************************************");
        System.out.println("Practice # 1 -- классы Person, Woman и Man");
        System.out.println("******************************************");
        Person ivan = new Man("Иван",33);
        Person emptyMan = new Man();
        Person boris = new Man("Борис",16);
        Man michael = new Man("Майкл",53);
        Person tamara = new Woman("Тамара",37);
        Woman emma = new Woman("Эмма",28);
        Person helga = new Woman("Хельга",19);

        System.out.println("ivan.getName() = " + ivan.getName());
        ivan.printAge();
        System.out.println("tamara.getName() = " + tamara.getName());
        tamara.printAge();
        System.out.println("michael.getName() = " + michael.getName());
        michael.printAge();
        System.out.println("emma.getName() = " + emma.getName());
        emma.printAge();

        System.out.println("**********************************");
        System.out.println("Practice # 2 -- массив типа Person");
        System.out.println("**********************************");

        Person[] array = new Person[]{ivan,emptyMan,boris,michael,tamara,emma,helga};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getName()+" ");
            array[i].printAge();
        }

        System.out.println("******************************");
        System.out.println("Practice # 3 -- Иерархия фигур");
        System.out.println("******************************");

        // Стороны фигур проверяются в getPerimeter и getArea на коррекность значений
        Figure triangle0 = new Triangle(-6,7,8);
        Triangle triangle1 = new Triangle(4,2,4);
        Figure rectangle0 = new Rectangle();
        Figure rectangle1 = new Rectangle(3, 5);
        Figure square0 = new Square(3);
        Square square1 = new Square(4);

        System.out.println("**********************************");
        System.out.println("-------------Perimeter------------");
        System.out.println("**********************************");
        System.out.println("triangle0: " + triangle0.getPerimeter());
        System.out.println("triangle1: " + triangle1.getPerimeter());
        System.out.println("rectangle0 = " + rectangle0.getPerimeter());
        System.out.println("rectangle1 = " + rectangle1.getPerimeter());
        System.out.println("square0 = " + square0.getPerimeter());
        System.out.println("square1 = " + square1.getPerimeter());

        System.out.println("**********************************");
        System.out.println("---------------Area---------------");
        System.out.println("**********************************");
        System.out.println("triangle0.getArea() = " + triangle0.getArea());
        System.out.println("triangle1.getArea() = " + triangle1.getArea());
        System.out.println("rectangle0.getArea() = " + rectangle0.getArea());
        System.out.println("rectangle1.getArea() = " + rectangle1.getArea());
        System.out.println("square0.getArea() = " + square0.getArea());
        System.out.println("square1.getArea() = " + square1.getArea());
    }
}
