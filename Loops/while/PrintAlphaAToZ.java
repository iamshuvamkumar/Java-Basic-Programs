import java.util.Scanner;
  class PrintAlphaAToZ{
	public static void main(String[]rk){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Starting Range. ");
  	 int i = sc.nextInt();  //A=65 ,a=97
    	System.out.print("Enter Ending Range. ");
 	 int j = sc.nextInt();  //z=90,Z=122
   while(i<=j){
	System.out.println((char)i);
    i++;
  }
}
}