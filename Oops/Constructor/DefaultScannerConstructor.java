import java.util.Scanner;
class Temp{
    int x;
	int y;
	Temp(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Value of X. ");
		this.x = sc.nextInt();
		System.out.print("Enter a Value of Y. ");
		this.y = sc.nextInt();
	}
void show(){
	System.out.println(" Value of x Is. "+this.x);
	System.out.println(" Value of y Is. "+this.y);
	
}
		
 }

class DefaultScannerConstructor{
	

public static void main (String[]args){
Temp obj = new Temp();
 obj.show();
}
}
