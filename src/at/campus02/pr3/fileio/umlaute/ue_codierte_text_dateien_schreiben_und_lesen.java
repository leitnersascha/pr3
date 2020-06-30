package at.campus02.pr3.fileio.umlaute;

import java.io.*;
import java.nio.charset.Charset;


import static java.nio.charset.StandardCharsets.UTF_8;


public class ue_codierte_text_dateien_schreiben_und_lesen {

    public static void main(String[] args) throws IOException {
        // mit Umlaute: UTF_8
        // ohne Umlaute: ISO_8859_1

        // writeFile(String filePath, String / Charset encoding)
        // readFile(String filePath, String / Charset encoding)

        writeFile("test.txt", UTF_8);
        readFile("test.txt", UTF_8);

    }

    public static void writeFile(String filePath, Charset encoding) throws IOException {
        BufferedWriter bufferedWriter = null;
        File file = new File(filePath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(fileOutputStream, encoding);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("Köche kochen Äpfel");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println("Success");
            }
        }
    }

    public static void readFile(String path, Charset encoding) {
        File f = new File(path);
        try {
            FileReader fileReader = new FileReader(f, encoding);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
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