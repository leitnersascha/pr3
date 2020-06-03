package at.campus02.pr3.textoutput;

import java.io.StringWriter;

public class StringWriter_example {
    /*
    Methods of StringWriter
        The StringWriter class provides implementations for different methods present in the Writer class.

    write() Method
    write() - writes a single character to the string writer
    write(char[] array) - writes the characters from the specified array to the writer
    write(String data) - writes the specified string to the writer
     */

    public static void main(String[] args) {

        String data = "This is the text in the string.";

        try {
            // Create a StringWriter with default string buffer capacity
            StringWriter stringWriter = new StringWriter();

            // Writes data to the string buffer
            stringWriter.write(data);

            // Prints the string writer
            System.out.println("Data in the StringWriter: " + stringWriter);

            stringWriter.flush();
            stringWriter.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}