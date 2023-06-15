
package MyFramePackage;

import  java.awt.Frame;

public class MyFrame extends Frame{
	public MyFrame(String str){
		super(str);
		setSize(400,400);
		setVisible(true);
	}
 public static void main(String...s){
 new MyFrame ("MyFrame-1");
 }
}