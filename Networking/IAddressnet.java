package Networking;
import java.net.*;
public class IAddressnet {
 public static void main(String[] args) {
	 		try {
	 			InetAddress ip = new InetAddress.getByName("https:/google.com/");
	 			System.out.println(ip.getHostName());
	 			System.out.println(ip.getHostAddress());
	 		} catch (Exception e) {
	 			e.printStackTrace();
	 		}

}
}
