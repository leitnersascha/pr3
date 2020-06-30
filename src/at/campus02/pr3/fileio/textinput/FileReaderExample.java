package at.campus02.pr3.fileio.textinput;

import java.io.*;

public class FileReaderExample {
    /*
        Java FileReader class is used to read data from the file.
        It returns data in byte format like FileInputStream class.
        It is character-oriented class which is used for file handling in java.
     */

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("umlaute.txt");
        int i;
        // read() returns -1 = end of file = -1
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }
}
