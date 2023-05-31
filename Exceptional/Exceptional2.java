//one try block Multiple catch block

import java.io.*;

class Exceptional2{
 public static void main(String...s){
	 InputStreamReader isr  = new InputStreamReader(System.in);
	 BufferedReader br = new BufferedReader(isr);
	 //br.readLine(); //error
	 		 System.out.println("main String= "+s.length);
	 try{
		 System.out.print("Enter Number ");
		 int num = Integer.parseInt(br.readLine());
		 int x = num/s.length;
		 System.out.println("x = "+x);
		 
		 int y[] = new int[s.length];
		 System.out.println("y = "+y.length);
		 y[5] = 25454;
		 System.out.println("y[3] ="+y[5]);
	 }
	catch(IOException e){
		 System.out.println("It's IoException ");
		 e.printStackTrace();
	 }
	 catch(ArithmeticException e){
		 System.out.println("It's ArithmeticException "+e);
		 e.printStackTrace();
	 }
	 catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("it's ArrayIndexOutOfBoundsException ");
		 e.printStackTrace();
	 }
  }
}