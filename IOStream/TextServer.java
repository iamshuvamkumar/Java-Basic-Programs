package IOStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TextServer {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\TextClient.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			EmpSer e1 = ( EmpSer)ois.readObject();
			System.out.println("Object read File  into the file ");
			System.out.println("str "+e1.str);
			System.out.println("age "+e1.age);
			System.out.println("a   "+e1.a);
			System.out.println("b   "+e1.b);
			System.out.println("y    "+e1.y);
			System.out.println("z    "+e1.z);
			System.out.println("str  "+e1.str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
