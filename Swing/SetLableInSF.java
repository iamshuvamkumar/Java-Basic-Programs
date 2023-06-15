import javax.swing.*;
import java.awt.*;

class SetLableInSF{
	public static void main(String[]asd){
    JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	f.setBounds(100,200,400,400);
	f.setVisible(true);
	f.setLayout(null);
	
	JLabel l = new JLabel("User Name");
	l.setBounds(50,50,90,30);
	
	 f.getContentPane().add(l);
	
	}
}