class base{
	public void show(){
		System.out.println("Show method From base class");
	}
	public void out(){
		System.out.println("out method From base class");
	}
}
class child extends base{
 public void show (){
	 super.show();
	 System.out.println("Show method From child class ");
 }
 public void display(){
	 System.out.println("Display method From child class ");	
 }
}


class DaynmicBinding{
	public static void main(String[]args){
/*	
     child c1 = new child();
	c1.show();
	c1.out();
	c1.display();
	*/
	
	base b1 = new child();
	b1.show();
	b1.out();
	//b1.display();
	child c2 = (child)b1;
	c2.display();
	
	Object o1 = new child();
	Object o2 = new base();
 }
}