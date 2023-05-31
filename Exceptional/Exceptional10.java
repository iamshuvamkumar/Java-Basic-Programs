//Coustom Exception

class MyException extends Exception{
	MyException(String str){
		super(str);
	}
}

 class Exceptional10 extends MyException{
	 String str;
	 
	 Exceptional10 (String str){
		 super(str);
		 this.str=str;
	 }
	 public String toString(){
		 return str;
	 }
	 void get (int x)throws MyException
	 {
		 if(x<18)
		 {
		//throw new MyException("X is less than Exception");
		   throw new Exceptional10("X is less than Exc...");		
		 }
		 else
			 System.out.println("X = "+x);
	 }
	 public static void main(String...s){
		 Exceptional10 obj = new Exceptional10("User Defined Exce....");
           System.out.println("The ref Id obj "+obj);	
       try{
		   obj.get(17);
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
System.out.println("Main End");
	}
 }