package at.campus02.pr3.fileio.file;

import java.io.File;

public class ue_1_sol {

    public static void main(String[] args) {


        readFileInformation(new File("code.iml"));
    }

    public static void readFileInformation(File file) {
        System.out.println("File exists? " + file.exists());
        System.out.println("The name of the file is: " + file.getName());
        System.out.println("Parent Directory: " + file.getParent());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("File ?: " + file.isFile());
        System.out.println("Directory ?: " + file.isDirectory());
        System.out.println("Hidden ?: " + file.isHidden());
        System.out.println("Readable ?: " + file.canRead());
        System.out.println("Writeable ?: " + file.canWrite());
        System.out.println("File Size : " + file.length());
    }
}
