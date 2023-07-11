package Thread.SynchronizeMethod;

public class CustomThread extends Thread {
	String tn;
	Method d;

	public CustomThread() {}

	public CustomThread(String tn, Method d) {
		super(tn);
		this.tn = tn;
		this.d = d;
		start();
	}

	@Override
	public void run() {
		System.out.println("Start run ==> "+tn+" "+ d.add(10, 20, tn));
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End run ==> "+tn+" "+ d.add(10, 20, tn));
	}
}
