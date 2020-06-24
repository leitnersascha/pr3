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
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        }

        if (ConsoleHelper.readline() != null) {
            w2.requestShutDown();
            System.out.println(t1.getState());
            // t2.stop(); - deprecated!
            System.out.println(t2.getState());
        }

        try {
            t1.join();
            t2.join();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("Fertig!");
    }
}
