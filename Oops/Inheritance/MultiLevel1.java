class GrandFather2{
	int x = 2;
}
class GrandFather1 extends GrandFather2{
	int x = 4;
}
class GrandFather extends GrandFather1{
	int x = 6;
}
class Father extends GrandFather{
	int x = 8;
}
class Child extends Father{
	int x= 12;
	void show(){
		System.out.println("Show Mehod from Child Class ");
		System.out.println("Class Child x = "+x);
		System.out.println("Class Father x = "+((Father)this).x);
		System.out.println("Class GrandFather x = "+((GrandFather)this).x);
		System.out.println("Class GrandFather1 x = "+((GrandFather1)this).x);
		System.out.println("Class GrandFather2 x = "+((GrandFather2)this).x);
	}
}


class MultiLevel1{
public static void main(String []args){
	Child c = new Child();
	c.show();
	
	System.out.println("\n\nClass Child x = "+c.x);
		System.out.println("Class Father x = "+((Father)c).x);
		System.out.println("Class GrandFather x = "+((GrandFather)c).x);
		System.out.println("Class GrandFather1 x = "+((GrandFather1)c).x);
		System.out.println("Class GrandFather2 x = "+((GrandFather2)c).x);
	}
}