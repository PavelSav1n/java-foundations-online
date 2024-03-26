package ru.itsjava.experiments.modificators.package2;

import ru.itsjava.experiments.modificators.package1.ModificatorTest;

public class ModificatorTestChild extends ModificatorTest {

    public void print(){
        ModificatorTest mt = new ModificatorTest();
        System.out.println("mt.publicField = " + mt.publicField);
    }
}
