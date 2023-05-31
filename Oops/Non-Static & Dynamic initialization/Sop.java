class PrintStream1{
	void println(String Str){
		System.out.println(Str);
	}
}
class System1{	
   static PrintStream1 out = null;
	 static{
	   out = new PrintStream1();
	  }
  }

class Sop{
	public static void main(String [] args){
		System1.out.println("Hello System.out.println");
	}
}
