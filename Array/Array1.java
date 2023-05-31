import java.io.*;
class Array1{
	
	public static void main(String[]args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	int x [] = new int[5];
	int a = x.length;
	int n,y=0;
	for(int i=0;i<a;i++){
	 n = Integer.parseInt(br.readLine());
	 x[i]=n;
	 y+=x[i];
	}
		System.out.print(" "+y);
	
	
	}
	}