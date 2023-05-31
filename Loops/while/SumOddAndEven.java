
import java.util.Scanner;

 class SumOddAndEven{
  public static void main(String[]args){
   Scanner sc  = new Scanner(System.in);
      System.out.print("Enter a Range ");
	int sumO=0,sumE=0;
	int r  = sc.nextInt();
      for(int i = 1;i<=r;i++){
 	 int x = sc.nextInt();
 	   if(x%2==0)
 	   sumE+=x;
           else
    	   sumO+=x;
        }

System.out.println("Sum OF Even Number "+sumE);
System.out.println("Sum OF Odd Number "+sumO);

}
}


