package at.campus02.pr3.network.beispiel1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromUrlAndWrite {

	public static void main(String[] args)
	{
		try
		{
			BufferedReader userInput = new BufferedReader(new FileReader("url.txt"));
			URL url = new URL(userInput.readLine());
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String input;

			PrintWriter pw = new PrintWriter("content.html");
			
			while ((input = in.readLine()) != null)
				pw.println(input);

			in.close();
			pw.close();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	
}
