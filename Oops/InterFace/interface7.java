interface Text{
	 default void show(){
		System.out.println("Show Mehtod Class Text ");
	}
}
interface Text1{
	  default void show(){
		System.out.println("Show Mehtod Class Text1 ");
	}
}

class interface7 implements Text,Text1{
	public void show(){
		System.out.println("Show Mehtod Class Interface ");
	Text.super.show();
	Text1.super.show();
	}
	
	public static void main(String[]args){
		interface7 obj = new interface7();
		obj.show();
		
		Text obj1 = new interface7();
		obj1.show();
		
		Text1 obj2 = new interface7();
		obj2.show();
		
	}
	}   
