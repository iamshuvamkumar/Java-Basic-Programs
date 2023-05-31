abstract class GrandFAther{
  abstract void show();
  abstract void display();
  }
  abstract class Father extends GrandFAther{
   void show(){
   System.out.println("Show method GrandFAther class ");
   System.out.println("Override in Father class \n");
   }
   abstract void out();
   abstract void result();
  }
  class child extends Father{
	  void get(){
		  System.out.println("Child class get method \n");
		  }
	  void display(){
		  System.out.println("GrandFAther calss dilsplay method ");
		  System.out.println("oberride in child class \n");
	  }
	  void out(){
		  System.out.println("Father calss out method ");
		  System.out.println("oberride in child class \n");
	  }
	  void result(){
		  System.out.println("Father calss result method ");
		  System.out.println("oberride in child class \n");
	  }
  }
  
	  
  class test2{
  public static void main(String [] args){
	  GrandFAther g1 = new child();
	  Father f1 = new child();
	  child c1 = new child();
	  System.out.println("\n GrandFAther calss \n ");
	  g1.show();
	  g1.display();
	   System.out.println("\n Father calss \n ");
	  f1.show();
	  f1.out();
	  f1.result();
	  System.out.println("\n Child calss \n ");
	  c1.get();
	  c1.display();
	  c1.out();
	  c1.result();
  }
  }