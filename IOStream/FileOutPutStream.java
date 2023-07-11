package IOStream;
import java.io.*;
import java.util.Scanner;
public class FileOutPutStream {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\FileoutputStream.txt");
			System.out.println("File Is Create");
			String str = sc.nextLine();
			byte[] ch = str.getBytes();
			for (int i = 0; i < ch.length; i++) {
				fos.write(ch[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End MAin");
	}
}
