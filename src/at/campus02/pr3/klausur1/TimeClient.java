package at.campus02.pr3.klausur1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {

    public static void main(String[] args) {
        try {
            System.out.println("Verbinde zu Server ... ");
            Socket socket = new Socket("localhost", 1111);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Reading from Server: ");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("EXIT");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
