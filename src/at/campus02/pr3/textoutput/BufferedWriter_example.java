package at.campus02.pr3.textoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_example {
    /*
    Methods of BufferedWriter
        The BufferedWriter class provides implementations for different methods present in Writer.
    write() Method
    write() - writes a single character to the internal buffer of the writer
    write(char[] array) - writes the characters from the specified array to the writer
    write(String data) - writes the specified string to the writer
     */

    public static void main(String args[]) throws IOException {
        FileWriter file = new FileWriter("bufferedWriter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(file);

        String data = " das ist ein test ";
        bufferedWriter.write(data);
        bufferedWriter.newLine();
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Fertig");

    }
}