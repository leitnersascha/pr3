package at.campus02.pr3.beispiel2;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable {

    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void work() throws InterruptedException {
        printStarted();
        while (shouldRun) {
            Date d = new Date();
            System.out.println(d.toString());
            Thread.sleep(1000);
        }
        printStopped();
    }
}
