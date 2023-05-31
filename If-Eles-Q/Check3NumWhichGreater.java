
import java.util.Scanner;
  class Check3NumWhichGreater{
    public static void main(String[]args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a 1st Num ");
    int a  = sc.nextInt();
   System.out.print("Enter a 2nd Num ");
    int b  = sc.nextInt();
   System.out.print("Enter a 3rd Num ");
    int c  = sc.nextInt();
   if(a>b && a>c)
  System.out.print("A is greater ");
   else if(b>c)
  System.out.print("b is greater ");
   else
  System.out.print("c is greater ");

}
}

  