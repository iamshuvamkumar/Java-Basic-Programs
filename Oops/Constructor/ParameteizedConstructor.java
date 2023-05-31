import java.util.Scanner;
class Temp{
int x,y;
  Temp(){}
   Temp(int x,int y){
    this.x=x;
	this.y=y;
  }
  void show(){
	  System.out.println("Value of Class Var x " +this.x);
	  System.out.println("Value of Class Var y " +this.y);
  }
	  
}



 class ParameteizedConstructor{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Value Of X. "); 
 int x = sc.nextInt();
 System.out.print("Enter a Value Of Y. ");
 int y = sc.nextInt();
  Temp obj = new Temp(x,y);
  obj.show();
  new Temp().show();
 new Temp(20,60).show();

 }
}
