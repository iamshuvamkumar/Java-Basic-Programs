//Does not matter return type in functions
class OverLoading2{
	void show(char ch,int x ,float f ){
		System.out.print(" |Charecter =>"+ch);
		System.out.print(" |Int =>"+x);
		System.out.print(" |Float =>"+f);
	}
	int show(int x,float f,long l,char ch){
		System.out.print(" |Int =>"+x);
		System.out.print(" |Float =>"+f);
		System.out.print(" |long =>"+l);
		System.out.print(" |Charecter =>"+ch);
		return 100;
	}
	double show(float f,char ch ,int x,long l){
	System.out.print(" |Float =>"+f);
	System.out.print(" |Char =>"+ch);
	System.out.print(" |Int =>"+x);
	System.out.print(" |Long  =>"+l);
	return 200;
	}
	
	
 public static void main(String[]args){
 OverLoading2 obj = new OverLoading2();
 obj.show('a',23,232.32F);
 System.out.println();
 int a = obj.show(21,23.33F,3233L,'c');
 System.out.println("|Return Type =>"+a);
  System.out.println();
 double b = obj.show(23.33F,'b',433,234L);
 System.o ut.println("|Return Type =>"+b);
 }
}