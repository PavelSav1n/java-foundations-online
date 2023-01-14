package ru.itsjava.homeWork.oop.homeWork6;

public class OOPBirds {
    public static void main(String[] args) {
        Bird parrot1 = new Parrot("Male", false, 5);
        Bird parrot2 = new Parrot("Female", true, 49);
        Bird crow1 = new Crow("Female", false, 15);
        Bird crow2 = new Crow("Male", true, 19);
        Bird crow3 = new Crow("Male", true, 19);
        Bird randomBird = new Bird("JustABird",null);

        System.out.println("**********");
        System.out.println("Homework #6");
        System.out.println("**********");
        System.out.println("parrot1.toString() = " + parrot1);
        System.out.println("parrot2.hashCode() = " + parrot2.hashCode());
        System.out.println("crow1.getAge() = " + crow1.getAge());
        System.out.println("Setting crow1 age to 22");
        crow1.setAge(22);
        System.out.println("After setting crow1 age:");
        crow1.printInfo();
        System.out.println("randomBird.equals(crow2) = " + randomBird.equals(crow2));
        System.out.println("crow2.equals(crow3) = " + crow2.equals(crow3));


    }

}
