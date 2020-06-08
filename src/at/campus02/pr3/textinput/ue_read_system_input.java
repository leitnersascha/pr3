package at.campus02.pr3.textinput;

import java.io.*;

public class ue_read_system_input {
    /*
    Schreiben Sie ein Programm, das zeilenweise Tastatureingaben auf die Konsole schreibt, bis das Wort „STOP“ eingegeben wird.
    Verwenden Sie dazu den InputStream System.in
    Verwenden Sie weiters die Klassen: InputStreamReader und BufferedReader
     */

    public static void main(String[] args) throws IOException {
        // Ready to receive user Input
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // legt einen BufferedReader über den InputStreamReader.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Zeile für Zeile wird eingelesen.
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            // Check if the input is STOP
            if (line.equals("STOP")) {
                // IF Yes, go out of the while loop
                break;
            }
        }

        // BR wird wird geschlossen
        bufferedReader.close();
        // Information, dass das Programm vorbei ist.
        System.out.println("Closed");

    }
}
