class Father {
	public void show(){
		System.out.println("Show method Father class ");
	}
}
class Son extends Father{
	public void show(){
		System.out.println("Show Method Son class ");
		super.show();
	}
}
class PublicToPublic{
	public static void main(String[]args){
		Son s1 = new Son();
		s1.show();
	}
}