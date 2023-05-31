/*
2)The argument list super class method & subclass method 
it os not match  its treated as function overloading  
*/
class Base{
   void show(){
     System.out.println("Show Method is Base Class");
    }
   }
class Child extends Base{
	void show(int x){
		System.out.println("Show Method Child Class "+x);
			super.show();
	}
}
class TextOverridding2{	
   public static void main(String []args){
     Child c1 = new Child(); 
  	  c1.show();
	  System.out.println("\nPass Arguments in child class \n");
  	  c1.show(100);
  }
}
/*then we not pass argument in child class Mehtod then print 

*/
