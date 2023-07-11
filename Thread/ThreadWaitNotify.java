
public class ThreadWaitNotify extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}
			this.notify();
		}
	}

	public static void main(String[] args) {
		ThreadWaitNotify wn = new ThreadWaitNotify();
		wn.start();
		synchronized (wn) {
			try {
				wn.wait();
				System.out.println("Rs. " + wn.total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
