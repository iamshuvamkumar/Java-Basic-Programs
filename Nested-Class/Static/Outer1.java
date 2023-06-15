
class Outer1{
	static class Inner{
		int a = 34;
		static int b = 32;
       void show(){
		   System.out.println("Show Non static Method Inner Class ");
		   System.out.println(" a = "+a);
		   System.out.println(" b = "+b);
	   }
	   static void out(){
		   System.out.println("Show static Method Inner Class ");
		   System.out.println(" b = "+b);
	   }
	
	public static void main(String ...s){
		Inner obj = new Inner();
		obj.out();
		obj.show();
		System.out.print("B in Inner class "+obj.a);
		
    	}
	}
}