import javax.swing.*;
import java.awt.*;

class TextAreaInSwing{
    JFrame f;
	Container c;
	JTextArea text;
	TextAreaInSwing(){
		f = new JFrame(" TEXTAREA ");
		c =f.getContentPane();
	    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(100,100,400,400);
		f.setVisible(true);
	     text  = new JTextArea();
		 text.setBounds(40,40,600,500);
	    c.add(text);
	    c.setLayout(null);
	}
 public static void main (String[]asd){
	 new TextAreaInSwing();
 }
}