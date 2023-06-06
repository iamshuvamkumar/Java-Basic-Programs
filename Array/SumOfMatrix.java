import java.util.Scanner;
class SumOfMatrix{
	public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
   int arr[][] = new int[1][3];	 
   int arr1[][] = new int[1][3];	
   int sum[][] = new int[1][3];
	 
	  System.out.println(" Array ");
	 
	  for(int i=0;i<arr.length;i++){
		  for(int j=0;j<arr[i].length;j++){
			   System.out.print("Enter array ["+i+"]"+"["+j+"] => ");
			  arr[i][j]=sc.nextInt();
		  }
	  }
	   System.out.println(" Array 1 ");
	  for(int i=0;i<arr1.length;i++){
		  for(int j=0;j<arr1[i].length;j++){
			     System.out.print("Enter array ["+i+"]"+"["+j+"] => ");
			  arr1[i][j]=sc.nextInt();
		  }
	  }
 	  for(int i=0;i<sum.length;i++){
		  for(int j=0;j<sum[i].length;j++){
			     sum[i][j]= arr[i][j]+arr1[i][j];
		  }
	  }
	 
System.out.print(" Sum Of Matrix ");
	 for(int i=0;i<sum.length;i++){
		  for(int j=0;j<sum[i].length;j++){
			     System.out.print(" "+sum[i][j]);
		  }
	  }
	 
	 }
	}