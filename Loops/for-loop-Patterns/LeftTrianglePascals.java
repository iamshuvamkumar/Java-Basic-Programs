import java.util.Scanner;

class LeftTrianglePascals{
 public static void main(String[]Rk){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a value ");
    int x = sc.nextInt();
   int sp=x/2+1;
    int st=1;
  int tem =sp;
    
   for(int i=1;i<=x;i++){
     for(int s=1;s<=sp;s++){
      System.out.print(" ");
     }
     for(int j=1;j<=st;j++){
      System.out.print("*");
     }
   if(i<tem){
    sp--;
    st++;
   }
   else{
     sp++;
     st--;
   }
   System.out.println();  
   }


}
}