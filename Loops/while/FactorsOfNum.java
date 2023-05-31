
import java.util.Scanner;
 class FactorsOfNum{
   public static void main(String[]Rk){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value. ");
   long num = sc.nextLong();
   int i=1;
   while(i<=100){
   if(num%i==0)
   System.out.print(" "+i+" ");
   i++;
   }
 }
}

