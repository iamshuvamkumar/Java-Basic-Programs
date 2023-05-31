class base{ 
  void show(){
     System.out.println("Show Method is Base Class");
    }
	final void out(){
		System.out.println("out method from base class ");
	}
   static void display(){
		System.out.println("Display  mehtod from base class");
	}
   }
class child extends base{
	void show(){
		System.out.println("Show Method Child Class ");
			super.show();
			out();
			display();
	}
}

class TextOverridding7{
	public static void main(String[]args){
		child c1 = new child();
		c1.show();
		c1.out();
		c1.display();
		child.display();
	
	}
}