package at.campus02.pr3.textinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ue_read_system_input_ExceptionHandling {
    /*
    Schreiben Sie ein Programm, das zeilenweise Tastatureingaben auf die Konsole schreibt, bis das Wort „STOP“ eingegeben wird.
    Verwenden Sie dazu den InputStream System.in
    Verwenden Sie weiters die Klassen: InputStreamReader und BufferedReader
     */

    public static void main(String[] args) {
        // Ready to receive user Input
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);

        // legt einen BufferedReader über den InputStreamReader.
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Zeile für Zeile wird eingelesen.
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                // Check if the input is STOP
                if (line.equals("STOP")) {
                    // IF Yes, go out of the while loop
                    break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                // BR wird geschlossen
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Information, dass das Programm vorbei ist.
            System.out.println("Closed");

        }


    }
}
