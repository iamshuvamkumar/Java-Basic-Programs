package Reflaction;

import java.awt.Frame;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends D{}
class F extends E{}
public class SimpleSuperClass extends F {
    public static void superclass(Object obj) {
    Class c1 = obj.getClass();	
    System.out.println(" "+c1.getName());
    Class supClass = c1.getSuperclass();
    System.out.println(supClass);
    while(supClass!=null) {
    	System.out.println(" "+supClass);
    	Class subclass = supClass;
    	supClass = subclass.getSuperclass();
    }
    }
	
	public static void main(String[] args) {
		SimpleSuperClass  ssc = new SimpleSuperClass();
		superclass(ssc);
		Frame f = new Frame();
		superclass(f);
	}
}
