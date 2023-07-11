package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatBox {
	DataInputStream dis;
	DataOutputStream dos;
	ServerSocket ss;	
	Socket s;

	public ChatBox() {
		try {
			System.out.println("ChatBox...");
			ss = new ServerSocket(10);
			System.out.println("Chatbox Server Ready..");
			System.out.println("Send Request..");
			s = ss.accept();
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
        String s3= "\nUser3->\n";
		try {
			do {
				s2 = dis.readUTF();
				System.out.println("ChatBox1.. " + s2);
				s1 = br.readLine();
				dos.writeUTF(" ChatBox1.." + s1);
				FileOutputStream fos = new FileOutputStream(
						"D:\\Workshop\\Java\\Javap\\Home Work\\Networking\\Chat.txt", true);
				PrintStream ps = new PrintStream(fos);

				byte[] ch = s1.getBytes();
				ps.println(s3);
				fos.write(ch);
				//ps.println(s1);

			} while (!s1.equals("."));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatBox();
	}

}
