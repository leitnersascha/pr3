package at.campus02.pr3.file;

import java.io.File;

public class ue_list_directories {

    public static void main(String[] args) {
        /*
        Write a method (+takes a file as parameter. (Directory Path)), which lists all filenames of a a given directory.
        Tip: Check if Directory exists + if given File is a directory to prevent failures. Write a message to console if this is the case.
         */

        File dir = new File("/");
        printDirectoryContentToConsole(dir);
    }

    public static void printDirectoryContentToConsole(File f) {
        if (f.exists() && f.isDirectory()) {
            String filenames[] = f.list();
            for (String filename : filenames) {
                System.out.println(filename);
            }
        } else {
            System.out.println("Does not exist or not a directory");
        }
    }
}
