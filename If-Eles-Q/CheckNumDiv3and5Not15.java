 import java.util.Scanner;  
   class CheckNumDiv3and5Not15{
    public static void main(String[]Rk){
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter Number ");
     int num = sc.nextInt();
  /*  
   if(num%5==0 || num%3==0){
      if(num%15!=0){
       System.out.print(" Number Divisible 5 and 3 but not 15 ");
      } 
      else{
      System.out.print(" Divisible 15 ");
      }
     }
   else{
      System.out.print(" Not Divisible ");
    }
*/

 if((num%5==0||num%3==0)&&num%15!=0)
    System.out.print(" Number Divisible 5 and 3 but not 15 ");
 else
   System.out.print(" Not Divisible ");
}
} 