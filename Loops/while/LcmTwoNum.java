import java.util.Scanner;
class LcmTwoNum{
   public static void main(String[]RK){
Scanner sc = new Scanner(System.in);
  System.out.print("Enter  value A  ");
   int a=sc.nextInt();
 System.out.print("Enter  value  B ");
   int b=sc.nextInt();
     int i=1;
    int x = a>b?a:b;
  while(i!=0){
   if(x%a==0&&x%b==0){
    System.out.print(x);
    break;
   }
  ++x;
}
  }
 }