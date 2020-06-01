package at.campus02.pr3.textoutput;

import java.io.*;

public class print_data_to_text_file {

    public static void main(String[] args) throws IOException {
        // Datei wird geöffnet und in PrintWriter gekapselt
        File f = new File("campus02-tesft.txt");

        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Mittels println(...) werden Zwei Zeilen geschrieben. Jede Zeile wird richtig abgeschlosen.
        printWriter.println("FirstLn");
        printWriter.println("SecondLn");

        // flush() löst das Schreiben aus
        printWriter.flush();

        // close() gibt die Datei wieder frei
        printWriter.close();

    }

}
