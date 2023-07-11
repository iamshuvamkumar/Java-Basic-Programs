import java.io.*;
class CreateFile{
	public static void main(String []ammy){
		File f = new File("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
		try{
		if(f.createNewFile()){
			System.out.println("File create");
		}
		else{
			System.out.println("File cant create");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}