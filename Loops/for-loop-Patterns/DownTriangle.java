import java.util.Scanner;

class DownTriangle{
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
    int x = sc.nextInt();
    int st = x;

   for(int i=1;i<=x;i++){
     for(int s=1;s<i;s++){
         System.out.print(" ");
    }
    for(int j=1;j<=2*st-1;j++)    
     if(j==1||i==1||j==2*st-1)
       System.out.print("*");
     else
      System.out.print(" ");
    st--;
   System.out.println();
   }


}
}
 



