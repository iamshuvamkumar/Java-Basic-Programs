abstract class GrandFather{
	abstract void display();
	GrandFather(){ }
	
}
abstract class Father extends GrandFather{
     int x;	             	
	Father(){}
	Father(int x){
	this.x=x;
	}
	abstract void out();
}
class Child extends Father{
	int x,y;
	
	Child(){}
	Child(int x,int y,int z){
		super(z);
		this.x=x;	
		this.y=y;
	}
	void display(){
		System.out.println("Display Method Child Class ");
		System.out.println("Display Method Override in Child Class ");
	}
	void out(){
		System.out.println("out method Father Class");
		System.out.println("Child Class x "+x);
		System.out.println("Child Class y "+y);
		System.out.println("Father Class x "+super.x);
	}
	
}
class Test4{
public static void main(String[]args){
 GrandFather g1 = new Child();
 g1.display();
 Father f1 = new Child(10,20,30);
 f1.out();
  }
 }