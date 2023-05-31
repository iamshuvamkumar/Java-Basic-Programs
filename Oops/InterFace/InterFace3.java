interface My{
  public abstract void show();
}
interface My1 {
	public abstract void display();
}
interface My2{
	public abstract void out();
}
interface My3 extends My,My1,My2{
	public abstract void result();
}
class Child implements My3{
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
 
class InterFace3{
public static void main(String[]args){
	
	My3 m = new Child();
	m.show();
	m.display();
	m.result();
	m.out();
	
   }
}