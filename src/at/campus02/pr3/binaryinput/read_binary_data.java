package at.campus02.pr3.binaryinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class read_binary_data {

    public static void main(String[] args) throws IOException {
        // Repräsentiert eine Datei auf dem Dateisystem
        File file = new File("campus02-test.txt");

        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        while ((byteRead = fileInputStream.read()) != -1) {

            // Byte wird in char umgewandelt und ausgegeben.
            char[] ch = Character.toChars(byteRead);
            System.out.println(ch[0]);
        }

        // close() gibt die Datei wieder frei.
        fileInputStream.close();
    }
}
