package at.campus02.pr3.textinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_text_file {
    public static void main(String[] args) throws IOException {
        // öffnet die Datei test.txt
        File file = new File("umlaute.txt");

        // liefert einen textorientierten Stream der Datei zurück
        FileReader fileReader = new FileReader((file));

        // legt einen BufferedReader über den FileReader. Somit kann komfortabler auf die Datei zugegriffen werden.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Zeile für Zeile wird eingelesen. Ist das Dateiende erreicht, so wird null zurückgeliefert.
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // Datei wird wird geschlossen
        bufferedReader.close();

    }
}
