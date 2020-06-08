package at.campus02.pr3.textoutput.ue_text_object_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

       /*
    Schreiben Sie eine Klasse Product zur Abbildung von Produkten mit folgenden Attributen.
        String ProductName
        Double Price
        String ProductCategory
    Schreiben Sie eine Klasse ProductManager zum Verwalten von Produkten in einer privaten Liste und implementieren Sie folgende Methoden
        public void add(Product p) ➔ fügt ein Produkt zur Liste hinzu
        public void save(String path) ➔ speichert die Produkte in der übergebenen Datei. -
            Realisieren Sie dies mittels BufferedWriter und Filewriter.
        public void load(String path) ➔ laden Sie den Text von der übergebenen Datei und geben Sie den Text auf der Konsole aus.

     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "text.txt";
        ProductManager productManager = new ProductManager(path);
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 2", 2.00, "Test 2");
        productManager.add(p1);
        productManager.add(p2);
        productManager.saveToFile();
        productManager.readFromFile();


    }


}