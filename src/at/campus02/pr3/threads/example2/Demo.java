package at.campus02.pr3.threads.example2;

public class Demo {

    public static void main(String[] args) {
        Worker w1 = new Worker('A');
        Worker w2 = new Worker('B');

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        System.out.println("Bitte drücken Sie eine Tasten, um die Threads zu stoppen.");


        if (ConsoleHelper.readline() != null) {
            w1.requestShutDown();
            w2.requestShutDown();
        }

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Fertig!");

    }
}
