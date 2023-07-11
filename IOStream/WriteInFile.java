import java.io.*;
class WriteInFile{
	public static void main(String[]args){
		try{
		FileWriter f  = new FileWriter("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
		try{
		f.write(" hello IOStream");
		}
		finally{
		f.close();
		}
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	}
}