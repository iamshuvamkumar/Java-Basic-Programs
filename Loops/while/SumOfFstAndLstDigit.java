	import java.util.Scanner;
	   class SumOfFstAndLstDigit{
		public static void main(String[]Rk){
		 Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value. ");

		  int num = sc.nextInt();
		    int sum=0,rem=0,rev=0,fst=0,lst=0,tem=num;
    		      while(num!=0){
 			rem = num%10;
			rev = (rev*10)+rem;
			num/=10;
		      }
                 fst = rev%10;
		 lst = tem%10;
		 sum=fst+lst;
	System.out.println("First Digit "+fst);
        System.out.println("Last Digit "+lst);
        System.out.println("Sum First And Last Digit "+sum);
    }
 }
