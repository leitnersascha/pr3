package at.campus02.pr3.threads.uebungen.ue4;

public class TestThread {

    public static void main(String args[]) {
        PrintDemo PD = new PrintDemo();

        Worker T1 = new Worker( "Thread - 1 ", PD );
        Worker T2 = new Worker( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        }catch( Exception e) {
            System.out.println("Interrupted");
        }
    }
}