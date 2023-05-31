import java.util.Scanner;

public class  CheckPosNav{
    
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input value: ");
        int x = sc.nextInt();

       if (x>0){
         if (x<1){
          System.out.print("P");
          }
         else if(x>1000000){
          System.out.print("L P");
         }     
         else {
         System.out.print("P");
         }
      }
 else if(x<0)
  System.out.print("N");


   
    }
}
