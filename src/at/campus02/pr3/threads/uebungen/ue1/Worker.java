package at.campus02.pr3.threads.uebungen.ue1;

import java.util.Date;

public class Worker implements Runnable {

    private final int sleepInterval = 2000; //msec = 1 SEK
    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            Date current_date = new Date();
            System.out.println(current_date.toString());
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


