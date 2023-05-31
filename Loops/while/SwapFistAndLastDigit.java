  import java.util.Scanner;

   class SwapFistAndLastDigit{

   public static void main(String[]Rk){

   Scanner sc = new Scanner(System.in);
    System.out.print("Enter Value. ");
    long num = sc.nextLong();
    long rev=0,rev1=0,sum=0,sum1=0,tem=num,tem1=0,swap1=0,swap;

     int lst= (int)num%10;
     long div = tem/10;

    while(div!=0){
    rev = div%10;
    sum = (sum*10)+rev;
    div/=10;  
     }

      int fst = (int)sum%10;
      long div1 = sum/10;
      tem1= div1;
      swap1= tem1*10+lst;
   
      while(swap1!=0){
      rev1 = swap1%10;
      sum1 = (sum1*10)+rev1;
      swap1/=10;  
     }
   swap = sum1*10+fst;




     /*
     	System.out.println("lst "+lst);
	System.out.println("fst "+fst);
	System.out.println("div "+div);
	System.out.println("div1 "+div1);
	System.out.println("sum "+sum);
	System.out.println("sum1 "+sum1);
	System.out.println("tem1 "+tem1);
	System.out.println("swap1  "+swap1);
      */

      System.out.println(" Swap  "+swap);

	if(num==swap)
	System.out.println(" palindrome");
	 else
	System.out.println(" Not palindrome");


      }
  }