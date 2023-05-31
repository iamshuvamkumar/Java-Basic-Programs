import java.util.Scanner;

   class ThreePointInJava{
   public static void main(String[]RK){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value X1 ");
     double x1 = sc.nextDouble();
    System.out.print("Enter Value X2 ");
     double x2 = sc.nextDouble();
    System.out.print("Enter Value X3 ");
     double x3 = sc.nextDouble();
    System.out.print("Enter Value Y1 ");
     double y1 = sc.nextDouble();
    System.out.print("Enter Value y2 ");
     double y2 = sc.nextDouble();
    System.out.print("Enter Value Y3 ");
     double y3 = sc.nextDouble();

    double m1 = (y2-y1)/(x2-x1);
    double m2 = (y3-y2)/(x3-x2);

    if(m1==m2)
  System.out.print("The three point lie on a single line ");
   else
  System.out.print("The three point NOT lie on a single line ");
  



}
}


   