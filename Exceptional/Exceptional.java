class Exceptional{
	public static void main(String[]args){
      System.out.println("Start Main ");
   try{
	   System.out.println("Start Try block ");
	   int x = 10/args.length;
	   System.out.println("x  = "+x);
	   
	   float f = 10.0f/0.0f;
	   System.out.println("f  = "+f);
	   System.out.println("End try block ");
   }	
catch(Exception e){
	System.out.println("Catch Block ");
	System.out.println("Divided by zero "+e);
}   
   System.out.print("End main method ");
	   
	 }
	}