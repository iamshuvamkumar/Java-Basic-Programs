import java.util.Scanner;
class MinOfArray{
   
   static void minArray(int range){
	   Scanner sc = new Scanner(System.in);
	   int arr[] = new int[range];
	   
	   for(int i=0;i<range;i++){
		   System.out.print("Enter Array Element arr["+i+"] => ");
		   arr[i] = sc.nextInt();		   
	   }
	   int min=arr[0];
	      for(int i=0;i<range;i++){
			  if(min>arr[i])
              min=arr[i];	
		  }
	   System.out.print( "A Min Element In the Array is "+min);
   } 

public static void main(String[]arg){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Array Range ");
	int range = sc.nextInt();
	minArray(range);
	
  }
}