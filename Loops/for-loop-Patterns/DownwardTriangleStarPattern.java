
import java.util.Scanner;

class DownwardTriangleStarPattern{
 public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value ");
  int x = sc.nextInt();
 for(int i = 1;i<=x;i++){
     for(int j =x;j>=i;j--){
       System.out.print(" *");
      }

   System.out.println();
 }

}
}