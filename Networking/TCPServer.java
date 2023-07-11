package Networking;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServer {
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	public TCPServer() {
		try {
			 System.out.print("In server .. ");
			 ss = new ServerSocket(10);
			 System.out.println("The server is started ");
			 s= ss.accept();
			 System.out.println("Client is accepted ");
			  dis  = new DataInputStream(s.getInputStream());
			  dos = new DataOutputStream(s.getOutputStream());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		serverChat();
	}
	public  void serverChat() {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s1=" ";
		String s2=" ";
		
		try {
			do {
				s2 = dis.readUTF();
				System.out.println("Client Msg   "+s2);
				s1=  br.readLine();
				dos.writeUTF("From server"+s1);
			}while(!s1.equals("stop"));
		}
		catch (Exception e) {
		  e.printStackTrace();
		}
	}
   public static void main(String[] args) {
		  new TCPServer();
   }
}
