import java.util.Iterator;

public class ThreadJoin extends Thread {

	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				sleep(4000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadJoin tj = new ThreadJoin();
		tj.start();
		
		try {
			tj.join();
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
