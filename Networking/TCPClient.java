package Networking;

import java.io.*;
import java.net.Socket;
public class TCPClient {
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	public TCPClient() {
		try {
			System.out.print("In Client .. ");
			s = new Socket("localhost",10);
			System.out.println("The Client is started ");
			dis  = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		clientChat();
	}
	public  void clientChat() {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=" ";
		String s2=" ";
		try {
			do {
				s1=  br.readLine();
				dos.writeUTF("From Client "+s1);
				s2 = dis.readUTF();
				System.out.println("Server  Msg   "+s2);
			}while(!s1.equals("stop"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new TCPClient();
	}
}
