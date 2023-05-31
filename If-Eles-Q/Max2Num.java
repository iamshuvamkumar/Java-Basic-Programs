//Write a Java program to find maximum between two numbers using conditional operator.

import java.util.Scanner;

class Max2Num{

public static void main(String[]args){
Scanner max = new Scanner(System.in);
System.out.println("Enter value x and y ");
int x = max.nextInt();
int y = max.nextInt();

if(x>y){
System.out.print("X is greater");
}
else{
System.out.print("Y is greater");
}

}
}