package at.campus02.pr3.fileio.textinput;

import java.io.FileReader;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FileReaderExample {
    /*
        Java FileReader class is used to read data from the file.
        It returns data in byte format like FileInputStream class.
        It is character-oriented class which is used for file handling in java.
     */

    public static void main(String[] args) throws IOException {
        // File Reader Constructors: File; String (Filepath); File + Charset; String + Charset)
        FileReader fileReader = new FileReader("testout.txt");

        // Zeichen für Zeichen wird eingelesen.
        // Ist das Dateiende erreicht, so wird -1 zurückgeliefert.
        int c;
        while ((c = fileReader.read()) != -1) {
            // int muss auf char gecastet werden, um somit Buchstaben zu erhalten. (Sonst nur Zahlen)
            char character = (char) c;
            System.out.println("int: " + c + " -> char: " + character);
        }
        // Filereader wird geschlossen
        fileReader.close();
    }
}
