import java.util.Scanner;
class SumOfArray{
	static void sumArray(int range){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int arr[] = new int[range];
		for(int i=0;i<range;i++){
			System.out.print("Enter Array Element arr["+i+"] => ");
			arr[i]=sc.nextInt();
			sum +=arr[i]; 
		}
		System.out.print("A Sum of Array is "+sum);
		
		
		}
      public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter  Array Range ");
	  int range= sc.nextInt();
	  sumArray(range);
	  
	  
  }	
}