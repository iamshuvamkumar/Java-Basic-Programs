import java.util.Scanner;
import java.util.Arrays;
public class Smallest{

public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
	 int array[]=new int[5];
	 for(int i=0;i<array.length;i++)
	 {
	     array[i]=sc.nextInt();
	 }
	 
	 Arrays.sort(array);
	 
	 System.out.print("Minimum valus in this  Array"+array[0]);
}

}