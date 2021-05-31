package at.campus02.pr3.threads.uebungen.ue4;

public class Main {
    public static void main(String[] args) {
        Work w1 = new Work();
        Work w2 = new Work();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fertig!");
    }
}