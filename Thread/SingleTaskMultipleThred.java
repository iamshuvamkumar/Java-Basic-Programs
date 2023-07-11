package myThread;

public class SingleTaskMultipleThred implements Runnable{
public void run() {
	System.out.println(Thread.currentThread().getName());
}
	
	public static void main(String[] args) {
		SingleTaskMultipleThred  s = new SingleTaskMultipleThred();
		
		Thread t = new Thread(s);		
        t.start();
    	Thread t1 = new Thread(s);		
        t1.start();

	}

}
