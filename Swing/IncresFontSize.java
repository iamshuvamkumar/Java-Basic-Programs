import javax.swing.*;
import java.awt.*;

class IncresFontSize{
	public static void main(String[]asd){
    JFrame f = new JFrame();	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	f.setBounds(100,200,400,400);
	f.setVisible(true);
	f.setLayout(null);
	
	JLabel l = new JLabel("User Name");
	l.setBounds(50,50,120,30);
	 
	 //Font fn = new Font(FontFamily,FontStyle,FontSize);
	 Font fn = new Font("cursive",Font.BOLD,35);
	
	  l.setFont(fn);
	 f.getContentPane().add(l);
	
	}
}