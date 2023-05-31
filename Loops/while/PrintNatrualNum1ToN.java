
import java.util.Scanner;
class PrintNatrualNum1ToN{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter Range .");
    int x = sc.nextInt(); 
    int i = 1;
   while(i<=x){
    System.out.println(i);
    i++;
   }
 }
}