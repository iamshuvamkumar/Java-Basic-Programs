import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class SwingMulButtonW implements ActionListener{
	JFrame f;
	Container c;
	JButton b,b1,b2;
	Color col,col1,col2;
	SwingMulButtonW(){
	f = new JFrame("  Buttons ");
	b = new JButton(" Red ");
	b1 = new JButton(" Yellow ");
	b2 = new JButton(" Green ");
	col = new Color(225, 0, 0);
	col1 = new Color(241, 196, 15);
	col2 = new Color(5, 59, 6);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.setBounds(100,100,600,300);
    c = f.getContentPane();
     
    b.setBounds(40,40,100,50);
    b1.setBounds(165,40,100,50);
    b2.setBounds(290,40,100,50);

	
	 
	 c.add(b);
	 c.add(b1);
	 c.add(b2);
	b.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	c.setLayout(null);
	
	}
	public void actionPerformed(ActionEvent e){
	  
		 if(e.getSource()==b){
			  //b.setBackground(col);
			  c.setBackground(col);
		 }
        if(e.getSource()==b1){
			  //b1.setBackground(col1);
			  c.setBackground(col1);
		 } 
		 if(e.getSource()==b2){
			 // b2.setBackground(col2);
			  c.setBackground(col2);
		 } 
	 }
	public static void main(String[]args){
		new SwingMulButtonW(); 
	}
}