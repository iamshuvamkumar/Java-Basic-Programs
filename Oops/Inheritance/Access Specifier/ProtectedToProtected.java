class Father {
	protected void show(){
		System.out.println("show method Father class ");
	}
}

class Son extends Father {
	protected void show(){
		System.out.println("show method Son class ");
		super.show();
	}
}
class ProtectedToProtected{
	public static void main (String[]args){
		Son s1 = new Son();
		s1.show();
	}
}