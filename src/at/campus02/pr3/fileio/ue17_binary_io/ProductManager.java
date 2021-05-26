package at.campus02.pr3.fileio.ue17_binary_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    /*
    1. Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen.
        String ProductName
        Double Price
        String ProductCategory
        Tipp:
            implements Serializable verwenden
            getter, setter, tostring, constructor erstellen


    2. Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten
    Liste und implementieren Sie folgende Methoden
        public void add(Product p) ➔ fügt ein Produkt zur Liste hinzu
        public void saveToFile(String path) ➔ speichert die Produkte in der übergebenen Datei. -
            Realisieren Sie dies mittels ObjectOutputStream und FileOutputStream.
        public List<Product> readFromFile(String path)
            ➔ laden Sie das Object Product von der übergebenen Datei und
                geben Sie die Objecte mittels toString() auf der Konsole aus.
            Tipp:
                    -   arbeiten Sie beim auslesen der Dateien mit einer While Schleife
                    -   verwenden Sie readObject()
                    -   verwenden Sie einen try catch block, um die Exception: EOFException zu behandeln

 */

    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for (Product p : productList) {
            objectOutputStream.writeObject(p);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Saving Done");
    }

    public void readFromFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> productList = new ArrayList<>();

        // boolean keepReading = true;
        try {
            while (true) {
                Object object = objectInputStream.readObject();
                Product p = (Product) object;
                productList.add(p);
                System.out.println(p);
            }
        } catch (EOFException e) {
            System.out.println("End of File reached.");
            // keepReading = false;
        } finally {
            objectInputStream.close();
        }
        System.out.println("Read Object data: ");
        System.out.println(productList);
    }

}
