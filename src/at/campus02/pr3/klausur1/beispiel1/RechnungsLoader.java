package at.campus02.pr3.klausur1.beispiel1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RechnungsLoader {
    public static List<Rechnung> LoadAll(String fileName) throws RechnungsLoaderException {

        List<Rechnung> rechungsListe = new ArrayList<Rechnung>();

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            Rechnung rechnung = null;
            List<RechnungsPosition> positionen = null;
            String strLine = null;
            while ((strLine = br.readLine()) != null) {
                // spalte die einzelnen Begriffe in einzelne Arrayfelder auf
                String[] spalten = strLine.split(" ");

                String spalte1 = spalten[0];

                // checkt, ob eine neue Rechnung angefangen wird.
                if ("Rechnung".equals(spalte1)) {

                    if (rechnung != null) {
                        // speichert die Vorg�ngerrechnung in die List
                        rechnung.setPositionen(positionen);
                        rechungsListe.add(rechnung);
                    }

                    // neue Instanz von der variable Rechnung erstellen.
                    rechnung = new Rechnung();
                    positionen = new ArrayList<RechnungsPosition>();

                    // Rechnungsnummer dazu eintragen
                    String rechnungsNummer = spalten[1];
                    rechnung.setRechnungsNr(rechnungsNummer);

                } else { // RECHNUNGSPOSTIONEN
                    // da wir oben abgefragt haben, ob eine neue Rechnung angefangen wird, k�nnen wir
                    // davon ausgehen, dass jetzt nur mehr eine Position gelesen werden kann.

                    // hier legen wir eine neue Instanz einer Rechnungsposition an.
                    RechnungsPosition rechnungsposition = new RechnungsPosition();

                    String bezeichnung = spalten[1];
                    rechnungsposition.setBezeichnung(bezeichnung);

                    String strPreis = spalten[2];

                    // so wird der String aus der Datei zu einem double konvertiert.
                    // geht dabei etwas schief, so wird die Exception unten abgefangen
                    double preis = Double.parseDouble((strPreis));

                    rechnungsposition.setPreis(preis);

                    positionen.add(rechnungsposition);
                }

            }

            // die letzte Rechnung noch hinzuf�gen
            if (rechnung != null && positionen != null) {
                rechnung.setPositionen(positionen);
                rechungsListe.add(rechnung);
            }


        } catch (FileNotFoundException e) {
            throw new RechnungsLoaderException(e);
        } catch (IOException e) {
            throw new RechnungsLoaderException(e);
        } catch (Exception e) {
            throw new RechnungsLoaderException(e);
        }

        return rechungsListe;
    }
}
