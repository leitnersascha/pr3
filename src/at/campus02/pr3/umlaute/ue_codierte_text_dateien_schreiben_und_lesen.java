package at.campus02.pr3.umlaute;

import java.io.*;
import java.nio.charset.Charset;


import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;


public class ue_codierte_text_dateien_schreiben_und_lesen {

    public static void main(String[] args) {
        // mit Umlaute: UTF_8
        // ohne Umlaute: ISO_8859_1

        // writeFile(String filePath, String / Charset encoding)
        // readFile(String filePath, String / Charset encoding)

        writeFile("test.txt", UTF_8);
        readFile("test.txt", ISO_8859_1);

    }

    public static void writeFile(String filePath, Charset encoding) {

        PrintWriter printWriter = null;
        File file = new File(filePath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter =
                    new OutputStreamWriter(fileOutputStream, encoding);
            printWriter = new PrintWriter(outputStreamWriter);
            String text = "Köche machen Müsli mit Äpfel";
            printWriter.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.flush();
                printWriter.close();
                System.out.println("Success");
            }
        }
    }

    public static void readFile(String path, Charset encoding) {
        File f = new File(path);

        try (
                FileInputStream fileInputStream = new FileInputStream(f);
                InputStreamReader inputStreamReader =
                        new InputStreamReader(fileInputStream, encoding);
                BufferedReader bufferedReader =
                        new BufferedReader(inputStreamReader);
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