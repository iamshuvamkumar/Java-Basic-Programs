 
import java.util.Scanner;
class NumberPattern{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
  
   System.out.print("Enter Value. ");
    int x = sc.nextInt();
    int n = 1;

   for(int i=1;i<=x;i++){
    for(int j=1;j<i+1;j++){
    System.out.print(""+n);
    n++;
    }
  System.out.println();
  }

}
}
  