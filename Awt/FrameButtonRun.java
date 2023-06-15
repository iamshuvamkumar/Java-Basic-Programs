package MyFramePackage;

import java.awt.*;
import java.awt.event.*;

class FrameButtonRun implements ActionListener{
  Button b,b1;
  Frame f;
  TextField tf;
  FrameButtonRun(String str){
	  f = new Frame(str);
	  f.setSize(400,400);
	  f.setVisible(true);
	  tf = new TextField();
	   b = new Button(" OK ");
	   b1 = new Button(" Cencel ");
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
	  if(ae.getSource()==b)
		  tf.setText("Button B1");
		  if(ae.getSource()==b1)
	     tf.setText("Button B2");
  }
  
	public static void main(String[]args){
     new FrameButtonRun(" EvantFrame ");
	}
   }
   
   
   
   
   
   
   
   
   
   
   