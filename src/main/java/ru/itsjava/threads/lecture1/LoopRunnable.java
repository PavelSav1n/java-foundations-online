package ru.itsjava.threads.lecture1;

public class LoopRunnable implements Runnable {

    long lastCheck = System.currentTimeMillis();

    @Override
    public void run() {
        // Here we can use two ways of interrupting our thread and waiting for some time, while doing some code.
        while (!Thread.currentThread().isInterrupted()) {

            // First way -- is to calculate difference between current time and last time we checked:
//            if (System.currentTimeMillis() - lastCheck >= 1000) {
//                lastCheck = System.currentTimeMillis();
//                System.out.println("LoopRunnable");
//            }

            // Second way is to use Thread.sleep() and handling the InterruptingException:
            try {
                Thread.sleep(1000L);
                System.out.println("LoopTryCatch");
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
                Thread.currentThread().interrupt();

            }
        }
    }
}
