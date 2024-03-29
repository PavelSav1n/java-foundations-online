package ru.itsjava.singletons;

public class Main {
    public static void main(String[] args) {

        //ClassSingleton
        // First instantiation:
        SingletonClass singletonInstance = SingletonClass.getInstance();
        System.out.println("singletonInstance = " + singletonInstance);
        System.out.println("singletonInstance.getInfo() = " + singletonInstance.getInfo());

        // getInstance will return the same instance as the first call.
        SingletonClass singletonInstance2 = SingletonClass.getInstance();
        System.out.println("singletonInstance2 = " + singletonInstance2);
        System.out.println("singletonInstance2.getInfo() = " + singletonInstance2.getInfo());

        // We set new info, and it will be changed in both:
        singletonInstance2.setInfo("New info class");
        System.out.println("singletonInstance.getInfo() = " + singletonInstance.getInfo());
        System.out.println("singletonInstance2.getInfo() = " + singletonInstance2.getInfo());

        // Won't work because of private constructor:
//        SingletonClass singletonClass3 = new SingletonClass();


        // EnumSingleton
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE.getInstance();
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE.getInstance();

        // We set new info, and it will be changed in both:
        singletonEnum1.setInfo("New info enum");

        System.out.println("singletonEnum1.getInfo() = " + singletonEnum1.getInfo());
        System.out.println("singletonEnum2.getInfo() = " + singletonEnum2.getInfo());


    }
}
