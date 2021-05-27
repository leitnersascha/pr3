package at.campus02.pr3.threads.ex2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("A");
        Person person2 = new Person("B");

        Thread t1 = new Thread(person1);
        Thread t2 = new Thread(person2);

        System.out.println("Bitte drücken Sie eine Taste, um die die Threads zu Stoppen!");

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        if (ConsoleHelper.readLine() != null) {
            person1.requestShutDown();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
            // t1.stop(); -> Deprecated!!!
        }

        if (ConsoleHelper.readLine() != null) {
            person2.requestShutDown();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
            // t1.stop(); -> Deprecated!!!
        }

        try {
            t1.join();
            t2.join();
            System.out.println(t1.getState());
            System.out.println(t2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fertig");

    }
}
