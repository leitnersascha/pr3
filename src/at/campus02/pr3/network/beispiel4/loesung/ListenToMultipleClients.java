package at.campus02.pr3.network.beispiel4.loesung;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class ListenToMultipleClients
{
	public static void main(String[] args)
	{
		ServerSocket server = null;
		Socket connectionToClient = null;
		List<Thread> clients = new ArrayList<Thread>();
		try
		{
			System.out.println("Starte Server");
			server = new ServerSocket(9090); // Definition des Server Ports
			server.setSoTimeout(30000); // Servers lebt für eine definierte Zeit
			while (true)
			{
				try
				{
					connectionToClient = server.accept(); // Server ist bereit Verbindungen zu akzeptieren
					Thread t = new Thread(new CommunicationTask(connectionToClient)); // Thread wird erstellt und parallel clients zu bearbeiten.
					t.start(); // starten den Thread
					clients.add(t); // fügt den Client zu die Liste von Clients hinzu
				}
				catch (SocketTimeoutException timeout)
				{
					System.out.println("Timeout");
					break;
				}
			}

			for (Thread t : clients)
				t.join();

			System.out.println("Beende Server");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
