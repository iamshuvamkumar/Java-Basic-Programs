
 import java.util.Scanner;
 class CountNumber{
  public static void main(String[]RK){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value. ");
    int num = sc.nextInt();
    int count=0;

    while(num!=0){
     num/=10;
     count++;
  }
 System.out.print(count);
}
}