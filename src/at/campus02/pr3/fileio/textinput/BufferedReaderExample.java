package at.campus02.pr3.fileio.textinput;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        // öffnet die Datei test.txt
        File file = new File("umlaute.txt");

        // liefert einen textorientierten Stream der Datei zurück
        FileReader fileReader = new FileReader(file);

        // legt einen BufferedReader über den FileReader. Somit kann komfortabler auf die Datei zugegriffen werden.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Zeile für Zeile wird eingelesen. Ist das Dateiende erreicht, so wird null zurückgeliefert.
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            System.out.println("neuer satz");
        }


        // Datei wird wird geschlossen
        bufferedReader.close();

    }
}
