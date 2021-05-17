package at.campus02.pr3.fileio.file;

import java.io.File;
import java.util.Scanner;

public class create_directory_provide_full_path {

    public static void main(String[] args) {
        // Prepare User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to create a directory: ");
        String path = scanner.next();
        // Provide Folder, which should be created
        System.out.println("Enter the name of the desired directory: ");
        path = path + scanner.next();
        // File Object with Path from User Input
        File file = new File(path);
        // Has Directory been created?
        // mkdir() -> Returns true if and only if the directory was created; false otherwise
        boolean created = file.mkdir();

        if (created) {
            System.out.println("Directory was created");
        } else {
            System.out.println("Does was not created");
        }
    }
}
