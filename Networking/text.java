package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class text {

	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          try {
		//	String x = br.readLine();
			int i = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
