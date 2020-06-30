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
			server = new ServerSocket(9090);
			server.setSoTimeout(30000);
			while (true)
			{
				try
				{
					connectionToClient = server.accept();
					Thread t = new Thread(new CommunicationTask(connectionToClient));
					t.start();
					clients.add(t);
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
