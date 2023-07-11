package Thread.SynchronizeMethod;

public class Method {
int x,y;
 synchronized int add(int x,int y,String tn) {
	this.x = x;
	this.y =y;
	System.out.println("Start in add "+tn);
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("End in add "+tn);
	return x+y;
}
}
