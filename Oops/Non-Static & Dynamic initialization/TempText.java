import java.util.Scanner;
class Temp{
	static int x;
	static {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value ");
		x= sc.nextInt();
	}
	public static void main(String...s){
		System.out.println("Main in Temp Class ");
		System.out.println("x = "+x);
		System.out.println("x = "+x);
	}
}

class TempText{
	static void get(){
		System.out.println(" get x = "+Temp.x);
	}
	 public static void main(String []t){
    	System.out.println("Main In TempTest Class ");		 
	    System.out.println("x = "+Temp.x);
        get();
	 }
}