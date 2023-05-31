abstract class GrandFather{
	abstract void show();
	abstract void car();
	abstract void bike();
}
abstract class Father extends GrandFather{
	void show(){
		System.out.println("Show method GrandFather class ");
		System.out.println("Override in Father class ");
	}
	abstract void bike();
	abstract void car();
	abstract void auto();
}
class Child extends Father{
	void get(int x){
		System.out.println("get Method from class class "+x);
	}
	void bike(){
		System.out.println("Bike Method from Father class ");
		System.out.println("Override in Child class ");
	}
	void car(){
		System.out.println("Car method from father class ");
		System.out.println("Override Child class ");
	}
	void auto(){
		System.out.println("Auto method from father class");
		System.out.println("Override in child class");
	}
}
class Test3{
	public static void main(String []args){
		GrandFather g1 = new Child();
		Father f1 = new Child();
		Child c1 = (Child)g1;
			System.out.println("GrandFather");
		g1.show();
		g1.bike();
		g1.car();
		System.out.println();
		System.out.println("Father");
		f1.show();
		f1.bike();
		f1.car();
		f1.auto();
		System.out.println();
		System.out.println("Child");
		c1.get(100);
		c1.show();
		c1.bike();
		c1.car();
		c1.auto();
		
	}
}