
import java.util.Scanner;
class SumOfProduct{
  public static void main(String[]RK){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Starting Value. ");
    long st = sc.nextInt();
   System.out.print("Enter Ending Value. ");
    long ed = sc.nextInt();
     long tem = 1;
   while(st<=ed){
      tem*=st;
       st++;
     }
   System.out.print("A product of digits is. "+tem);
   }
 }
