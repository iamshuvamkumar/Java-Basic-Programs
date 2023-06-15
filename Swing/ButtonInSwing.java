import javax.swing.*;
import java.awt.*;

class ButtonInSwing{
	public static void main(String[]args){
		JFrame f = new JFrame("Button");
		Container c = f.getContentPane();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(50,50,400,400);
		 
		Color Green = new Color(21, 127, 31);
	    Color White = new Color(255, 255, 255);
	    Color Skyblue = new Color(160, 234, 222);
	    Color Black = new Color(2, 3, 0); 
		Font fn = new Font("null",Font.BOLD,25);
		Cursor cr  = new Cursor(Cursor.HAND_CURSOR);
		
		ImageIcon img = new ImageIcon("LoginIcon.png");
		
		JButton btn = new JButton("Button");
		btn.setBounds(40,40,100,40);
		btn.setBackground(Black);
		btn.setForeground(White);
		btn.setFont(fn);
		btn.setCursor(cr);
		
		c.add(btn);
		c.setLayout(null);
	}
}