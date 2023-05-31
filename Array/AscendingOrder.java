import java.util.Scanner;
class AscendingOrder{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Range ");
		int x = sc.nextInt();
		int arr[]= new int[x];
	
		System.out.println("Enter Array Data ");
     	for(int i=0;i<arr.length;i++){
			System.out.print("Array x ["+i+"]" );
			 arr[i]= sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}