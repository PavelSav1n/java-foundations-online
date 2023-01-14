package ru.itsjava.homeWork.individuals;

public class TestValueOf {
    public static void main(String[] args) {
        Integer valueFromPool1 = 127;    // произойдет вызов: Integer.valueOf(127);
        Integer valueFromPool2 = 127;    // произойдет вызов: Integer.valueOf(127);
        Integer valueNotFromPool1 = 128; // произойдет вызов: Integer.valueOf(128);
        Integer valueNotFromPool2 = 128; // произойдет вызов: Integer.valueOf(128);

        String string = "String";

        System.out.println(valueFromPool1 == valueFromPool2);       // true
        System.out.println(valueNotFromPool1 == valueNotFromPool2); // false

        System.out.println(127 == valueFromPool1);              // true  (произойдет вызов: valueFromPool1.intValue();)
        System.out.println(128 == valueNotFromPool1);           // true  (произойдет вызов: valueNotFromPool1.intValue();)
        System.out.println((Integer) 127 == valueFromPool1);    // true  (произойдет вызов: Integer.valueOf(127);)
        System.out.println((Integer) 128 == valueNotFromPool1); // false (произойдет вызов: Integer.valueOf(128);)
        System.out.println();
        System.out.println(string.equals(valueFromPool1));
        System.out.println();
        System.out.println(valueFromPool1.equals(valueFromPool2));
        System.out.println(valueNotFromPool1.equals(valueNotFromPool2));
    }
}
