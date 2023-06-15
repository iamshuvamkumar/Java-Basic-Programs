package Package1;
import Package1.PackageUsing1;
/*package Packages;    // package in C Drive
import Packages.PackageUsing1;*/
class PackageUsing{
    
	int x = 111;
	static int y = 222;
	
	void show(){
		System.out.println("Show method in PackageUsing class ");
		System.out.println(" X  = "+x);
		System.out.println(" Y  = "+y);
	}
		
	public static void main(String[]args){
		PackageUsing pk = new PackageUsing();
	    PackageUsing1 pk1 = new PackageUsing1();
		pk.show();
		pk1.get();
		PackageUsing1.y=20;
		System.out.println("Change PackageUsing1 Y Vlaue "+(PackageUsing1.y=20));
		//System.out.println("Change PackageUsing1 X Vlaue "+(PackageUsing1.x=21));   //non static data member can't be call to another class
		pk1.get();
		pk1.changeValue(1,2);
		pk1.get();
	    
	  }
	}