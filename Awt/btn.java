

import java.awt.*;
import java.awt.event.*;

class btn implements ActionListener{
  Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
  Frame f;
  TextField tf;
  btn(String str){
	  f = new Frame(str);
	  f.setSize(400,400);
	  f.setVisible(true);
	  tf = new TextField();
	   b = new Button("0");
	   b1 = new Button("1");
	   b2 = new Button("2");
	   b3 = new Button("3");
	   b4 = new Button("4");
	   b5 = new Button("5");
	   b6 = new Button("6");
	   b7 = new Button("7");
	   b8 = new Button("8");
	   b9 = new Button("9");
       b.setBounds(40,120,50,30);	   
       b1.setBounds(120,120,50,30);	   
       b2.setBounds(190,120,50,30);	   
       b3.setBounds(40,160,50,30);	   
       b4.setBounds(120,160,50,30);	   
       b5.setBounds(190,160,50,30);	   
       b6.setBounds(40,220,50,30);	   
       b7.setBounds(120,220,50,30);	   
       b8.setBounds(190,220,50,30);	   
       b9.setBounds(40,250,50,30);	   
	   tf.setBounds(40,40,180,50);
	  
	  f.add(b);
	  f.add(b1);
	  f.add(b2);
	  f.add(b3);
	  f.add(b4);
	  f.add(b5);
	  f.add(b6);
	  f.add(b7);
	  f.add(b8);
	  f.add(b9);

	  f.add(tf);
	  b.addActionListener(this);
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  b7.addActionListener(this);
	  b8.addActionListener(this);
	  b9.addActionListener(this);
	  f.setLayout(null);
	  
  }
  
  public void actionPerformed(ActionEvent ae ){
	  if(ae.getSource()==b)
		  tf.setText("0");
      if(ae.getSource()==b1)
	     tf.setText("1");
	  if(ae.getSource()==b2)
	     tf.setText("2");
	 if(ae.getSource()==b3)
	     tf.setText("3");
	 if(ae.getSource()==b4)
	     tf.setText("4");
	 if(ae.getSource()==b5)
	     tf.setText("5");
	 if(ae.getSource()==b6)
	     tf.setText("6");
	 if(ae.getSource()==b7)
	     tf.setText("7");
	 if(ae.getSource()==b8)
	     tf.setText("8");
	 if(ae.getSource()==b9)
	     tf.setText("9");
  }
  
	public static void main(String[]args){
     new btn(" EvantFrame ");
	}
   }
   
   
   
   
   
   
   
   
   
   
   