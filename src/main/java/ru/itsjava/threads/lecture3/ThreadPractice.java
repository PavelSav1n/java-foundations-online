package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

import java.security.PublicKey;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {

//        Object obj = new Object();
//        synchronized (obj) {
//            // не работает без связки с synchronized
//            obj.wait();
//        }

        ThreadPractice threadPractice = new ThreadPractice();
        MyThread thread1 = new MyThread(1, threadPractice);
        MyThread thread2 = new MyThread(2, threadPractice);
        MyThread thread3 = new MyThread(3, threadPractice);

        thread1.start();
        thread2.start();
        thread3.start();

        // Deadlock
        // поток ожидает, когда текущий поток завершится, чтобы запустить текущий поток.
//        Thread.currentThread().join();

    }

//    @SneakyThrows
//    public void printNum(int num) {
//        synchronized (this) {
//            System.out.println("Begin " + num);
//            this.wait(1000L);
//            System.out.println("End " + num);
//        }
//    }

    // То же самое что и сверху:
    // В synchronized метод может попасть только один поток
    @SneakyThrows
    public synchronized void printNum(int num) {
        System.out.println("Begin " + num);
        // метод wait, вызванный на объекте, передаёт монитор следующему в очереди потоку, который обращается к этому синхронизированному методу,
        // после чего продолжает выполнение через указанное время. Если пусто, то ждёт, пока не будет разбужен.
        // освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не вызовет метод notify()/notifyAll()
        this.wait(1000L);
        // метод sleep переводит поток в режим ожидания и затем продолжает его выполнение
        Thread.sleep(1000L);
        System.out.println("End " + num);

    }
}
