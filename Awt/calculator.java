package MyFramePackage;

import  java.awt.*;
 public class calculator{
	   Frame f;
	   Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,mud,equal;
	   TextField t;
	 	   
	   public calculator(String str ){
		   f = new Frame(str);
		   f.setSize(400,400);
		   f.setVisible(true);
		  
		   
			t = new TextField ();
		    
	  	    b0 = new Button("0");
			b1 = new Button("1");
			b2 = new Button("2");
			b3 = new Button("3");
			b4 = new Button("4");
			b5 = new Button("5");
			b6 = new Button("6");
			b7 = new Button("7");
			b8 = new Button("8");
			b9 = new Button("9");
			sum = new Button("+");
			sub = new Button("-");
			mul = new Button("*");
			div = new Button("/");
			mud = new Button("%");
			equal = new Button("=");
		    
			t.setBounds(20,30,350,80); 
			
		    b7.setBounds(20,130,70,50);
		    b8.setBounds(110,130,70,50);
		    b9.setBounds(200,130,70,50);
			mul.setBounds(290,130,70,50);
			
		    b4.setBounds(20,200,70,50);
		    b5.setBounds(110,200,70,50);
		    b6.setBounds(200,200,70,50);
		    div.setBounds(290,200,70,50);
			
		    b3.setBounds(20,270,70,50);
		    b2.setBounds(110,270,70,50);
		    b1.setBounds(200,270,70,50);
		    mud.setBounds(290,270,70,50);
			
            sum.setBounds(20,340,70,50);		  
		    b0.setBounds(110,340,70,50);
		    sub.setBounds(200,340,70,50);
		    equal.setBounds(290,340,70,50);
		  
		  
		   f.add(t);
		   f.add(b0);
		   f.add(b1);
		   f.add(b2);
		   f.add(b3);
		   f.add(b4);
		   f.add(b5);
		   f.add(b6);
		   f.add(b7);
		   f.add(b8);
		   f.add(b9);
		   f.add(sum);
		   f.add(sub);
		   f.add(mul);
		   f.add(div);
		   f.add(mud);
		   f.add(equal);
		   f.setLayout(null);
	   }
	   
	   
 public static void main(String[]args){
	new calculator(" Calculator ");
	
  }
 }
	   
