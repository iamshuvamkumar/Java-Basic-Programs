//WAP to Reversed method
import java.util.Scanner;

class ReversedMethod{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Number. ");
 int x = sc.nextInt();
 int rev = 0,sum = 0;

 while(x!=0){
 rev=x%10;
 sum = rev+(sum*10);
 x/=10;
 
 }
System.out.print(sum);

}
}