
import java.util.Scanner;
 class FindMax2ValueOP{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter value 1st. ");
    int a = sc.nextInt();
  System.out.print("Enter value 2nd. ");
    int b = sc.nextInt();
    boolean ab = a>b;
    boolean ba = b>a;
 System.out.println("A Greater than b "+ab);
 System.out.println("B Greater than a "+ba);

}
}