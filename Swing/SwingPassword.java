import javax.swing.*;
import java.awt.*;


class SwingPassword{
  public static void main(String[]asd){
	  JFrame f = new JFrame("Password");
	  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	  f.setVisible(true);
	  f.setBounds(100,100,800,600);
	  Container c = f.getContentPane();
	  
	  
      JLabel l = new JLabel("UserName");
	  l.setBounds(40,40,120,40);
	  JTextField t = new JTextField();
	  t.setBounds(220,40,220,40);
	  
	  JLabel l1 = new JLabel("Password");
	  l1.setBounds(40,120,120,40);
	  JPasswordField ps = new JPasswordField();
	  ps.setBounds(220,120,220,40);
	    ps.setEchoChar('*');
	 Font fn = new Font("null",Font.BOLD,22);
	  
	     //ps.setEchoChar((Char)0);  //show password
	  
	  JButton btn = new JButton("Send");
		btn.setBounds(280,180,100,40);
		
		
	  
	  Color Green = new Color(21, 127, 31);
	  Color White = new Color(255, 255, 255);
	  Color Skyblue = new Color(160, 234, 222);
	  Color Black = new Color(2, 3, 0);
	  l.setFont(fn);
	  l1.setFont(fn);
	  t.setFont(fn);
	  ps.setFont(fn);
	  t.setForeground(Green);
	  t.setBackground(Skyblue);
	  l.setForeground(Green);
	  l1.setForeground(Green);
	  ps.setBackground(Black);
	  ps.setForeground(White);
	  btn.setBackground(Black);
	  btn.setForeground(White);
	  
	  c.add(btn);
	  c.add(l);
	  c.add(t);
	  c.add(l1);
	  c.add(ps);
      c.setLayout(null);
  }
}