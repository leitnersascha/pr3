package at.campus02.pr3.threads;

public class ThreadMethods implements Runnable {
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        thread.setPriority(1);
        int prio = thread.getPriority();
        System.out.println(prio);
        System.out.println("Thread Running");
    }
}
