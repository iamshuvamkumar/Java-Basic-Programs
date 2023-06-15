import javax.swing.*;
import java.awt.*;

class SetSwingFrameResize{
	 
	public static void main(String[]args){
		JFrame f = new JFrame();
		f.setVisible(true);
		//f.setSize(400,400);
		//f.setLocation(250,250);
		f.setBounds(200,150,300,300);
		f.setTitle("Swing Frist Frame");
		ImageIcon img = new ImageIcon("LoginIcon.png");
		f.setIconImage(img.getImage());
		f.getContentPane().setBackground(Color.BLACK);
		
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}