package at.campus02.pr3.binaryoutput.ue_binary_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main   {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "test-product.dat";
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 2", 2.00, "Test 2");
        productList.add(p1);
        productList.add(p2);

        saveToFile(productList, path);
        readFromFile(path);

    }

    public static void saveToFile(List<Product> productList, String path) throws IOException {
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        // Serialisierung!
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
        for (Product p : productList) {
            objectOutputStream.writeObject(p);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        System.out.println("Saving Done");
    }

    public static void readFromFile(String path) throws IOException, ClassNotFoundException {
        // Start: Lese Inhalt von test-output.dat:
        FileInputStream fileInputStream = new FileInputStream(path);
        // Serialisierung!
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Product> productList = (List<Product>) objectInputStream.readObject();
        System.out.println("Read Object data: ");
        System.out.println(productList);

        objectInputStream.close();

    }
}