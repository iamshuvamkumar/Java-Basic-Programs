
import java.util.Scanner;
class SumOfDigits{
  public static void main(String[]RK){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Starting Value. ");
    int st = sc.nextInt();
   System.out.print("Enter Ending Value. ");
    int ed = sc.nextInt();
     int tem = 0;
   while(st<=ed){
      tem+=st;
       st++;
     }
   System.out.print("Sum of Digits is "+tem);
   }
 }
