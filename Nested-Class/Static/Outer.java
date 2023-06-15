class Outer{
	int x = 10;
	static int y = 20;
	void get(){
		   System.out.println("Show Method Outer ");
		   System.out.println(" x = "+x);
		   System.out.println(" y = "+y);
	   }
	static class Inner{
		int a = 343;
		static int b = 232;
       void show(){
		   System.out.println("Show Non static Method Inner Class ");
		   System.out.println(" a = "+a);
		   //System.out.println(" x = "+x);
		   System.out.println(" b = "+b);
		   System.out.println(" y = "+y);
	   }
	   static void out(){
		   System.out.println("Show static Method Inner Class ");
		   System.out.println(" y = "+y);
		   System.out.println(" b = "+b);
	   }
	}
	public static void main(String ...s){
		Outer obj = new Outer();
		obj.get();
		//obj.show();
		Inner obj1 = new Inner();
		obj1.out();
		obj1.show();
		System.out.print("B in Inner class "+obj1.a);
	}
}