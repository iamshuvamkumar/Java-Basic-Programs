//WAP to print table.

import java.util.Scanner;

class PrintTable{
 public static void main(String[]RK){
  Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number. ");
  int x = sc.nextInt();
  int i = 1,tab=1;

  while(i<=10){
  tab = x*i;
  System.out.println(x+"*"+i+"="+tab);
  i++;
  }

}
}
 
