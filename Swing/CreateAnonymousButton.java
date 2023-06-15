import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CreateAnonymousButton {
	JFrame f;
	Container c;
	JButton b;
	CreateAnonymousButton(){
		f = new JFrame(" CreateAnonymousButton ");
		c = f.getContentPane();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		b = new JButton("Anonymouse Button");
		f.setBounds(40,50,500,400);
		f.setVisible(true);
		
		b.setBounds(54,55,120,40);
		
		c.add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 if(e.getSource()==b)
			  b.setBounds(100,100,300,300);
		 }
		});
		c.setLayout(null);
	}
	public static void main(String[]asd){
      new CreateAnonymousButton();
 	 
	}
}