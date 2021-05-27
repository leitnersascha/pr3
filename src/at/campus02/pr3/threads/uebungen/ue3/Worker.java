package at.campus02.pr3.threads.uebungen.ue3;

/*
counter is an instance variable of class IncTo100Demo.
Each of your threads uses its own instance of that class, and
therefore works with its own copy of that variable. That's why
they update the values independently. To make the threads share,
you must either have them use the same instance of your class,
or you must make count static.

If you share data between threads then you must synchronize access to that shared data.
 */

public class Worker implements Runnable {
    private final int sleepInterval = 1000; //mse
    private int counter = 0;
    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (counter < 21) {
                System.out.println(Thread.currentThread().getName() +
                        " Counter   ---   " + counter++);
                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

