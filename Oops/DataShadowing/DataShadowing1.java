class Temp{
	int x=10;
	
	void show(int y){
		int x=20;
		System.out.println("This is class Var "+this.x);
		System.out.println("This is Local Var "+x);
		System.out.println("This is argument var "+y);
		System.out.println();
	}
	void get(int x){
		this.x= x;
	}
	
		
}


class DataShadowing1{
public static void main(String[]args){
	Temp obj = new Temp();
	obj.show(50);
	obj.get(12);
	obj.show(15);
	Temp obj1 = new Temp();
	obj1.show(20);
	obj1.get(33);
	obj1.show(60);
	
	
  }
}