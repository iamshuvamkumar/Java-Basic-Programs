import java.util.Scanner;

class SandglasStarPattern{
 public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value ");
    int x = sc.nextInt();
       int sp = 1;
       int st = x;
       int tem = st;
       int sx=sp;

   for(int i=1;i<=x;i++){
     for(int s=1;s<=sp;s++){
      System.out.print(" ");
       }
       for(int j=1;j<=st;j++){
       System.out.print(" *");
       }
       sp++;
       st--;
      System.out.println();
     }
      for(int i=1;i<=x;i++){
        for(int s=1;s<=tem;s++){
         System.out.print(" ");
       }
        for(int j=1;j<=sx;j++){
       System.out.print(" *");
       }
       sx++;
       tem--;
      System.out.println();
     }
}
}