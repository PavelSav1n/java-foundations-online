package ru.itsjava.experiments.question1;

public class SecondClass extends FirstClass{

    private String field3;
    private String field4;

    public SecondClass(String param1, String param2, String param3, String param4) {
        super(param1, param2);
        this.field3 = param3;
        this.field4 = param4;
    }
}
