//WAP to input length and breadth check  rectangle is Squar or not
import java.util.Scanner;

class CheckRectSquarOrNot{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter Length & Breadth. ");
    int l= sc.nextInt();
    int b= sc.nextInt();
    if(l==b)
    System.out.print("Yes This is Squar");
    else
    System.out.print("No This is not a Squar");
 }
}

