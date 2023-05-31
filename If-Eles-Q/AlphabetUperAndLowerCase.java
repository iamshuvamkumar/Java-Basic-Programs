//Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;

  class AlphabetUperAndLowerCase{
  public static void main(String[]RK){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a alphabet ");
	char ch = sc.next().charAt(0);
	if(ch>='a'&&ch<='z')
	System.out.print("LowerCase");
	else if(ch>='A'&&ch<='Z')
	System.out.print("UpperCase");
	else{
	System.out.print("This Is Not A Alphabet");
	}
}
}