package at.campus02.pr3.threads.example4v2;

public class Person implements Runnable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        doStuff();
    }

    private synchronized void doStuff() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }
    }

}