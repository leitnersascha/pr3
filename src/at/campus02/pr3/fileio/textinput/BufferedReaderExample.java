package at.campus02.pr3.fileio.textinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // öffnet die Datei test.txt
        File file = new File("testout.txt");
        // liefert einen textorientierten Stream der Datei zurück
        FileReader fileReader = new FileReader(file);
        // legt einen BufferedReader über den FileReader.
        // Somit kann komfortabler/effizenter auf die Datei zugegriffen werden.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // ODER
        BufferedReader br = new BufferedReader(new FileReader(new File("testout.txt")));
        BufferedReader br2 = new BufferedReader(new FileReader("testout.txt"));
        // Zeile für Zeile wird eingelesen. Ist das Dateiende erreicht, so wird null zurückgeliefert.
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        // bufferedReader wird geschlossen
        bufferedReader.close();
    }
}
