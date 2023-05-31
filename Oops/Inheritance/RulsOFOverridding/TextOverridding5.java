/*The parent class less Restricitve child class method 
the method marked private can't be access in child 
outside of that class in which they are defind
*/
class Base{
   void show(){
     System.out.println("Show Method is Base Class");
	 out();
    }
	private void out(){
		System.out.println("out method from base class ");
	}
	protected void display(){
		System.out.println("Display  mehtod from base class");
	}
   }
class Child extends Base{
	void show(){
		System.out.println("Show Method Child Class ");
			super.show();
	}
	public void display(){
		System.out.println("Display method from child class");
		super.display();
	}
}
class TextOverridding5{	
   public static void main(String []args){
     Child c1 = new Child(); 
  	  c1.show();
	  c1.display();
 }
}