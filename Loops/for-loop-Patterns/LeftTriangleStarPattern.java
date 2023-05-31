 
import java.util.Scanner;

  class LeftTriangleStarPattern{
    public static void main(String[]Rk){
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter value. ");
       int x = sc.nextInt();
        for(int i=1;i<=x;i++){
         for(int s=x;s>i;s--){
          System.out.print("  ");
         }
         for(int j=1;j<i;j++){
         System.out.print(" *");
         }
       System.out.println();
      }
}
}