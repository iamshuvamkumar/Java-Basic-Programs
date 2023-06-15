
package MyFramePackage;

import  java.awt.Frame;

public class MyFrame1{
	public MyFrame1(String str){
	Frame f = new Frame(str);
	f.setSize(400,400);
	f.setVisible(true);
	}
	public static void main(String[]args){
	  new MyFrame1 ("MyFrame");	
	 }
	}