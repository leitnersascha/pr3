package at.campus02.pr3.threads.example1;

public class Worker implements Runnable {

    private char sign;

    public Worker(char sign) {
        this.sign = sign;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName() + " " + sign);

        }

    }
}
