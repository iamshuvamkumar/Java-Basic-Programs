package MyFramePackage;

import java.awt.*;
import java.awt.event.*;

class FrameButtonRunInCp implements ActionListener{
  Button b,b1;
  Frame f;
  TextField tf;
  EvantFrame(String str){
	  f = new Frame(str);
	  f.setSize(400,400);
	  f.setVisible(true);
	  tf = new TextField();
	   b = new Button(" OK ");
	   b1 = new Button(" OK ");
       b.setBounds(40,120,50,30);	   
       b1.setBounds(120,120,50,30);	   
       tf.setBounds(40,80,150,30);	   
	  
	  f.add(b);
	  f.add(b1);
	  f.add(tf);
	  b.addActionListener(this);
	  b1.addActionListener(this);
	  f.setLayout(null);
	  
  }
  
  public void actionPerformed(ActionEvent ae ){
	    System.out.println(" actionPerformed "+this);
  }
  
	public static void main(String[]args){
		EvantFrame obj = new EvantFrame(" EvantFrame ");
		 System.out.println("EMain  "+obj);
	}
   }