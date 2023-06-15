import javax.swing.*;
import java.awt.*;

class SetBackGroudColorInSwing {
	 
	public static void main(String[]args){
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
		//f.setSize(400,400);
		//f.setLocation(250,250);
		f.setBounds(200,150,300,300);
		f.setTitle("Swing Frist Frame");
		ImageIcon img = new ImageIcon("LoginIcon.png");
		f.setIconImage(img.getImage());
		
		//firstWay
		//f.getContentPane().setBackground(Color.BLACK);
		
		//seconnd Way
		Color col = new Color(187,99,209);
		f.getContentPane().setBackground(col);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}