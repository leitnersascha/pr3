package at.campus02.pr3.klausur2.exam1;

import java.io.*;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }

    public void loadFromCsv(String path, String separator) throws IOException, CsvLoaderException {

        File file = new File(path);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s;
            while ((s=bufferedReader.readLine())!= null){
                String[] studentString = s.split(separator);
                String start = studentString[0];
                if(start.startsWith("#")){
                    continue;
                }
                else if(studentString.length != 3){
                    throw new CsvLoaderException("Falsches Format -> 3 Zeilen erwartet");
                }
                else{
                    String id = studentString[0];
                    String name = studentString[1];
                    String email = studentString[2];
                    Student  student = new Student(id, name, email);
                    students.add(student);
                }
            }
            bufferedReader.close();
            System.out.println(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
