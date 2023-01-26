package ru.itsjava.interfaces;

public class BadGin implements Creatable{
    @Override
    public void createWish() {
        System.out.println("Никаких желаний, пока не сделаешь уроки!");
    }
}
