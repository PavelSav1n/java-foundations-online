package ru.itsjava.oop.inheritance;

// Так нельзя, т.к. множественного наследования в классах нет.
// public class Child extends Father, Mother{
public class Child extends Father{

}

// Можно сделать Mother интерфейсом и тогда:
// public class Child extends Father implements Mother{
// и Child возьмёт реализацию giveLove() от класса Father
//
// }
// Так же можно сделать Father & Mother интерфейсами и тогда:
// public class Child implements Mother, Father{
// но тут потребуется переопределить giveLove():
//  @Override
//  public void giveLove() {
//      System.out.println("Child loves you");
//  }
//
// }
