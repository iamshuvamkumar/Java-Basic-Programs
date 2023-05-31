
import java.util.Scanner;

class RightPascalsTriangle{
 public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value ");
    int x = sc.nextInt();
    int s=x/2+1;
    int st=1;
    

  for(int i=1;i<=x;i++){
    for(int j=1;j<=st;j++){
      System.out.print("*");
    }
    if(i<s){
    st++;
    }
    else{
    st--;
   }
  System.out.println();
  }


}
}