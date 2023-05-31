abstract class base{
  int x;
  int y;
  void show(){
	  System.out.println("Show in Base Class ");
	  System.out.println("x "+x);
	  System.out.println("y "+y);
  }
  abstract void display();
}
class child extends base{
void get(int x ,int y){
	System.out.println("Get in child class ");
	this.x=x;
	this.y=y;
}
  void display(){
	  System.out.println("Display method From Base Class ");
	  System.out.println("Override in child class \n");
  }
}
class Test1{
public static void main(String[]args){
	
	base b1 = new child();
	b1.show();
	b1.display();
	child c1 = (child)b1;
	c1.get(10,20);
	b1.show();
	//c1.display();
  }
} 