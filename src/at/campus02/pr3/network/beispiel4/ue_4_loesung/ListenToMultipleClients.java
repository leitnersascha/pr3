package at.campus02.pr3.network.beispiel4.ue_4_loesung;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class ListenToMultipleClients {

    public static void main(String[] args) throws IOException, InterruptedException {
        List<Thread> clients = new ArrayList<>();

        System.out.println("Starte Server ...");
        ServerSocket serverSocket = new ServerSocket(9090);
        serverSocket.setSoTimeout(30000); // 30 sek

        while (true) {
            try {
                Socket socket = serverSocket.accept();
                Thread thread = new Thread(new CommunicationTask(socket)); // Worker Classe - Runnalbe implementiert hat.
                thread.start();
                clients.add(thread);
            } catch (SocketTimeoutException timout) {
                System.out.println("Server TIMEOUT");
                break;
            }
        }

        for (Thread t : clients)
            t.join();

        System.out.println("ENDE");
    }
}

