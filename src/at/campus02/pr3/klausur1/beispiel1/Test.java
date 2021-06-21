package at.campus02.pr3.klausur1.beispiel1;

import java.util.List;


public class Test {
	
	public static void main(String... args) {
		try {
			List<Rechnung> rechnungsListe = RechnungsLoader.LoadAll("test.txt");
			System.out.println(rechnungsListe);
		} catch (RechnungsLoaderException e) {
			e.printStackTrace();
		}
		
		
	}
}
