package ru.itsjava.homeWork.oop.homeWork4.birds;

public class Bird {

    // Поля
    private final String type;
    private final String gender;
    private boolean isDomestic;
    private int age;

    //Конструктор
    public Bird(String type) {
        this.type = type;
        this.gender = "unknown";

    }
//    public Bird(){
//
//    }

    public Bird(String type, String gender, boolean isDomestic, int age) {
        this.type = type;
        this.gender = gender;
        this.isDomestic = isDomestic;
        this.age = age;
    }

    // Методы
    public void setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.print("Type:" + type + " | Gender:" + gender + " | ");
        if (isDomestic) {
            System.out.print("Domestic");
        } else {
            System.out.print("Wild");
        }
        System.out.print(" | Age:" + age);
        System.out.println();
    }

    public void squawk() {
        System.out.println(type + " *squawking*");
    }

}
