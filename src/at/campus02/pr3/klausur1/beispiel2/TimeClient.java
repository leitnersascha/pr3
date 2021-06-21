package at.campus02.pr3.klausur1.beispiel2;

import java.io.*;
import java.net.Socket;

public class TimeClient {

    public static void main(String[] args) {
        System.out.println("Connecting to Server");
        try (
                Socket socket = new Socket("localhost", 1111);

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Reading from Server");
            System.out.println("datetime -> " + bufferedReader.readLine());
            System.out.println("Exiting the Client!");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
