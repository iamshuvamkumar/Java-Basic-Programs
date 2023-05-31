/*Write a java program to input all sides of a triangle
 and check whether triangle is valid or not.*/

import java.util.Scanner;
class TriangleValidSide{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Value of triangle ");
 int a = nextInt();
 int b = nextInt();
 int c = nextInt();

if((b+c>a)&&(a+c>b)&&(a+b>c))
System.out.print("Triangle Is Valid ");
else
System.out.print("Triangle Is Not Valid ");

}
}


