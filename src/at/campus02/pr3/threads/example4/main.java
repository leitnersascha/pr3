package at.campus02.pr3.threads.example4;

public class main {
    public static void main(String[] args) {

        Person person1 = new Person("A");
        Person person2 = new Person("B");

        Thread t1 = new Thread(person1);
        Thread t2 = new Thread(person2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
