class GrandFather{
	int x = 10;
}
class Father extends GrandFather{
	int x = 20;
}
class Child extends Father{
	int x= 30;
	void show(){
		System.out.println("Show Mehod from Child Class ");
		System.out.println("Class Child x = "+x);
		System.out.println("Class Father x = "+((Father)this).x);
		System.out.println("Class GrandFather x = "+((GrandFather)this).x);
	}
}


class MultiLevel{
public static void main(String []args){
	Child c = new Child();
	c.show();
	
	System.out.println("\n\nClass Child x = "+c.x);
		System.out.println("Class Father x = "+((Father)c).x);
		System.out.println("Class GrandFather x = "+((GrandFather)c).x);
	}
}