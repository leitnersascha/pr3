package at.campus02.pr3.file;

import java.io.File;
import java.util.Scanner;

public class create_directory {

    public static void main(String[] args) {
       // mkdir() - creates Directory
       // mkdirs() - creates Directories

        System.out.println("Enter the path to create a directory: ");

        // Benutzereingabe initialitsieren
        Scanner scanner = new Scanner(System.in);
        // C:\
        String path = scanner.next();
        // Ordner, welcher erstellt werden soll
        System.out.println("Enter the name of the desired directory: ");
        path = path+scanner.next();

        // Create a File object
        File file = new File(path);

        boolean created = file.mkdir();
        if(created){
            System.out.println("Directory was created");
        }
        else{
            System.out.println("Not a directory");
        }

    }

}
