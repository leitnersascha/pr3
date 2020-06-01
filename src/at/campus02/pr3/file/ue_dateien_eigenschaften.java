package at.campus02.pr3.file;

import java.io.File;
import java.io.IOException;

public class ue_dateien_eigenschaften {

    public static void main(String[] args) {
        /*
        Uebung:
        Create a method, which has a parameter File as method
            The method should print the following information of a file on the console:
            - Does this file exist?
            - Name of the File
            - Parent Directory of the File
            - Path to this File
            - Is this a directory?
            - Is this a file?
            - Is this file readable?
            - Is this File writeable
            - File Size
         */

        File file = new File("live-demo.iml");
        readFileInformation(file);
    }

    public static void readFileInformation(File file) {
        System.out.println("Does this file exists? " + file.exists());
        System.out.println("The name of file is  " + file.getName());
        System.out.println("Parent Directory of this file  " + file.getParent());
        System.out.println("Path to this file " + file.getPath());
        System.out.println("The full path to this file " + file.getAbsolutePath());
        System.out.println("Is this a Directory? " + file.isDirectory());
        System.out.println("Is this a File? " + file.isFile());
        System.out.println("Is this a hidden file " + file.isHidden());
        System.out.println("Is this File readable ? " + file.canRead());
        System.out.println("Is this File writable ? " + file.canWrite());
        System.out.println("File Size: " + file.length());
    }
}
