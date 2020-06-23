package at.campus02.pr3.threads.example4v2;

import at.campus02.pr3.threads.example4.Person;

public class main {
    public static void main(String[] args) {
        at.campus02.pr3.threads.example4.Person person1 = new at.campus02.pr3.threads.example4.Person("Name1");
        at.campus02.pr3.threads.example4.Person person2 = new Person("Name2");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
