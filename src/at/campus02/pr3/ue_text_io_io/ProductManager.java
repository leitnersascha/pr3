package at.campus02.pr3.ue_text_io_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Product p : productList) {
            bufferedWriter.write(p.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("Saving Done");
    }

    public void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
        System.out.println("Read finished");
    }

}
