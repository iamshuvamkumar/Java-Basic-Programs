import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class StudentForm implements ActionListener{
    JFrame f;
	Container c;
	JLabel name,email,id,subject,math,sci,hindi,eng,skt,result,grade,per;
	JButton b;
	JCheckBox n,t,el,tl;
	JRadioButton male ,female;
	JTextArea ta;
	JTextField Name,Email,Id,Math,Sci,Hindi,Eng,Skt,Result,Grade,Per;
	Color white,black,brown,gray;
	Font font;
	ButtonGroup bg;
    
	 
	 StudentForm(){
		 f = new JFrame(" From ");
		 c = f.getContentPane();
		 f.setBounds(100,100,600,600);
		 f.setVisible(true);
		 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	      
         white = new Color(255, 255, 255);
         black = new Color(0, 0, 0);
         brown = new Color(111, 26, 7);
         gray = new Color(218, 221, 216);
         font = new Font("null",Font.PLAIN,18);		 
		 
		  
		 c.setBackground(brown);
		
   	   	 name = new JLabel("Enter Your Name : ");
		 name.setBounds(40,40,170,30);
		 Name = new JTextField();
		 Name.setBounds(230,40,170,30);
      	
		 
		 id = new JLabel("Enter Your Student ID : ");   
		 id.setBounds(40,80,190,30);
         Id = new JTextField();
         Id.setBounds(230,80,170,30);

         email = new JLabel("Enter Your Email : ");   
		 email.setBounds(40,120,170,30);
         Email = new JTextField();
         Email.setBounds(230,120,170,30);		 
		
         name.setForeground(white);
		 name.setFont(font);
		 
		 Name.setBackground(gray);
		 Name.setForeground(black);
		 Name.setFont(font);
		 
		 id.setForeground(white);
		 id.setFont(font);
		 
		 Id.setBackground(gray);
		 Id.setForeground(black);
		 Id.setFont(font);
		 
         email.setForeground(white);
         email.setFont(font);
		 
         Email.setBackground(gray);
         Email.setForeground(black);
         Email.setFont(font);
         
         male = new JRadioButton("Male");
         female = new JRadioButton("FeMale");
         
		 bg = new ButtonGroup();
		 
         male.setBounds(50,180,80,40);
		 male.setFont(font);
		 male.setBackground(brown);
		 male.setForeground(white);
		 
		 female.setBounds(130,180,100,40);
		 female.setFont(font);
		 female.setBackground(brown);
		 female.setForeground(white);
		 bg.add(male);
		 bg.add(female);
		
		n = new JCheckBox("9th"); 
		t = new JCheckBox("10th");
		el = new JCheckBox("11th");
		tl = new JCheckBox("12th");
		
		n.setBounds(50,220,50,30);
		n.setBackground(brown);
		n.setForeground(white);
		n.setFont(font);
		t.setBounds(100,220,60,30);
		t.setBackground(brown);
		t.setForeground(white);
		t.setFont(font);
		el.setBounds(160,220,60,30);
		el.setBackground(brown);
		el.setForeground(white);
		el.setFont(font);
		tl.setBounds(220,220,60,30);
		tl.setBackground(brown);
		tl.setForeground(white);
		tl.setFont(font);
		
		subject = new JLabel("---------------Subject---------------");
		subject.setBounds(40,240,300,40);
		subject.setBackground(brown);
		subject.setForeground(white);
		subject.setFont(font);
		
		math = new JLabel("MATH :");
		math.setBounds(30,280,65,40);
		math.setBackground(brown);
		math.setForeground(white);
		math.setFont(font);
		Math = new JTextField();
		Math.setBounds(100,285,60,30);
		Math.setBackground(gray);
		Math.setFont(font);
		
		eng = new JLabel("ENGLISH :");
		eng.setBounds(170,280,100,40);
		eng.setBackground(brown);
		eng.setForeground(white);
		eng.setFont(font);
		Eng = new JTextField();
		Eng.setBounds(270,285,50,30);
		Eng.setBackground(gray);
		Eng.setFont(font);
		
		sci = new JLabel("SCIENCE :");
		sci.setBounds(340,280,100,40);
		sci.setBackground(brown);
		sci.setForeground(white);
		sci.setFont(font);
		Sci = new JTextField();
		Sci.setBounds(440,285,50,30);
		Sci.setBackground(gray);
		Sci.setFont(font);
		
		skt = new JLabel("SANSKRIT :");
		skt.setBounds(40,320,120,40);
		skt.setBackground(brown);
		skt.setForeground(white);
		skt.setFont(font);
		Skt = new JTextField();
		Skt.setBounds(160,325,50,30);
		Skt.setBackground(gray);
		Skt.setFont(font);
		
		hindi = new JLabel("HINDI :");
		hindi.setBounds(280,320,120,40);
		hindi.setBackground(brown);
		hindi.setForeground(white);
		hindi.setFont(font);
		Hindi = new JTextField();
		Hindi.setBounds(370,320,50,30);
		Hindi.setBackground(gray);
		Hindi.setFont(font);
		
		result = new JLabel("RESULT :");
		result.setBounds(40,395,90,40);
		result.setBackground(brown);
		result.setForeground(white);
		result.setFont(font);
		Result = new JTextField();
		Result.setBounds(140,400,80,30);
		Result.setBackground(gray);
		Result.setFont(font);
		
		grade = new JLabel("GRADE :");
		grade.setBounds(250,395,90,40);
		grade.setBackground(brown);
		grade.setForeground(white);
		grade.setFont(font);
		Grade = new JTextField();
		Grade.setBounds(340,400,80,30);
		Grade.setBackground(gray);
		Grade.setFont(font);
		
		per = new JLabel("PERCENTAGE :");
		per.setBounds(40,440,150,40);
		per.setBackground(brown);
		per.setForeground(white);
		per.setFont(font);
		Per = new JTextField();
		Per.setBounds(200,440,80,30);
		Per.setBackground(gray);
		Per.setFont(font);
		 
		 b = new JButton("Submit");
	     b.setBounds(250,500,100,40);
         b.setBackground(gray);
		 b.setForeground(black);
		 b.setFont(font);
          
		 c.add(per);
		 c.add(Per);
	     c.add(b);
		 c.add(grade);
		 c.add(Grade);
         c.add(result);
         c.add(Result);		 
		 c.add(name);
		 c.add(Name);
		 c.add(id);
		 c.add(Id);
		 c.add(email);
		 c.add(Email);
		 c.add(male);
		 c.add(female);
		 c.add(n);
		 c.add(t);
		 c.add(el);
		 c.add(tl);
		 c.add(subject);
		 c.add(math);
		 c.add(Math);
		 c.add(Sci);
		 c.add(sci);
		 c.add(Hindi);
		 c.add(hindi);
		 c.add(eng);
		 c.add(Eng);
		 c.add(skt);
		 c.add(Skt);
		 b.addActionListener(this);
		 c.setLayout(null);
	 }
	 public void actionPerformed(ActionEvent e){
		   if(e.getSource()==b){
			   int a = Integer.parseInt(Math.getText());
			   int b = Integer.parseInt(Hindi.getText());
			   int c = Integer.parseInt(Sci.getText());
			   int d = Integer.parseInt(Skt.getText());
			   int e1 = Integer.parseInt(Eng.getText());
			   
			   int num = (a+b+c+d+e1)/5;
			   
			   int ans = (a+b+c+d+e1);
			   String an = " "+num+"%";
			   
			   if(num>=85&&num<=100){
				   Grade.setText("A");
			   }
			   else if(num>=65&&num<=85){
				   Grade.setText("B");
			   }
			    else if(num>=45&&num<=65){
				   Grade.setText("C");
			   }
			    else if(num>=25&&num<=45){
				   Grade.setText("D");
			   }
			   else{
				   Grade.setText("F");
			   }
			   
			   if(ans>300){
				    Result.setText("Pass");
			   }
			   else{
				    Result.setText("Fail");
			   }
			        Per.setText(an);
			  
			   
			   System.out.println("Name :"+Name.getText());
			   System.out.println("Id :"+Id.getText());
			   System.out.println("Email :"+Email.getText());
			   
			   
			   System.out.println("Result :"+Result.getText());
			   System.out.println("Grade :"+Grade.getText());
			   System.out.println("PERCENTAGE :"+ Per.getText()+"%");
			   
		   }
	 }
 
 
  public static void main(String[]args){
	  new StudentForm();
  }
}