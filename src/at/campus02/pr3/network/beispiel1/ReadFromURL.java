package at.campus02.pr3.network.beispiel1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadFromURL
{
	public static void main(String[] args)
	{
		try
		{
			System.out.print("Bitte gew�nschte URL angeben:");
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			URL url = new URL(userInput.readLine());
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			String input;

			while ((input = in.readLine()) != null)
				System.out.println(input);

			in.close();
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