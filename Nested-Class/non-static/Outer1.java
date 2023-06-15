//error
class Outer1{
   int x = 10;
   static int y = 20;
   static void display(){
      System.out.println("display of Outer y   = "+y);
   }
   class Inner1{
	  int a = 30;  
	  static int b = 40;
	  void show(){
         System.out.println("\nshow of Inner   ");
		 System.out.println(" x =   "+x);
		 System.out.println(" a =   "+a);
		 System.out.println(" y =   "+y);
		 System.out.println(" b =   "+b);
		 out();
      }	
	  
	  static void out(){
         System.out.println("\nout of Inner   ");
		 System.out.println(" y =   "+y);
		 System.out.println(" b =   "+b);
      }
	  
    public static void main(String ...s){
         System.out.println("Main .........  ");
		 System.out.println(" y =   "+y);
		 display();
		 
		 Outer1 o = new Outer1();
		 Outer1.Inner1  i = o.new  Inner1();
         i.show();	
		 System.out.println(" b....... =   "+b);
		  //out();
		 
	   }	 
   }	   
}