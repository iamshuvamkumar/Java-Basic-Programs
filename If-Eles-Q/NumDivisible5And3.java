
 import java.util.Scanner;
  class NumDivisible5And3{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Nummber. ");
    int x = sc.nextInt();
    if(x%5==0 && x%3==0)
    System.out.print("Its divisible by 5 and 3 = "+x);
    else
    System.out.print("Its not divisible by 5 and 3 = "+x);

   }
  }