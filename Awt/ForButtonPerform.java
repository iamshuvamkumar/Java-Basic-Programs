package MyFramePackage;
import MyFramePackage.*;
import java.awt.*;
import java.awt.event.*;


class ForButtonPerform implements ActionListener{
       Frame f;
	   Label l;
	   Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,mud,equal;
	   TextField t;
	 	   
	   public ForButtonPerform(String str ){
		   f = new Frame(str);
		   f.setSize(400,400);
		   f.setVisible(true);
		   l=new Label();
           l.setBounds(50,50,260,60);
		   
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
		   b0.addActionListener(this);
		   b1.addActionListener(this);
		   b2.addActionListener(this);
		   b3.addActionListener(this);
		   b4.addActionListener(this);
		   b5.addActionListener(this);
		   b6.addActionListener(this);
		   b7.addActionListener(this);
		   b8.addActionListener(this);
		   b9.addActionListener(this);
		   sum.addActionListener(this);
		   sub.addActionListener(this);
		   mul.addActionListener(this);
		   div.addActionListener(this);
		   mud.addActionListener(this);
		   equal.addActionListener(this);
		   f.setLayout(null);
		   f.addWindowListener(new Windowcls());
	   }
  public void actionPerformed(ActionEvent ae ){
	  String s,s1;
	  if(ae.getSource()==b0){
		  t.setText("0");
	  }
	  if(ae.getSource()==b1)
	     t.setText("1");
	 if(ae.getSource()==b2)
	     t.setText("2");
	 if(ae.getSource()==b3)
	     t.setText("3");
	 if(ae.getSource()==b4)
	     t.setText("4");
	 if(ae.getSource()==b5)
	     t.setText("5");
	 if(ae.getSource()==b6)
	     t.setText("6");
	 if(ae.getSource()==b7)
	     t.setText("7");
	 if(ae.getSource()==b8)
	     t.setText("8");
	 if(ae.getSource()==b9)
	     t.setText("9");
	 if(ae.getSource()==sum)
		 t.setText("+");
	  if(ae.getSource()==sub)
		 t.setText("-");
	  if(ae.getSource()==mul)
		 t.setText("*");
	  if(ae.getSource()==div)
		 t.setText("/");
	  if(ae.getSource()==mud)
		 t.setText("%");
	  if(ae.getSource()==equal)
		 t.setText("=");
	 
  }
	   
 public static void main(String[]args){
	new ForButtonPerform(" ForButtonPerform ");
	
  }	
 }