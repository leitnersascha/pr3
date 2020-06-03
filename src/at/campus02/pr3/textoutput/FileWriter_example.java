package at.campus02.pr3.textoutput;

import java.io.FileWriter;

public class FileWriter_example {
    public static void main(String args[]) {
        /*
        A PrintWriter has a different concept of error handling. You need to call checkError() instead of using try/catch blocks.
         */
        String data = "This is the data in the output file";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes the string to the file
            output.write(data);

            output.flush();
            // Closes the writer
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
