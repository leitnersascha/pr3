package at.campus02.pr3.threads.example2.test;

public class Worker implements Runnable {
    private char sign;
    boolean isRunnning = true;
    public Worker(char sign) {
        this.sign = sign;
    }
    public void requestShutDown(){
        isRunnning = false;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (isRunnning) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(i + Thread.currentThread().getName() + " " + sign);
            }else {
                break;
            }
        }
    }
}
