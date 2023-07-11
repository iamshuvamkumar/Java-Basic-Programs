import java.io.*;
class DataTranfar{
	public static void main(String[]args){
		try{
		FileInputStream r = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HStream.txt");
		FileOutputStream w = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\HelloStream.txt");
			int i;
			while((i=r.read())!=-1){
				w.write(i);
			}
		}
		catch(Exception e ){
			System.out.print(e);
		}
	}
}