package at.campus02.pr3.file;

import java.io.File;

public class ue_list_data_information {

    public static void main(String[] args) {
        /*
        Tip: use listFiles()
        Create a method, which takes a file as parameter. (Directory Path)
        - Check if the File is a Directory
        - All files of the given directory need to be printed, with the following content:
                - File Name
                - File Path
                - File Size

        - In the end we also want to know, what is the size of all files together? (Print it to console)

        Question: What is the difference between:
            - File.list()
            - File.listFiles()

         */

        File dir = new File("C:\\Users\\campus02\\Downloads");
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
        else{
            System.out.println("No Directory");
        }
    }
}