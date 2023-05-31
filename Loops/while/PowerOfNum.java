import java.util.Scanner;
  class PowerOfNum{
   public static void main(String[]RK){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Num. ");
  int num = sc.nextInt();
  System.out.print("Enter Power. ");
  int pow = sc.nextInt();
  int i=1;
  int tem = 1;
  while(i<=pow){
   tem=num*tem;
  i++;
  }

 System.out.print(" "+num+" ^ "+pow+" = "+tem);

}
}
  