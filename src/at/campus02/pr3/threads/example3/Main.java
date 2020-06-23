package at.campus02.pr3.threads.example3;

import java.io.IOException;

public class Main 
{

  public static void main(String[] args) throws IOException
  {
    TestThread ping = new TestThread("Ping");
    TestThread pong = new TestThread("Pong");
    
    ping.setName("Ping");
    ping.start();
    
    pong.setName("Pong");
    pong.start();
    
    while (System.in.available() == 0)
    {
      try {
        Thread.sleep(1000);
      } 
      catch (InterruptedException e) 
      {
        e.printStackTrace();
      }
    }
    System.out.println("Main: Key pressed:");
    System.out.println("Main: Interrupting Thread " + ping.getName());
    ping.interrupt();
    System.out.println("Main: Interrupting Thread " + pong.getName());
    pong.interrupt();
    System.out.println("Main: Terminating program.");
   
  }
}
