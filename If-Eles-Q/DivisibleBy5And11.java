//Write a java program to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;

class DivisibleBy5And11{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any Number :");
    int x = sc.nextInt();
    if((x%5==0)&&(x%11==0))
    System.out.print("Yes divisible by 5 and 11");
    else
    System.out.print("No divisible by 5 and 11");
}
}


