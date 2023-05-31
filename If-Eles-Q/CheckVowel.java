//Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;

class CheckVowel{
  public static void main(String[]T){
	Scanner  sc = new Scanner(System.in);
         System.out.print("Enter any Alphabet ");
	char ch = sc.next().charAt(0);

	if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')||(ch=='O'||ch=='o')||(ch=='U'||ch=='u')){
		System.out.print("This Is Vowel");
	}
	else if (ch>='0'||ch<='9'){
		System.out.print("Enter Alphabet Not Number ");
	}
	else {
	System.out.print("This Is Consonant");
	}
	
}
}