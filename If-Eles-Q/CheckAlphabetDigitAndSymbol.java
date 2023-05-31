//Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.Scanner;

  class CheckAlphabetDigitAndSymbol{
  public static void main(String[]RK){
  Scanner sc = new Scanner(System.in);
  char ch = sc.next().charAt(0);
  if((ch>='a '&& ch<='z')||(ch>='A'&&ch<='Z')){
  System.out.print("Alphabet");
  }
  else if(ch>='0'&& ch<='9'){
   System.out.print("Number");
  }
  else
  {
  System.out.print("Symbol");
   }

}
}