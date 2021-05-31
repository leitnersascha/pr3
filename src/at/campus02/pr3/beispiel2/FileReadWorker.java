package at.campus02.pr3.beispiel2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable {

    private String path;
    public ArrayList<String> lines;

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void work() throws InterruptedException, IOException {
        printStarted();
        FileReader fr = new FileReader(new File(path));
        BufferedReader br = new BufferedReader(fr);
        String templine;

        while ((templine = br.readLine()) != null) {
            if (!shouldRun)
                break;
            lines.add(templine);
            System.out.println(templine);
            Thread.sleep(100);
        }
        br.close();
        printStopped();
    }
}
