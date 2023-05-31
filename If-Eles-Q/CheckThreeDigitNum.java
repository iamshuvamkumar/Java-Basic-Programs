
import java.util.Scanner;
 class CheckThreeDigitNum{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Number. ");
   int x = sc.nextInt();
   
  if(x>99 && x<1000)
  System.out.print("Yes This Is Three Digit Num. "+x);
  else
  System.out.print("This Is Not Three Digit Num. "+x);
   
}
}


