interface My{
void show();
 }
 class Temp{
	 public void show(){
		 System.out.println("Show Method Of interface");
	 }
 }
class Interface9 extends Temp implements My{
public static void main(String[]args){
My m1 = new Interface9();
m1.show();
}
}