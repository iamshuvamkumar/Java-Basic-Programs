
class Base{
   void show(){
     System.out.println("Show Method is Base Class");
    }
   }
class Child extends Base{
	void show(){
		System.out.println("Show Method Child Class "+x);
			super.show();
	}
}
class TextOverridding3{	
   public static void main(String []args){
     Child c1 = new Child(); 
  	  c1.show();
 }
}