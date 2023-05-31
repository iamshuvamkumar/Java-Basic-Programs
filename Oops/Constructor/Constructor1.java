class Temp{
	int x,y;
    Temp(){
		x = 10;
		y = 20;
	}	
	void show(){
		System.out.println("class x  "+this.x);
		System.out.println("class y  "+this.y);
	}

}
class DefaultConstructor1{
public static void  main(String[]args){
Temp obj = new Temp();
obj.show();
}
}