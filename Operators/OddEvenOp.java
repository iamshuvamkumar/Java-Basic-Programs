
import java.util.Scanner;
  class OddEvenOp{
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
    int x= sc.nextInt();
    boolean tf= x%2==0;
    System.out.print("A Number is Even(T) & Odd(F). "+tf);

}
}