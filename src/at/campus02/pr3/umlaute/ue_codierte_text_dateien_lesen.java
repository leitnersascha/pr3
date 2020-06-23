package at.campus02.pr3.umlaute;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ue_codierte_text_dateien_lesen {

    /*
    Erstellen Sie ein Programm, welches die zuvor erstellte Text Datei, welche Umlaute beinhaltet, ausließt.
    Beim auslesen, soll es möglich sein, die gewünschte Codierung anzugeben.
    Testen Sie den Konsolen Output mit folgenden Codierungsoptionen:
    UTF-8
    ISO_8859_1
    Welche Unterschiede stellen Sie fest?
     */

    public static void main(String[] args) {

        File f = new File("campus02-test.txt");

        try (
                FileInputStream fileInputStream = new FileInputStream(f);
                // Mit Umlaute: ä ö
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                // Ohne Umlaute: ä ö
                //  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.ISO_8859_1);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
