package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;

public class ChatBox1 {
	DataInputStream dis;
	DataOutputStream dos;
	Socket s;

	ChatBox1() {
		try {
			System.out.println("ChatBox...");
			s = new Socket("localhost", 10);
			System.out.println("Accept Request..");
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		chat();
	}

	public void chat() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = " ";
		String s2 = " ";
		String s3= "\nuser2->\n";
		try {
			do {
				s1 = br.readLine();
				dos.writeUTF("ChatBox.." + s1);
				s2 = dis.readUTF();
				System.out.println("ChatBox.." + s2);
				FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Networking\\Chat.txt",true);
	        PrintStream ps = new PrintStream(fos);
	
					byte[] ch =s1.getBytes();
					ps.println(s3);
					fos.write(ch);
					
					//ps.println(s1);
				
			} while (!s1.equals("."));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatBox1();
	}

}
