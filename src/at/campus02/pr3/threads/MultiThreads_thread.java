package at.campus02.pr3.threads;

public class MultiThreads_runnable implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread("thread1");
        Thread thread2 = new Thread("thread2");
        thread.start();
        thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(thread.getName());
        System.out.println(thread2.getName());
    }

    @Override
    public void run() {
    }
}
