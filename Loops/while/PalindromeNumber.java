import java.util.Scanner;
  class PalindromeNumber{
    public static void main(String[]RK){
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number. ");
     long num = sc.nextLong();
    long sum=0,rev=0,tem=num;
   
   
    while(num!=0){
     rev = num%10;
     sum = (sum*10)+rev;
     num/=10;
   }
  if(sum==tem)
   System.out.print("Its Number Is Palindrome ");
  else
  System.out.print("Its Number Not Palindrome ");
}
}
     