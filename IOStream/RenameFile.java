import java.io.*;
class RenameFile{
	public static void main(String[]args){
		File f  = new File("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
		File r  = new File("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HStream.txt");
		try{
	       if(f.exists()){
			   System.out.print(f.renameTo(r));
		   }
		   else{
			   System.out.print("File ka jo Hona tha ho gaya");
		   }
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	}
}