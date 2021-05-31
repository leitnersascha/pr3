package at.campus02.pr3.threads.uebungen.ue4;

public class Work implements Runnable{
    private final int sleepInterval = 1000; // msec = 1 sec
    private static int counter = 0;
    private static Object lock = new Object();
    @Override
    public void run() {

        while (counter <= 20) {
            synchronized (lock) {
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + " Counter ---  " + counter++);
                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                    lock.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    } // run
}