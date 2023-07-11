import java.io.*;
class FileRead{
	public static void main(String[]args){
		try{
		FileReader fr  = new FileReader("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
		try{
	        int i;
			while ((i= fr.read())!=-1){
				System.out.print((char)i); 
			 }
		}
		finally{
		fr.close();
		}
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	}
}