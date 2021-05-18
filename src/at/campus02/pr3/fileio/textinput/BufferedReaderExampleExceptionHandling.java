package at.campus02.pr3.fileio.textinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleExceptionHandling {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
