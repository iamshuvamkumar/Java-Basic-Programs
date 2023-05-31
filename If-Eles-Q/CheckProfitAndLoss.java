import java.util.Scanner;

class CheckProfitAndLoss{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);

   System.out.print("Enter Cost price. ");
   int cp = sc.nextInt();

    System.out.print("Enter Selling Price.  ");
     int sp = sc.nextInt();

     if(sp>cp){
    System.out.print((sp-cp)+" "+"Profit");
     }
     else if(cp>sp){
    System.out.print((cp-sp)+" "+"loss");
     }

}
}