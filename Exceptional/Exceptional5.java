//Seprate try and sepreat catch block
class Exceptional5{
  public static void main(String[]s){
	  try{
		  int x = 10/s.length;
		  System.out.println(x);
	  }
	  catch(ArithmeticException e){
		  System.out.println("This is Airthmatic Exception" );
	  }
	  try{
		  int []y = new int[s.length];
		  y[4] = 4545;
		  System.out.println(y);
	  }
	  catch (ArrayIndexOutOfBoundsException e){
		  System.out.println("ArrayIndexOutOfBoundsException");
	  }
  }
 }