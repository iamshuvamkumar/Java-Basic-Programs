class A{
	void p(String str){
		System.out.println(str);
	}
}
class s{
  static A o = null;
   static{
     o = new A();
   }	   

public static void main(String[]args){
	System.out.println(" ref id of A class is  "+o);
	//B.x.show();
}
}
class TempText1{
public static void main(String []args){
	s.o.p(" hi im System.out.println  ");
}
}