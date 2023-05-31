import java.util.Scanner;

class DiamondStarPattern{
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
     int x = sc.nextInt();
     int sp = x/2+1;
     int st = 1;
     int tem=sp;

if(x%2==0){
  for(int i=1;i<=x+1;i++){
   for(int s=1;s<=sp;s++){
    System.out.print(" ");
  }
    for(int j=1;j<=2*st-1;j++){
      if(j==1||j==2*st-1)
      System.out.print("*");
      else
     System.out.print(" ");
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
else{
 for(int i=1;i<=x;i++){
   for(int s=1;s<=sp;s++){
    System.out.print(" ");
  }
    for(int j=1;j<=2*st-1;j++){
      if(j==1||j==2*st-1)
      System.out.print("*");
      else
     System.out.print(" ");
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
}