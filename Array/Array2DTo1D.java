import java.util.Scanner;
class Array2DTo1D{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int arr [][] = new int[3][2];
		
	    int l = arr.length;
		int l1 = arr[0].length;
		int k=0;

		int arr_1[] = new int[l*l1];
	
	  
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" arr["+i+"]"+"["+j+"] ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
				arr_1[k++] = arr[i][j];
			}
			System.out.println();
		}
		
		//-- > 2D array convert into 1D Array
		
		for(int i=0;i<arr_1.length;i++){
			System.out.print(" "+arr_1[i]);
		}
		
		
	}
}