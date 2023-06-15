import javax.swing.*;

class SetLocationInDesktopScreen{
	 
	public static void main(String[]args){
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
	    f.setLocation(250,250);	
		//setsize ans Locaction
        f.setBounds(200,150,300,300);		
	}
}