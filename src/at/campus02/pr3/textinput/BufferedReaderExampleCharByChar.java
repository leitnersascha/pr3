package at.campus02.pr3.textinput;

import java.io.*;

public class BufferedReaderExampleCharByChar {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("umlaute.txt"));
        int c;
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            System.out.println(c + " - "  + character);
        }
    }
}

