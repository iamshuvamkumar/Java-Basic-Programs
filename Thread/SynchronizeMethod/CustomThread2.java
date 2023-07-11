package Thread.SynchronizeMethod;

public class CustomThread2 extends Thread {
	String tn;
	Method d;
	CustomThread2(){}
	public CustomThread2(String tn, Method d) {
		super(tn);
		this.tn = tn;
		this.d = d;
		start();
	}
	public void run() {
		System.out.println("Start run ==>" +tn+" "+ d.add(100, 200, tn));
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End run ==>" +tn+" "+ d.add(100, 200, tn));
	}
}