package at.campus02.pr3.threads.example1;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Runnable worker1 = new Worker('A');
        Runnable worker2 = new Worker('B');

        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(worker2);

        t1.start();
        t2.start();
        System.out.println("t1: " + t1.getName());
        System.out.println("t2: " + t2.getName());
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        t1.join(); // Warten bis der Thread fertig ist.
        t2.join();

        System.out.println("Fertig");

    }


}
