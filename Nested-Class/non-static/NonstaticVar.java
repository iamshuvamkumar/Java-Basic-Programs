class Outer{
	int x =32;
	void show(){
		System.out.println("Show method NonstaticVar class  ");
		System.out.println(" X "+x);
	}
	class Inner{
		int y =323;
	void get(){
		System.out.println("Gert method Inner class ");
		System.out.println(" Y "+y);
	}
}
}
class NonstaticVar{
	public static void main(String[]args){
		 Outer o = new Outer();
		 o.show();
		 //Outer.Inner.get(); 
		 Outer.Inner in =  o.new Inner();
		 in.get();
	  }
	}