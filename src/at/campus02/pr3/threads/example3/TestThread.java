package at.campus02.pr3.threads.example3;

public class TestThread extends Thread
{
  String test;
  
  public TestThread(String test)
  {
    this.test = test;
  }
  
  public void run()
  {
    while(!isInterrupted())
    {
      System.out.println(test);
      try 
      {
        sleep(1000);
      } 
      catch (InterruptedException e) 
      {
        System.out.println("Thread " + this.getName() + ": Interrupt received during execution of sleep.");
        interrupt();
      }
    }
    System.out.println("Thread " + this.getName() + ": Interrupt received - terminating.");
  }
}
