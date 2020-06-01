package at.campus02.pr3.binaryoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class write_binary_data {

    public static void main(String[] args) throws IOException {
        // FileOutputStream öffnet die Datei. Der Konstruktor bietet Einstellungen, ob Datei überschrieben werden darf oder nicht.
        // Ausgabe erstellen, und diese Zeichen für Zeichen durchlaufen
        File file = new File("test-output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String outputText = "hello File - first output";
        for (char c : outputText.toCharArray()) {
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();

        // Zeichen mittels fos.write(…) in die Datei schreiben.
        // flush() führt den tatsächlichen Schreibvorgang durch. Darf am Ende nicht vergessen werden!
        // close() gibt die Datei wieder frei. Darf am Ende nicht vergessen werden.
    }

}
