package Reflaction;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class SimpleMethodName {
	public void show() {}
	public void showNot(int x ,String str) {}
	
    public static void print(Object obj) {
    	Class c1 = obj.getClass();
    	System.out.println("Class name "+c1.getName());
    	
    	  Method[] meth = c1.getMethods();
    	  for(int i=0;i<meth.length;i++) {
    		  System.out.print(meth[i].getReturnType().getName()+" ");
    		  System.out.print(meth[i].getName()+" (");
    		   
    		   Parameter[] param = meth[i].getParameters();
    		   for(int j=0;j<param.length;j++) {
    			   System.out.print(param[j].getParameterizedType().getTypeName());
    		   }
    		  System.out.println(" )");
    	  }
    }
	public static void main(String[] args) {
		SimpleMethodName smn = new SimpleMethodName();
		print(smn);

	}

}
