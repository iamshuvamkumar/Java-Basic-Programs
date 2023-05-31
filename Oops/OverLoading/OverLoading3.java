class OverLoading3{
	
	void show(int x,long y){
		System.out.println("Int X "+x+" Long Y "+y);
	}
	void show(long x,int y){
		System.out.println("Long x "+x+" Int y "+y);
	}
public static void main(String[]args){
	OverLoading3 obj = new OverLoading3();
//	obj.show(100,200); //Error Ambiguous
	obj.show(101L,201);
	obj.show(102,202L);
 }
}