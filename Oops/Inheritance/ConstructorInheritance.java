class A{
	A(){
		System.out.println(" Def Class A ");
	}
	A(int x){
		System.out.println(" Class  A  x "+x);
	}
}
	class B extends A{
	B(){
		super();
		System.out.println(" Def Class B ");
	}
	B(int x){
		super(15);
		System.out.println(" Class  B  x "+x);
	}
	}
	class C extends B{
	C(){
		super();
		System.out.println(" Def Class C ");
	}
	C(int x){
		super(10);
		System.out.println(" Class  C  x "+x);
	}
	}
class ConstructorInheritance{
	public static void main(String []args){
		System.out.println("Object 1");
		new C();
		System.out.println("Object 1");
		new C(5);
	}
}