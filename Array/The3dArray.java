 import java.util.Scanner;
 
 class The3dArray{
	 public static void main(String[]args){
		 Scanner sc = new Scanner(System.in);
		  int [][]x = new int [1][3];
		  int y[][] = new int [1][3];
		  int [][]z = new int [1][3];
		  int sum[][] = new int[1][2];
		  
		  for(int i=0;i<x.length;i++){
		    for(int j=0;j<x[i].length;j++){
			 x[i][j] = sc.nextInt();  
			 y[i][j] = sc.nextInt();  
			 z[i][j] = sc.nextInt();  
		    }
		  }
		    for(int i=0;i<x.length;i++){
		    for(int j=0;j<x[i].length;j++){
			System.out.print("  "+x[i][j]);    
		    }
			System.out.println();
			for(int j=0;j<x[i].length;j++){
			System.out.print("  "+y[i][j]);    
		    }
			System.out.println();
			for(int j=0;j<x[i].length;j++){
			System.out.print("  "+z[i][j]);    
		    }
		  }  
	 }
 }