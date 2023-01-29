package ru.itsjava.homeWork.interfaces.homeWork11;

public interface Talkable {

    default void talk(){
        System.out.println("DEFAULT method in interface: *there is some talking is going on*");
    }
}
