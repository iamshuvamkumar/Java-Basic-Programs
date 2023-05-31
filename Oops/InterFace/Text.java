interface Text{
	 public static void show(){
		System.out.println("static Mehtod Class interface ");
	}
	public static int add(int a,int b){
		return(a+b); 
	}
}

	public static void main(String[]args){
		show();
	  int i = add(5,4);
	  System.out.println("Sum "+i);
	  System.out.println("sum "+add(5,5));
		
	}
	}   
