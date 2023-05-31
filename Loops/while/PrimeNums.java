  import java.util.Scanner;
  
class PrimeNums{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
   int n1 = sc.nextInt();
   int i=2;

   while(i<=10){
   int j=2,m=i;
    while(j<=i){
    if(m%j==0){
    System.out.println("Prime "+j);
    break;
     }
    j++;
   }
    i++;

     }
   }
 } 
