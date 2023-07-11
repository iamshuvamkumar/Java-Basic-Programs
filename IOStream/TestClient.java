package IOStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class TestClient {

	public static void main(String[] args) {
		System.out.println("Start main test Client ");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\TextClient.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			EmpSer e1 = new EmpSer("Shuvam",10,11,12,13,14, 15); 
			oos.writeObject(e1);
			System.out.println("Compleate");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End main test Client ");

	}

}
