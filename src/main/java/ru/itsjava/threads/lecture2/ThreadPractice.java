package ru.itsjava.threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
        // Создание анонимного класса:
        // Создаём класс, который доступен по ссылке интерфейса, использует конструктор интерфейса и реализует его метод:
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет из анонимного класса");
            }
        };

        // Этот метод можно запустить через run()
        // Этот метод будет вызван в том же потоке main
        anonymousRunnable.run();

        // Если мы хотим создать новый поток то:
        Thread thread = new Thread(anonymousRunnable);
        thread.start();

        // Создание анонимного класса может быть заменено на одну строчку
        // Когда у нас есть анонимный класс, он может быть заменён на функциональное программирование.
        // У Runnable есть аннотация @FunctionalInterface, что можно заменить на лямбду
        // Если внутри один метод, то не обязательно его указывать. Просто пихаем в одни {} или вообще без:
        Runnable functionalRunnable = () -> System.out.println("Привет из функционального программирования");
        new Thread(functionalRunnable).start();

        // Если мы хотим создать всего один поток, без возможности обратиться к нему после:
        // Ещё раз, к нему нельзя будет обратиться, потому что в конце вызов метода start() который возвращает void
        // Если нужна ссылка, то .start() нужно будет убрать и позже уже вызвать start() по ссылке:
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Привет из потока, который мы создали прямо внутри Thread() и без присваивания ссылки ");
            }
        }).start();


        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет после сна в 3 сек");
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        // Превращение потока в демона, при котором поток main не будет ждать завершение его выполнения
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("End of main thread");
    }
}
