package ru.itsjava.homeWork.threads.lecture2;

public class RunnableThreadHomework {
    public static void main(String[] args) {

        // Создаём абстрактный класс с типом переменной интерфейса Runnable и переопределяем внутри {} public abstract void run();
        // для sout можно и без {}
        Runnable runnable1 = () -> System.out.println("Привет, я Runnable");
        // Создаём поток и передаём внутрь наш класс runnable
        Thread thread1 = new Thread(runnable1);
        // Запускаем поток:
        thread1.start();
        // Делаем то же самое для второго потока:
        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Привет, я проснулся после 4 секунд");
            }
        };
        // Создаём поток и передаём туда runnable2
        Thread thread2 = new Thread(runnable2);
        // Устанавливаем флаг демона:
        thread2.setDaemon(true);
        // Стартуем
        thread2.start();
        // thread2 будет работать в JVM ещё 5*4 сек после завершения потока main
    }
}
