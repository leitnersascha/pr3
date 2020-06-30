package at.campus02.pr3.threads.uebungen.ue4;

class Worker extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;
    private static Object lock = new Object();
    Worker( String name,  PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        synchronized(lock) {
            PD.printCount(Thread.currentThread());
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
