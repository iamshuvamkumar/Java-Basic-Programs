package Networking;
interface A{
	void show();
}
class B implements A{
	public void show() {
		System.out.println("B");
	}
}
class C implements A{
	public void show() {
		System.out.println("C");
	}
}
class D implements A{
	public void show() {
		System.out.println("D");
	}
}

public class LossselyCop {

	public static void main(String[] args) {
	/*	B b = new B();
		b.show();
		C c = new C();
		c.show();
		D d = new D();
		d.show();
      */
	/*
		A a = new B();
		a.show();
		A a1 = new C();
		a1.show();
		A a2 = new D();
		a2.show();
		*/
		try {
			Class c1 = Class.forName(args[0]);
			String cname = c1.getName();
			System.out.println("Name of Class "+cname);
			
			A a = (A)c1.newInstance();
			a.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
