package at.campus02.pr3.threads;

public class MultiThreads_thread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MultiThreads_thread t1 = new MultiThreads_thread();
        t1.start();
        MultiThreads_thread t2 = new MultiThreads_thread();
        t2.start();
    }
}