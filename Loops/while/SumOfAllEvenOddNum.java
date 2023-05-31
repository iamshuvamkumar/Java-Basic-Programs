import java.util.Scanner;
	class SumOfAllEvenOddNum{
	public static void main(String[]rk){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Starting Range. ");
	int i = sc.nextInt();   
        System.out.print("Enter Ending Range. ");
	int n = sc.nextInt(); 
        int sumE = 0,sumO=0;
      while(i<=n){
         if(i%2==0)
	   sumE+=i; 
         else
          sumO+=i;
        i++;
       }

   System.out.println("Even Sum "+sumE);
   System.out.println("Odd Sum "+sumO);
   
   }
  }