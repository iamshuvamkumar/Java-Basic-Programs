/*Data Shadowing=> whenever class varible &local varible
same in then concept is known Data shadowing 
The shadowing Problem slove with help of This KeyWord
*/

class Temp{
		int x=20;
 void show(int y ){
	 int x= 10;
  System.out.println("Loacal Var X => "+x);
  //System.out.println("Loacal Var X => "+x);
  System.out.println("Class Var t => "+this.x);
  System.out.println("Argument y => "+y);
  }
}


class DataShadowing{
	public static void main(String []args){
	Temp obj = new Temp();
	obj.show(30);
	
	
	
	
	}
}
	