//Write a Java program to check whether a number is negative, positive or zero.

import java.util.Scanner;

class NagativPositiveZeroNum{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number ");
int num = sc.nextInt();

if(num>0){
System.out.print("Number is Positive ");
}
else if(num<0){
System.out.print("Number is Negative ");
}
else{
System.out.print("Number is Zer0");
}

}
}