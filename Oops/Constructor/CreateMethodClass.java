 class Temp{
	 int x,y;
	 Temp(){
		 System.out.println("Default Constructor");
	 }
	 Temp(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 void Temp(){
		 System.out.println(" Class Temp Method "+x);
		 System.out.println(" Class Temp Method "+y);
	 }
	 void show(){
		 System.out.println("Class X Var Value "+x);
		 System.out.println("Class Y Var Value "+y);
	 }
 }
 class CreateMethodClass{
	 public static void main(String[]args){
		 Temp obj = new Temp(10,50);
		 obj.show();
		 obj.Temp();
		 
		 new Temp().show();
		 new Temp().Temp();
		 new Temp(20,10).show();
		 new Temp(20,10).Temp();
		 
	 }
 }