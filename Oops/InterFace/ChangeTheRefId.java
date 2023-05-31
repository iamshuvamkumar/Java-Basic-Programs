interface My{
	void show();
}
class Child implements My{
	String s;
	Child(){}
	Child(String s1){s=s1;}
	public String toString(){return s;}
		
		public void show(){
			System.out.println("Show method Interface My  ");
		}
		void display(){
			System.out.println("Display method child class");
		}
		
}

class ChangeTheRefId{
 public static void main(String[]args){
	 Child c = new Child("Shuvam@9211");
	 My m = new Child("GODOFCLOWN");
	 System.out.println("The ref of Child claas c "+c);
	 System.out.println("The ref of My interface m "+m);
      c.show();
      c.display();
      m.show();
      //m.display();
	  String strc = c.String();
	  System.out.println("Return valur of String Strc "+strc);
	  String strm = m.String();
      System.out.println("Return valur of String Strm "+strm);
 }
}