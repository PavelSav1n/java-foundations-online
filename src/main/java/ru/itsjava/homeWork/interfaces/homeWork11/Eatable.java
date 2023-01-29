package ru.itsjava.homeWork.interfaces.homeWork11;

public interface Eatable {

    default void eat(){
        System.out.println("DEFAULT method in interface: You can eat that");
    }
}
