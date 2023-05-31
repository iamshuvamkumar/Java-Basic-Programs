import java.util.Scanner;

class CheckRectanglePerimeter{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);

   System.out.print("Enter Length. ");
   int l = sc.nextInt();

    System.out.print("Enter breadth.  ");
     int b = sc.nextInt();

     int area  = l*b;
     int per =  2*(l+b);

    if (area>per){
     System.out.print("Area Greater Than Perimeter");
     }
    else if(per>area){
      System.out.print("Perimeter Greater Than Area");
    }
   else{
     System.out.print("Area and Perimeter is Equal ");
   }

}
}