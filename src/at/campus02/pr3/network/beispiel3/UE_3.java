package at.campus02.pr3.network.beispiel3;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class UE_3 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            socket = new Socket("www.acoela.myspecies.info", 80);

            // SCHREIBEN
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("GET /en HTTP/1.1");
            bufferedWriter.newLine(); // -> sonst eine Zeile
            bufferedWriter.write("Host: www.acoela.myspecies.info");
            bufferedWriter.newLine(); // newline wird 2 mal benötigt!
            bufferedWriter.newLine();
            bufferedWriter.flush();

            // LESEN
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter_content = new PrintWriter("content.html");
            PrintWriter printWriter_response = new PrintWriter("resp.html");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("<!DOCTYPE")) // Hier möchte ich nur die Response auslesen und nicht den Content.
                    break;
                printWriter_response.println(line);
                // printWriter_response.flush();
                System.out.println(line);
            }
            do {
                printWriter_content.println(line); // content wird hier reingeschrieben (HTML content)
                printWriter_content.flush();
            }
            while ((line = bufferedReader.readLine()) != null); // bis keine repsonse zurück kommt.
            printWriter_content.close();
            printWriter_response.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (printWriter != null)
                    printWriter.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
