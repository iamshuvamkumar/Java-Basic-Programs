import java.util.Scanner;
class TwoSum{
static void twosum(int nums, int target){
	Scanner sc = new Scanner(System.in);
	
	         int x=nums;
			 
     int num [] = new int[x];
	       	
        
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
           for(int j=1;j<num.length;j++){
               if(num[i]+num[j]==target){
               System.out.println("["+num[i]+","+num[j]+"]");
			  }
           }
        }

}

    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  array range ");
		int x = sc.nextInt();
		System.out.print("Enter   Target ");
		int y = sc.nextInt();
		System.out.println("Enter   Target");
		twosum(x,y);            
    }
	
}