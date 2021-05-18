package at.campus02.pr3.fileio.textinput;

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
        String srg = "Hello Java";
        StringReader stringReader = new StringReader(srg);
        int c = 0;
        while ((c = stringReader.read()) != -1) {
            System.out.println((char) c);
        }
    }
}