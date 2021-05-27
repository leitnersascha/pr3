package at.campus02.pr3.threads.uebungen.ue3;

/*
counter is an instance variable of class IncTo100Demo.
Each of your threads uses its own instance of that class, and
therefore works with its own copy of that variable. That's why
they update the values independently. To make the threads share,
you must either have them use the same instance of your class,
or you must make count static.

If you share data between threads then you must synchronize access to that shared data.
 */

public class Worker {
}

