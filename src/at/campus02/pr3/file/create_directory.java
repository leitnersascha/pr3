package at.campus02.pr3.file;

import java.io.File;

public class create_directory {

    public static void main(String[] args) {
        /*
        Tip: use delete(File file), renameTo(File dest)
        Create a Method,
            - which creates 10 Files.
            - save all File Information in a List
            - rename all files (print to console original name + name after renaming: example test.txt -> test_neu.txt + Status
            - delete all files and print filename and the status of the deletion.

         */

        File dir = new File("C:");
        printDirectoryContent(dir);
    }

    public static void printDirectoryContent(File f) {
        if (f.isDirectory()) {
            // Variable initialized
            long filesize = 0;
            // Go trough the directory; listFiles() returns an array of Files (Objects)
            for (File file : f.listFiles()) {
                System.out.println("Filename: " + file.getName() + "Size: " + file.length());
                filesize = filesize + file.length();
            }
            // print out the complete size of the directory
            System.out.println(filesize);
        }
    }
}
