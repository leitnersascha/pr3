package at.campus02.pr3.fileio.file;

import java.io.File;

public class ue_list_files_in_sub_directories {

    public static void main(String[] args) {
        /*
        Write a program, which lists all files of a subdirectory
         */

        File dir = new File("C:\\Users\\campus02\\Downloads");
        listf(dir.getAbsolutePath());
    }

    public static void listf(String path) {

        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                listf(f.getAbsolutePath());
                System.out.println("Dir:" + f.getAbsoluteFile());
            } else {
                System.out.println("File:" + f.getAbsoluteFile());
            }
        }
    }
}


