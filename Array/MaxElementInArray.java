import java.util.Scanner;
class MaxElementInArray{
    static void MaxArray(int range){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[range];
		int max = 0;
		for(int i=0;i<range;i++){
			System.out.print("Enter Array Element arr["+i+"] => " );
			arr[i] = sc.nextInt();
			if(max<arr[i])
				max=arr[i];
		}
		System.out.print( "A Max Element In the Array is "+max);
	}  
	
	 public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter Array Range ");
	 int range = sc.nextInt();
	 MaxArray(range);
		
	}
}