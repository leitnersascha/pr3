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
        for (int i = 0; i < 1000; i++) {
            while (isRunning) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(i + " " + Thread.currentThread().getName() + " " + sign);
            }
            break;
        }
    }
}
