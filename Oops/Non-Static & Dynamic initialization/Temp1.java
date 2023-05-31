class Temp1{
	int x= 10; //Compile time initi//Static 
	Temp1(){  } //Defult constatuor
	void show(){
		System.out.println("X = "+x);
	}
	Temp1(int x){
		this.x=x;
	}
public static void main(String[]args){
	Temp1 obj = new Temp1();
	obj.show();
	Temp1 obj1 = new Temp1(500);
	obj1.show();
}
}