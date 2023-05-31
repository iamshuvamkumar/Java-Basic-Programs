import java.util.Scanner;
	class Print1ToNEvenOddNum{
	public static void main(String[]rk){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Starting Range. ");
	int i = sc.nextInt();   
        System.out.print("Enter Ending Range. ");
	int n = sc.nextInt();    
      while(i<=n){
    	  if(i%2==0)
     	System.out.println("Its Even "+i);
        else
	System.out.println("Its Odd "+i);
       i++;
     }
   }
}