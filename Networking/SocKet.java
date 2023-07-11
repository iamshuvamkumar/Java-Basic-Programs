package Networking;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocKet {

	public static void main(String[] args) {
		try {
			String ip= "localhost";//IPaddres
			int port =10; //port number
			Socket s = new Socket(ip,port);
			
			String str ="Shuavm";
			
			OutputStreamWriter ow = new OutputStreamWriter(s.getOutputStream());
			PrintWriter pw = new PrintWriter(ow);
			ow.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
