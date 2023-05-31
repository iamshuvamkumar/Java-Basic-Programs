
import java.util.Scanner;

class RelationalOperator{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a value in X var ");
int x = sc.nextInt();

System.out.print("Enter a value in Y var ");
int y = sc.nextInt();

boolean ans ;

ans = x==y;
System.out.println("Is == equal to X == Y "+ans);

ans  = x>y;
System.out.println("Is > Greater than X > Y "+ans);

ans  = x>=y;
System.out.println("Is >= Greater than Equal to X >= Y "+ans);

ans  = x<y;
System.out.println("Is < Less than X < Y "+ans);

ans  = x<=y;
System.out.println("Is <= Less than Equal to X <= Y "+ans);

ans  = x!=y;
System.out.println("Is != NOT Equal  to X != Y "+ans);

}
}
