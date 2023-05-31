
import java.util.Scanner;
class FirstAndLastDigit{
   public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
 System.out.print("Enter A Value. ");
   int n = sc.nextInt();
   int r = 0;
   int fst = 0;
   int lst = 0;
   int sum = 0;
int  tem = n;
   while(n!=0){
    r = n%10;
    sum=(sum*10)+r;
    n/=10;
   }
  fst= sum%10;
 System.out.println("A First Value of Number Is "+fst);
  lst = tem%10;
 System.out.println("A Last Value of Number Is "+lst);
//System.out.println(tem);

}
}