import java.util.Scanner;
class UsingWhileLoop{
 public static void main(String[]args){
Scanner sc = new Scanner(System.in);
   int i=1;
  while( i<=1){
   int x = sc.nextInt();
   if(x<=10)
   System.out.print(x+"Is between 1 to 10 ");
  else
   System.out.print(x+"Is not between 1 to 10 ");
i++;
}
}
}