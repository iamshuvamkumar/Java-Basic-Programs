import java.util.Scanner;
	class SumOfAllNatrualNum{
	public static void main(String[]rk){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Starting Range. ");
	int i = sc.nextInt();   
        System.out.print("Enter Ending Range. ");
	int n = sc.nextInt(); 
    	int tem = 0;
       while(i<=n){
          tem = tem+i;
          i++;
        }
        System.out.print(tem);
  }
}
    