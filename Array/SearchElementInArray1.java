import java.util.Scanner;
class SearchElementInArray1{
	static void searchElementArray(int range){
		Scanner sc = new Scanner(System.in);
		int arr [] =new int[range];
		int i = 0;
		int ans = -1;
		for(i=0;i<range;i++){
			System.out.print("Enter Array Element arr["+i+"]");
			arr[i]=sc.nextInt();	
		}
		System.out.print("Enter Search Element in Array ");
		int search = sc.nextInt();
		for(i=0;i<range;i++){
		if(arr[i]==search){
			ans = i;
		   break;
		}
        }
		if(ans==i)
	    System.out.print("Search Element "+search+" Index in the Array is "+ans);
        else
		System.out.print(ans);	
		
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Range ");
		int range = sc.nextInt();
		searchElementArray(range);
	}
}