package at.campus02.pr3.network.beispiel4.loesung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CommunicationTask implements Runnable
{
	private Socket connectionToClient;

	public CommunicationTask(Socket connectionToClient)
	{
		this.connectionToClient = connectionToClient;
	}

	@Override
	public void run()
	{
		Thread.currentThread().setName("Client Port " + connectionToClient.getPort());

		BufferedReader br = null;
		BufferedWriter bw = null;

		try
		{
			br = new BufferedReader(new InputStreamReader(connectionToClient.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(connectionToClient.getOutputStream()));

			bw.write("HELLO"); // Server gibt ein initiales Hallo zurück
			bw.newLine();
			bw.flush(); // Flushen, um den Befehl durchzuführen

			String command;
			while ((command = br.readLine()) != null) // Zeilenweise Input auslesen
			{
				if ("TIME".equals(command))
				{
					Calendar cal = GregorianCalendar.getInstance();
					bw.write(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
							+ cal.get(Calendar.SECOND)); // aktuelle Zeit zurückgeben
					bw.newLine();
					bw.flush();
				}
				else if ("PORT".equals(command))
				{
					bw.write("Port:" + connectionToClient.getPort()); // aktuell verwendenten Port zurückgegben
					bw.newLine();
					bw.flush();
				}
				else if ("END".equals(command))
				{
					bw.write("Bye");
					bw.newLine();
					bw.flush();
					break;
				}
				else
				{
					bw.write("unknown command");
					bw.newLine();
					bw.flush();
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " wurde beendet");
	}
}
