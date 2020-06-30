package at.campus02.pr3.fileio.umlaute;

import java.io.*;

import static java.nio.charset.StandardCharsets.*;

public class codierte_text_dateien_erstellen {

    public static void main(String[] args) {

        File file = new File("umlaute.txt");
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                // Mit Umlaute: ä ö
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8);
                // Ohne Umlaute: ä ö
                //    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, ISO_8859_1);
                PrintWriter printWriter = new PrintWriter(outputStreamWriter)) {
            printWriter.println("Köche machen Müsli mit Äpfel");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}