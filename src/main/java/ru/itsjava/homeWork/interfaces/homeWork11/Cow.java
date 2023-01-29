package ru.itsjava.homeWork.interfaces.homeWork11;

public class Cow implements Talkable, Eatable {
    @Override
    public void eat() {
        System.out.println("Cow is suitable to be eaten");
    }

    @Override
    public void talk() {
        System.out.println("Mooo!");
    }
}
