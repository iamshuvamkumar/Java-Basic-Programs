import java.util.Iterator;

public class ThreadJoin1 extends Thread {
	
	static Thread mainThread;
	public void run() {
		
		try {
			mainThread.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				sleep(3000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		mainThread = new Thread();
		ThreadJoin1 tj = new ThreadJoin1();
		tj.start();
		
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
