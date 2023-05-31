
import java.util.Scanner;
class LogicalOperator{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();

//Is AND

boolean z = (x>a)&&(y<b);
System.out.println(z);

// Is OR

boolean z1 = (x>a)||(y<b);
System.out.println(z1);

//Is Not

boolean z2 = !(x==b);
System.out.println(z2);

}
}

/*
x=5,y=2:a=3,b=4;
5>3&&2<4 = T

x=4,y=6:a=9,b=1;
4>9;6<1 

!(x==b)

*/