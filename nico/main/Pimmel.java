package nico.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Pimmel extends Thread
{
	
	public void run() {
		Socket socket = null;
		try {
			//opens a socket connection to the socket server
			//the server will start the audio
			//no special msg is sent
			
			System.out.println("start speech");
			socket = new Socket("localhost", 65432);
			socket.connect(null);
			socket.close();
		}catch (Exception e) {
		}
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	public void PimmelMassage()
	{		
		Pimmel t = new Pimmel();
		
		if(!t.isAlive())
		{
			t.start();
		}
	}
}
