interface my{
	public abstract void show();
	abstract void display();
	public void out();
	void result();
	//public void m1(){} interface only create method not method declearaction in interface
}
class Child implements my{
	public void show(){
		System.out.println("\nShow Method From My InterFace Class\n");
	}
	public void display(){
		System.out.println("Display method from My InterFace Class\n");
	}
	public void out(){
		System.out.println("Out method from My InterFace  Class\n");
	}
	public void result(){
		System.out.println("Result Mehod from My InterFace Class\n");
	}
	void get(int x){
		System.out.println("Get method from Child Class"+x);
	}
}
class InterFace{
public static void main(String [] args){
 my m = new Child();
 m.show();
 m.display();
 m.out();
 m.result();
 Child c = (Child)m;
 c.get(100);
   }
   }