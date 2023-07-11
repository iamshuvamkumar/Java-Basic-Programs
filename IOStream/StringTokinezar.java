package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StringTokinezar {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\IOStream\\FileoutputStream.txt");
			StreamTokenizer st=new StreamTokenizer(fis);
			st.eolIsSignificant(true);
			st.wordChars(33, 255);
			st.whitespaceChars(0, 32);
			int token=0;
			int n=0;
			int nw=0;
			while(true)
			{
				token=st.nextToken();
				if(token==StreamTokenizer.TT_EOF){
				  break;
				}
				if(token==StreamTokenizer.TT_NUMBER){
					// System.out.println(st.nval);
					 n++;
					
				}
					 
				
				if(token==StreamTokenizer.TT_WORD){
				   System.out.println(st.sval);
				   nw++;
			 
				}
			}
			System.out.println("Numeric value "+n);
			System.out.println("string value "+nw);
			System.out.println("token "+token);
			
			
		} catch (IOException e) {
				
				e.printStackTrace();
			}

	}

}
