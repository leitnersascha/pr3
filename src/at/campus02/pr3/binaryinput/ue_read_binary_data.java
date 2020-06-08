package at.campus02.pr3.binaryinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue_read_binary_data {
    /*
    1. Schreiben Sie ein Programm, welches von einer Datei alle Zeichen auf der
    Konsole ausgibt. (FileInputStream)
    2.  Zählen Sie die Anzahl der eingelesenen Zeichen
     und geben Sie die Gesamtanzahl am Ende aus.
     */

    public static void main(String[] args) throws IOException {
        // Repräsentiert eine Datei auf dem Dateisystem
        File file = new File("campus02-test.txt");

        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        // character -> Damit man die Anzahl der Zeichen zählen kann
        int character = 0;
        while ((byteRead = fileInputStream.read()) != -1) {
            // Anzahl der Zeichen mit jeder Wiederholung um 1 erhöhen.
            character++;
            // Byte wird in char umgewandelt und ausgegeben.
            char[] ch = Character.toChars(byteRead);
            System.out.println(ch[0]);
        }

        // Ausgabe Anzahl der Zeichen, nachdem  die Datei vollständig durchgesehen wurde.
        System.out.println(character);
        // close() gibt die Datei wieder frei.
        fileInputStream.close();
    }
}
