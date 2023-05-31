//Write a Java program to find maximum between three numbers using conditional operator.

import java.util.Scanner;

class Max3Num{
public static void main(String[]args){

Scanner max = new Scanner(System.in);

int x = max.nextInt();
int y = max.nextInt();
int z = max.nextInt();

if((x>y)&&(x>z)){
System.out.print("X is geater");
}
else if(y>z){
System.out.print("Y is geater");
}
else{
System.out.print("Z is geater");
}

}
}