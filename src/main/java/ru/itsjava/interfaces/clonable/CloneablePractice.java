package ru.itsjava.interfaces.clonable;

public class CloneablePractice {
    public static void main(String[] args) {
        Girl dasha = new Girl("Dasha", 160);

        Girl dasha2 = dasha.clone();

        System.out.println("dasha = " + dasha);
        System.out.println("dasha2 = " + dasha2);

    }
}
