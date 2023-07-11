package IOStream;
import java.io.*;
import java.util.Scanner;
public class FileOutPutStream1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\FileoutputStream.txt",true);
			FileOutputStream fos1 = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Awt\\FileoutputStream.txt",true); //another file location
			System.out.println("File Is Create");
			String str = sc.nextLine();
			String str1 = sc.nextLine();
			byte[] ch = str.getBytes();
			byte[] ch1 = str1.getBytes();
			for (int i = 0; i < ch.length; i++) {
				fos.write(ch[i]);
			}
			for (int i = 0; i < ch1.length; i++) {
				fos1.write(ch1[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End MAin");
	}
}
