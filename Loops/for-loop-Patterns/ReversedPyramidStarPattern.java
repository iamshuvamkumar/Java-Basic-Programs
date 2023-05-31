import java.util.Scanner;

  class ReversedPyramidStarPattern{
    public static void main(String[]Rk){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value. ");

     int x = sc.nextInt();
     int st = x;

  for(int i=1;i<=x;i++){
   for(int s=1;s<=i;s++){
   System.out.print(" ");
    }
    for(int j=1;j<=st;j++){
    System.out.print(" *");
    }
     st--;
     System.out.println();
   }

}
}