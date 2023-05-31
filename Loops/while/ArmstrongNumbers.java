import java.util.Scanner;

class ArmstrongNumbers{
  public static void main(String...s){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Numbers. ");
    int num = sc.nextInt();
    int sum=0,rem=0,tem=num;
   while(num!=0){
    rem = num%10;
    sum= sum+(rem*rem*rem);
    num/=10;    
    }
  
  if(tem==sum)
  System.out.println("Its Armstrong Numbers. "+sum);
  else
  System.out.println("Its Not Armstrong Numbers. "+sum);
    }
   }