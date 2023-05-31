 import java.util.Scanner;
  class FactorialOfNum{
    public static void main(String[]RK){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
    long num = sc.nextLong();
     int i = 1,tem=1;
      
      while(i<=num){
      tem*=i;
       i++;
     }
  System.out.print(num+" Foctorial Is. "+tem);
 }
}
         

