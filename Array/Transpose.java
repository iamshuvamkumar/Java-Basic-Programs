import java.util.Scanner;

class Transpose{	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int [][]x  = new int [3][3];
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				x[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}
	}
}