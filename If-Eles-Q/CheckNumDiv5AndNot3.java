

import java.util.Scanner;
 class CheckNumDiv5AndNot3{
     public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number. ");
   int x = sc.nextInt();
   if(x%5==0 && x%3!=0)
  System.out.print("x is div by 5 but not divisible 3. ");
  else
  System.out.print("x is div by 5 and 3. ");

}
}