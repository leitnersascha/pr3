package at.campus02.pr3.threads.example5;

public class DeadlockDemo {

  public static void main(String[] args) {
    Friend f1 = new Friend("Max");
    Friend f2 = new Friend("Moritz");

    f1.setFriend(f2);
    f2.setFriend(f1);

    new Thread(f1).start();
    new Thread(f2).start();

  }

}
