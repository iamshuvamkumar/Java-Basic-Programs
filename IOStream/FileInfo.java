import java.io.*;
class FileInfo{
	public static void main(String[]args){
		File f = new File("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
		try{
			if(f.exists()){
				System.out.println("File Name: "+f.getName());
				System.out.println("File Location: "+f.getAbsolutePath());
				System.out.println("File Write: "+f.canWrite());
				System.out.println("File Read: "+f.canRead());
				System.out.println("File size: "+f.length());
				System.out.println("File delet: "+f.delete());
			}
			else{
				System.out.println("File not exists");
			}
		}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
