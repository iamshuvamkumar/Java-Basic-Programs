import javax.swing.*;
import java.awt.*;


 class RadioButtonInSwing{
 JFrame f;
 Container c;
 JLabel male,female;
 ButtonGroup b;
 JRadioButton m,fm;
     RadioButtonInSwing(){
         f = new JFrame();
		 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
         f.setBounds(100,100,500,500);
         f.setVisible(true);
         c = f.getContentPane();
         male = new JLabel("Male");	
         male.setBounds(100,100,50,40);		 
         female = new JLabel("FeMale");
         female.setBounds(100,200,60,40);		 
		 m = new JRadioButton();
		 m.setBounds(200,100,50,40);
		 fm = new JRadioButton();
		 fm.setBounds(200,200,50,40);
		 b = new ButtonGroup();
		 b.add(m);
		 b.add(fm);
		 
		 c.add(male);
		 c.add(female);
		 c.add(m);
		 c.add(fm);
		 
         c.setLayout(null);
     }

     public static void main(String[] args) {
       new RadioButtonInSwing();
     }
 }