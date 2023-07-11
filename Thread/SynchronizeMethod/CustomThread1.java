package Thread.SynchronizeMethod;

public class CustomThread1 extends Thread {
	String tn;
	Method d;
	CustomThread1(){}
	public CustomThread1(String tn, Method d) {
		super(tn);
		this.tn = tn;
		this.d = d;
		start();
	}
	public void run() {
		System.out.println("Start run ==> " +tn+" "+ d.add(11, 22, tn));
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End run ==> " +tn+" "+  d.add(11, 22, tn));
	}
}
