 import java.util.Scanner;
 
 class SumDiagonal{
	 public static void main(String[]args){
		 Scanner sc = new Scanner(System.in);
		  int [][]x = new int [4][4];
		  int arr[][] = new int[1][1];
		  
		  for(int i=0;i<x.length;i++){
		    for(int j=0;j<x[i].length;j++){
			 x[i][j] = sc.nextInt();    
		    }
		  }
		    for(int i=0;i<x.length;i++){
		    for(int j=0;j<x[i].length;j++){
			System.out.print("  "+x[i][j]);    
		    }
			System.out.println();    
		  } 

//---------------------------------------------------//
 int sum = 0;
 int sum1 = 0;
 int n1 = x.length-1;
 
 
for(int i=0;i<x.length;i++){   
   for(int j=0;j<x[i].length;j++){
   }
   sum+=x[i][i];
   sum1+=x[i][n1];
   n1--;
  }
  System.out.print(" [ "+sum " "+sum1+" ] ");
  
	 }
 }