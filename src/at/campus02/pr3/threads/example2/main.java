package at.campus02.pr3.threads.example2;

import at.campus02.pr3.threads.example5.Person;

public class main {
    public static void main(String[] args) {
        at.campus02.pr3.threads.example5.Person person1 = new at.campus02.pr3.threads.example5.Person("Name1");
        at.campus02.pr3.threads.example5.Person person2 = new Person("Name2");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        thread2.start();

        System.out.println("Enter something");
        ConsoleHelper.readLine();

        person1.requestShutDown();
        person2.requestShutDown();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
