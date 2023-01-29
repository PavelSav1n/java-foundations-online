package ru.itsjava.interfaces;

public class test {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            //?
            @Override
            public void say() {
                System.out.println("i am animal");
            }
        };
    }

    public interface Animal {
        void say();
    }
}

