package at.campus02.pr3.fileio.textinput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleExceptionHandling {
    public static void main(String[] args) {
        readTextFile();
    }

    public static void readTextFile() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("testout.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
