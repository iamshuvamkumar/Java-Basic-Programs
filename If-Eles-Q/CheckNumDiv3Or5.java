import java.util.Scanner;
 class CheckNumDiv3Or5{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a Number. ");
   int x = sc.nextInt();
    if(x%5==0 || x%3==0)
 System.out.print("A Number is divisible 5 or 3 ");
 else
System.out.print("A Number not divisible 5 or 3 ");
}
}