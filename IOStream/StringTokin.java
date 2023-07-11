package IOStream;
import java.io.*;
import java.util.StringTokenizer;
public class StringTokin {

	public static void main(String[] args) {
		String str = "name=shuvam;class=javaBatch;age=21;";
		StringTokenizer st = new StringTokenizer(str,";");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

	}

}
