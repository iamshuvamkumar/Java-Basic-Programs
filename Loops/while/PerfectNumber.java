  
class PerfectNumber{
   public static void main(String[]args){
    int x = 6;
    int sum=0;
    int i = 1;

 while(i<x){        
      if(x%i==0){
      System.out.print(" "+i);
      sum = sum+i; 
       }
     i++;  
    }
   System.out.println();
    System.out.print(" "+sum);

 }
 }