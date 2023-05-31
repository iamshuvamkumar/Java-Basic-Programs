 
import java.util.Scanner;
 class AreaAndPerimeterOfRectangle{
    public static void main(String[]args){
  
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter Width. ");
     float w = (float) sc.nextFloat();
    System.out.print("Enter Hight. ");
     float h = (float) sc.nextFloat();
 
     float a = w*h;
     float p = 2.0f*(w+h);
     System.out.format("Area of Rectangle. "+"%.2f",a);
     System.out.format("\nArea of Rectangle. "+"%.2f",p);

  }
}
