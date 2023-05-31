  import java.util.Scanner;
  
class PrimeNum{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
   int n1 = sc.nextInt();
   int i=2;

   while(i<=n1){
   if(n1%i==0)
    System.out.println("Prime "+i);
    i++;
     }
   }
 } 
