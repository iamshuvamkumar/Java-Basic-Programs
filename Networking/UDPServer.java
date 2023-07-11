package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10);
			byte [] b = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b, b.length);
			ds.receive(dp);
			String st = new String(dp.getData());
			System.out.println(st.trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
