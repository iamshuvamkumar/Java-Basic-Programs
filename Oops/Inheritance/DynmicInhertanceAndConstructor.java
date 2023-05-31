class GrandFather {//extends Object{
	private int x;
	GrandFather(){}
	GrandFather(int x){
		this.x=x;
	}
	public void show(){
		System.out.println("Show method Grandfather class");
		System.out.println(" x = "+x);
	}
}
class Father extends GrandFather{
	private int x;
	private int y;
	Father(){}
	Father(int x,int y ,int z){
		super(z);
		this.x=x;
		this.y=y;
	}
	public void show(){
		super.show();
		System.out.println("Show method Father calss ");
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		
	}
}
class child extends Father{
	private int x;
	private int y;
	private int z;
	child (){}
	child (int x, int y, int z ,int a,int b,int c ){
		super(a,b,c);
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void show(){
		super.show();
		System.out.println("Show method Child class ");
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		System.out.println(" z = "+z);
	}
}

  class DynmicInhertanceAndConstructor{
  public static void main(String[]args){
      
	   child c1 = new child(10,20,30,40,50,60);
	   c1.show();
	   
   }
}