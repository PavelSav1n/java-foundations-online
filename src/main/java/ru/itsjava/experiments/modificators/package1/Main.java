package ru.itsjava.experiments.modificators.package1;

import ru.itsjava.experiments.modificators.package2.ModificatorTestChild;

public class Main {
    public static void main(String[] args) {
        ModificatorTest mt = new ModificatorTest();


        // ModificatorTest contains 4 types of variables
        // Only to 3 of them we have access:
        System.out.println("mt.defaultField = " + mt.defaultField);
        System.out.println("mt.protectedField = " + mt.protectedField);
        System.out.println("mt.publicField = " + mt.publicField);


        // ModificatorTestChild has only 2 types (public and protected)
        // Default is not accessible:
        ModificatorTestChild mtc = new ModificatorTestChild();
        System.out.println("mtc.publicField = " + mtc.publicField);
        System.out.println("mtc.protectedField = " + mtc.protectedField);
    }
}
