 /*Copy Constructor :=> The copy vlaue of data member
 one object into another this is support in C++
 In java copy Constructor are not available
 This work done with the help paramerterized Constructor
 */
 class Temp{
	 int a;
	 int b;
	Temp(){
	a = 5;
    b = 10;	
	}
	Temp(Temp ref){
		System.out.println(ref.a+" CopyConstructor "+ref.b);
		this.a=ref.a+10;
		this.b=ref.b;
		System.out.println(a+" Class Var "+b);
	}
	/*void show(){
		System.out.println(a+3+" Class Var "+b);
	}*/

}
class CopyConstructor{
  public static void main(String[]args){
  Temp obj = new Temp();
   Temp obj1 = new Temp(obj);
   obj1.show();
   
  
  }
  }