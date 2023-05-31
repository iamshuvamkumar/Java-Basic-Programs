
import java.util.Scanner;

class IncrementDecrement{

public static void main(String[]args){
Scanner sc = new  Scanner(System.in);

int x = sc.nextInt(); //5
int y = sc.nextInt();//2
int a=0,b=0;

a = x++;  //post

System.out.println("First A print "+a);
System.out.println("Then X Increment "+x);

a = ++y; //pre

System.out.println("First A Increment "+a);
System.out.println("Then Y Print "+y);

b = x--; //post

System.out.println("First B print  "+b);
System.out.println("Than X Decrement "+x);
 
b = --y; //pre

System.out.println("First B Decrement than print "+b);
System.out.println("Than Y print "+y);

}
}
