import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class LoginForm implements ActionListener {
	JFrame f;
	Container c;
	JButton Login;
	Font fn;
    JLabel l,l1;
	JTextField t;
	JPasswordField t1;
	
	LoginForm(){
     f = new JFrame();
     c = f.getContentPane();
     f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
     f.setBounds(400,200,500,500);
     f.setVisible(true);	 
	 fn = new Font("null",Font.BOLD,25);
	 
	 l = new JLabel(" UserName : ");
	 l1 = new JLabel(" Password : ");
	 
	 t = new JTextField();
	 t1 = new JPasswordField();
	 
	 l.setBounds(40,40,170,40);
	 l1.setBounds(40,120,170,40);
	 t.setBounds(200,40,200,40);
	 t1.setBounds(200,120,200,40);
	
	 l.setFont(fn);
	 l1.setFont(fn);
	 t.setFont(fn);
	 t1.setFont(fn);
	 
	 t1.setEchoChar('*');
	 
	 Login = new JButton(" Login ");
	 Login.setBounds(40,200,400,40);
	 Login.setFont(fn);
	 
	 
	 c.add(l);
	 c.add(l1);
	 c.add(t);
	 c.add(t1);
	 c.add(Login);	
	 c.setLayout(null);
	 Login.addActionListener(this);
	 }
	
	public void actionPerformed(ActionEvent e){
		System.out.println("userName :"+t.getText());
		char []pf =t1.getPassword();
		String vl = new String(pf);
		System.out.println("Password :"+vl);
	}
	
	
	public static void main(String[]asd){
		new LoginForm();
	}
}