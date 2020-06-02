package at.campus02.pr3.textinput.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class NestedFinally {

    public static void main(String... args) {
        nestedFinally("umlaute.txt");
    }

    private static void nestedFinally(String fileName) {
        try {
            //If the constructor throws an exception, the finally block will NOT execute
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            try {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    //process the line...
                }
            } finally {
                //no need to check for null
                //any exceptions thrown here will be caught by
                //the outer catch block
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}
