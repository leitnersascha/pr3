package at.campus02.pr3.beispiel2;

import java.io.IOException;

public abstract class Worker {

    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        shouldRun = true;
    }

    protected abstract void work() throws InterruptedException, IOException;

    protected void printStarted(){
        System.out.println(name + " wurde gestartet!");
    }

    protected void printStopped(){
        System.out.println(name + " wurde gestoppt!");
    }

    public void stopWorker(){
        shouldRun = false;
    }
}
