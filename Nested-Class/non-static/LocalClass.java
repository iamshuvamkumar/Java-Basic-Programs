class Outer{
   int x = 10;
   static int y = 20;
   void display(){
      System.out.println("display of Outer y   = "+y);
	  System.out.println(" x =   "+x);
      class Inner {
	    int a = 30;  
	    void show(){
          System.out.println("\nshow of Inner   ");
		  System.out.println(" x =   "+x);
		  System.out.println(" a =   "+a);
		  System.out.println(" y =   "+y);
	    }	
	  }
      Inner i = new Inner();
	  i.show();
   }
}
class LocalClass{
	public static void main(String[]args){
		 Outer o = new Outer();
		 o.display();
		 
	  }
	}