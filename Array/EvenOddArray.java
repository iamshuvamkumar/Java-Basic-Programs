import java.util.Scanner; 	 	 	
class EvenOddArray{
	static void oddArry(int x){
		 Scanner sc = new Scanner(System.in);
		 int arr[] = new int[x];
		 for(int i=0;i<arr.length;i++){
			System.out.print("Enter array ");
	       arr[i] = sc.nextInt();
	     }
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]%2!=0)
				 System.out.print("Odd"+arr[i]);
			 }
		 }
		 static void EvenArry(int x){
		 Scanner sc = new Scanner(System.in);
		 int arr[] = new int[x];
		 for(int i=0;i<arr.length;i++){
			System.out.print("\nEnter array ");
	       arr[i] = sc.nextInt();
	     }
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]%2==0)
				 System.out.print("Even"+arr[i]);
			 }
		 }
		 
	 public static void main(String...s){
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter a array range ");
	 int x=sc.nextInt();
	 oddArry(x);
	 EvenArry(x);
	 }	
}
