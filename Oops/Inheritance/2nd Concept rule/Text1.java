class A{}
class B extends A{}
class Base {
 A show(){
	 System.out.println("Show Method of base class");
     return new A();	 
 }
}
 class Child extends Base{
	 B show(){
		 System.out.println("show method of child class ");
		 super.show();
		 return new B();
	 }
 }
class Text1{
	public static void main(String[]args){
		Child c1 = new Child();
		c1.show();
	}
}
