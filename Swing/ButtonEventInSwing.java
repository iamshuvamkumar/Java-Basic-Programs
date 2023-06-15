import javax.swing.*;   
import java.awt.*;
import java.awt.event.*;
  
  class ButtonEventInSwing implements ActionListener {
	  JButton btn;
	  Container c;
	  JFrame f;    
	  
	  ButtonEventInSwing(){
		  f = new JFrame("Button BackGround Change");
		  f.setVisible(true);
		  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

		  c = f.getContentPane();
		  f.setBounds(40,40,500,400);
		  
		  btn = new JButton("Send");
          btn.setBounds(40,40,70,40);	
          c.add(btn);
          btn.addActionListener(this);	  
		  c.setLayout(null);
	  }
	  public void actionPerformed(ActionEvent e){
		  btn.setBackground(Color.RED);
	  }
	  
	  
      public static void main(String[]args){
           new ButtonEventInSwing();
         
		
	  }
  }