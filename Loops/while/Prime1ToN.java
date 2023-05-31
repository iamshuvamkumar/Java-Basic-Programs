import java.util.Scanner;

class Prime1ToN{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Starting Value. ");
      int i = sc.nextInt();
     System.out.print("Enter Ending Value. ");
      int n = sc.nextInt();
       int sum=0;
      while(i<=n){
        int j = 1;
        int count = 0;
      while(j<=i){
        if(i%j==0)
         count++;
        j++;
       }
    if (count==2){  
     System.out.print(" "+i);
      }
      i++;   
      }
    }
   }