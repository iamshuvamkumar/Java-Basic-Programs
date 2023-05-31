//Write a java program to check whether a character is alphabet or not.

import java.util.Scanner;

class CharAlphabatOrNot{
  public static void main(String[]T){
   Scanner sc = new Scanner(System.in);

   char ch = sc.next().charAt(0);

	if((ch>='a'&&ch<='z'||(ch>='A'&&ch<='Z')
	System.out.print("Alphabet ");
	else
	System.out.print("Not Alphabet");
}
}
