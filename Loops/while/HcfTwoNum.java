  import java.util.Scanner;
  
class HcfTwoNum{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter Value. ");
   int n1 = sc.nextInt();
   System.out.println("Enter Value. ");
   int n2 = sc.nextInt();
   int i = 1;
   int m=0;
   //int a = (n1<n2)?n1:n2;
   
  while(i<=n1){
    if(n1%i==0 && n2%i==0){
        m=i;
     }
    i++;
  }
   System.out.println("HCF ->"+m);
    }
}


