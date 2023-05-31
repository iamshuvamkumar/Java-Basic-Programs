//Write a program to find a factorial of number.

import java.util.Scanner;

class FactorilOfNum{
  public static void main(String[]RK){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Number. ");
  int x = sc.nextInt();
  int i = 1;
  int fact = x;
  while(i<x){
  fact =fact*i;
  //System.out.println(x+"*"+i+"="+fact);
  i++;
 }
System.out.println("Factriol of Number is. "+fact);
}
}