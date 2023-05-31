class Exceptional1{
	void show(){
		System.out.println("Show method in class");
	}
	public static void main(String...s){
      System.out.println("Start Main ");
	  Exceptional1 obj = null;
   try{
	   System.out.println("Start Try block ");
	   int x = 10/s.length;
	   System.out.println("x  = "+x);
	   
	   int y[] = new int[s.length];
       y[3]=554546;
	   System.out.println("y  = "+y[3]);
		
		//obj = new Exceptional1();
		obj.show();
	   System.out.println("End try block ");
   }	

catch(ArithmeticException e){
	System.out.println("Catch Block ArithmeticException");
	System.out.println("Divided by zero "+e);
	e.printStackTrace();
} 
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Array Index Out Of Bounds Exception");
	System.out.println("Array Index "+e);	
		e.printStackTrace();
}
 catch(NullPointerException e){
		  System.err.println(" NUll value  Exc....  ... ");	
		  e.printStackTrace();
		}
catch(Exception e){
	System.out.println("Father of All Exception"+e);
	e.printStackTrace();
}
   System.out.print("End main method ");
	   
	 }
	}