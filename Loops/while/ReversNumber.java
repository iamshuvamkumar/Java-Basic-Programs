 import java.util.Scanner;
   class ReversNumber{
    public static void main(String[]Rk){
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter Value. ");
      long  num = sc.nextLong();
      long rev = 0,sum=0;

       while(num!=0){
        rev = num%10;
        sum = (sum*10)+rev;
 	num/=10;
       }
     System.out.print("Number Revers Value is. "+sum);
  }
 }