package Networking;

import java.net.*;

public class FindUrlDel {
public static void main(String[] args) {
	try {
		URL obj = new URL("https://google.com/");
		System.out.println(obj.getPort());
		System.out.println(obj.getHost());
		System.out.println(obj.getPort());
		System.out.println(obj.getFile());
	} catch (Exception e) {
	e.printStackTrace();
	}
}
	
}
