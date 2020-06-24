package at.campus02.pr3.threads.example2.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static String readline() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try{
            return bufferedReader.readLine();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}