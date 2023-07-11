package Reflaction;

import java.awt.Frame;

public class RSimpleNmae {  //1st waay to get class
	void show() {
		System.out.println("Show Method..");
	}

	public static void print(Object obj) {
		Class c1 = obj.getClass();
		String cname = c1.getName();
		System.out.println("The Name of class => " + cname);

	}

	public static void print(String obj) { //2nd way to get class

		try {
			Class c1 = Class.forName(obj);
			String cname = c1.getName();
			System.out.println("The Name String of class => " + cname);
			Object obj1= (Object) c1.newInstance();
			RSimpleNmae RSimple = new RSimpleNmae();
			RSimple.show();
			
			Class c2 = Class.forName("java.lang.StringBuffer");
		   System.out.println("The Name Of class => "+c2.getName());
		   Object obj2 = (Object) c2.newInstance();
		   StringBuffer stb = (StringBuffer) obj2;
		   System.out.println("Capicity => "+stb.capacity());
		   
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("Main Start ");
		RSimpleNmae sp = new RSimpleNmae();
		print(sp);
		Thread t1 = new Thread();
		print(t1);
		Frame f = new Frame();
		print(f);
		print("Reflaction.RSimpleNmae");
		try {  //3rd way to get class
			Class st = RSimpleNmae.class;
			System.out.println(st);
			Class th = Thread.class;
			System.out.println(th);
			Class th1 = Runnable.class;
			System.out.println(th1);

		} catch (Exception e) {
			
		}
		
		
		System.out.println("Main End ");
	}

}
