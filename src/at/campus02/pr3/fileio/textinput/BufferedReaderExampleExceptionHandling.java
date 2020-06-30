package at.campus02.pr3.fileio.textinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleExceptionHandling {
    public static void main(String[] args) {

        // öffnet die Datei test.txt
        File file = new File("umlaute.txt");
        BufferedReader bufferedReader = null;

        try {
            // liefert einen textorientierten Stream der Datei zurück
            FileReader fileReader = new FileReader(file);

            // legt einen BufferedReader über den FileReader. Somit kann komfortabler auf die Datei zugegriffen werden.
            bufferedReader = new BufferedReader(fileReader);

            // Zeile für Zeile wird eingelesen. Ist das Dateiende erreicht, so wird null zurückgeliefert.
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                System.out.println("neuer satz");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    // Datei wird wird geschlossen
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
