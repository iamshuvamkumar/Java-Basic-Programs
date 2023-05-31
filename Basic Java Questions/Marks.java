//Write a java program to enter marks of five subjects and calculate total, average and percentage

import java.util.Scanner;

class marks{

public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Marks of Math ");
int M = sc.nextInt();
System.out.print("Enter a Marks of Hindi ");
int H = sc.nextInt();
System.out.print("Enter a Marks of English ");
int E = sc.nextInt();
System.out.print("Enter a Marks of Scince ");
int S = sc.nextInt();
System.out.print("Enter a Marks of SKT ");
int Sk = sc.nextInt();

int per= (M+H+E+S+Sk)/5;
int marks= M+H+E+S+Sk;
System.out.print("Total Marks And Per"+marks+" "+per);

}
}