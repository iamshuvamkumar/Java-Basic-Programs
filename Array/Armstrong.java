import java.util.Scanner;
class Armstrong{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int x= sc.nextInt();
	  int arr [] = new int [x];
	  
	  for(int j=0;j<arr.length;j++){
		  System.out.print("Enter Array element in arr["+j+"]");
		  arr[j] = sc.nextInt();
	  }
     	for(int i=0;i<arr.length;i++){
		  int r=0,s=0,tem=0,tem1;	 
            tem = arr[i];
            tem1=tem;		   
		   while(tem!=0){
			  r= tem%10;
			  s =s+(r*r*r);
			  tem/=10;  
		  }
		  if(arr[i]==s)
		   System.out.println("its is a Armstrong num "+s);
	  }
	}
	
	
}