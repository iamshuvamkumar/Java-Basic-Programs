
import java.util.Scanner;

class BitwiseOperator{
public static void main(String[]args){

int x = 60,y=13;
int rs=0;

rs=(x&y);
System.out.println("Bitwise AND & "+rs);
rs=(x|y);
System.out.println("Bitwise OR | "+rs);
rs=(x^y);
System.out.println("Bitwise XOR ^ "+rs);
rs=(x<<y);
System.out.println("Bitwise Left Shift << "+rs);
rs=(x>>y);
System.out.println("Bitwise Right Shift >> "+rs);



}
}

