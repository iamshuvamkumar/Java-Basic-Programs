
import java.util.Scanner;

class AssignmentOperators{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int rs=0;  //x=5,y=2

//rs = x+=y;
System.out.println(x+=y);  // x+=y  x= 5+2=7

// rs = x-=y;
System.out.println(x-=y);  //x-=y  x=7-2=5

// rs = x*=y;
System.out.println(x*=y); //x*=y  x= 5*2=10

//rs = x/=y;
System.out.println(x/=y);  //x/=y x = 10/2= 5

//rs = x%=y;
System.out.println(x%=y); x%=y = 5%2=1


}
}