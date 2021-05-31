package at.campus02.pr3.network.beispiel2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class WriteToURLConnection
{
	public static void main(String[] args)
	{
		URL url;
		try
		{
			url = new URL("https://www.wetter.at");
			URLConnection conn = url.openConnection();
			// conn.setDoOutput(true);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));

			bw.write("GET /wetter/oesterreich/steiermark/graz/index.html HTTP/1.1");
			bw.newLine();
			bw.write("Browser: FIREJAVA");
			bw.newLine();
			bw.newLine();
			bw.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line;
			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
