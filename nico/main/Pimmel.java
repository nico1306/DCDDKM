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
				System.out.println("start speech");
				socket = new Socket("localhost", 65432);
				socket.connect(null); 
			}catch (Exception e) {
			}
			try {
				Thread.sleep(5*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public void PimmelMassage()
	{
		Pimmel t = new Pimmel();
		t.start();
	}
}
