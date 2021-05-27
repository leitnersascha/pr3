package at.campus02.pr3.threads.example2;

public class Worker implements Runnable {
    private boolean isRunning = true;

    private char sign;

    public Worker(char sign) {
        this.sign = sign;
    }

    public void requestShutDown() {
        isRunning = false;
    }


    @Override
    public void run() {

    }
}
