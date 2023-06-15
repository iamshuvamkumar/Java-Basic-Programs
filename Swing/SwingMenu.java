import javax.swing.*;
import java.awt.*;

class SwingMenu{
       JFrame f;
	   Container c;
	   JMenuBar menubar;
	   JMenu menu,menu1;
	   JMenuItem mi,mi1,mi2,i,i1,i2;
	    
		SwingMenu(){
          f = new JFrame("Menu-Bar");
		  c =f.getContentPane();
		  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		  f.setVisible(true);
		  f.setBounds(100,100,400,400);
          
          menubar = new JMenuBar();
		  menubar.setBounds(0,0,400,40);
          menu = new JMenu("bhar ka menu");		  
		  mi = new JMenuItem("One");
		  mi1 = new JMenuItem("Two");
		  mi2 = new JMenuItem("Three");
		  
		  i = new JMenuItem("1");
		  i1 = new JMenuItem("2");
		  i2 = new JMenuItem("3");
		   
		  menu.add(mi);
		  menu.add(mi1);
		  menu.add(mi2);
		  
		   menu1 = new JMenu("Menu k andae menu ");
		   menu1.add(i);
		   menu1.add(i1);
		   menu1.add(i2);
		   
		  menu.add(menu1);
		  menubar.add(menu);
		  
		  c.add(menubar);
		  
		  c.setLayout(null);
		}
	public static void main(String[]args){
		new SwingMenu();
	}
}