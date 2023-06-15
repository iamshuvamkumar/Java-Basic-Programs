import javax.swing.*;
import java.awt.*;

 class SetImageInSwing{
	 public static void main(String[]asd){
		 JFrame f = new JFrame("Frame");
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 f.setBounds(50,100,400,400);
		 f.setVisible(true);
		 f.setLayout(null);
		 ImageIcon img = new ImageIcon("LoginIcon.png");
		 JLabel l = new JLabel(img);
		 l.setBounds(50,50,img.getIconWidth(),img.getIconHeight());
		 f.getContentPane().add(l);
		 
	 }
 }