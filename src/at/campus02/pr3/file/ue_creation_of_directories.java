package at.campus02.pr3.file;

import java.io.File;

public class ue_creation_of_directories {

    public static void main(String[] args) {
        /*
        Tip: use mkdirs()
        Write a method (it should take a parameter FILE to work with, which create a directory like, "C:\\campus02\\test\\demo4"
            - it also should be checked, if the given File is a file or a Directory. + the console messages need to have the information whether it was created or not.
                -> IF Yes: Directory C:\campus02\test\demo4  created?: false
                -> IF No: Directory C:\campus02\test\demo4  created?: true

        Question: What is the difference Between mkdirs() and mkdir() ?
        Question: What does mkdirs() return?
        Question: What does mkdir() return?
         */

        File dir = new File("C:\\test\\alt");
        createDirectories(dir);
    }

    public static void createDirectories(File f) {
        // check if file is a file or directory
        if (!f.isFile() && !f.isDirectory()) {
            // perform mkdirs to try create a directory - returns true if success, returns false if no success
            System.out.println("Directory " + f.getAbsolutePath() + " created?: " + f.mkdirs());
        } else {
            System.out.println("Directory " + f.getAbsolutePath() + " created?: " + f.mkdirs());
        }
    }
}
