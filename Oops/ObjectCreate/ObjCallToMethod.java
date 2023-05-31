//static also in call in class area. and static call only one time in loadding time.
//a&b are local varible this is call only stack area

class ObjCallToMethod{
	int x;
	int y;
	static int z=20;
	void getData(int a,int b){
		x=a;  
		y=b;
	}
	void show(){
		System.out.println("x== "+x);
		System.out.println("y== "+y);
		System.out.println("z== "+z);
	}
public static void main(String[]args){
   ObjCallToMethod obj = new ObjCallToMethod();  
   System.out.println("The value of ref Id obj "+obj);
   
   obj.show();
   obj.getData(42,22);
   obj.show();
   
   ObjCallToMethod obj1 = new ObjCallToMethod(); 
   System.out.println("The value of ref Id obj1 "+obj1);
    
   obj1.show();
   obj1.getData(2,3);
   obj1.show();
   
   System.out.println("After change the value of z ");
   z=10;
   obj.show();
   obj1.show();
   
   System.out.println("After change the value of obj ");
     obj.getData(15,45);
	 obj.show();
	 System.out.println("After change the value of obj1 ");
     obj1.getData(1,15);
	 obj1.show();

  }
}