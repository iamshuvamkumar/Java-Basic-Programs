 class Temp{
	 Temp(){
		 this(200);
		 System.out.println("Default Constructor ");
	 }
	 Temp(int x,int y){
		 this("Hello Chaining ");
		 System.out.println(" Local Var x => "+x);
		 System.out.println(" Local Var y => "+y);
	 }
	 Temp(int x){
		 this(30,50);
		 System.out.println(" Local Var x => "+x);
	 }
	 Temp(String str){
		 System.out.println(" Local String Var => "+str);
	 }
	 
 }
 
 class ConstructorChailing{
	 public static void main(String[]args){
		 Temp obj = new Temp();
	 }
 }