
import java.util.Scanner;

class DiamondShapePattern{
  public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value ");
   int x = sc.nextInt();
   int st=1,sp=x/2+1;  
   int m = sp;

 /*  for(int i = 1;i<=x;i++){

  for(int s=1;s<=sp;s++){
   System.out.print(" ");
  }
   for(int j = 1;j<=st;j++){
    System.out.print(" *");
   }
    if(i<m){
      sp--;
      st++;
     }
      else{
        sp++;
        st--;
       }
System.out.println();
}*/
/*
for(int i=1;i<=11;i++){
   for(int j=1;j<=11;j++){
     if(j==6-i||j==4+i ||j==5)
        System.out.print("*"); 
     else 
   System.out.print(" ");
 }
 System.out.println();
 }
 */
  }
}