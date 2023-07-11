
public class PerortiInThread extends Thread {
 @Override
public void run() {
	System.out.println("This Is Thread Priority "+Thread.currentThread().getPriority());
}
	 
	public static void main(String[] args) {	
    PerortiInThread pt  = new PerortiInThread(); 
    Thread.currentThread().setPriority(3);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
        pt.setPriority(6);
		pt.start();
	}
}