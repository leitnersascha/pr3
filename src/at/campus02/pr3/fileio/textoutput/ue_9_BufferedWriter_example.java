package at.campus02.pr3.fileio.textoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ue_9_BufferedWriter_example {
    /*
    Methods of BufferedWriter
        The BufferedWriter class provides implementations for different methods present in Writer.
    write() Method
    write() - writes a single character to the internal buffer of the writer
    write(char[] array) - writes the characters from the specified array to the writer
    write(String data) - writes the specified string to the writer
     */

    public static void main(String args[]) throws IOException {
        FileWriter fileWriter = new FileWriter("neue_datei_18mai.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // BufferedWriter bufferedReader = new BufferedWriter(new FileWriter("neue_datei_18mai.txt"));

        String data = "Das ist ein test";
        bufferedWriter.write(data);
        bufferedWriter.write(data);
        bufferedWriter.newLine();
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Fertig");

    }
}