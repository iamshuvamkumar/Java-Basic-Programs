import java.util.Scanner;
class Matrix{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x[][] = new int[2][2];
		int [][]y = new int[2][2];
		int z[][] = new int[2][2];
		
		// Input X and Y Array Size Are Same
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
			 System.out.print("x["+i+"]["+j+"] ");
				x[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
			  System.out.print("x["+i+"]["+j+"] ");
				y[i][j]=sc.nextInt();
			}
		}
		
		
		//---->OutPut X And Y Array
		System.out.println("OutPut of 1st X Matrix");
		for(int i=0;i<x.length;i++){
		  for(int j=0;j<x[i].length;j++){
		    System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("OutPut of 2ed Y Matrix");

        for(int i=0;i<y.length;i++){
		   for(int j=0;j<y[i].length;j++){
		    System.out.print(" "+y[i][j]);
			}
			System.out.println();
		}
		
		//-----> Addition
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				z[i][j]= x[i][j]+y[i][j];
			}
		}
		System.out.println("multiplecation");
		
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				System.out.print(" "+z[i][j]);
			}
			  System.out.println();
		}
		//-----> Sub
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				z[i][j]= x[i][j]-y[i][j];
			}
		}
       System.out.println("Sub");
		
         for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				System.out.print(" "+z[i][j]);
			}
			  System.out.println();
		}
		
		//-----> multiplecation of two matrix
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++){
				z[i][j]=0;
				for(int k=0;k<x.length;k++){
					z[i][j]= z[i][j]+(x[i][k]*y[k][j]);
				}
				
			}
		}
		System.out.println("multiplecation");
		
		System.out.println("OutPut of 3rd Z Matrix");
		for(int i=0;i<z.length;i++){
			for(int j=0;j<z[i].length;j++){
				System.out.print(" "+z[i][j]);
			}
			  System.out.println();
		}
		
 

		
	  }
	}