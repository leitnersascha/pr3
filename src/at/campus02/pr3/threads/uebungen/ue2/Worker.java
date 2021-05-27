package at.campus02.pr3.threads.uebungen.ue2;

import java.util.Date;

public class Worker implements Runnable {
    private final int sleepIntervall = 1000; //msec

    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        // synchronized (lock) {
        while (isRunning) {
            synchronized (lock) {
                Date d = new Date();
                System.out.print("[");
                System.out.println(Thread.currentThread().getName() + " ");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println();
                try {
                    Thread.sleep(sleepIntervall);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

