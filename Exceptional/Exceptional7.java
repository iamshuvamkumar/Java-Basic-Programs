//try with finally block and a finally block after catch block
class Exceptional7{
	public static void main(String[]s){
	 try{
		 int x = 10/s.length;
		 System.out.print(x);
	 }
	 catch(Exception e){
		 System.out.println("perent Exception ");
	 }
	 finally{
		 System.out.println("Finally block");
	 }
	 }
	}