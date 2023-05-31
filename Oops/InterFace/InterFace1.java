interface My{
  public abstract void show();
}
interface My1{
	public abstract void display();
}
interface My2{
	public abstract void out();
	public abstract void result();
}
class Child implements My,My1,My2{
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
	void get(int x){
		System.out.println("Get Method From Child class"+x);
	}
}


class InterFace1{
public static void main(String[]args){
	My m = new Child();
	My1 m1 = new Child();
	My2 m2 = new Child();
	m.show();
	m1.display();
	m2.result();
	m2.out();
	Child c = (Child)m;
	c.get(123);
   }
}