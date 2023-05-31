class Father{
	void show(){
	System.out.println("Show Method from Father Class ");
   }
}
class Son extends Father{
	void show (){
		System.out.println("Show Method from Son Class");
		super.show();
	}
}

class DefaultToDefault{
	public static void main(String[]args){
		Son s1 = new Son();
		s1.show();
	}
}