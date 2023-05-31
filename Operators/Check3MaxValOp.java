import java.util.Scanner;
 class Check3MaxValOp{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

    System.out.print("Enter Value A. ");
     int a = sc.nextInt();

    System.out.print("Enter Value B. ");
     int b = sc.nextInt();

    System.out.print("Enter Value C. ");
     int c = sc.nextInt();
 
   boolean tf ;
   tf = (a>b && a>c)?a:(b>c)?b:c;
    System.out.print("A max Value Is "+tf);
}
}