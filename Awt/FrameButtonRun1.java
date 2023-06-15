package MyFramePackage;

import java.awt.*;
import java.awt.event.*;

class FrameButtonRun1 implements ActionListener{
  Button b,b1;
  Frame f;
  TextField tf;
  FrameButtonRun1(String str){
	  f = new Frame(str);
	  tf = new TextField();
	   b = new Button(" OK ");
	   b1 = new Button(" Cencel ");
       b.setBounds(40,120,50,30);	   
       b1.setBounds(120,120,50,30);	   
       tf.setBounds(40,80,150,30);

      f.setSize(400,400);
	  f.setVisible(true);	   
	  f.add(b);
	  f.add(b1);
	  f.add(tf);
	  f.setLayout(null);
	  b.addActionListener(this);
      f.addWindowListener(new WindowEx());	  
	  b1.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent ew){
			  tf.setText(" Button b2 ");
		  }
	  });  
  }
  
  public void actionPerformed(ActionEvent ae ){
	  if(ae.getSource()==b)
		  tf.setText("Button B1");
		 /* if(ae.getSource()==b1)
	     tf.setText("Button B2");*/
  }
  class WindowEx extends WindowAdapter{
	  public void windowClosing(WindowEvent we){
		  System.exit(0);
	  }
  }
  
	public static void main(String[]args){
     new FrameButtonRun1(" EvantFrame ");
	}
   }
   
   
   
   
   
   
   
   
   
   
   