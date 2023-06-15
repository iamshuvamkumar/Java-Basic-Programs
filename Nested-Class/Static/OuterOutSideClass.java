class Outer{
	int x =320;
	static int y =30;
	void show(){
		System.out.println("Show Mehtod for Outer2 ");
		System.out.println(" X "+x);
	}
	static void out(){
		System.out.println("Show Mehtod for Outer2 ");
		System.out.println(" Y "+y);
	}
 static class Inner{
		int c = 23;
		static int p = 21;
		void get(){
		System.out.println("Get method for Inner class ");
		System.out.println("c = "+c);
		System.out.println("static P = "+p);
		}
	}
}
class OuterOutSideClass{
		public static void main(String[]args){
 //Outer.show();//non static data memeber can't be call
 Outer.out();
 
 Outer.Inner i = new Outer.Inner();
 i.get();
	 	
		}
	}