package ru.itsjava.threads.lecture1;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        // Необходимо вывести символ А с задержкой в 2 сек:
        // Можно делать с помощью долгих циклов

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2_000_000_000L; j++) {
//            }
//            System.out.println("A");
//        }

        // можно с помощью .sleep() для текущего потока main:

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//        }

        // Но как их запустить одновременно?

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //   A   A   A   A    A
        //     B     B     B        B        B

        // Можно использовать независимые друг от друга потоки и вывести А и B одновременно:

        // Создаём экземпляр класса PrinterThread (наследник Thread)
        PrinterThread printerThreadA = new PrinterThread("A", 2000L);
        PrinterThread printerThreadС = new PrinterThread("С", 2000L);

        // Создаём экземпляр класса PrinterRunnable (реализует интерфейс Runnable), который должен быть выполнен потоком
        PrinterRunnable printerRunnableB = new PrinterRunnable("B", 3000L);
        // Создаём отдельный поток и указываем наш класс, который должен быть выполнен потоком:
        Thread threadB = new Thread(printerRunnableB);

        // Creating loop thread, which we will try to interrupt without throwing exception. InterruptedException is thrown when thread is in sleep mode.
        LoopRunnable loopRunnable = new LoopRunnable();
        Thread threadLoopRunnable = new Thread(loopRunnable);

        // sout, который будет выполнен первым в связи с тем, что main -- первый поток, который выполняется в программе:
        System.out.println("start");

        // Выполняем поток А
        printerThreadA.start();
        // Выполняем поток B
        threadB.start();


        // Приостанавливаем поток main до выполнения потока B
        threadB.join();

        // Выполняем поток С вместе с loopRunnable.
        printerThreadС.start();
        threadLoopRunnable.start();

        // Waiting for printerThreadC to finish. loopRunnable is still executing.
        printerThreadС.join();

        System.out.println("threadLoopRunnable.isInterrupted() = " + threadLoopRunnable.isInterrupted());
        threadLoopRunnable.interrupt(); // Trying to interrupt
        System.out.println("threadLoopRunnable.isInterrupted() = " + threadLoopRunnable.isInterrupted());
        // Продолжаем выполнения main, выводим sout из main:
        System.out.println("end");

    }
}
