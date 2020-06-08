package at.campus02.pr3.textoutput.ue_text_object_io;

import java.io.*;
import java.util.List;

public class ProductManager {
    String path;

    public ProductManager(String path) {
        this.path = path;
    }
    List<Product> productList;

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile() throws IOException, IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        // Serialisierung!

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product p : productList) {
            bufferedWriter.write(p.toString());
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Saving Done");
    }

    public void readFromFile() throws IOException, ClassNotFoundException {

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }

}
