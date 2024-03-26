package ru.itsjava.experiments.modificators.package2;

import ru.itsjava.experiments.modificators.package1.ModificatorTest;

public class Main {
    public static void main(String[] args) {
        ModificatorTest mt = new ModificatorTest();
        System.out.println("mt.publicField = " + mt.publicField);

        ModificatorTestChild mtc = new ModificatorTestChild();
        System.out.println("mtc.publicField = " + mtc.publicField);
    }
}
