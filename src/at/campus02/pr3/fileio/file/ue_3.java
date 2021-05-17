package at.campus02.pr3.fileio.file;

import java.io.File;

public class ue_3 {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Work\\Desktop\\PR3-21\\01 - File IO");
        System.out.println("Original Path: " + dir.getAbsolutePath());
        listDirectory(dir.getAbsolutePath());
    }

    public static void listDirectory(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {

        }

    }
}


