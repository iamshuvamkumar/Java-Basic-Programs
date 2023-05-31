interface Text{
	public default void show(){
		System.out.println("Show Mehtod Class Text ");
	}
}

class interface6 implements Text{
	public void show(){
		System.out.println("Show Mehtod Class Interface ");
	Text.super.show();
	}
	public static void main(String[]args){
		Text obj = new interface6();
		obj.show();
	}
	}
