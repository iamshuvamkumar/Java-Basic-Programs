abstract class base{
  int x;
  int y;
  void show(){
	  System.out.println("Show in Base Class ");
	  System.out.println("x "+x);
	  System.out.println("y "+y);
  }
}
class child extends base{
void get(int x ,int y){
	System.out.println("Get in child class ");
	this.x=x;
	this.y=y;
}
}
class Test{
public static void main(String[]args){
	//base b = new base();
	base b1 = new child(); //base class object child class ref if of child class in b1 object 
	b1.show();
	//b1.get(); //parent class not call child class method
	child c1 = (child)b1;  // create child class object to take b1 ref id to typecast c1 becouse same refrence id in c1 and b1 
	//child c1 = new child(); //when we create new class object and create new memory location lalocate new memory
	c1.get(10,20);
	b1.show();
  }
} 