package at.campus02.pr3.beispiel2;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable {

    @Override
    public void run() {
        printStarted();
        while (shouldRun) {
            try {
                work();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printStopped();
    }

    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    protected void work() throws InterruptedException {
        Date d = new Date();
        System.out.println(d.toString());
        Thread.sleep(1000);
    }
}
