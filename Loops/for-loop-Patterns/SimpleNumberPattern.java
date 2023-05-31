
import java.util.Scanner;
class SimpleNumberPattern{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value. ");
   int x = sc.nextInt();
   for(int i=1;i<=x;i++){
    for(int j=1;j<=i;j++){
    System.out.print(" "+j);
    }
  System.out.println();
}


}
}