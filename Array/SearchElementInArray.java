import java.util.Scanner;
class SearchElementInArray{
  public static void main(String...a){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter array range ");
	  int y = sc.nextInt();
      int x[]= new int[y];
     System.out.println("Enter array Element");
	 for(int i=0;i<x.length;i++){
       	System.out.print("Enter arr x["+i+"] ");
		x[i] = sc.nextInt();
	}
		System.out.print("Enter Search Element in array ");
		int search = sc.nextInt();
	 for(int i=0;i<x.length;i++){
       	if(x[i]==search)
			System.out.println("A Elementin arrayIndex is "+i);
	}
  
  }
  }