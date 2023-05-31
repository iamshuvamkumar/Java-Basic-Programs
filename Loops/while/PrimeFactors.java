import java.util.Scanner; 
 
class PrimeFactors{
   public static void main(String[]Rk){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value ");
  int i = 2,j=1,num=sc.nextInt();
  int tem=num;
  while(i<num){
   
     if(tem%i==0)
      System.out.print(" "+i);
   i++;
 }


  }
}