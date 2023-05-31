class Father {
int x;
int y;
void show(){
	System.out.println("Show  Method From Father Class ");
    System.out.println("X  =  "+x);
    System.out.println("Y  =  "+y);
}
}
class Son extends Father{
void getData(int x,int y){
	System.out.println("getData Mehtod Son Class ");
	this.x=x;
	this.y=y;
  }
}
class Temp{
	public static void main(String[]args){
	Father f = new Father();
	//f.show();
	Son s = new Son();
	s.show();
	s.getData(10,20);
	s.show();
	}
}