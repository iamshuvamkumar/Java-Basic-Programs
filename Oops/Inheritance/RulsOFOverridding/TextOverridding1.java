/*The Rules For Method Overridding For Primitive return type
1)The argument list must be match sub class method same as 
super class
*/
class Base{
   void show(){
     System.out.println("Show Method is Base Class");
    }
   }
class Child extends Base{
	void show(){
		System.out.println("Show Method Child Class ");
			super.show();
	}
}
class TextOverridding1{	
   public static void main(String []args){
     Child c1 = new Child();
  	  c1.show();
  }
}

