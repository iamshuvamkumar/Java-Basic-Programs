//Write a Java program to check whether year is leap year or not using conditional operator.
 
import java.util.Scanner;

class LeapYear{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a Year ");
int year = sc.nextInt();
if(year%4==0){
System.out.print("Leap Year");
}

else{
System.out.print(" Not Leap Year");
}

}
}
 