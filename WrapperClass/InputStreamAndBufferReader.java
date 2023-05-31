import java.io.*;

class InputStreamAndBufferReader{
	  public static void main(String[]agrs)throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	    System.out.print("Enter any string ");
        String  str = br.readLine();
	    System.out.println("string  "+str);
	 
	    System.out.print("Enter Byte vlaue ");
	    byte b = Byte.parseByte(br.readLine());
	    System.out.println(b);
	   
	    System.out.print("Enter Short vlaue ");
	    short s = Short.parseShort(br.readLine());
	    System.out.println(s);
	   
	    System.out.print("Enter Integer vlaue ");
	    int i = Integer.parseInt(br.readLine());	
	   	System.out.println(i);

	    System.out.print("Enter Long vlaue ");
	    long l = Long.parseLong(br.readLine());	
	    System.out.println(l);

	    System.out.print("Enter Float vlaue ");
	    float f = Float.parseFloat(br.readLine());
	    System.out.println(f);

        System.out.print("Enter Double vlaue ");
	    double d = Double.parseDouble(br.readLine());
        System.out.println(d);
	   
	  }
   }