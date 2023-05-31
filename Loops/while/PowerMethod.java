//Write A program to build power method.
 import java.util.Scanner;
 class PowerMethod{
 public static void main(String[]Rk){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number. ");
 int num = sc.nextInt();
 System.out.print("Enter a power. ");
 int power = sc.nextInt();
 int i = 1;
 int res = 1;

 while(i<=power){
 res=res*num;
 i++;
 }
System.out.println(num+" ^ "+power+" = "+res);
}
}



