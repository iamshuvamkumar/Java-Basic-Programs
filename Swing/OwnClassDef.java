import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class OwnClassDef{
	public static Container c;
	JFrame f;
	public static JButton b;
	OwnClassDef(){
		f = new JFrame("Own Class Define");
		c = f.getContentPane();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		b = new JButton("Anonymouse Button");
		f.setBounds(40,50,500,400);
		f.setVisible(true);
		
		b.setBounds(54,55,120,40);
		
		c.add(b);
		b.addActionListener(new ColorRed());
		
		c.setLayout(null);
	}
		
	public static void main(String []asa){
		new OwnClassDef();
	} 
}
class ColorRed implements ActionListener{
	    public void actionPerformed(ActionEvent e){
			OwnClassDef.c.setBackground(Color.RED);
			OwnClassDef.b.setBackground(Color.YELLOW);
		}
}