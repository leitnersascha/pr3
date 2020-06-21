package at.campus02.pr3.ue_text_io_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList = new ArrayList<>();

    public void add(Product p) {
        productList.add(p);
    }

    public void saveToFile(String path) {
        File file = new File(path);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (Product p : productList) {
                    bufferedWriter.write(p.toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                // function - DB
                e.printStackTrace();
            }
        } catch (IOException e) {
            // andere Funtion
            e.printStackTrace();
        }
        System.out.println("Product Information successfully saved.");
    }

    public void readFromFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Product Information successfully read.");
    }

}
