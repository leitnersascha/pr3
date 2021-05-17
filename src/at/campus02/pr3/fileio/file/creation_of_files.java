package at.campus02.pr3.fileio.file;

import java.io.File;
import java.io.IOException;

public class creation_of_files {

    public static void main(String[] args) {
        // GOAL: Create a new File and check if the file was successfully created.
        // File Separators:
        // Linux: /
        // Windows: \ (/)

        // Consider File Separation from Operating System
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);


        File file1 = new File("campus02-test.txt");
        File file2 = new File("C:" + fileSeparator + "campus02" + fileSeparator + "test_neu.txt");
        File file3 = new File("C:\\Users\\Work\\Desktop\\PR3-21\\code\\test.mp3");
        File file4 = new File("C:/Users/Work/Desktop/PR3-21/code/test.mp3");
        // File file5 = new File("files/campus02-test.txt"); -> Directory "files" must exist!

        // createNewFile() - Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
        try {
            if (file4.createNewFile()) {
                System.out.println(file4.getAbsolutePath() + "FileName" + file4.getName());
                System.out.println("uri: " + file4.toURI());
                System.out.println("path: " + file4.toPath());
                System.out.println("new File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            // Path does not exists or can not be found
            e.printStackTrace();
        }
    }
}
