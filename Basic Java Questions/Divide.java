//Write a Java program to divide two numbers and print on the screen
import java.util.Scanner;

class Divide{
public static void main(String[]args){
Scanner div = new Scanner(System.in);
System.out.println("Enter a value of X And Y ");
int x = div.nextInt();
int y = div.nextInt();
float d = x/y;
System.out.print("A division value is "+d);
}
}
