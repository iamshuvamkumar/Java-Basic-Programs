/*If it Parent class Method throws broader Exception must be 
throws Overridden method in child class 
It is  call inside Exception Handler

If it Parent class Method does not  throws broader Exception
Child class Overridden Method can't be throws */

class Base{
     
   void show()  throws Exception
   {
	System.out.println("Show Method from Base class  ");
   }	 
}
class Exceptional11 extends Base{
    
   void show() throws Exception 
   {
	System.out.println("Show Method from Child class  "); 
	super.show();
   }
   public  static void main(String ...s)  
   {
	   Exceptional11 obj = new Exceptional11();
	   //obj.show();
	   
	   try{
		  obj.show();
		}
	    catch(Exception e){
		  e.printStackTrace();
		}
	    System.out.println("End of Main ");
	}
}

 