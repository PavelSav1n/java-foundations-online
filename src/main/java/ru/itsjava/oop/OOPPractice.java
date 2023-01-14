package ru.itsjava.oop;

public class OOPPractice {
    public static void main(String[] args) {

        Telephone phone = new IPhone();

        System.out.println("phone.toString() = " + phone);

        Telephone phone2 = new IPhone();

        System.out.println("phone2.toString() = " + phone2);

        IPhone phone3 = new IPhone();
        System.out.println("phone3.toString() = " + phone3);

    }
}
