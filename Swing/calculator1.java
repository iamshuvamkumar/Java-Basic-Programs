import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator1 implements ActionListener{
    JFrame f;
    Container c;
    JButton sum,mul,sub,div;
    JLabel l,l1,ans;
	JTextField t,t1;
	
   public calculator1(){
           f = new JFrame("Cal");
		   c = f.getContentPane();
		   f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		   f.setSize(400,500);
		   f.setVisible(true);
		   
		   l = new JLabel("Num --> ");
		   l.setBounds(40,40,80,40);
		   l1 = new JLabel("Num --> ");
		   l1.setBounds(40,80,80,40); 
		   
		   t = new JTextField();
		   t.setBounds(100,40,80,40);
		   
		   t1 = new JTextField();
		   t1.setBounds(100,100,80,40);
		
     	   ans = new JLabel();
		   ans.setBounds(280,40,80,40);
		   
		   
		   sum = new JButton("+");
		   sum.setBounds(40,160,50,40);
		   sub = new JButton("-");
		   sub.setBounds(110,160,40,40);
		   mul = new JButton("*");
		   mul.setBounds(170,160,40,40);
		   div = new JButton("/");
		   div.setBounds(250,160,40,40);
		  
		   
		   
		   
       c.add(l);
       c.add(l1);
       c.add(t);
       c.add(t1);
       c.add(mul);
       c.add(sub);
       c.add(sum);
       c.add(div);
	   c.add(ans);
	  sum.addActionListener(this);
	  mul.addActionListener(this);
	  sub.addActionListener(this);
	  div.addActionListener(this);
	  
      c.setLayout(null);
}
 public void actionPerformed(ActionEvent e){
	if(e.getSource()==sum){
		int a = Integer.parseInt(t.getText());
		int b = Integer.parseInt(t1.getText());
		int c = a+b;
		ans.setText("ans "+c);
	} 
	 if(e.getSource()==sub){
		int a = Integer.parseInt(t.getText());
		int b = Integer.parseInt(t1.getText());
		int c = a-b;
		ans.setText("ans "+c);
	} 
	if(e.getSource()==mul){
		int a = Integer.parseInt(t.getText());
		int b = Integer.parseInt(t1.getText());
		int c = a*b;
		ans.setText("ans "+c);
	} 
	 
	 if(e.getSource()==div){
		int a = Integer.parseInt(t.getText());
		int b = Integer.parseInt(t1.getText());
		int c = a/b;
		ans.setText("ans "+c);
	} 
	 
	 
 }
    
public static void main(String[] args) {
    new calculator1();
 }
}