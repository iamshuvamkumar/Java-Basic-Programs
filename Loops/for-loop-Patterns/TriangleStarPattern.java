
import java.util.Scanner;

class TriangleStarPattern{

  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);

 System.out.print("Enter value. ");

  int x = sc.nextInt();

  for(int i = 1;i<=x;i++){
  for(int s = i;s<=x;s++){
  System.out.print(" ");
}
  for(int j = 1;j<=2*i-1;j++){
    if(j==1||i==x||j==2*i-1)
     System.out.print("*");
   else
    System.out.print(" ");
}
System.out.println();
}

}
}

 

