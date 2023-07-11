package IOStream;

import java.io.*;

public class IoBufferedInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HeStream.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis  = new DataInputStream(bis);
		System.out.println("File is read... ");
	    String str =" "; 
	    while(str!=null) {
	    	try {
				str= dis.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	if(str!=null) {
	    		System.out.println(str);
	    	}
	    
	    }
	}catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("End of main");


	}
}