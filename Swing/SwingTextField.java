import javax.swing.*;
import java.awt.*;

class SwingTextField{
	public static void main(String[]args){
		JFrame f = new JFrame("SwingTextField");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		f.setBounds(80,80,600,400);
		f.setVisible(true);
		
		
		JLabel l = new JLabel("Label");
		l.setBounds(40,40,50,30);
		
		JTextField t = new JTextField("Enter Text ");
		t.setBounds(110,40,120,30);
		Font fn = new Font("null",Font.ITALIC,20);
		t.setFont(fn);
		Color co = new Color(77, 108, 250);
		t.setForeground(co);
		 Color bg = new Color(222, 13, 146);
		t.setBackground(bg);
		c.add(l);
		c.add(t);
		c.setLayout(null);
	}
}