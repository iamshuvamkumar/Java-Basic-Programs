package MyFramePackage;

import  java.awt.*;
 public class MyFrame2{
	   Frame f;
	   Label l;
	   Label l1;
	   Button b;
	   Button b1;
	   TextField t;
	   TextField t1;
	 	   
	   public MyFrame2(String str ){
		   f = new Frame(str);
		   f.setSize(400,400);
		   f.setVisible(true);
		  
		    l = new Label("Enter Your Name ");
		    l1 = new Label("Enter Your Password ");
	        
			t = new TextField ();
		    t1 = new TextField (); 
     
		    
	  	    b = new Button("OK");
			b1 = new Button("Cencel");
		   
		    l .setBounds(30,70,100,30);
			 t .setBounds(150,70,200,30);
			 
		    l1.setBounds(30,130,120,30);
		    t1 .setBounds(150,130,200,30);
			
		    b.setBounds(100,180,80,30);
		    b1.setBounds(190,180,80,30);
		   
		   f.add(l);
		   f.add(l1);
		   f.add(t);
		   f.add(t1);
		   f.add(b);
		   f.add(b1);
		   f.setLayout(null);
		 
		   
	   }
	   
	   
 public static void main(String[]args){
	new MyFrame2(" MyFrame - - 2 ");
	
  }
 }
	   
