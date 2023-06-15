
import  java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;
 public class calculator implements ActionListener{
	   JFrame f;
	   
	   JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,mud,equal;
	   
	   JTextField t;
	  
	  Container c;
	 
	   public calculator(String str ){
		   f = new JFrame(str);
		   c = f.getContentPane();
		   f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		   f.setSize(400,500);
		   f.setVisible(true);
		   
			t = new JTextField ();
		    
	  	    b0 = new JButton("0");
			b1 = new JButton("1");
			b2 = new JButton("2");
			b3 = new JButton("3");
			b4 = new JButton("4");
			b5 = new JButton("5");
			b6 = new JButton("6");
			b7 = new JButton("7");
			b8 = new JButton("8");
			b9 = new JButton("9");
			sum = new JButton("+");
			sub = new JButton("-");
			mul = new JButton("*");
			div = new JButton("/");
			mud = new JButton("%");
			equal = new JButton("=");
		    
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
		  
		  
		   c.add(t);
		   c.add(b0);
		   c.add(b1);
		   c.add(b2);
		   c.add(b3);
		   c.add(b4);
		   c.add(b5);
		   c.add(b6);
		   c.add(b7);
		   c.add(b8);
		   c.add(b9);
		   c.add(sum);
		   c.add(sub);
		   c.add(mul);
		   c.add(div);
		   c.add(mud);
		   c.add(equal);
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
		   t.addActionListener(this);
		   c.setLayout(null);
	   }
	   public void actionPerformed(ActionEvent e){
          String s,ss;
                        
   if(e.getSource()==b0){
       s=t.getText();
       ss=s+"0";
       t.setText(ss);
       }
   if(e.getSource()==b1){
       s=t.getText();
       ss=s+"1";
       t.setText(ss);
       }

   if(e.getSource()==b2){
       s=t.getText();
       ss=s+"2";
       t.setText(ss);
       }

   if(e.getSource()==b3){
       s=t.getText();
       ss=s+"3";
       t.setText(ss);
       }

   if(e.getSource()==b4){
       s=t.getText();
       ss=s+"4";
       t.setText(ss);
       }

   if(e.getSource()==b5){
       s=t.getText();
       ss=s+"5";
       t.setText(ss);
       }

   if(e.getSource()==b6){
       s=t.getText();
       ss=s+"6";
       t.setText(ss);
       }
   if(e.getSource()==b7){
       s=t.getText();
       ss=s+"7";
       t.setText(ss);
       }
   if(e.getSource()==b8){
       s=t.getText();
       ss=s+"8";
       t.setText(ss);
       }
	     
	if(e.getSource()==b9){
       s=t.getText();
       ss=s+"9";
       t.setText(ss);
       }
    if(e.getSource()==sum){
       s=t.getText();
       ss=s+"+";
       t.setText(ss);
       }
	if(e.getSource()==sub){
       s=t.getText();
       ss=s+"-";
       t.setText(ss);
       }
	if(e.getSource()==mul){
       s=t.getText();
       ss=s+"*";
       t.setText(ss);
       }
   if(e.getSource()==div){
       s=t.getText();
       ss=s+"/";
       t.setText(ss);
       }
   if(e.getSource()==mud){
       s=t.getText();
       ss=s+"%";
       t.setText(ss);
   }	
    
  }
	   
 public static void main(String[]args){
	new calculator(" Calculator ");
	
  }
 }
	   
