interface My{
  public abstract void show();
}
interface My1 extends My{
	public abstract void display();
}
interface My2 extends My1{
	public abstract void out();
	public abstract void result();
}
class Child implements My2{
	public void show(){
		System.out.println("Show Method  From My Calss");
	}  
	public void out(){
		System.out.println("Out Method From My2 Class");
	}
	public void display(){
		System.out.println("Display Method From My1 class ");
	}
	public void result(){
		System.out.println("Result Method From My2 Class ");
	}
	
}
 
class InterFace2{
public static void main(String[]args){
	
	My2 m = new Child();
	m.show();
	m.display();
	m.result();
	m.out();
	
   }
}