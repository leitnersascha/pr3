package at.campus02.pr3.fileio.file;

import java.io.File;
import java.io.IOException;

public class erstellung_von_dateien {

    public static void main(String[] args) {

        // Create a new File and check if the file was successfully created.
        // - Also consider File Separation from Operating System

        // Erstellung eines neuen Files
        File file = new File("campus02-test.txt");

        // Receive file separator from System. For Windows: "\"
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);

        File file2 = new File("C:" + fileSeparator + "Users" + fileSeparator + "" +
                "campus02" + fileSeparator + "neuertest1.txt");

        try {
            if (file2.createNewFile()) {
                System.out.println(file2.getAbsolutePath() + " filename: " + file2.getName());
                System.out.println("New File is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            // File / Path does not exists or can not be found
            e.printStackTrace();
        }

    }
}
