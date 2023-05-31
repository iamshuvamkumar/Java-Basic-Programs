class Base {
 Base show(){
	 System.out.println("Show Method of base class");
     return new Base();	 
 }
}
 class Child extends Base{
	 Child show(){
		 System.out.println("show method of child class ");
		 super.show();
		 return new Child();
	 }
 }
class Text{
	public static void main(String[]args){
		Child c1 = new Child();
		c1.show();
	}
}