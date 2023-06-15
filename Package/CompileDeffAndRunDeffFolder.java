//C:\Package
package  CDRD;
class CompileDeffAndRunDeffFolder {
	int x = 11;
	static int y = 22;
	void show(){
		System.out.println("Show method in CompileDeffAndRunDeffFolder ");
		System.out.println(" X = "+x);
		System.out.println(" Y = "+y);
	}
	
	public static void main(String[]args){
		CompileDeffAndRunDeffFolder cdrd = new CompileDeffAndRunDeffFolder();
		cdrd.show();
		
	}
}
