interface Text{
	 public static void show(){
		System.out.println("static Mehtod Class interface ");
	}
	public static int add(int a,int b){
		return(a+b); 
	}
}

class interface8 implements Text{
	
	public static void main(String[]args){
		Text obj = new  interface8();
	  Text.show();
	  int i = Text.add(5,4);
	  System.out.println("Sum "+i);
	  System.out.println("sum "+Text.add(5,5));
		
	}
	}   
