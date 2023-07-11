package IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IOPrintStream {

	public static void main(String[] args) {
		System.out.println("Hello out object");
		System.out.println("Hello out object");
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\PrintStream.txt"));
			System.setOut(ps);
			System.out.println("hello");
			System.out.println("PrintStream");
			System.out.println("Out");
			
			PrintStream ps1 = new PrintStream(new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\PrintStream1.txt"));
			System.setErr(ps1);
			System.err.println("hello");
			System.err.println("PrintStream");
			System.err.println("err");
			System.out.println("this is out");
			System.err.println("this is err");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
