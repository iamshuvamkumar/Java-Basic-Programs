package Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SerVer {
	public static void main(String[]args) {
	try {
		System.out.println("Server is Start ");
		ServerSocket ss = new ServerSocket(10);
		System.out.println("Server is waiting for request ");
		Socket s = ss.accept();
		System.out.println("Request Accept ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}
}
