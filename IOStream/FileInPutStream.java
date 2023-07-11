package IOStream;

import java.io.FileInputStream;

public class FileInPutStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis  = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\FileoutputStream.txt");
			FileInputStream fis1  = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Awt\\FileoutputStream.txt");
			System.out.println("File readIng Start");
			int ch = 0;
			int ch1 = 0;
			while((ch = fis.read())!=-1) {
	           System.out.print((char)ch);
			}
			System.out.println();
			while((ch1= fis1.read())!=-1) {
		           System.out.print((char)ch1);
				}
				System.out.println();
			}
     	catch(Exception e) {
         e.printStackTrace();     		
     	}
		System.out.println("End Main");
	}
}
