 import java.util.Scanner;  
   class CheckTriangleIsValid{
    public static void main(String[]Rk){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Angle1 ->");
     int a = sc.nextInt();
    System.out.print("Enter Angle2 ->");
     int b = sc.nextInt();
    System.out.print("Enter Angle3 ->");
     int c = sc.nextInt();

    //int sum = a+b+c;

  if(b+c>a && a+c>b && a+b>c)
     System.out.print("Trangle Is Valid.  ");
  else
    System.out.print("Trangle Is Not Valid.  ");
        
    }
}




    