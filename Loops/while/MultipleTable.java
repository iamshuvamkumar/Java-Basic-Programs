import java.util.Scanner;
 	class MultipleTable{
          public static void main(String[]rk){
            Scanner sc = new Scanner(System.in);
   		System.out.print("Enter Staring Point. ");
		int x = sc.nextInt();
	     System.out.print("Enter Ending Point. ");
		int y = sc.nextInt();
		int tem = 0;
              while(x<=y){
  		int i = 1;
		while(i<=10){
		tem = x*i;
		System.out.print(" "+tem+" ");
 		i++;
		}
		System.out.println("");
		x++;
		}               
           


}
}