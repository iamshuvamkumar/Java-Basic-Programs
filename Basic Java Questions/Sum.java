//Write a Java program to print the sum of two numbers.

import java.util.Scanner;

class Sum{
public static void main(String[]args){
Scanner sum = new Scanner(System.in);
System.out.println("Enter value X and Y");

int x = sum.nextInt();
int y = sum.nextInt();

int add = x+y;

System.out.print("A Sum of two value "+add); 
}
}
