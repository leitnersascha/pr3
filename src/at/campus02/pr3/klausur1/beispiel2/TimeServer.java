package at.campus02.pr3.klausur1.beispiel2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

    public static void main(String[] args) {

        try {
            System.out.println("Starte Server ....");
            int counter = 0;
            ServerSocket serverSocket = new ServerSocket(1111);

            while (counter < 5) {
                Socket socket = serverSocket.accept();
                counter++;
                System.out.println("Current Counter Value: " + counter);
                System.out.println(socket.getPort() + " hat eine Verbindung aufgebaut");
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                LocalDateTime localDateTime = LocalDateTime.now();
                bufferedWriter.write(localDateTime.toString());
                bufferedWriter.newLine();
                bufferedWriter.write(122);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                bufferedWriter.close();
                System.out.println(socket.getPort() + " hat die Verbindung verlassen.");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
