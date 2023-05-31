interface Text{
	public default void show(){
		System.out.println("Show Mehtod Class Text ");
	}
}
class interface5 implements Text{
	public static void main(String[]args){
		Text obj = new interface5();
		obj.show();
	}
	}
