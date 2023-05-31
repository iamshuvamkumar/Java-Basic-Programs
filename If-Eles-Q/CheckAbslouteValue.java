//WAP to  check  abslute value

import java.util.Scanner;

class CheckAbslouteValue{

 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value. ");
    int x= sc.nextInt();

    if(x<0){
    x*=(-1);
    System.out.print(""+x);
    }
    else
    System.out.print(""+x);
 }
}

