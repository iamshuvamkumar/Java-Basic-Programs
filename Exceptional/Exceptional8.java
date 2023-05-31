//throw keyword
class Exceptional8{
	void get(int x) //throws Exception
	{
	 if(x<18) 
	 {
		 throw new ArithmeticException ("ArithmeticException :- x is less than 18 ");
	    // throw new Exception("x is less than exc..");
	 }	
	 else
		 System.out.println("x = "+x);
	}
	public static void main(String[]s)//throws Exception
	{
	 Exceptional8 obj = new Exceptional8();
	 //obj.get(15);
	 try{
		 obj.get(15);
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
	 
		 System.out.println("Main end");
	 }
	}