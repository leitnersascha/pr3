package at.campus02.pr3.threads;

public class Threads_execute_twice extends Thread {
    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        Threads_execute_twice t1 = new Threads_execute_twice();
        t1.start();
        t1.start();
    }
}