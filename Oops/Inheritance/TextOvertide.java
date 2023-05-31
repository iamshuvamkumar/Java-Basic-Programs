class Base{
	void show(){
		System.out.println("Show Method From Base Class");
	}
	void out(){
        System.out.println("Out Method From Base Class");
		
	}
	
}
class Child extends Base{
	void show(){
		System.out.println("Show Method From child Class");
		super.show();
	}
	void display(){
        System.out.println("Display Method From child Class");
		
	}
	
}


class TextOvertide{
	public static void main (String[]args){
		Child c = new Child();
		c.show();
		c.out();
		c.display();
	}
}