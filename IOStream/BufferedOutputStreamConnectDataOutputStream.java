package IOStream;

import java.io.*;

public class BufferedOutputStreamConnectDataOutputStream {

	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\Buffer.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
			String str = "  ";
            while (!str.equals(".")) {
				System.out.println("Enter a String ");
				str = dis.readLine();
				dos.writeBytes(str);
				dos.flush();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
