 
 import java.util.Scanner;

  class CheckTwoDigitNum{

   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Number. ");
     int x = sc.nextInt();
   if(x>=10 && x<=99)
   System.out.print("Its a Two Digit Number. ");
  else
  System.out.print("Its not Two Digit Number. ");

}
}