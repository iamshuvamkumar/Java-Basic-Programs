package IOStream;
import java.io.*;
public class DataOutputAndInputStream {



	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(System.in);
			FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HeStream.txt",true);
			DataOutputStream dos  = new DataOutputStream(fos);
			PrintStream ps = new PrintStream(fos);
			String str = "THis is data io Stream";
			while(!str.equals("Stop")) {
				System.out.println("Enter a String ");
				str = dis.readLine();
				//dos.writeChars(str);
				//dos.writeUTF(str);
				//dos.writeBytes(str);
				//dos.flush();
				ps.println(str);
			}
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
