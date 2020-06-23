package at.campus02.pr3.threads.ok.example5.example2;

public class Person implements Runnable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            System.out.println(name);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


