package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOByteArrayStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\FileoutputStream.txt", true);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			System.out.println("File is Create");
			String str = "This is Byte Array Output Stream";
			byte[] ch = str.getBytes();
			for (int i = 0; i < ch.length; i++) {
				baos.write(ch[i]);
			}
			try {
				baos.writeTo(fos);
				System.out.println("Write in file ");
				System.out.println(baos);
				ByteArrayInputStream bais = new ByteArrayInputStream(ch);
				int ch1;
				while ((ch1 = bais.read()) != -1) {
					System.out.print((char) ch1);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("\nEnd MAin");

	}

}
