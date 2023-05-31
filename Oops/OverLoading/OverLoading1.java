class OverLoading1{
	int show(int x){
		System.out.println("Int x "+x);
		return 20;
	}
	void show(int x){
		System.out.println("Void x "+x); //Give Error
	}
	/*void show(long x){   //change the argument not given error
		System.out.println("Void x "+x);  
	}*/
  public static void main(String []args){
  OverLoading1 obj = new OverLoading1();
  obj.show(54);
   
  }
 }
 
 /*The fubction OverLoading is alwayas achive to change
 the arguments of the function does not matter return 
 of function it uiquely identify the arguments are deffrent
 thhe function overloading can't be achive to change the return 
 of function only
 its only and only arguments are diferent */
 
 