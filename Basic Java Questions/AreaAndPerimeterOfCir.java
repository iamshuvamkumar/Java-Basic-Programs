import java.util.Scanner;
class AreaAndPerimeterOfCir{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
  float r = sc.nextFloat();
   float pi = 3.14f;
  double a = pi*r;
  double p = 2.0*pi*r;
 System.out.format("Area "+"%.2f", a);
 System.out.format("\nperimeter "+"%.2f", p); 

}
}