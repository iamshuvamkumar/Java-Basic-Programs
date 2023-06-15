 import javax.swing.*;
 import java.awt.*;
 
 class CheckBoxInSwing{
	    JFrame f;
		Container c;
		JCheckBox x,y,z;
		CheckBoxInSwing(){
			f = new JFrame("CheckBoxInSwing");
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
			c = f.getContentPane();
			f.setBounds(100,100,400,400);
			f.setVisible(true);
			
			x = new JCheckBox("A");
			y = new JCheckBox("B");
			z = new JCheckBox("C");
			x.setBounds(40,100,40,20);
			y.setBounds(90,100,40,20);
			z.setBounds(130,100,40,20);
			
			
			z.setSelected(true);
			
			
			c.add(x);
			c.add(y);
			c.add(z);
			c.setLayout(null);
		}
	 
	 public static void main(String[]args){
		 new CheckBoxInSwing();
	 }
 }