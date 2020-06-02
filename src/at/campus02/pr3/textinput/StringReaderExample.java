package at.campus02.pr3.textinput;

import java.io.FileReader;

import java.io.StringReader;

public class StringReaderExample {
    /*
    Java StringReader class is a character stream with
    string as a source. It takes an input string and
    changes it into character stream. It inherits Reader class.

    In StringReader class, system resources like network
    sockets and files are not used, therefore closing the
    StringReader is not necessary.
    */

    public static void main(String[] args) throws Exception {
        String srg = "Hello Java!! \nWelcome - Test";
        StringReader reader = new StringReader(srg);
        int k = 0;
        while ((k = reader.read()) != -1) {
            System.out.print((char) k);
        }
    }
}