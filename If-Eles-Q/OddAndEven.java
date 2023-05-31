//Write a java program to check whether a number is even or odd.

import java.util.Scanner;
class OddAndEven{
  public static void main(String[]T){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Number :");
       int x = sc.nextInt();
	if(x%2==0)
	System.out.print("This Is Even");
	else
	System.out.print("This Is Odd");
}
}