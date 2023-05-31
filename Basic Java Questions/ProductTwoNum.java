//WAP to take  two number as input and display the product two number

import java.util.Scanner;

class ProductTwoNum{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value. ");
    int a = sc.nextInt();
   System.out.print("Enter Value. ");
    int b = sc.nextInt();
  
   int p = a*b;
   System.out.print("Product of Two Number is"+a+" * "+b+" = "+p);

}
}