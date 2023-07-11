package IOStream;
import java.io.*;
public class DataInputStreamConnectFile {
public static void main(String[] args) {
	try {
		FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HeStream.txt");
	    DataInputStream dis = new DataInputStream(fis);
	    String str = " ";
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
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("End Main");
}
}
