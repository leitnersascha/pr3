package at.campus02.pr3.klausur2.exam1;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException, CsvLoaderException {
        StudentManager studentManager = new StudentManager();
        studentManager.loadFromCsv("test.csv", ";");
    }

}
