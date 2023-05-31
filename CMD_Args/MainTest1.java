class MainTest1{
public static void main(String[]s){
	//THis method array type argument
	System.out.println("\nTHis is MainTest1 and length is "+s.length);
	/*MainTest2.main("Hi MainTest1\n");
	String str[]={"Hi","MainTest1","Class"};
	MainTest2.main(str);*/
		for(int i=0;i<s.length;i++)
			System.out.print(" "+s[i]);
   }
}
class MainTest2{
	public static void main(String...s){
		System.out.println("This is MainTest2 and length is "+s.length);
		for(int i=0;i<s.length;i++)
			System.out.print(" "+s[i]);
		//MainTest1.main("Hi MainTest1\n");  //error only array type arguments
	String str[]={"Hi","MainTest1","Class"};
	MainTest1.main(str);
	MainTest1.main(s);
	}
}