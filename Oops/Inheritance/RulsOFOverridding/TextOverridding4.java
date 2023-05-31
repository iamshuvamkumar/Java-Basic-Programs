/*The argument its same parent & child class method but 
return type is diffrent then give error not be compile
*/
class Base{
   void show(){
     System.out.println("Show Method is Base Class");
    }
   }
class Child extends Base{
	int show(){
		System.out.println("Show Method Child Class "+x);
			super.show();
	}
}
class TextOverridding4{	
   public static void main(String []args){
     Child c1 = new Child(); 
  	  c1.show();
 }
}