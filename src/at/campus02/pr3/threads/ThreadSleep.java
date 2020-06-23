package at.campus02.pr3.threads;

public class MultiThread implements Runnable {

    /*
    MULTITHREADING in Java is a process of executing
    two or more threads simultaneously to maximum
    utilization of CPU. Multithreaded applications
    execute two or more threads run concurrently.
    Hence, it is also known as Concurrency in Java.
    Each thread runs parallel to each other. Mulitple
    threads don't allocate separate memory area, hence
    they save memory. Also, context switching between threads takes less time.

    Advantages of multithread:

    The users are not blocked because threads are independent, and we can perform multiple operations at times
    As such the threads are independent, the other threads won't get affected if one thread meets an exception.
         */

    public static void main(String[] args) {
        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");
        guruThread1.start();
        guruThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());
    }

    @Override
    public void run() {
    }
}
