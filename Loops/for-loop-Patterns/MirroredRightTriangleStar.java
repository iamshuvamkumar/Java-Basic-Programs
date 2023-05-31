
import java.util.Scanner;
class MirroredRightTriangleStar{
  public static void main(String[]Rk){
   Scanner sc = new Scanner(System.in);
 System.out.print("Enter value. ");

  int x = sc.nextInt();
  int sp = x,st = 1;
  
   for(int i=1;i<=x;i++){
    for(int s=1;s<=sp;s++){
    System.out.print(" ");
   }
  for(int j=1;j<=st;j++){
   System.out.print("*");
   }
    sp--;
    st++;
  System.out.println();
  }


}
}