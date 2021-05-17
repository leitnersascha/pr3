package at.campus02.pr3.fileio.file;

import java.io.File;

public class ue_6 {

    public static void main(String[] args) {
        /*

        1. Create a directory with 10 files in a folder
        2. Create a method, which renames all 10 files (only files and not directories!) within the folder
            2.1 for example: test.txt to 1_test.txt
                2.1.1 for the new file name - concatinate a string with .getParent(), seperator + getName()
                2.1.2 use renameTo() method
                2.1.3 Check if the rename was a success (via if) and print the according message to the console

         */

        File source = new File("C:\\test\\alt");
        rename_files(source);
    }

    public static void rename_files(File source) {

    }
}