interface My{
	public abstract void show();
	public abstract void display();
}
interface My1{
	public abstract void out();
	public abstract void display();
}
abstract class Father implements My ,My1{
	public void show(){
		System.out.println("Show Method My Interface " );
	}
	public void out(){
		System.out.println("Out Method My1 InterFace ");
	}
	abstract void results();
}
class Child extends Father{
	public void show(){
		super.show();
	System.out.println("Show Method Child Class " );
	}
	public void display(){
		System.out.println("Display Method My1 Interface " );
	}
	public void results(){
		System.out.println("Show Method Father " );
	}
}
 
class InterFace5{
public static void main(String[]args){
	My m = new Child();
	My1 m1 = new Child();
	Father f1 = (Father)m1;
	m.show();
	m.display();
	m1.display();
	m1.out();
	f1.results();
	
	
   }
}