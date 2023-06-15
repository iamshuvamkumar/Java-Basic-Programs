
//package Packages; // package in C Drive
//package Package1;
package pkg;

public class PackageUsing1{
	int x = 101;
	static int y = 202;
	void get(){
		System.out.println("get method in PackageUsing1 class ");
		System.out.println(" X  = "+x);
		System.out.println(" Y  = "+y);
	}
	void changeValue(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[]args){
		
		PackageUsing1 pk1 = new PackageUsing1();
		pk1.get();
		
		
	  }
	}