package Reflaction;

interface a{}
interface b{}
interface c{}
interface d{}
interface e{}

public class SimpleInterFaceName implements a,b,c,d,e {
    public static void print(Object obj) {
    	Class c1 = obj.getClass();
    	System.out.println(c1.getName());
    	
    	Class []in =  c1.getInterfaces();
    	for(int i=0;i<in.length;i++) {
    		System.out.println(in[i].getName());
    	}
    	
    }
	
	public static void main(String[] args) {
		SimpleInterFaceName sin = new SimpleInterFaceName();
		print(sin);

	}

}
