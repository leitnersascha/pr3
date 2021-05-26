package at.campus02.pr3.fileio.ue17_binary_io;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductManager productManager = new ProductManager();
        String path = "test-product.dat";
        Product p1 = new Product("Product 1", 1.00, "Test");
        Product p2 = new Product("Product 22", 2.00, "Test 2");
        productManager.add(p1);
        productManager.add(p2);

        productManager.saveToFile(path);
        productManager.readFromFile(path);

    }
}