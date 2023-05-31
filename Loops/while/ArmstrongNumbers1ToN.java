import java.util.Scanner; 
 
class ArmstrongNumbers1ToN{
   public static void main(String[]Rk){
   Scanner sc = new Scanner(System.in);
   // System.out.print("Enter Value ");

  int i=1;
    int tem,rem,trm;
   int sum;

  while(i<=1000){
      sum=0;
      tem=i;
      trm=tem;
     while(tem!=0){
      rem=tem%10;
      sum=sum+(rem*rem*rem);
      tem/=10;
     }
    if(sum==trm)
   System.out.println("Its arm "+sum);
   i++;
}


  }
}