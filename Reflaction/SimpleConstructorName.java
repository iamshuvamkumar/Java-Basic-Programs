package Reflaction;

import java.awt.Frame;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class SimpleConstructorName {
	SimpleConstructorName(int x,String str){}
	public static void print(Object obj) {
		try {
			Class c1 = obj.getClass();
			System.out.println(" Class name is "+c1.getName());
			 
			Constructor[] cont = c1.getConstructors();
			for(int i=0;i<cont.length;i++) {
				System.out.print(cont[i].getName()+" ( ");
			  Parameter [] param= cont[i].getParameters();
			  for(int j=0;j<param.length;j++) {
				  System.out.print(param[j].getType().getName());
			  }
			  
			  System.out.println(")");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		SimpleConstructorName scn = new SimpleConstructorName(12,"a");
		Frame f = new Frame();
	print(f);
	}

}
