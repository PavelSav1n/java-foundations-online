package ru.itsjava.singletons;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SingletonClass {

    private static SingletonClass INSTANCE;
    private String info = "This is a singleton"; // Not final, because we want to change it to show, it will change in all instances.
    private static int count; // will be always 1 after calling getInstance method

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
            System.out.println("++count = " + ++count); // we will be here only once, because INSTANCE would not be null after first call
        }
        return INSTANCE;
    }
}
